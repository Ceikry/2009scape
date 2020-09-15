package org.runite.jagex;

import org.rs09.client.Linkable;
import org.rs09.client.filestore.ReferenceTable;
import org.rs09.client.filestore.ResourceProvider;
import org.rs09.client.collections.HashTable;

import java.util.Objects;

final class Class151_Sub1 extends ResourceProvider {

    private final Class41 aClass41_2943;
    private ReferenceTable aReferenceTable_2944;
    private final HashTable<ResourceRequest> aHashTable_2946 = new HashTable<>(16);
    private final int anInt2947;
    private int anInt2948 = 0;
    private byte[] aByteArray2949;
    private ResourceRequest aResourceRequest_2950;
    private final Js5Worker aJs5Worker_2953;
    Class41 aClass41_2954;
    private final int anInt2955;
    private final Class73 aClass73_2956;
    private final int anInt2957;
    private boolean aBoolean2962;
    private final Class61 aClass61_2963 = new Class61();
    private int anInt2964 = 0;
    private boolean aBoolean2965;
    private Class61 aClass61_2966;
    private long aLong2967 = 0L;
    private final boolean aBoolean2968;


    public final void request(int var1) {
        try {
            if (null != this.aClass41_2954) {
                Linkable var3;
                for (var3 = this.aClass61_2963.method1222(); null != var3; var3 = this.aClass61_2963.method1221()) {
                    if ((long) var1 == var3.linkableKey) {
                        return;
                    }
                }
                var3 = new Linkable();
                var3.linkableKey = var1;
                this.aClass61_2963.method1215(var3);
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "bg.H(" + var1 + ',' + 127 + ')');
        }
    }

    public final ReferenceTable getReferenceTable() {
        try {
            if (this.aReferenceTable_2944 == null) {
                if (null == this.aResourceRequest_2950) {
                    if (this.aJs5Worker_2953.method1251()) {
                        return null;
                    }

                    this.aResourceRequest_2950 = this.aJs5Worker_2953.addJS5Request(255, (byte) 0, this.anInt2957, true);
                }

                if (this.aResourceRequest_2950.waiting) {
                    return null;
                } else {
                    byte[] var2 = this.aResourceRequest_2950.getData();
                    if (this.aResourceRequest_2950 instanceof CacheResourceRequest) {
                        try {
                            if (var2 == null) {
                                throw new RuntimeException();
                            }

                            this.aReferenceTable_2944 = new ReferenceTable(var2, this.anInt2955);
                            if (this.aReferenceTable_2944.getRevision() != this.anInt2947) {
                                throw new RuntimeException();
                            }
                        } catch (RuntimeException var4) {
                            this.aReferenceTable_2944 = null;
                            if (this.aJs5Worker_2953.method1251()) {
                                this.aResourceRequest_2950 = null;
                            } else {
                                this.aResourceRequest_2950 = this.aJs5Worker_2953.addJS5Request(255, (byte) 0, this.anInt2957, true);
                            }

                            return null;
                        }
                    } else {
                        try {
                            if (var2 == null) {
                                throw new RuntimeException();
                            }

                            this.aReferenceTable_2944 = new ReferenceTable(var2, this.anInt2955);
                        } catch (RuntimeException var5) {
                            this.aJs5Worker_2953.method1252();
                            this.aReferenceTable_2944 = null;
                            if (this.aJs5Worker_2953.method1251()) {
                                this.aResourceRequest_2950 = null;
                            } else {
                                this.aResourceRequest_2950 = this.aJs5Worker_2953.addJS5Request(255, (byte) 0, this.anInt2957, true);
                            }

                            return null;
                        }

                        if (this.aClass41_2943 != null) {
                            this.aClass73_2956.method1305(this.aClass41_2943, var2, this.anInt2957);
                        }
                    }

                    if (null != this.aClass41_2954) {
                        this.aByteArray2949 = new byte[this.aReferenceTable_2944.getArchiveAmount()];
                        this.anInt2948 = 0;
                    }

                    this.aResourceRequest_2950 = null;
                    return this.aReferenceTable_2944;
                }
            } else {
                return this.aReferenceTable_2944;
            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "bg.B(" + 0 + ')');
        }
    }

    final void method2101() {
        try {
            if (this.aClass41_2954 != null) {
                this.aBoolean2965 = true;
                if (this.aClass61_2966 == null) {
                    this.aClass61_2966 = new Class61();
                }

            }
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "bg.A(" + true + ')');
        }
    }

    final int method2102() {
        try {

            return this.anInt2948;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "bg.I(" + 0 + ')');
        }
    }

    final int method2106() {
        try {
            if (null == this.aReferenceTable_2944) {
                return 0;
            } else if (this.aBoolean2962) {
                Linkable var2 = this.aClass61_2966.method1222();
                if (null == var2) {
                    return 0;
                } else {

                    return (int) var2.linkableKey;
                }
            } else {
                return this.aReferenceTable_2944.getValidArchiveAmount();
            }
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "bg.O(" + 1 + ')');
        }
    }

    final void method2107() {
        try {
            if (null != this.aClass61_2966) {
                if (this.getReferenceTable() == null) {
                    return;
                }

                boolean var2;
                Linkable var3;
                int var4;
                if (this.aBoolean2962) {
                    var2 = true;

                    for (var3 = this.aClass61_2966.method1222(); null != var3; var3 = this.aClass61_2966.method1221()) {
                        var4 = (int) var3.linkableKey;
                        if (this.aByteArray2949[var4] == 0) {
                            this.method2109(1, var4, 51);
                        }

                        if (this.aByteArray2949[var4] == 0) {
                            var2 = false;
                        } else {
                            var3.unlink();
                        }
                    }

                    while (this.aReferenceTable_2944.archiveFileLengths.length > this.anInt2964) {
                        if (this.aReferenceTable_2944.archiveFileLengths[this.anInt2964] != 0) {
                            if (this.aClass73_2956.anInt1087 >= 250) {
                                var2 = false;
                                break;
                            }

                            if (0 == this.aByteArray2949[this.anInt2964]) {
                                this.method2109(1, this.anInt2964, 99);
                            }

                            if (this.aByteArray2949[this.anInt2964] == 0) {
                                var2 = false;
                                var3 = new Linkable();
                                var3.linkableKey = this.anInt2964;
                                this.aClass61_2966.method1215(var3);
                            }

                        }
                        ++this.anInt2964;
                    }

                    if (var2) {
                        this.aBoolean2962 = false;
                        this.anInt2964 = 0;
                    }
                } else if (this.aBoolean2965) {
                    var2 = true;

                    for (var3 = this.aClass61_2966.method1222(); var3 != null; var3 = this.aClass61_2966.method1221()) {
                        var4 = (int) var3.linkableKey;
                        if (this.aByteArray2949[var4] != 1) {
                            this.method2109(2, var4, 96);
                        }

                        if (this.aByteArray2949[var4] == 1) {
                            var3.unlink();
                        } else {
                            var2 = false;
                        }
                    }

                    while (this.anInt2964 < this.aReferenceTable_2944.archiveFileLengths.length) {
                        if (this.aReferenceTable_2944.archiveFileLengths[this.anInt2964] == 0) {
                            ++this.anInt2964;
                        } else {
                            if (this.aJs5Worker_2953.method1241()) {
                                var2 = false;
                                break;
                            }

                            if (1 != this.aByteArray2949[this.anInt2964]) {
                                this.method2109(2, this.anInt2964, 47);
                            }

                            if (this.aByteArray2949[this.anInt2964] != 1) {
                                var3 = new Linkable();
                                var3.linkableKey = this.anInt2964;
                                this.aClass61_2966.method1215(var3);
                                var2 = false;
                            }

                            ++this.anInt2964;
                        }
                    }

                    if (var2) {
                        this.anInt2964 = 0;
                        this.aBoolean2965 = false;
                    }
                } else {
                    this.aClass61_2966 = null;
                }
            }

            if (this.aBoolean2968 && this.aLong2967 <= Class5.method830((byte) -55)) {
                for (ResourceRequest var6 = this.aHashTable_2946.first(); var6 != null; var6 = this.aHashTable_2946.next()) {
                    if (!var6.waiting) {
                        if (var6.aBoolean3635) {
                            if (!var6.aBoolean3628) {
                                throw new RuntimeException();
                            }

                            var6.unlink();
                        } else {
                            var6.aBoolean3635 = true;
                        }
                    }
                }

                this.aLong2967 = 1000L + Class5.method830((byte) -55);
            }

        } catch (RuntimeException var5) {
            var5.printStackTrace();
            throw Class44.clientError(var5, "bg.J(" + true + ')');
        }
    }

    public final int percentComplete(int var1) {
            ResourceRequest var3 = this.aHashTable_2946.get(var1);
            return null != var3 ? var3.getCompletion() : 0;
    }

    final int method2108() {
        try {
            if (this.aReferenceTable_2944 == null) {
                return 0;
            } else {

                return this.aReferenceTable_2944.getValidArchiveAmount();
            }
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "bg.M(" + (byte) 1 + ')');
        }
    }

    private ResourceRequest method2109(int var1, int archiveIndex, int var3) {
        try {
            ResourceRequest var4 = this.aHashTable_2946.get(archiveIndex);
            if (null != var4 && var1 == 0 && !var4.aBoolean3628 && var4.waiting) {
                var4.unlink();
                var4 = null;
            }

            if (null == var4) {
                if (0 == var1) {
                    if (null == this.aClass41_2954 || this.aByteArray2949[archiveIndex] == -1) {
                        if (this.aJs5Worker_2953.method1251()) {
                            return null;
                        }

                        var4 = this.aJs5Worker_2953.addJS5Request(this.anInt2957, (byte) 2, archiveIndex, true);
                    } else {
                        var4 = this.aClass73_2956.method1309(this.aClass41_2954, (byte) 106, archiveIndex);
                    }
                } else if (1 == var1) {
                    if (this.aClass41_2954 == null) {
                        throw new RuntimeException();
                    }

                    var4 = this.aClass73_2956.method1307(archiveIndex, this.aClass41_2954);
                } else {
                    if (var1 != 2) {
                        throw new RuntimeException();
                    }

                    if (this.aClass41_2954 == null) {
                        throw new RuntimeException();
                    }

                    if (this.aByteArray2949[archiveIndex] != -1) {
                        throw new RuntimeException();
                    }

                    if (this.aJs5Worker_2953.method1241()) {
                        return null;
                    }

                    var4 = this.aJs5Worker_2953.addJS5Request(this.anInt2957, (byte) 2, archiveIndex, false);
                }

                this.aHashTable_2946.put(archiveIndex, var4);
            }

            if (Objects.requireNonNull(var4).waiting) {
                return null;
            } else {
                byte[] var5 = var4.getData();
                int expectedCRC;
                Js5ResourceRequest var12;
                if (var4 instanceof CacheResourceRequest) {
                    try {
                        if (var5 != null && var5.length > 2) {
                            Class3_Sub13_Sub12.CRC32.reset();
                            Class3_Sub13_Sub12.CRC32.update(var5, 0, -2 + var5.length);
                            expectedCRC = (int) Class3_Sub13_Sub12.CRC32.getValue();
                            if (this.aReferenceTable_2944.archiveCRCs[archiveIndex] == expectedCRC) {
                                int var8 = (var5[-2 + var5.length] << 8 & '\uff00') - -(255 & var5[-1 + var5.length]);
                                if (('\uffff' & this.aReferenceTable_2944.archiveRevisions[archiveIndex]) == var8) {
                                    if (1 != this.aByteArray2949[archiveIndex]) {

                                        ++this.anInt2948;
                                        this.aByteArray2949[archiveIndex] = 1;
                                    }

                                    if (!var4.aBoolean3628) {
                                        var4.unlink();
                                    }

                                    return var4;
                                } else {
                                    System.err.println("CRC mismatch - [entry=" + this.aReferenceTable_2944.archiveRevisions[archiveIndex] + ", pass=" + var8 + "]!");
                                    throw new RuntimeException();
                                }
                            } else {
                                System.err.println("CRC mismatch - [entry=" + this.aReferenceTable_2944.archiveCRCs[archiveIndex] + ", pass=" + expectedCRC + "]!");
                                throw new RuntimeException();
                            }
                        } else {
//                      if(1 != this.aByteArray2949[var2]) {
//                          ++this.anInt2948;
//                          this.aByteArray2949[var2] = 1;
//                       }
//                       if(!((Class3_Sub28_Sub10)var4).aBoolean3628) {
//                          ((Class3_Sub28_Sub10)var4).method86(-1024);
//                       }

//                       return null;
                            throw new RuntimeException("Missing CRC for request " + ((archiveIndex >> 16) & 0xFF) + ", " + (archiveIndex & 0xFFFF));
                        }
                    } catch (Exception var9) {
//            	   var9.printStackTrace();
                        this.aByteArray2949[archiveIndex] = -1;
                        var4.unlink();
                        if (var4.aBoolean3628 && !this.aJs5Worker_2953.method1251()) {
                            var12 = this.aJs5Worker_2953.addJS5Request(this.anInt2957, (byte) 2, archiveIndex, true);
                            this.aHashTable_2946.put(archiveIndex, var12);
                        }

                        return null;
                    }
                } else {
                    try {
                        if (null == var5 || var5.length <= 2) {
                            System.err.println("Invalid CRC?");
                            throw new RuntimeException();
                        }

                        Class3_Sub13_Sub12.CRC32.reset();
                        Class3_Sub13_Sub12.CRC32.update(var5, 0, var5.length - 2);
                        expectedCRC = (int) Class3_Sub13_Sub12.CRC32.getValue();
                        if (expectedCRC != this.aReferenceTable_2944.archiveCRCs[archiveIndex]) {
                            Class3_Sub13_Sub12.CRC32.reset();
                            Class3_Sub13_Sub12.CRC32.update(var5, 0, var5.length - 4);
                            expectedCRC = (int) Class3_Sub13_Sub12.CRC32.getValue();

                            if (expectedCRC != this.aReferenceTable_2944.archiveCRCs[archiveIndex]) {
                                throw new RuntimeException("CRC mismatch - [found=" + this.aReferenceTable_2944.archiveCRCs[archiveIndex] + ", expected=" + expectedCRC + "]!");
                            }
                        }

                        this.aJs5Worker_2953.anInt1011 = 0;
                        this.aJs5Worker_2953.anInt1010 = 0;
                    } catch (RuntimeException var10) {
                        var10.printStackTrace();
                        this.aJs5Worker_2953.method1252();
                        var4.unlink();
                        if (var4.aBoolean3628 && !this.aJs5Worker_2953.method1251()) {
                            var12 = this.aJs5Worker_2953.addJS5Request(this.anInt2957, (byte) 2, archiveIndex, true);
                            this.aHashTable_2946.put(archiveIndex, var12);
                        }

                        return null;
                    }

                    var5[var5.length + -2] = (byte) (this.aReferenceTable_2944.archiveRevisions[archiveIndex] >>> 8);
                    var5[var5.length - 1] = (byte) this.aReferenceTable_2944.archiveRevisions[archiveIndex];
                    if (null != this.aClass41_2954) {
                        this.aClass73_2956.method1305(this.aClass41_2954, var5, archiveIndex);
                        if (1 != this.aByteArray2949[archiveIndex]) {
                            ++this.anInt2948;
                            this.aByteArray2949[archiveIndex] = 1;
                        }
                    }

                    if (!var4.aBoolean3628) {
                        var4.unlink();
                    }

                    return var4;
                }
            }
        } catch (RuntimeException var11) {
//    	  var11.printStackTrace();
            throw Class44.clientError(var11, "bg.C(" + var1 + ',' + archiveIndex + ',' + var3 + ')');
        }
    }

    final void method2110() {
        try {
            if (this.aClass61_2966 != null) {
                if (null != this.getReferenceTable()) {
                    for (Linkable var2 = this.aClass61_2963.method1222(); null != var2; var2 = this.aClass61_2963.method1221()) {
                        int var3 = (int) var2.linkableKey;
                        if (0 <= var3 && this.aReferenceTable_2944.getArchiveAmount() > var3 && this.aReferenceTable_2944.archiveFileLengths[var3] != 0) {
                            if (this.aByteArray2949[var3] == 0) {
                                this.method2109(1, var3, 80);
                            }

                            if (-1 == this.aByteArray2949[var3]) {
                                this.method2109(2, var3, 78);
                            }

                            if (this.aByteArray2949[var3] == 1) {
                                var2.unlink();
                            }
                        } else {
                            var2.unlink();
                        }
                    }

                }
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "bg.D(" + 0 + ')');
        }
    }

    final int method2111() {
        try {
            return null != this.getReferenceTable() ? 100 : (null == this.aResourceRequest_2950 ? 0 : this.aResourceRequest_2950.getCompletion());
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "bg.E(" + -61 + ')');
        }
    }

    public final byte[] get(int var1) {
        try {
            ResourceRequest var3 = this.method2109(0, var1, 103);
            if (var3 == null) {
                return null;
            } else {
                byte[] var4 = var3.getData();
                var3.unlink();
                return var4;
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "bg.K(" + var1 + ',' + 0 + ')');
        }
    }

    Class151_Sub1(int var1, Class41 var2, Class41 var3, Js5Worker var4, Class73 var5, int var6, int var7) {
        try {
            this.anInt2957 = var1;
            this.aClass41_2954 = var2;
            if (this.aClass41_2954 == null) {
                this.aBoolean2962 = false;
            } else {
                this.aBoolean2962 = true;
                this.aClass61_2966 = new Class61();
            }

            this.aClass73_2956 = var5;
            this.anInt2955 = var6;
            this.aBoolean2968 = true;
            this.aClass41_2943 = var3;
            this.aJs5Worker_2953 = var4;
            this.anInt2947 = var7;
            if (null != this.aClass41_2943) {
                this.aResourceRequest_2950 = this.aClass73_2956.method1309(this.aClass41_2943, (byte) 113, this.anInt2957);
            }

        } catch (RuntimeException var10) {
            throw Class44.clientError(var10, "bg.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + true + ')');
        }
    }

}
