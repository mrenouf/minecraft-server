// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public abstract class cy extends fy {

   protected cy(int var1, jt var2) {
      super(var1, (var2 == jt.g?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.a(true);
   }

   public static float b(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      float var1 = (float)(var0 + 1) / 9.0F;
      return var1;
   }

   public int a(int var1) {
      return var1 != 0 && var1 != 1?this.bg + 1:this.bg;
   }

   protected int g(em var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4) != this.bs?-1:var1.b(var2, var3, var4);
   }

   protected int b(iq var1, int var2, int var3, int var4) {
      if(var1.c(var2, var3, var4) != this.bs) {
         return -1;
      } else {
         int var5 = var1.b(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean a() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      jt var6 = var1.c(var2, var3, var4);
      return var6 == this.bs?false:(var6 == jt.r?false:(var5 == 1?true:super.a(var1, var2, var3, var4, var5)));
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private bc c(iq var1, int var2, int var3, int var4) {
      bc var5 = bc.b(0.0D, 0.0D, 0.0D);
      int var6 = this.b(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.b(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.c(var8, var3, var10).c()) {
               var11 = this.b(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.b(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.a(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.a(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.b().c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.b();
      return var5;
   }

   public void a(em var1, int var2, int var3, int var4, dw var5, bc var6) {
      bc var7 = this.c((iq)var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int b() {
      return this.bs == jt.f?5:(this.bs == jt.g?30:0);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public void e(em var1, int var2, int var3, int var4) {
      this.i(var1, var2, var3, var4);
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      this.i(var1, var2, var3, var4);
   }

   private void i(em var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bh) {
         if(this.bs == jt.g) {
            boolean var5 = false;
            if(var5 || var1.c(var2, var3, var4 - 1) == jt.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2, var3, var4 + 1) == jt.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2 - 1, var3, var4) == jt.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2 + 1, var3, var4) == jt.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2, var3 + 1, var4) == jt.f) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.b(var2, var3, var4);
               if(var6 == 0) {
                  var1.d(var2, var3, var4, fy.ap.bh);
               } else if(var6 <= 4) {
                  var1.d(var2, var3, var4, fy.w.bh);
               }

               this.h(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void h(em var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.l.nextFloat() - var1.l.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
