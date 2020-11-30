package org.runite.client;

import org.rs09.client.config.GameConfig;
import org.rs09.client.net.Connection;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

class LoginHandler {

    static boolean inDynamicSceneLogin;
    static int loginStage = 0;
    static long isaacServerKey = 0L;
    static int anInt820 = 0;
    static int anInt2079 = 0;

    static void handleLogin() {
        try {
            if (0 != loginStage && 5 != loginStage) {
                try {
                    if (++anInt820 > 2000) {
                        if (Network.activeConnection != null) {
                            Network.activeConnection.close();
                            Network.activeConnection = null;
                        }

                        if (anInt2079 >= 1) {
                            Class158.anInt2005 = -5;
                            loginStage = 0;
                            return;
                        }

                        anInt820 = 0;
                        if (Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                            Class140_Sub6.accRegistryPort = Client.currentPort;
                        } else {
                            Class140_Sub6.accRegistryPort = Class162.anInt2036;
                        }

                        loginStage = 1;
                        ++anInt2079;
                    }
                    if (loginStage == 1) {
                        Class3_Sub9.aClass64_2318 = Signlink.aClass87_665.method1441((byte) 8, Class38_Sub1.accRegistryIp, GameConfig.SERVER_PORT + GameConfig.WORLD);//Class140_Sub6.accRegistryPort);
                        loginStage = 2;
                    }

                    if (loginStage == 2) {
                        if (Objects.requireNonNull(Class3_Sub9.aClass64_2318).anInt978 == 2) {
                            throw new IOException();
                        }

                        if (1 != Class3_Sub9.aClass64_2318.anInt978) {
                            return;
                        }

                        Network.activeConnection = new Connection((Socket) Class3_Sub9.aClass64_2318.anObject974, Signlink.aClass87_665);
                        Class3_Sub9.aClass64_2318 = null;
                        long var1 = PacketParser.aLong3202 = Class131.username.toLong();
                        Network.outgoingBuffer.index = 0;
                        Network.outgoingBuffer.writeByte(14);
                        int nameHash = (int) (var1 >> 16 & 31L);
                        Network.outgoingBuffer.writeByte(nameHash);
                        Network.activeConnection.sendBytes(Network.outgoingBuffer.buffer, 2);
                        if (WorldListEntry.aClass155_2627 != null) {
                            WorldListEntry.aClass155_2627.method2159(106);
                        }

                        if (Class3_Sub21.aClass155_2491 != null) {
                            Class3_Sub21.aClass155_2491.method2159(79);
                        }

                        int var4 = Network.activeConnection.readByte();
                        if (WorldListEntry.aClass155_2627 != null) {
                            WorldListEntry.aClass155_2627.method2159(68);
                        }

                        if (null != Class3_Sub21.aClass155_2491) {
                            Class3_Sub21.aClass155_2491.method2159(109);
                        }

                        if (var4 != 0) {
                            Class158.anInt2005 = var4;
                            loginStage = 0;
                            Network.activeConnection.close();
                            Network.activeConnection = null;
                            return;
                        }

                        loginStage = 3;
                    }

                    if (loginStage == 3) {
                        if (Network.activeConnection.availableBytes() < 8) {
                            return;
                        }

                        Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, 8);
                        Network.incomingBuffer.index = 0;
                        isaacServerKey = Network.incomingBuffer.readLong();
                        int[] var9 = new int[4];
                        Network.outgoingBuffer.index = 0;
                        var9[2] = (int) (isaacServerKey >> 32);
                        var9[3] = (int) isaacServerKey;
                        var9[1] = (int) (Math.random() * 9.9999999E7D);
                        var9[0] = (int) (Math.random() * 9.9999999E7D);
                        Network.outgoingBuffer.writeByte(10);
                        Network.outgoingBuffer.writeInt(var9[0]);
                        Network.outgoingBuffer.writeInt(var9[1]);
                        Network.outgoingBuffer.writeInt(var9[2]);
                        Network.outgoingBuffer.writeInt(var9[3]);
                        Network.outgoingBuffer.writeLong(Class131.username.toLong());
                        Network.outgoingBuffer.writeString(Class131.password);
                        Class3_Sub13_Sub1.sendComputerUsernameAndOS();
                        Network.outgoingBuffer.rsaEncrypt(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441);
                        Network.loginBuffer.index = 0;
                        if (40 == Class143.loadingStage) {
                            Network.loginBuffer.writeByte(18);
                        } else {
                            Network.loginBuffer.writeByte(16);
                        }

                        Network.loginBuffer.writeShort(Network.outgoingBuffer.index + 163 + Class3_Sub13_Sub33.method326((byte) 111, Class163_Sub2.aClass94_2996));
                        Network.loginBuffer.writeInt(GameConfig.CLIENT_BUILD);
                        Network.loginBuffer.writeByte(Class7.anInt2161);
                        Network.loginBuffer.writeByte(!Client.userIsMembers ? 0 : 1);
                        Network.loginBuffer.writeByte(1);
                        Network.loginBuffer.writeByte(Display.gameRenderWindowType());
                        Network.loginBuffer.writeShort(GameShell.gameShellAWTWidth);
                        Network.loginBuffer.writeShort(GameShell.gameShellAWTHeight);
                        Network.loginBuffer.writeByte(Unsorted.anInt3671);
                        Class81.putRandomDataFile(Network.loginBuffer, true);
                        Network.loginBuffer.writeString(Class163_Sub2.aClass94_2996);
                        Network.loginBuffer.writeInt(Class3_Sub26.anInt2554);
                        Network.loginBuffer.writeInt(Class84.method1421());
                        CS2Script.aBoolean2705 = true;
                        Network.loginBuffer.writeShort(Class113.interfacePacketCounter);
                        Network.loginBuffer.writeInt(CacheIndex.skeletonsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.skinsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.configurationsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.interfacesIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.soundFXIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.landscapesIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.musicIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.modelsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.spritesIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.texturesIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.huffmanEncodingIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.music2Index.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.interfaceScriptsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.fontsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.soundFX2Index.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.soundFX3Index.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.objectConfigIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.clientscriptMaskIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.npcConfigIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.itemConfigIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.animationIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.graphicFXIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.clientScriptConfigIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.worldmapIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.quickchatMessagesIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.quickchatMenusIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.materialsIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.particlesConfigIndex.getReferenceTableCrc());
                        Network.loginBuffer.writeInt(CacheIndex.libIndex.getReferenceTableCrc());
                        Network.loginBuffer.putBytes(Network.outgoingBuffer.buffer, Network.outgoingBuffer.index);
                        Network.activeConnection.sendBytes(Network.loginBuffer.buffer, Network.loginBuffer.index);
                        Network.outgoingBuffer.ISAACEncryption(var9);

                        for (int var2 = 0; var2 < 4; ++var2) {
                            var9[var2] += 50;
                        }

                        Network.incomingBuffer.ISAACEncryption(var9);
                        loginStage = 4;
                    }

                    if (loginStage == 4) {
                        if (Network.activeConnection.availableBytes() < 1) {
                            return;
                        }

                        int opcode = Network.activeConnection.readByte();
                        if (opcode == 21) {
                            loginStage = 7;
                        } else if (opcode == 29) {
                            loginStage = 10;
                        } else {
                            if (opcode == 1) {
                                loginStage = 5;
                                Class158.anInt2005 = opcode;
                                return;
                            }

                            if (2 != opcode) {
                                if (opcode != 15) {
                                    if (23 == opcode && anInt2079 < 1) {
                                        loginStage = 1;
                                        ++anInt2079;
                                        anInt820 = 0;
                                        Network.activeConnection.close();
                                        Network.activeConnection = null;
                                        return;
                                    }

                                    Class158.anInt2005 = opcode;
                                    loginStage = 0;
                                    Network.activeConnection.close();
                                    Network.activeConnection = null;
                                    return;
                                }

                                loginStage = 0;
                                Class158.anInt2005 = opcode;
                                return;
                            }

                            loginStage = 8;
                        }
                    }

                    if (6 == loginStage) {
                        Network.outgoingBuffer.index = 0;
                        Network.outgoingBuffer.putOpcode(17);
                        Network.activeConnection.sendBytes(Network.outgoingBuffer.buffer, Network.outgoingBuffer.index);
                        loginStage = 4;
                        return;
                    }

                    if (loginStage == 7) {
                        if (Network.activeConnection.availableBytes() >= 1) {
                            Class3_Sub13_Sub34.anInt3413 = 60 * (3 + Network.activeConnection.readByte());
                            loginStage = 0;
                            Class158.anInt2005 = 21;
                            Network.activeConnection.close();
                            Network.activeConnection = null;
                            return;
                        }

                        return;
                    }

                    if (loginStage == 10) {
                        if (1 <= Network.activeConnection.availableBytes()) {
                            Class3_Sub26.anInt2561 = Network.activeConnection.readByte();
                            loginStage = 0;
                            Class158.anInt2005 = 29;
                            Network.activeConnection.close();
                            Network.activeConnection = null;
                            return;
                        }

                        return;
                    }

                    if (loginStage == 8) {
                        if (Network.activeConnection.availableBytes() < 14) {
                            return;
                        }

                        Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, 14);
                        Network.incomingBuffer.index = 0;
                        Class3_Sub13_Sub26.rights = Network.incomingBuffer.readUnsignedByte();
                        CS2Script.anInt3775 = Network.incomingBuffer.readUnsignedByte();
                        Class3_Sub15.aBoolean2433 = Network.incomingBuffer.readUnsignedByte() == 1;
                        Class121.aBoolean1641 = 1 == Network.incomingBuffer.readUnsignedByte();
                        Unsorted.aBoolean4063 = Network.incomingBuffer.readUnsignedByte() == 1;
                        Class3_Sub13_Sub14.aBoolean3166 = 1 == Network.incomingBuffer.readUnsignedByte();
                        Unsorted.aBoolean29 = Network.incomingBuffer.readUnsignedByte() == 1;
                        Class3_Sub1.localIndex = Network.incomingBuffer.readUnsignedShort();
                        Class3_Sub13_Sub29.disableGEBoxes = Network.incomingBuffer.readUnsignedByte() == 1;
                        Unsorted.isMember = Network.incomingBuffer.readUnsignedByte() == 1;
                        Class113.method1702(Unsorted.isMember);
                        Class8.method845(Unsorted.isMember);
                        if (!Client.userIsMembers) {
                            if ((!Class3_Sub15.aBoolean2433 || Unsorted.aBoolean4063) && !Class3_Sub13_Sub29.disableGEBoxes) {
                                try {
                                    TextCore.aClass94_516.method1577(Signlink.aClass87_665.applet);
                                } catch (Throwable var5) {
                                }
                            } else {
                                try {
                                    Class97.aClass94_1374.method1577(Signlink.aClass87_665.applet);
                                } catch (Throwable var6) {
                                }
                            }
                        }

                        Network.incomingOpcode = Network.incomingBuffer.getOpcode();
                        inDynamicSceneLogin = Network.incomingOpcode == 214;
                        Network.incomingPacketLength = Network.incomingBuffer.readUnsignedShort();
                        loginStage = 9;
                    }

                    if (loginStage == 9) {
                        if (Network.incomingPacketLength > Network.activeConnection.availableBytes()) {
                            return;
                        }

                        Network.incomingBuffer.index = 0;
                        Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, Network.incomingPacketLength);
                        Class158.anInt2005 = 2;
                        loginStage = 0;
                        SequenceDefinition.resetAll();
                        Unsorted.anInt3606 = -1;
                        Class39.updateSceneGraph(inDynamicSceneLogin);
                        Network.incomingOpcode = -1;
                        return;
                    }
                } catch (IOException var7) {
                    if (null != Network.activeConnection) {
                        Network.activeConnection.close();
                        Network.activeConnection = null;
                    }

                    if (anInt2079 >= 1) {
                        loginStage = 0;
                        Class158.anInt2005 = -4;
                    } else {
                        loginStage = 1;
                        anInt820 = 0;
                        ++anInt2079;
                        if (Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                            Class140_Sub6.accRegistryPort = Client.currentPort;
                        } else {
                            Class140_Sub6.accRegistryPort = Class162.anInt2036;
                        }
                    }
                }

            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "ri.A(" + ')');
        }
    }

    static int method1753(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & '\uff80') + var1;
    }

}
