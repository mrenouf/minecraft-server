// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class au extends fs {

   private int a;


   public au(int var1, int var2) {
      super(var1);
      this.a = var2;
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
      gm var24 = var2.a(var13, var23, this.a == 0);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            if(!var2.a(var3, var25, var26, var27)) {
               return var1;
            }

            if(this.a == 0) {
               if(var2.c(var25, var26, var27) == jt.f && var2.b(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new hj(fs.av);
               }

               if(var2.c(var25, var26, var27) == jt.g && var2.b(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new hj(fs.aw);
               }
            } else {
               if(this.a < 0) {
                  return new hj(fs.au);
               }

               if(var24.e == 0) {
                  --var26;
               }

               if(var24.e == 1) {
                  ++var26;
               }

               if(var24.e == 2) {
                  --var27;
               }

               if(var24.e == 3) {
                  ++var27;
               }

               if(var24.e == 4) {
                  --var25;
               }

               if(var24.e == 5) {
                  ++var25;
               }

               if(var2.a(var25, var26, var27) == 0 || !var2.c(var25, var26, var27).a()) {
                  if(var2.q.d && this.a == fy.A.bh) {
                     var2.a(var7 + 0.5D, var9 + 0.5D, var11 + 0.5D, "random.fizz", 0.5F, 2.6F + (var2.l.nextFloat() - var2.l.nextFloat()) * 0.8F);

                     for(int var28 = 0; var28 < 8; ++var28) {
                        var2.a("largesmoke", (double)var25 + Math.random(), (double)var26 + Math.random(), (double)var27 + Math.random(), 0.0D, 0.0D, 0.0D);
                     }
                  } else {
                     var2.b(var25, var26, var27, this.a, 0);
                  }

                  return new hj(fs.au);
               }
            }
         } else if(this.a == 0 && var24.g instanceof be) {
            return new hj(fs.aE);
         }

         return var1;
      }
   }
}
