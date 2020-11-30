package org.runite.client;

class Class38 {

    static int anInt660;
    static boolean aBoolean661 = true;
    static int[][] anIntArrayArray663;
    static int[] anIntArray664 = new int[14];
    static Class146 aClass146_668;


    static ItemDefinition getItemDefinition(int itemId) {
        try {
            ItemDefinition var2 = (ItemDefinition) Class3_Sub28_Sub4.aReferenceCache_3572.get(itemId);
            if (var2 == null) {
                byte[] var3 = Class97.aClass153_1370.getFile(Class140_Sub2.method1951(itemId), 255 & itemId);
                var2 = new ItemDefinition();
                var2.itemId = itemId;
                if (var3 != null) {
                    var2.parseDefinitions(new DataBuffer(var3));
                }

                var2.method1112();
                if (var2.anInt791 != -1) {
                    var2.method1118(getItemDefinition(var2.anInt789), getItemDefinition(var2.anInt791));
                }

                if (var2.anInt762 != -1) {
                    var2.method1109(getItemDefinition(var2.anInt795), getItemDefinition(var2.anInt762));
                }

                if (!Class139.aBoolean1827 && var2.membersItem) {
                    var2.name = TextCore.MembersObject;
                    var2.teamId = 0;
                    var2.inventoryOptions = ClientErrorException.aClass94Array2119;
                    var2.aBoolean807 = false;
                    var2.groundOptions = Unsorted.aClass94Array2596;
                }

                Class3_Sub28_Sub4.aReferenceCache_3572.put(var2, itemId);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "fk.F(" + itemId + ')');
        }
    }

    static void method1028() {
        try {
            for (int var1 = -1; Class159.localPlayerCount > var1; ++var1) {
                int var2;
                if (var1 == -1) {
                    var2 = 2047;
                } else {
                    var2 = Class56.localPlayerIndexes[var1];
                }

                Player var3 = Class3_Sub13_Sub22.players[var2];
                if (var3 != null) {
                    Unsorted.method68(var3.getSize(), var3);
                }
            }

        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "fk.G(" + -102 + ')');
        }
    }

    static void method1029(int var0) {
        try {
            Network.outgoingBuffer.putOpcode(177);
            Network.outgoingBuffer.writeShort(Class113.interfacePacketCounter);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "fk.D(" + var0 + ')');
        }
    }

}
