package org.runite.jagex;
import java.lang.ref.SoftReference;

final class Class3_Sub28_Sub7_Sub2<T> extends Class3_Sub28_Sub7 {

   private final SoftReference<T> aSoftReference4053;


   final T method567() {

       return this.aSoftReference4053.get();
   }

   final boolean method568() {

      return true;
   }

   Class3_Sub28_Sub7_Sub2(T var1) {
      this.aSoftReference4053 = new SoftReference<>(var1);
   }
}
