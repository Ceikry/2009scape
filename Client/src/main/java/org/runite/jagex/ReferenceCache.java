package org.runite.jagex;

import org.rs09.client.Node;
import org.rs09.client.data.HashTable;
import org.rs09.client.data.Queue;
import org.rs09.client.data.reference.HardObjectReference;
import org.rs09.client.data.reference.ObjectReference;
import org.rs09.client.data.reference.SoftObjectReferenceTransformer;

import java.util.Objects;

public final class ReferenceCache<T> {

    private int remaining;
    private final int capacity;
    private final Queue<ObjectReference<T>> history = new Queue<>();
    private final HashTable<ObjectReference<T>> table;

    public final void put(T value, long key) {
        this.remove(key);

        if (this.remaining == 0) {
            ObjectReference<T> last = this.history.poll();
            Objects.requireNonNull(last).unlink();
            last.unlinkNode();
        } else {
            this.remaining--;
        }

        HardObjectReference<T> reference = new HardObjectReference<>(value);
        this.table.put(key, reference);
        this.history.offer(reference);
        reference.nodeKey = 0L;
    }

    public final T remove(long key) {
        ObjectReference<T> previous = this.table.get(key);
        if (previous != null) {
            previous.unlink();
            previous.unlinkNode();
            this.remaining++;
            return previous.getValue();
        }
        return null;
    }

    public final int hardCount() {
        int count = 0;

        for (ObjectReference<T> reference = this.history.getFront(); reference != null; reference = this.history.next()) {
            if (!reference.isSoftReference()) {
                count++;
            }
        }

        return count;
    }

    public final void sweep(int maximumAge) {
        for (ObjectReference<T> reference = this.history.getFront(); null != reference; reference = this.history.next()) {
            if (!reference.isSoftReference()) {
                if (++reference.nodeKey > (long) maximumAge) {
                    ObjectReference<T> soft = SoftObjectReferenceTransformer.INSTANCE.transform(reference);
                    this.table.put(reference.linkableKey, soft);
                    Node.splice(reference, soft);

                    reference.unlink();
                    reference.unlinkNode();
                }
            } else if (null == reference.getValue()) {
                reference.unlink();
                reference.unlinkNode();
                ++this.remaining;
            }
        }
    }

    public final void clearSoftReferences() {
        for (ObjectReference<T> reference = this.history.getFront(); reference != null; reference = this.history.next()) {
            if (reference.isSoftReference()) {
                reference.unlink();
                reference.unlinkNode();
                this.remaining++;
            }
        }
    }

    public final void clear() {
        this.history.clear();
        this.table.clear();
        this.remaining = this.capacity;
    }

    public ReferenceCache(int capacity) {
        int size = 1;
        while (size + size < capacity) {
            size += size;
        }

        this.capacity = capacity;
        this.remaining = capacity;
        this.table = new HashTable<>(size);
    }

    public final T get(long key) {
        ObjectReference<T> reference = this.table.get(key);
        if (null == reference) {
            return null;
        }

        T value = reference.getValue();
        if (value == null) {
            reference.unlink();
            reference.unlinkNode();
            this.remaining++;
            return null;
        } else {
            if (reference.isSoftReference()) {
                HardObjectReference<T> hard = new HardObjectReference<>(value);
                this.table.put(reference.linkableKey, hard);
                this.history.offer(hard);
                hard.nodeKey = 0L;
                reference.unlink();
                reference.unlinkNode();
            } else {
                this.history.offer(reference);
                reference.nodeKey = 0L;
            }

            return value;
        }
    }

}
