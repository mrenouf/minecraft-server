// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class bm {

   private static int[][] d = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
   private int[] e;
   public double a;
   public double b;
   public double c;
   private static final double f = 0.5D * (Math.sqrt(3.0D) - 1.0D);
   private static final double g = (3.0D - Math.sqrt(3.0D)) / 6.0D;


   public bm() {
      this(new Random());
   }

   public bm(Random var1) {
      this.e = new int[512];
      this.a = var1.nextDouble() * 256.0D;
      this.b = var1.nextDouble() * 256.0D;
      this.c = var1.nextDouble() * 256.0D;

      int var2;
      for(var2 = 0; var2 < 256; this.e[var2] = var2++) {
         ;
      }

      for(var2 = 0; var2 < 256; ++var2) {
         int var3 = var1.nextInt(256 - var2) + var2;
         int var4 = this.e[var2];
         this.e[var2] = this.e[var3];
         this.e[var3] = var4;
         this.e[var2 + 256] = this.e[var2];
      }

   }

   private static int a(double var0) {
      return var0 > 0.0D?(int)var0:(int)var0 - 1;
   }

   private static double a(int[] var0, double var1, double var3) {
      return (double)var0[0] * var1 + (double)var0[1] * var3;
   }

   public void a(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      int var14 = 0;

      for(int var15 = 0; var15 < var6; ++var15) {
         double var16 = (var2 + (double)var15) * var8 + this.a;

         for(int var18 = 0; var18 < var7; ++var18) {
            double var19 = (var4 + (double)var18) * var10 + this.b;
            double var27 = (var16 + var19) * f;
            int var29 = a(var16 + var27);
            int var30 = a(var19 + var27);
            double var31 = (double)(var29 + var30) * g;
            double var33 = (double)var29 - var31;
            double var35 = (double)var30 - var31;
            double var37 = var16 - var33;
            double var39 = var19 - var35;
            byte var42;
            byte var41;
            if(var37 > var39) {
               var41 = 1;
               var42 = 0;
            } else {
               var41 = 0;
               var42 = 1;
            }

            double var43 = var37 - (double)var41 + g;
            double var45 = var39 - (double)var42 + g;
            double var47 = var37 - 1.0D + 2.0D * g;
            double var49 = var39 - 1.0D + 2.0D * g;
            int var51 = var29 & 255;
            int var52 = var30 & 255;
            int var53 = this.e[var51 + this.e[var52]] % 12;
            int var54 = this.e[var51 + var41 + this.e[var52 + var42]] % 12;
            int var55 = this.e[var51 + 1 + this.e[var52 + 1]] % 12;
            double var56 = 0.5D - var37 * var37 - var39 * var39;
            double var21;
            if(var56 < 0.0D) {
               var21 = 0.0D;
            } else {
               var56 *= var56;
               var21 = var56 * var56 * a(d[var53], var37, var39);
            }

            double var58 = 0.5D - var43 * var43 - var45 * var45;
            double var23;
            if(var58 < 0.0D) {
               var23 = 0.0D;
            } else {
               var58 *= var58;
               var23 = var58 * var58 * a(d[var54], var43, var45);
            }

            double var60 = 0.5D - var47 * var47 - var49 * var49;
            double var25;
            if(var60 < 0.0D) {
               var25 = 0.0D;
            } else {
               var60 *= var60;
               var25 = var60 * var60 * a(d[var55], var47, var49);
            }

            int var10001 = var14++;
            var1[var10001] += 70.0D * (var21 + var23 + var25) * var12;
         }
      }

   }

}
