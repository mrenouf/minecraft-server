// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hm {

   public final byte[] a;


   public hm(int var1) {
      this.a = new byte[var1 >> 1];
   }

   public hm(byte[] var1) {
      this.a = var1;
   }

   public int a(int var1, int var2, int var3) {
      int var4 = var1 << 11 | var3 << 7 | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0?this.a[var5] & 15:this.a[var5] >> 4 & 15;
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = var1 << 11 | var3 << 7 | var2;
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      if(var7 == 0) {
         this.a[var6] = (byte)(this.a[var6] & 240 | var4 & 15);
      } else {
         this.a[var6] = (byte)(this.a[var6] & 15 | (var4 & 15) << 4);
      }

   }

   public boolean a() {
      return this.a != null;
   }
}
