// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ev extends bi {

   private int a;
   private int b;


   public ev(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(em var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * 3.1415927F;
      double var7 = (double)((float)(var3 + 8) + hd.a(var6) * (float)this.b / 8.0F);
      double var9 = (double)((float)(var3 + 8) - hd.a(var6) * (float)this.b / 8.0F);
      double var11 = (double)((float)(var5 + 8) + hd.b(var6) * (float)this.b / 8.0F);
      double var13 = (double)((float)(var5 + 8) - hd.b(var6) * (float)this.b / 8.0F);
      double var15 = (double)(var4 + var2.nextInt(3) + 2);
      double var17 = (double)(var4 + var2.nextInt(3) + 2);

      for(int var19 = 0; var19 <= this.b; ++var19) {
         double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.b;
         double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.b;
         double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.b;
         double var26 = var2.nextDouble() * (double)this.b / 16.0D;
         double var28 = (double)(hd.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;
         double var30 = (double)(hd.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;

         for(int var32 = (int)(var20 - var28 / 2.0D); var32 <= (int)(var20 + var28 / 2.0D); ++var32) {
            for(int var33 = (int)(var22 - var30 / 2.0D); var33 <= (int)(var22 + var30 / 2.0D); ++var33) {
               for(int var34 = (int)(var24 - var28 / 2.0D); var34 <= (int)(var24 + var28 / 2.0D); ++var34) {
                  double var35 = ((double)var32 + 0.5D - var20) / (var28 / 2.0D);
                  double var37 = ((double)var33 + 0.5D - var22) / (var30 / 2.0D);
                  double var39 = ((double)var34 + 0.5D - var24) / (var28 / 2.0D);
                  if(var35 * var35 + var37 * var37 + var39 * var39 < 1.0D && var1.a(var32, var33, var34) == fy.t.bh) {
                     var1.a(var32, var33, var34, this.a);
                  }
               }
            }
         }
      }

      return true;
   }
}
