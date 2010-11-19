// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:42
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class bb extends fy {

   private boolean a;


   public bb(int var1, int var2, boolean var3) {
      super(var1, var2, jt.d);
      if(var3) {
         this.a(true);
      }

      this.a = var3;
   }

   public int b() {
      return 30;
   }

   public void b(em var1, int var2, int var3, int var4, fv var5) {
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public void b(em var1, int var2, int var3, int var4, dw var5) {
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      this.g(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5);
   }

   private void g(em var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3, var4);
      if(this.bh == fy.aN.bh) {
         var1.d(var2, var3, var4, fy.aO.bh);
      }

   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(this.bh == fy.aO.bh) {
         var1.d(var2, var3, var4, fy.aN.bh);
      }

   }

   public int a(int var1, Random var2) {
      return fs.aA.aW;
   }

   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   private void h(em var1, int var2, int var3, int var4) {
      Random var5 = var1.l;
      double var6 = 0.0625D;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if(var8 == 0 && !var1.d(var2, var3 + 1, var4)) {
            var11 = (double)(var3 + 1) + var6;
         }

         if(var8 == 1 && !var1.d(var2, var3 - 1, var4)) {
            var11 = (double)(var3 + 0) - var6;
         }

         if(var8 == 2 && !var1.d(var2, var3, var4 + 1)) {
            var13 = (double)(var4 + 1) + var6;
         }

         if(var8 == 3 && !var1.d(var2, var3, var4 - 1)) {
            var13 = (double)(var4 + 0) - var6;
         }

         if(var8 == 4 && !var1.d(var2 + 1, var3, var4)) {
            var9 = (double)(var2 + 1) + var6;
         }

         if(var8 == 5 && !var1.d(var2 - 1, var3, var4)) {
            var9 = (double)(var2 + 0) - var6;
         }

         if(var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < 0.0D || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
