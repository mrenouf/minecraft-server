// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:31
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public abstract class cx extends fw {

   protected int d = 1;


   protected cx(int var1, jr var2) {
      super(var1, (var2 == jr.g?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if(var2 == jr.g) {
         this.d = 2;
      }

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
      return var1 != 0 && var1 != 1?this.bh + 1:this.bh;
   }

   protected int g(el var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4) != this.bt?-1:var1.b(var2, var3, var4);
   }

   protected int b(io var1, int var2, int var3, int var4) {
      if(var1.c(var2, var3, var4) != this.bt) {
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

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      jr var6 = var1.c(var2, var3, var4);
      return var6 == this.bt?false:(var6 == jr.r?false:(var5 == 1?true:super.a(var1, var2, var3, var4, var5)));
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private ba c(io var1, int var2, int var3, int var4) {
      ba var5 = ba.b(0.0D, 0.0D, 0.0D);
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

   public void a(el var1, int var2, int var3, int var4, dv var5, ba var6) {
      ba var7 = this.c(var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int b() {
      return this.bt == jr.f?5:(this.bt == jr.g?30:0);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public void e(el var1, int var2, int var3, int var4) {
      this.i(var1, var2, var3, var4);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      this.i(var1, var2, var3, var4);
   }

   private void i(el var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bi) {
         if(this.bt == jr.g) {
            boolean var5 = false;
            if(var5 || var1.c(var2, var3, var4 - 1) == jr.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2, var3, var4 + 1) == jr.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2 - 1, var3, var4) == jr.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2 + 1, var3, var4) == jr.f) {
               var5 = true;
            }

            if(var5 || var1.c(var2, var3 + 1, var4) == jr.f) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.b(var2, var3, var4);
               if(var6 == 0) {
                  var1.d(var2, var3, var4, fw.aq.bi);
               } else if(var6 <= 4) {
                  var1.d(var2, var3, var4, fw.x.bi);
               }

               this.h(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void h(el var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.l.nextFloat() - var1.l.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
