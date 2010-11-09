// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class dz extends fb {

   protected void a(int var1, int var2, byte[] var3, double var4, double var6, double var8) {
      this.a(var1, var2, var3, var4, var6, var8, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void a(int var1, int var2, byte[] var3, double var4, double var6, double var8, float var10, float var11, float var12, int var13, int var14, double var15) {
      double var17 = (double)(var1 * 16 + 8);
      double var19 = (double)(var2 * 16 + 8);
      float var21 = 0.0F;
      float var22 = 0.0F;
      Random var23 = new Random(this.b.nextLong());
      if(var14 <= 0) {
         int var24 = this.a * 16 - 16;
         var14 = var24 - var23.nextInt(var24 / 4);
      }

      boolean var55 = false;
      if(var13 == -1) {
         var13 = var14 / 2;
         var55 = true;
      }

      int var25 = var23.nextInt(var14 / 2) + var14 / 4;

      for(boolean var26 = var23.nextInt(6) == 0; var13 < var14; ++var13) {
         double var27 = 1.5D + (double)(hb.a((float)var13 * 3.1415927F / (float)var14) * var10 * 1.0F);
         double var29 = var27 * var15;
         float var31 = hb.b(var12);
         float var32 = hb.a(var12);
         var4 += (double)(hb.b(var11) * var31);
         var6 += (double)var32;
         var8 += (double)(hb.a(var11) * var31);
         if(var26) {
            var12 *= 0.92F;
         } else {
            var12 *= 0.7F;
         }

         var12 += var22 * 0.1F;
         var11 += var21 * 0.1F;
         var22 *= 0.9F;
         var21 *= 0.75F;
         var22 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 2.0F;
         var21 += (var23.nextFloat() - var23.nextFloat()) * var23.nextFloat() * 4.0F;
         if(!var55 && var13 == var25 && var10 > 1.0F) {
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 - 1.5707964F, var12 / 3.0F, var13, var14, 1.0D);
            this.a(var1, var2, var3, var4, var6, var8, var23.nextFloat() * 0.5F + 0.5F, var11 + 1.5707964F, var12 / 3.0F, var13, var14, 1.0D);
            return;
         }

         if(var55 || var23.nextInt(4) != 0) {
            double var33 = var4 - var17;
            double var35 = var8 - var19;
            double var37 = (double)(var14 - var13);
            double var39 = (double)(var10 + 2.0F + 16.0F);
            if(var33 * var33 + var35 * var35 - var37 * var37 > var39 * var39) {
               return;
            }

            if(var4 >= var17 - 16.0D - var27 * 2.0D && var8 >= var19 - 16.0D - var27 * 2.0D && var4 <= var17 + 16.0D + var27 * 2.0D && var8 <= var19 + 16.0D + var27 * 2.0D) {
               int var53 = hb.b(var4 - var27) - var1 * 16 - 1;
               int var34 = hb.b(var4 + var27) - var1 * 16 + 1;
               int var56 = hb.b(var6 - var29) - 1;
               int var36 = hb.b(var6 + var29) + 1;
               int var54 = hb.b(var8 - var27) - var2 * 16 - 1;
               int var38 = hb.b(var8 + var27) - var2 * 16 + 1;
               if(var53 < 0) {
                  var53 = 0;
               }

               if(var34 > 16) {
                  var34 = 16;
               }

               if(var56 < 1) {
                  var56 = 1;
               }

               if(var36 > 120) {
                  var36 = 120;
               }

               if(var54 < 0) {
                  var54 = 0;
               }

               if(var38 > 16) {
                  var38 = 16;
               }

               boolean var57 = false;

               int var43;
               int var40;
               for(var40 = var53; !var57 && var40 < var34; ++var40) {
                  for(int var41 = var54; !var57 && var41 < var38; ++var41) {
                     for(int var42 = var36 + 1; !var57 && var42 >= var56 - 1; --var42) {
                        var43 = (var40 * 16 + var41) * 128 + var42;
                        if(var42 >= 0 && var42 < 128) {
                           if(var3[var43] == fw.B.bi || var3[var43] == fw.C.bi) {
                              var57 = true;
                           }

                           if(var42 != var56 - 1 && var40 != var53 && var40 != var34 - 1 && var41 != var54 && var41 != var38 - 1) {
                              var42 = var56;
                           }
                        }
                     }
                  }
               }

               if(!var57) {
                  for(var40 = var53; var40 < var34; ++var40) {
                     double var52 = ((double)(var40 + var1 * 16) + 0.5D - var4) / var27;

                     for(var43 = var54; var43 < var38; ++var43) {
                        double var44 = ((double)(var43 + var2 * 16) + 0.5D - var8) / var27;
                        int var46 = (var40 * 16 + var43) * 128 + var36;
                        boolean var47 = false;

                        for(int var48 = var36 - 1; var48 >= var56; --var48) {
                           double var49 = ((double)var48 + 0.5D - var6) / var29;
                           if(var49 > -0.7D && var52 * var52 + var49 * var49 + var44 * var44 < 1.0D) {
                              byte var51 = var3[var46];
                              if(var51 == fw.v.bi) {
                                 var47 = true;
                              }

                              if(var51 == fw.u.bi || var51 == fw.w.bi || var51 == fw.v.bi) {
                                 if(var48 < 10) {
                                    var3[var46] = (byte)fw.D.bi;
                                 } else {
                                    var3[var46] = 0;
                                    if(var47 && var3[var46 - 1] == fw.w.bi) {
                                       var3[var46 - 1] = (byte)fw.v.bi;
                                    }
                                 }
                              }
                           }

                           --var46;
                        }
                     }
                  }

                  if(var55) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(el var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.b.nextInt(this.b.nextInt(this.b.nextInt(40) + 1) + 1);
      if(this.b.nextInt(15) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.b.nextInt(16));
         double var11 = (double)this.b.nextInt(this.b.nextInt(120) + 8);
         double var13 = (double)(var3 * 16 + this.b.nextInt(16));
         int var15 = 1;
         if(this.b.nextInt(4) == 0) {
            this.a(var4, var5, var6, var9, var11, var13);
            var15 += this.b.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.b.nextFloat() * 3.1415927F * 2.0F;
            float var18 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
            this.a(var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0D);
         }
      }

   }
}
