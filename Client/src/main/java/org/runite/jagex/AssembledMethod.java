package org.runite.jagex;

import org.rs09.client.Node;
import org.rs09.client.collections.HashTable;

final class AssembledMethod extends Node {

   // The ints are loaded in this order
   int numberOfIntsToCopy;
   int numberOfRSStringsToCopy;
   int numberOfIntArguments;
   int numberOfStringArguments;

   int[] assemblyInstructions;
   int[] instructionOperands;
   HashTable[] switchHashTable;
   RSString[] stringInstructionOperands;
}
