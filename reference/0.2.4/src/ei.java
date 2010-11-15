// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ei extends de {

   private final boolean a;


   protected ei(int var1, boolean var2) {
      super(var1, jt.d);
      this.a = var2;
      this.bg = 45;
   }

   public int a(int var1, Random var2) {
      return fy.aB.bh;
   }

   public void e(em var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.g(var1, var2, var3, var4);
   }

   private void g(em var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      byte var9 = 3;
      if(fy.o[var5] && !fy.o[var6]) {
         var9 = 3;
      }

      if(fy.o[var6] && !fy.o[var5]) {
         var9 = 2;
      }

      if(fy.o[var7] && !fy.o[var8]) {
         var9 = 5;
      }

      if(fy.o[var8] && !fy.o[var7]) {
         var9 = 4;
      }

      var1.b(var2, var3, var4, var9);
   }

   public int a(int var1) {
      return var1 == 1?fy.t.bh:(var1 == 0?fy.t.bh:(var1 == 3?this.bg - 1:this.bg));
   }

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      ds var6 = (ds)var1.k(var2, var3, var4);
      var5.a(var6);
      return true;
   }

   public static void a(boolean var0, em var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      ay var6 = var1.k(var2, var3, var4);
      if(var0) {
         var1.d(var2, var3, var4, fy.aC.bh);
      } else {
         var1.d(var2, var3, var4, fy.aB.bh);
      }

      var1.b(var2, var3, var4, var5);
      var1.a(var2, var3, var4, var6);
   }

   protected ay a_() {
      return new ds();
   }

   public void a(em var1, int var2, int var3, int var4, jv var5) {
      int var6 = hd.b((double)(var5.v * 4.0F / 360.0F) + 0.5D) & 3;
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
