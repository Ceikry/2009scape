//package org.runite.jagex;
//
//import org.rs09.client.Linkable;
//
//class Node extends Linkable {
//
//    long nodeKey;
//    Node previousNode;
//    Node nextNode;
//
//    final void unlinkNode() {
//        if (this.previousNode != null) {
//            this.previousNode.nextNode = this.nextNode;
//            this.nextNode.previousNode = this.previousNode;
//            this.nextNode = null;
//            this.previousNode = null;
//        }
//    }
//
//}
