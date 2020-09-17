package org.runite.jagex;
import org.runite.GameLaunch;
import org.rs09.client.net.Connection;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

class Class127 {

   static int[] anIntArray1679 = new int[14];
   static CacheIndex aClass153_1680;
   static int[] anIntArray1681;

   static boolean dynamic;
   static void handleLogin(byte var0) {
      try {
         if(0 != Class3_Sub13_Sub25.loginStage && 5 != Class3_Sub13_Sub25.loginStage) {
            try {
               if(++Class50.anInt820 > 2000) {
                  if(Class3_Sub15.activeConnection != null) {
                     Class3_Sub15.activeConnection.close();
                     Class3_Sub15.activeConnection = null;
                  }

                  if(Class166.anInt2079 >= 1) {
                     Class158.anInt2005 = -5;
                     Class3_Sub13_Sub25.loginStage = 0;
                     return;
                  }

                  Class50.anInt820 = 0;
                  if(Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                     Class140_Sub6.accRegistryPort = Client.currentPort;
                  } else {
                     Class140_Sub6.accRegistryPort = Class162.anInt2036;
                  }

                  Class3_Sub13_Sub25.loginStage = 1;
                  ++Class166.anInt2079;
               }
               if(Class3_Sub13_Sub25.loginStage == 1) {
                  Class3_Sub9.aClass64_2318 = Class38.aClass87_665.method1441((byte)8, Class38_Sub1.accRegistryIp, 43594 + GameLaunch.SETTINGS.getWorld());//Class140_Sub6.accRegistryPort);
                  Class3_Sub13_Sub25.loginStage = 2;
               }

               if(Class3_Sub13_Sub25.loginStage == 2) {
                  if(Objects.requireNonNull(Class3_Sub9.aClass64_2318).anInt978 == 2) {
                     throw new IOException();
                  }

                  if(1 != Class3_Sub9.aClass64_2318.anInt978) {
                     return;
                  }

                  Class3_Sub15.activeConnection = new Connection((Socket)Class3_Sub9.aClass64_2318.anObject974, Class38.aClass87_665);
                  Class3_Sub9.aClass64_2318 = null;
                  long var1 = Class3_Sub13_Sub16.aLong3202 = Class3_Sub28_Sub14.username.toLong();
                  Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                  Class3_Sub13_Sub1.outgoingBuffer.writeByte(14);
                  int nameHash = (int)(var1 >> 16 & 31L);
                  Class3_Sub13_Sub1.outgoingBuffer.writeByte(nameHash);
                  Class3_Sub15.activeConnection.sendBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, 2);
                  if(WorldListEntry.aClass155_2627 != null) {
                     WorldListEntry.aClass155_2627.method2159(106);
                  }

                  if(Class3_Sub21.aClass155_2491 != null) {
                     Class3_Sub21.aClass155_2491.method2159(var0 + 88);
                  }

                  int var4 = Class3_Sub15.activeConnection.readByte();
                  if(WorldListEntry.aClass155_2627 != null) {
                     WorldListEntry.aClass155_2627.method2159(68);
                  }

                  if(null != Class3_Sub21.aClass155_2491) {
                     Class3_Sub21.aClass155_2491.method2159(109);
                  }

                  if(var4 != 0) {
                     Class158.anInt2005 = var4;
                     Class3_Sub13_Sub25.loginStage = 0;
                     Class3_Sub15.activeConnection.close();
                     Class3_Sub15.activeConnection = null;
                     return;
                  }

                  Class3_Sub13_Sub25.loginStage = 3;
               }

               if(Class3_Sub13_Sub25.loginStage == 3) {
                  if(Class3_Sub15.activeConnection.availableBytes() < 8) {
                     return;
                  }

                  Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, 8);
                  GraphicDefinition.incomingBuffer.index = 0;
                  Class3_Sub13_Sub27.isaacServerKey = GraphicDefinition.incomingBuffer.readLong();
                  int[] var9 = new int[4];
                  Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                  var9[2] = (int)(Class3_Sub13_Sub27.isaacServerKey >> 32);
                  var9[3] = (int)Class3_Sub13_Sub27.isaacServerKey;
                  var9[1] = (int)(Math.random() * 9.9999999E7D);
                  var9[0] = (int)(Math.random() * 9.9999999E7D);
                  Class3_Sub13_Sub1.outgoingBuffer.writeByte(10);
                  Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[0]);
                  Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[1]);
                  Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[2]);
                  Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[3]);
                  Class3_Sub13_Sub1.outgoingBuffer.writeLong(Class3_Sub28_Sub14.username.toLong());
                  Class3_Sub13_Sub1.outgoingBuffer.writeString(Class3_Sub28_Sub14.password);
                  Class3_Sub13_Sub1.method229();
                  Class3_Sub13_Sub1.outgoingBuffer.rsaEncrypt(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441);
                  Unsorted.aClass3_Sub30_Sub1_2942.index = 0;
                  if(40 == Class143.loadingStage) {
                     Unsorted.aClass3_Sub30_Sub1_2942.writeByte(18);
                  } else {
                     Unsorted.aClass3_Sub30_Sub1_2942.writeByte(16);
                  }

                  Unsorted.aClass3_Sub30_Sub1_2942.writeShort(Class3_Sub13_Sub1.outgoingBuffer.index + 163 - -Class3_Sub13_Sub33.method326((byte)111, Class163_Sub2.aClass94_2996));
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(530);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeByte(Class7.anInt2161);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeByte(!Class3_Sub28_Sub19.aBoolean3779?0:1);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeByte(1);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeByte(Class83.method1411(0));
                  Unsorted.aClass3_Sub30_Sub1_2942.writeShort(Class23.anInt454);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeShort(Class140_Sub7.anInt2934);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeByte(Class3_Sub28_Sub14.anInt3671);
                  Class81.putRandomDataFile(Unsorted.aClass3_Sub30_Sub1_2942, true);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeString(Class163_Sub2.aClass94_2996);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub26.anInt2554);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class84.method1421());
                  Class140_Sub2.aBoolean2705 = true;
                  Unsorted.aClass3_Sub30_Sub1_2942.writeShort(Class113.interfacePacketCounter);
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class75_Sub3.aClass153_2660.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub28_Sub19.aClass153_3772.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class164.aClass153_2052.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class140_Sub3.aClass153_2727.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class146.aClass153_1902.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub13_Sub6.aClass153_3077.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class75_Sub2.aClass153_2645.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class159.aClass153_2019.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class140_Sub6.spritesCacheIndex.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub13_Sub28.aClass153_3352.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub13_Sub25.aClass153_3304.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Unsorted.aClass153_2573.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub1.interfaceScriptsIndex.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Unsorted.aClass153_1948.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub19.aClass153_2474.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(NPC.aClass153_3994.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class168.aClass153_2097.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(NPC.aClass153_3993.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class101.aClass153_1428.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class100.aClass153_1410.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub13_Sub36.aClass153_3429.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class70.aClass153_1058.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub22.aClass153_2528.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class133.aClass153_1751.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class140_Sub7.aClass153_2939.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class3_Sub4.aClass153_2258.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class97.aClass153_1376.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class132.aClass153_1735.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.writeInt(Class132.libIndex.getReferenceTableCrc());
                  Unsorted.aClass3_Sub30_Sub1_2942.putBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, Class3_Sub13_Sub1.outgoingBuffer.index);
                  Class3_Sub15.activeConnection.sendBytes(Unsorted.aClass3_Sub30_Sub1_2942.buffer, Unsorted.aClass3_Sub30_Sub1_2942.index);
                  Class3_Sub13_Sub1.outgoingBuffer.method814(var9);

                  for(int var2 = 0; var2 < 4; ++var2) {
                     var9[var2] += 50;
                  }

                  GraphicDefinition.incomingBuffer.method814(var9);
                  Class3_Sub13_Sub25.loginStage = 4;
               }

               if(Class3_Sub13_Sub25.loginStage == 4) {
                  if(Class3_Sub15.activeConnection.availableBytes() < 1) {
                     return;
                  }

                  int opcode = Class3_Sub15.activeConnection.readByte();
                  if(opcode == 21) {
                     Class3_Sub13_Sub25.loginStage = 7;
                  } else if (opcode == 29) {
                     Class3_Sub13_Sub25.loginStage = 10;
                  } else {
                     if (opcode == 1) {
                        Class3_Sub13_Sub25.loginStage = 5;
                        Class158.anInt2005 = opcode;
                        return;
                     }

                     if (2 != opcode) {
                        if (opcode != 15) {
                           if (23 == opcode && Class166.anInt2079 < 1) {
                              Class3_Sub13_Sub25.loginStage = 1;
                              ++Class166.anInt2079;
                              Class50.anInt820 = 0;
                              Class3_Sub15.activeConnection.close();
                              Class3_Sub15.activeConnection = null;
                              return;
                           }

                           Class158.anInt2005 = opcode;
                           Class3_Sub13_Sub25.loginStage = 0;
                           Class3_Sub15.activeConnection.close();
                           Class3_Sub15.activeConnection = null;
                           return;
                        }

                        Class3_Sub13_Sub25.loginStage = 0;
                        Class158.anInt2005 = opcode;
                        return;
                     }

                     Class3_Sub13_Sub25.loginStage = 8;
                  }
               }

               if(6 == Class3_Sub13_Sub25.loginStage) {
                  Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                  Class3_Sub13_Sub1.outgoingBuffer.putOpcode(17);
                  Class3_Sub15.activeConnection.sendBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, Class3_Sub13_Sub1.outgoingBuffer.index);
                  Class3_Sub13_Sub25.loginStage = 4;
                  return;
               }

               if(Class3_Sub13_Sub25.loginStage == 7) {
                  if(Class3_Sub15.activeConnection.availableBytes() >= 1) {
                     Class3_Sub13_Sub34.anInt3413 = 60 * (3 + Class3_Sub15.activeConnection.readByte());
                     Class3_Sub13_Sub25.loginStage = 0;
                     Class158.anInt2005 = 21;
                     Class3_Sub15.activeConnection.close();
                     Class3_Sub15.activeConnection = null;
                     return;
                  }

                  return;
               }

               if(Class3_Sub13_Sub25.loginStage == 10) {
                  if(1 <= Class3_Sub15.activeConnection.availableBytes()) {
                     Class3_Sub26.anInt2561 = Class3_Sub15.activeConnection.readByte();
                     Class3_Sub13_Sub25.loginStage = 0;
                     Class158.anInt2005 = 29;
                     Class3_Sub15.activeConnection.close();
                     Class3_Sub15.activeConnection = null;
                     return;
                  }

                  return;
               }

               if(Class3_Sub13_Sub25.loginStage == 8) {
                  if(Class3_Sub15.activeConnection.availableBytes() < 14) {
                     return;
                  }

                  Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, 14);
                  GraphicDefinition.incomingBuffer.index = 0;
                  Class3_Sub13_Sub26.rights = GraphicDefinition.incomingBuffer.readUnsignedByte();
                  Class3_Sub28_Sub19.anInt3775 = GraphicDefinition.incomingBuffer.readUnsignedByte();
                  Class3_Sub15.aBoolean2433 = GraphicDefinition.incomingBuffer.readUnsignedByte() == 1;
                  Class121.aBoolean1641 = 1 == GraphicDefinition.incomingBuffer.readUnsignedByte();
                  Unsorted.aBoolean4063 = GraphicDefinition.incomingBuffer.readUnsignedByte() == 1;
                  Class3_Sub13_Sub14.aBoolean3166 = 1 == GraphicDefinition.incomingBuffer.readUnsignedByte();
                  Unsorted.aBoolean29 = GraphicDefinition.incomingBuffer.readUnsignedByte() == 1;
                  Class3_Sub1.localIndex = GraphicDefinition.incomingBuffer.readUnsignedShort();
                  Class3_Sub13_Sub29.disableGEBoxes = GraphicDefinition.incomingBuffer.readUnsignedByte() == 1;
                  Unsorted.isMember = GraphicDefinition.incomingBuffer.readUnsignedByte() == 1;
                  Class113.method1702(Unsorted.isMember);
                  Class8.method845(Unsorted.isMember);
                  if(!Class3_Sub28_Sub19.aBoolean3779) {
                     if((!Class3_Sub15.aBoolean2433 || Unsorted.aBoolean4063) && !Class3_Sub13_Sub29.disableGEBoxes) {
                        try {
                           Class27.aClass94_516.method1577(Class38.aClass87_665.applet);
                        } catch (Throwable var5) {
                        }
                     } else {
                        try {
                           Class97.aClass94_1374.method1577(Class38.aClass87_665.applet);
                        } catch (Throwable var6) {
                        }
                     }
                  }

                  Unsorted.incomingOpcode = GraphicDefinition.incomingBuffer.getOpcode();
                  dynamic = Unsorted.incomingOpcode == 214;
                  Unsorted.incomingPacketLength = GraphicDefinition.incomingBuffer.readUnsignedShort();
                  Class3_Sub13_Sub25.loginStage = 9;
               }

               if(Class3_Sub13_Sub25.loginStage == 9) {
                  if(Unsorted.incomingPacketLength > Class3_Sub15.activeConnection.availableBytes()) {
                     return;
                  }

                  GraphicDefinition.incomingBuffer.index = 0;
                  Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, Unsorted.incomingPacketLength);
                  Class158.anInt2005 = 2;
                  Class3_Sub13_Sub25.loginStage = 0;
                  AnimationDefinition.resetAll();
                  Unsorted.anInt3606 = -1;
                  Class39.updateSceneGraph(dynamic);
                  Unsorted.incomingOpcode = -1;
                  return;
               }

               if(var0 != -9) {
                  aClass153_1680 = (CacheIndex)null;
               }
            } catch (IOException var7) {
               if(null != Class3_Sub15.activeConnection) {
                  Class3_Sub15.activeConnection.close();
                  Class3_Sub15.activeConnection = null;
               }

               if(Class166.anInt2079 >= 1) {
                  Class3_Sub13_Sub25.loginStage = 0;
                  Class158.anInt2005 = -4;
               } else {
                  Class3_Sub13_Sub25.loginStage = 1;
                  Class50.anInt820 = 0;
                  ++Class166.anInt2079;
                  if(Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                     Class140_Sub6.accRegistryPort = Client.currentPort;
                  } else {
                     Class140_Sub6.accRegistryPort = Class162.anInt2036;
                  }
               }
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.clientError(var8, "ri.A(" + var0 + ')');
      }
   }

   static int method1753(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

}
