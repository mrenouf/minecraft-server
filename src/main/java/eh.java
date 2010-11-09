// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:14
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class eh extends dd {

   private final boolean a;


   protected eh(int var1, boolean var2) {
      super(var1, jr.d);
      this.a = var2;
      this.bh = 45;
   }

   public int a(int var1, Random var2) {
      return fw.aC.bi;
   }

   public void e(el var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.g(var1, var2, var3, var4);
   }

   private void g(el var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      byte var9 = 3;
      if(fw.p[var5] && !fw.p[var6]) {
         var9 = 3;
      }

      if(fw.p[var6] && !fw.p[var5]) {
         var9 = 2;
      }

      if(fw.p[var7] && !fw.p[var8]) {
         var9 = 5;
      }

      if(fw.p[var8] && !fw.p[var7]) {
         var9 = 4;
      }

      var1.b(var2, var3, var4, var9);
   }

   public int a(int var1) {
      return var1 == 1?fw.u.bi:(var1 == 0?fw.u.bi:(var1 == 3?this.bh - 1:this.bh));
   }

   public boolean a(el var1, int var2, int var3, int var4, ft var5) {
      dr var6 = (dr)var1.k(var2, var3, var4);
      var5.a(var6);
      return true;
   }

   public static void a(boolean var0, el var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      av var6 = var1.k(var2, var3, var4);
      if(var0) {
         var1.d(var2, var3, var4, fw.aD.bi);
      } else {
         var1.d(var2, var3, var4, fw.aC.bi);
      }

      var1.b(var2, var3, var4, var5);
      var1.a(var2, var3, var4, var6);
   }

   protected av a_() {
      return new dr();
   }

   public void a(el var1, int var2, int var3, int var4, jt var5) {
      int var6 = hb.b((double)(var5.v * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.b(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.b(var2, var3, var4, 5);
      }

      if(var6 == 2) {
         var1.b(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.b(var2, var3, var4, 4);
      }

   }
}
