package org.runite.jagex;

import org.rs09.client.Node;

public final class Queue<T extends Node> {

    private final Node tail = new Node();
    private Node current;

    public final int size() {
        int size = 0;

        for (Node var3 = this.tail.nextNode; var3 != this.tail; ++size) {
            var3 = var3.nextNode;
        }

        return size;
    }

    public final T getFront() {
        Node front = this.tail.nextNode;
        if (this.tail == front) {
            this.current = null;
            return null;
        }

        this.current = front.nextNode;
        return (T) front;
    }

    public final T poll() {
        Node next = this.tail.nextNode;
        if (next == this.tail) {
            return null;
        }

        next.unlinkNode();
        return (T) next;
    }

    public final T next() {
        Node current = this.current;
        if (current == this.tail) {
            this.current = null;
            return null;
        }

        this.current = current.nextNode;
        return (T) current;
    }

    public final void offer(T node) {
        if (node.previousNode != null) {
            node.unlinkNode();
        }

        node.previousNode = this.tail.previousNode;
        node.nextNode = this.tail;
        node.previousNode.nextNode = node;
        node.nextNode.previousNode = node;
    }

    public final void clear() {
        while (true) {
            Node next = this.tail.nextNode;
            if (this.tail == next) {
                this.current = null;
                return;
            }

            next.unlinkNode();
        }
    }

    public Queue() {
        this.tail.nextNode = this.tail;
        this.tail.previousNode = this.tail;
    }

}
