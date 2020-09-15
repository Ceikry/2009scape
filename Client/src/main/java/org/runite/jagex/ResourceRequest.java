package org.runite.jagex;

import org.rs09.client.Node;

abstract class ResourceRequest extends Node {

   boolean aBoolean3628;
   boolean aBoolean3635;
   volatile boolean waiting = true;

   abstract int getCompletion();

   abstract byte[] getData();

}
