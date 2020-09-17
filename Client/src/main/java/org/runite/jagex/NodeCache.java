package org.runite.jagex;

import org.rs09.client.Node;
import org.rs09.client.data.HashTable;
import org.rs09.client.data.Queue;

import java.util.Objects;

public final class NodeCache<T extends Node> {

    private Node aClass3_Sub28_744 = new Node();
    private final HashTable<T> table;
    private final int capacity;
    private final Queue<T> history = new Queue<T>();
    private int remaining;

    public final T get(long key) {
        T value = this.table.get(key);
        if (value != null) {
            this.history.offer(value);
        }
        return value;
    }

    public final T first() {
        return this.table.first();
    }

    public final void put(long key, T value) {
        if (this.remaining == 0) {
            Node history = this.history.poll();
            Objects.requireNonNull(history).unlink();
            history.unlinkNode();

            if (this.aClass3_Sub28_744 == history) {
                history = this.history.poll();
                Objects.requireNonNull(history).unlink();
                history.unlinkNode();
            }
        } else {
            this.remaining--;
        }

        this.table.put(key, value);
        this.history.offer(value);
    }

    public final T next() {
        return this.table.next();
    }

    public final void clear() {
        this.history.clear();
        this.table.clear();
        this.aClass3_Sub28_744 = new Node();

        this.remaining = this.capacity;
    }

    public NodeCache(int capacity) {
        this.remaining = capacity;
        this.capacity = capacity;

        int size = 1;
        while (size - -size < capacity) {
            size += size;
        }
        this.table = new HashTable<>(size);
    }

}
