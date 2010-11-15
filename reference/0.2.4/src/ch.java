// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ch {

   public boolean a = false;
   private Random b = new Random();


   public void a(em var1, dw var2, double var3, double var5, double var7, float var9) {
      var1.a(var3, var5, var7, "random.explode", 4.0F, (1.0F + (var1.l.nextFloat() - var1.l.nextFloat()) * 0.2F) * 0.7F);
      HashSet var10 = new HashSet();
      float var11 = var9;
      byte var12 = 16;

      int var13;
      int var14;
      int var15;
      double var25;
      double var27;
      double var29;
      for(var13 = 0; var13 < var12; ++var13) {
         for(var14 = 0; var14 < var12; ++var14) {
            for(var15 = 0; var15 < var12; ++var15) {
               if(var13 == 0 || var13 == var12 - 1 || var14 == 0 || var14 == var12 - 1 || var15 == 0 || var15 == var12 - 1) {
                  double var16 = (double)((float)var13 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var18 = (double)((float)var14 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var20 = (double)((float)var15 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
                  var16 /= var22;
                  var18 /= var22;
                  var20 /= var22;
                  float var24 = var9 * (0.7F + var1.l.nextFloat() * 0.6F);
                  var25 = var3;
                  var27 = var5;
                  var29 = var7;

                  for(float var31 = 0.3F; var24 > 0.0F; var24 -= var31 * 0.75F) {
                     int var32 = hd.b(var25);
                     int var33 = hd.b(var27);
                     int var34 = hd.b(var29);
                     int var35 = var1.a(var32, var33, var34);
                     if(var35 > 0) {
                        var24 -= (fy.m[var35].a(var2) + 0.3F) * var31;
                     }

                     if(var24 > 0.0F) {
                        var10.add(new hn(var32, var33, var34));
                     }

                     var25 += var16 * (double)var31;
                     var27 += var18 * (double)var31;
                     var29 += var20 * (double)var31;
                  }
               }
            }
         }
      }

      var9 *= 2.0F;
      var13 = hd.b(var3 - (double)var9 - 1.0D);
      var14 = hd.b(var3 + (double)var9 + 1.0D);
      var15 = hd.b(var5 - (double)var9 - 1.0D);
      int var45 = hd.b(var5 + (double)var9 + 1.0D);
      int var17 = hd.b(var7 - (double)var9 - 1.0D);
      int var46 = hd.b(var7 + (double)var9 + 1.0D);
      List var19 = var1.b(var2, dt.b((double)var13, (double)var15, (double)var17, (double)var14, (double)var45, (double)var46));
      bc var51 = bc.b(var3, var5, var7);

      double var50;
      double var49;
      double var52;
      for(int var21 = 0; var21 < var19.size(); ++var21) {
         dw var48 = (dw)var19.get(var21);
         double var23 = var48.e(var3, var5, var7) / (double)var9;
         if(var23 <= 1.0D) {
            var25 = var48.p - var3;
            var27 = var48.q - var5;
            var29 = var48.r - var7;
            var49 = (double)hd.a(var25 * var25 + var27 * var27 + var29 * var29);
            var25 /= var49;
            var27 /= var49;
            var29 /= var49;
            var50 = (double)var1.a(var51, var48.z);
            var52 = (1.0D - var23) * var50;
            var48.a(var2, (int)((var52 * var52 + var52) / 2.0D * 8.0D * (double)var9 + 1.0D));
            var48.s += var25 * var52;
            var48.t += var27 * var52;
            var48.u += var29 * var52;
         }
      }

      var9 = var11;
      ArrayList var53 = new ArrayList();
      var53.addAll(var10);

      int var26;
      int var28;
      int var47;
      int var55;
      int var54;
      hn var57;
      int var56;
      for(var54 = var53.size() - 1; var54 >= 0; --var54) {
         var57 = (hn)var53.get(var54);
         var47 = var57.a;
         var55 = var57.b;
         var26 = var57.c;
         var56 = var1.a(var47, var55, var26);

         for(var28 = 0; var28 < 1; ++var28) {
            var29 = (double)((float)var47 + var1.l.nextFloat());
            var49 = (double)((float)var55 + var1.l.nextFloat());
            var50 = (double)((float)var26 + var1.l.nextFloat());
            var52 = var29 - var3;
            double var37 = var49 - var5;
            double var39 = var50 - var7;
            double var41 = (double)hd.a(var52 * var52 + var37 * var37 + var39 * var39);
            var52 /= var41;
            var37 /= var41;
            var39 /= var41;
            double var43 = 0.5D / (var41 / (double)var9 + 0.1D);
            var43 *= (double)(var1.l.nextFloat() * var1.l.nextFloat() + 0.3F);
            var52 *= var43;
            var37 *= var43;
            var39 *= var43;
            var1.a("explode", (var29 + var3 * 1.0D) / 2.0D, (var49 + var5 * 1.0D) / 2.0D, (var50 + var7 * 1.0D) / 2.0D, var52, var37, var39);
            var1.a("smoke", var29, var49, var50, var52, var37, var39);
         }

         if(var56 > 0) {
            fy.m[var56].a(var1, var47, var55, var26, var1.b(var47, var55, var26), 0.3F);
            var1.d(var47, var55, var26, 0);
            fy.m[var56].c(var1, var47, var55, var26);
         }
      }

      if(this.a) {
         for(var54 = var53.size() - 1; var54 >= 0; --var54) {
            var57 = (hn)var53.get(var54);
            var47 = var57.a;
            var55 = var57.b;
            var26 = var57.c;
            var56 = var1.a(var47, var55, var26);
            var28 = var1.a(var47, var55 - 1, var26);
            if(var56 == 0 && fy.o[var28] && this.b.nextInt(3) == 0) {
               var1.d(var47, var55, var26, fy.ar.bh);
            }
         }
      }

   }
}
