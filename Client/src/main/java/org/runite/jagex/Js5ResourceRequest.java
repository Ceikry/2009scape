package org.runite.jagex;

final class Js5ResourceRequest extends ResourceRequest {

    byte aByte4064;
    int anInt4067;
    RSByteBuffer aClass3_Sub30_4069;

    final int getCompletion() {
        try {
            return (this.aClass3_Sub30_4069 == null ? 0 : this.aClass3_Sub30_4069.index * 100 / (-this.aByte4064 + this.aClass3_Sub30_4069.buffer.length));
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "pm.A(" + false + ')');
        }
    }

    final byte[] getData() {
        try {
            if (!this.waiting && -this.aByte4064 + this.aClass3_Sub30_4069.buffer.length <= this.aClass3_Sub30_4069.index) {

                return this.aClass3_Sub30_4069.buffer;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "pm.E(" + false + ')');
        }
    }

}
