// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:55
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class iu {

   private fm e;
   private fm f;
   private fm g;
   public double[] a;
   public double[] b;
   public double[] c;
   public ij[] d;


   protected iu() {
   }

   public iu(em var1) {
      this.e = new fm(new Random(var1.u * 9871L), 4);
      this.f = new fm(new Random(var1.u * 39811L), 4);
      this.g = new fm(new Random(var1.u * 543321L), 2);
   }

   public ij a(kc var1) {
      return this.a(var1.a, var1.b);
   }

   public ij a(int var1, int var2) {
      return this.a(var1, var2, 1, 1)[0];
   }

   public ij[] a(int var1, int var2, int var3, int var4) {
      this.d = this.a(this.d, var1, var2, var3, var4);
      return this.d;
   }

   public double[] a(double[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new double[var4 * var5];
      }

      var1 = this.e.a(var1, (double)var2, (double)var3, var4, var4, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
      this.c = this.g.a(this.c, (double)var2, (double)var3, var4, var4, 0.25D, 0.25D, 0.5882352941176471D);
      int var6 = 0;

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var5; ++var8) {
            double var9 = this.c[var6] * 1.1D + 0.5D;
            double var11 = 0.01D;
            double var13 = 1.0D - var11;
            double var15 = (var1[var6] * 0.15D + 0.7D) * var13 + var9 * var11;
            var15 = 1.0D - (1.0D - var15) * (1.0D - var15);
            if(var15 < 0.0D) {
               var15 = 0.0D;
            }

            if(var15 > 1.0D) {
               var15 = 1.0D;
            }

            var1[var6] = var15;
            ++var6;
         }
      }

      return var1;
   }

   public ij[] a(ij[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new ij[var4 * var5];
      }

      this.a = this.e.a(this.a, (double)var2, (double)var3, var4, var4, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
      this.b = this.f.a(this.b, (double)var2, (double)var3, var4, var4, 0.05000000074505806D, 0.05000000074505806D, 0.3333333333333333D);
      this.c = this.g.a(this.c, (double)var2, (double)var3, var4, var4, 0.25D, 0.25D, 0.5882352941176471D);
      int var6 = 0;

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var5; ++var8) {
            double var9 = this.c[var6] * 1.1D + 0.5D;
            double var11 = 0.01D;
            double var13 = 1.0D - var11;
            double var15 = (this.a[var6] * 0.15D + 0.7D) * var13 + var9 * var11;
            var11 = 0.0020D;
            var13 = 1.0D - var11;
            double var17 = (this.b[var6] * 0.15D + 0.5D) * var13 + var9 * var11;
            var15 = 1.0D - (1.0D - var15) * (1.0D - var15);
            if(var15 < 0.0D) {
               var15 = 0.0D;
            }

            if(var17 < 0.0D) {
               var17 = 0.0D;
            }

            if(var15 > 1.0D) {
               var15 = 1.0D;
            }

            if(var17 > 1.0D) {
               var17 = 1.0D;
            }

            this.a[var6] = var15;
            this.b[var6] = var17;
            var1[var6++] = ij.a(var15, var17);
         }
      }

      return var1;
   }
}
