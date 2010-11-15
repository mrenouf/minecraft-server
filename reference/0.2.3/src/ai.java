// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:34
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ai extends cn {

   private int[] d;
   public double a;
   public double b;
   public double c;


   public ai() {
      this(new Random());
   }

   public ai(Random var1) {
      this.d = new int[512];
      this.a = var1.nextDouble() * 256.0D;
      this.b = var1.nextDouble() * 256.0D;
      this.c = var1.nextDouble() * 256.0D;

      int var2;
      for(var2 = 0; var2 < 256; this.d[var2] = var2++) {
         ;
      }

      for(var2 = 0; var2 < 256; ++var2) {
         int var3 = var1.nextInt(256 - var2) + var2;
         int var4 = this.d[var2];
         this.d[var2] = this.d[var3];
         this.d[var3] = var4;
         this.d[var2 + 256] = this.d[var2];
      }

   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 + this.a;
      double var9 = var3 + this.b;
      double var11 = var5 + this.c;
      int var13 = (int)var7;
      int var14 = (int)var9;
      int var15 = (int)var11;
      if(var7 < (double)var13) {
         --var13;
      }

      if(var9 < (double)var14) {
         --var14;
      }

      if(var11 < (double)var15) {
         --var15;
      }

      int var16 = var13 & 255;
      int var17 = var14 & 255;
      int var18 = var15 & 255;
      var7 -= (double)var13;
      var9 -= (double)var14;
      var11 -= (double)var15;
      double var19 = var7 * var7 * var7 * (var7 * (var7 * 6.0D - 15.0D) + 10.0D);
      double var21 = var9 * var9 * var9 * (var9 * (var9 * 6.0D - 15.0D) + 10.0D);
      double var23 = var11 * var11 * var11 * (var11 * (var11 * 6.0D - 15.0D) + 10.0D);
      int var25 = this.d[var16] + var17;
      int var26 = this.d[var25] + var18;
      int var27 = this.d[var25 + 1] + var18;
      int var28 = this.d[var16 + 1] + var17;
      int var29 = this.d[var28] + var18;
      int var30 = this.d[var28 + 1] + var18;
      return this.b(var23, this.b(var21, this.b(var19, this.a(this.d[var26], var7, var9, var11), this.a(this.d[var29], var7 - 1.0D, var9, var11)), this.b(var19, this.a(this.d[var27], var7, var9 - 1.0D, var11), this.a(this.d[var30], var7 - 1.0D, var9 - 1.0D, var11))), this.b(var21, this.b(var19, this.a(this.d[var26 + 1], var7, var9, var11 - 1.0D), this.a(this.d[var29 + 1], var7 - 1.0D, var9, var11 - 1.0D)), this.b(var19, this.a(this.d[var27 + 1], var7, var9 - 1.0D, var11 - 1.0D), this.a(this.d[var30 + 1], var7 - 1.0D, var9 - 1.0D, var11 - 1.0D))));
   }

   public final double b(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public final double a(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      double var7 = (double)(1 - ((var6 & 8) >> 3)) * var2;
      double var9 = var6 < 4?0.0D:(var6 != 12 && var6 != 14?var4:var2);
      return ((var6 & 1) == 0?var7:-var7) + ((var6 & 2) == 0?var9:-var9);
   }

   public final double a(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8?var2:var4;
      double var11 = var8 < 4?var4:(var8 != 12 && var8 != 14?var6:var2);
      return ((var8 & 1) == 0?var9:-var9) + ((var8 & 2) == 0?var11:-var11);
   }

   public double a(double var1, double var3) {
      return this.a(var1, var3, 0.0D);
   }

   public void a(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      int var19;
      boolean var23;
      int var22;
      boolean var24;
      double var29;
      double var31;
      int var40;
      int var10001;
      int var47;
      int var78;
      int var72;
      if(var9 == 1) {
         boolean var76 = false;
         boolean var75 = false;
         boolean var21 = false;
         boolean var71 = false;
         var23 = false;
         var24 = false;
         double var66 = 0.0D;
         double var68 = 0.0D;
         var29 = 0.0D;
         var31 = 0.0D;
         int var65 = 0;
         double var34 = 1.0D / var17;

         for(int var36 = 0; var36 < var8; ++var36) {
            double var77 = (var2 + (double)var36) * var11 + this.a;
            int var39 = (int)var77;
            if(var77 < (double)var39) {
               --var39;
            }

            var40 = var39 & 255;
            var77 -= (double)var39;
            double var64 = var77 * var77 * var77 * (var77 * (var77 * 6.0D - 15.0D) + 10.0D);

            for(int var43 = 0; var43 < var10; ++var43) {
               double var79 = (var6 + (double)var43) * var15 + this.c;
               int var46 = (int)var79;
               if(var79 < (double)var46) {
                  --var46;
               }

               var47 = var46 & 255;
               var79 -= (double)var46;
               double var73 = var79 * var79 * var79 * (var79 * (var79 * 6.0D - 15.0D) + 10.0D);
               var19 = this.d[var40] + 0;
               int var69 = this.d[var19] + var47;
               int var81 = this.d[var19 + 1] + var47;
               var22 = this.d[var40 + 1] + 0;
               var72 = this.d[var22] + var47;
               var78 = this.d[var22 + 1] + var47;
               var66 = this.b(var64, this.a(this.d[var69], var77, var79), this.a(this.d[var72], var77 - 1.0D, 0.0D, var79));
               var29 = this.b(var64, this.a(this.d[var69 + 1], var77, 0.0D, var79 - 1.0D), this.a(this.d[var72 + 1], var77 - 1.0D, 0.0D, var79 - 1.0D));
               double var50 = this.b(var73, var66, var29);
               var10001 = var65++;
               var1[var10001] += var50 * var34;
            }
         }

      } else {
         var19 = 0;
         double var20 = 1.0D / var17;
         var22 = -1;
         var23 = false;
         var24 = false;
         boolean var25 = false;
         boolean var26 = false;
         boolean var27 = false;
         boolean var28 = false;
         var29 = 0.0D;
         var31 = 0.0D;
         double var33 = 0.0D;
         double var35 = 0.0D;

         for(int var37 = 0; var37 < var8; ++var37) {
            double var38 = (var2 + (double)var37) * var11 + this.a;
            var40 = (int)var38;
            if(var38 < (double)var40) {
               --var40;
            }

            int var41 = var40 & 255;
            var38 -= (double)var40;
            double var42 = var38 * var38 * var38 * (var38 * (var38 * 6.0D - 15.0D) + 10.0D);

            for(int var44 = 0; var44 < var10; ++var44) {
               double var45 = (var6 + (double)var44) * var15 + this.c;
               var47 = (int)var45;
               if(var45 < (double)var47) {
                  --var47;
               }

               int var48 = var47 & 255;
               var45 -= (double)var47;
               double var49 = var45 * var45 * var45 * (var45 * (var45 * 6.0D - 15.0D) + 10.0D);

               for(int var51 = 0; var51 < var9; ++var51) {
                  double var52 = (var4 + (double)var51) * var13 + this.b;
                  int var54 = (int)var52;
                  if(var52 < (double)var54) {
                     --var54;
                  }

                  int var55 = var54 & 255;
                  var52 -= (double)var54;
                  double var56 = var52 * var52 * var52 * (var52 * (var52 * 6.0D - 15.0D) + 10.0D);
                  if(var51 == 0 || var55 != var22) {
                     var22 = var55;
                     var72 = this.d[var41] + var55;
                     var78 = this.d[var72] + var48;
                     int var74 = this.d[var72 + 1] + var48;
                     int var70 = this.d[var41 + 1] + var55;
                     int var67 = this.d[var70] + var48;
                     int var80 = this.d[var70 + 1] + var48;
                     var29 = this.b(var42, this.a(this.d[var78], var38, var52, var45), this.a(this.d[var67], var38 - 1.0D, var52, var45));
                     var31 = this.b(var42, this.a(this.d[var74], var38, var52 - 1.0D, var45), this.a(this.d[var80], var38 - 1.0D, var52 - 1.0D, var45));
                     var33 = this.b(var42, this.a(this.d[var78 + 1], var38, var52, var45 - 1.0D), this.a(this.d[var67 + 1], var38 - 1.0D, var52, var45 - 1.0D));
                     var35 = this.b(var42, this.a(this.d[var74 + 1], var38, var52 - 1.0D, var45 - 1.0D), this.a(this.d[var80 + 1], var38 - 1.0D, var52 - 1.0D, var45 - 1.0D));
                  }

                  double var58 = this.b(var56, var29, var31);
                  double var60 = this.b(var56, var33, var35);
                  double var62 = this.b(var49, var58, var60);
                  var10001 = var19++;
                  var1[var10001] += var62 * var20;
               }
            }
         }

      }
   }
}
