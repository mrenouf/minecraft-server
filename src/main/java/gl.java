// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gl extends fs {

   public gl(int var1) {
      super(var1);
   }

   public hj a(hj var1, em var2, fv var3) {
      float var4 = 1.0F;
      float var5 = var3.y + (var3.w - var3.y) * var4;
      float var6 = var3.x + (var3.v - var3.x) * var4;
      double var7 = var3.m + (var3.p - var3.m) * (double)var4;
      double var9 = var3.n + (var3.q - var3.n) * (double)var4 + 1.62D - (double)var3.G;
      double var11 = var3.o + (var3.r - var3.o) * (double)var4;
      bc var13 = bc.b(var7, var9, var11);
      float var14 = hd.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = hd.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -hd.b(-var5 * 0.017453292F);
      float var17 = hd.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      bc var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      gm var24 = var2.a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            if(!var2.z) {
               var2.a(new fi(var2, (double)((float)var25 + 0.5F), (double)((float)var26 + 1.5F), (double)((float)var27 + 0.5F)));
            }

            --var1.a;
         }

         return var1;
      }
   }
}
