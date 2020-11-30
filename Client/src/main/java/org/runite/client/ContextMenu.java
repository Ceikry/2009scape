package org.runite.client;

import org.rs09.client.util.ArrayUtils;

public class ContextMenu {

    static int menuOptionCount = 0;
    static RSString[] aClass94Array2935 = new RSString[500];
    static RSString[] aClass94Array4016 = new RSString[500];
    static int[] anIntArray1578 = new int[500];
    static short[] aShortArray3095 = new short[500];
    static long[] aLongArray3271 = new long[500];
    static int[] anIntArray1613 = new int[500];
    static int[] anIntArray512 = new int[500];

    static void method509(int var1) {
        try {
            --menuOptionCount;
            if (menuOptionCount != var1) {
                ArrayUtils.arraycopy(aClass94Array2935, 1 + var1, aClass94Array2935, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(aClass94Array4016, 1 + var1, aClass94Array4016, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(anIntArray1578, 1 + var1, anIntArray1578, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(aShortArray3095, 1 + var1, aShortArray3095, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(aLongArray3271, 1 + var1, aLongArray3271, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(anIntArray1613, 1 + var1, anIntArray1613, var1, menuOptionCount - var1);
                ArrayUtils.arraycopy(anIntArray512, 1 + var1, anIntArray512, var1, menuOptionCount - var1);
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "qe.A(" + 1 + ',' + var1 + ')');
        }
    }
}
