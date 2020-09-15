package org.rs09.client

open class Node : Linkable() {
    @JvmField
    var nodeKey: Long = 0
    @JvmField
    var previousNode: Node? = null
    @JvmField
    var nextNode: Node? = null

    fun unlinkNode() {
        if (previousNode != null) {
            previousNode!!.nextNode = nextNode
            nextNode!!.previousNode = previousNode
            nextNode = null
            previousNode = null
        }
    }
}
