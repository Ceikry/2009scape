package org.runite.client;


import static org.lwjgl.opengl.GL11.GL_SRC_COLOR;

public class ClientCommands {

    static boolean commandQaOpEnabled = false;
    static boolean fpsOverlayEnabled = false;
    static boolean tweeningEnabled = false;
    static boolean shiftClickEnabled = false;
    static boolean canDrop = false;
    static boolean renderInfoOverlayEnabled = false;
    /**
     * Removed out of (depreciated)Properties.java
     */
    private static boolean modernHotkeys;


    public static void ClientCommands(RSString command) {
        try {
            int var2;
            int var3;
            Runtime runtime;
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_GARBAGE_COLLECTOR)) {
                ClearReferenceCache.clearSoftReference();

                for (var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }

                runtime = Runtime.getRuntime();
                var3 = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                Network.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.memoryEquals, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
            }

            int var4;
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_MEMORY_MANAGEMENT)) {
                ClearReferenceCache.clearSoftReference();

                for (var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }

                runtime = Runtime.getRuntime();
                var3 = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                Network.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.memoryBeforeCleanup, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
                Class3_Sub1.method90(1);
                ClearReferenceCache.clearSoftReference();

                for (var4 = 0; var4 < 10; ++var4) {
                    System.gc();
                }

                var3 = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                Network.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.aClass94_2033, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_PC_CACHE_SIZE)) {
                Network.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.aClass94_442, RSString.stringAnimator(Unsorted.method1727((byte) 123))}), -1);
            }

            if (HDToolKit.highDetail && command.equalsStringIgnoreCase(TextCore.COMMAND_GRAPHICS_CARD_MEMORY)) {
                System.out.println("oncard_geometry:" + Class31.anInt585);
                System.out.println("oncard_2d:" + Class31.memory2D);
                System.out.println("oncard_texture:" + Class31.anInt580);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_CLIENT_CONNECTION)) {
                Network.breakClientConnection();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_JS5_CLIENT_CONNECTION)) {
                Class58.aJs5Worker_917.close();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_JS5_SERVER_CONNECTION)) {
                Class58.aJs5Worker_917.requestTermination();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_CONNECTION)) {
                Signlink.aClass87_665.method1431();
                Network.activeConnection.applyDummyStreams();
                Class58.aJs5Worker_917.applyDummyStreams();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_REPLACE_CANVAS)) {
                Client.forceReplaceCanvasEnable = true;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_REBUILD)) {
                Class117.method1719(25);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_TOGGLE_FPSON)) {
                fpsOverlayEnabled = !fpsOverlayEnabled;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_RENDER_INFO)) {
                renderInfoOverlayEnabled = !renderInfoOverlayEnabled;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_LOWRES_GRAPHICS)) {
                Display.graphicsSettings(false, 0, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_WINDOW)) {
                Display.graphicsSettings(false, 1, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_RESIZE)) {
                Display.graphicsSettings(false, 2, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_FULLSCREEN)) {
                Display.graphicsSettings(false, 3, 1024, GL_SRC_COLOR);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_NOCLIP)) {
                for (var2 = 0; var2 < 4; ++var2) {
                    for (var3 = 1; var3 < 103; ++var3) {
                        for (var4 = 1; var4 < 103; ++var4) {
                            AtmosphereParser.aClass91Array1182[var2].anIntArrayArray1304[var3][var4] = 0;
                        }
                    }
                }
            }

            if (command.startsWith(TextCore.COMMAND_SET_PARTICLES)) {
                Class127_Sub1.method1758(command.substring(15).parseInt());
                Class119.method1730(Signlink.aClass87_665);
                CS2Script.aBoolean2705 = false;
            }

            if (command.startsWith(TextCore.COMMAND_FPS) && Client.modeWhereValue != 0) {
                Class65.method1237(command.substring(6).parseInt());
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_ERROR_TEST)) {
                throw new RuntimeException();
            }

            if (command.startsWith(TextCore.COMMAND_RECT_DEBUG)) {
                Client.rectDebugInt = command.substring(12).trim(1).parseInt();
                Network.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.rectDebugEquals, RSString.stringAnimator(Client.rectDebugInt)}), -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_QA_OP_TEST)) {
                commandQaOpEnabled = true;
            }
            /* Client tweening */
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_TWEENING)) {
                if (tweeningEnabled) {
                    tweeningEnabled = false;
                    Network.addChatMessage(null, 0, TextCore.forcedTweeningDisabled, -1);
                } else {
                    tweeningEnabled = true;
                    Network.addChatMessage(null, 0, TextCore.forcedTweeningEnabled, -1);
                }
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_SHIFT_DROP_CLICK)) {
                shiftClickEnabled = !shiftClickEnabled;
            }
            Network.outgoingBuffer.putOpcode(44);
            Network.outgoingBuffer.writeByte(command.length() + -1);
            Network.outgoingBuffer.writeString(command.substring(2));

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "k.H(" + (command != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

}
