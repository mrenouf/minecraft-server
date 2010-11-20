// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class du extends fy {

   private boolean a = true;


   public du(int var1, int var2) {
      super(var1, var2, jt.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return var1.d(var2, var3 - 1, var4);
   }

   private void g(em var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      int var6 = 0;
      this.a = false;
      boolean var7 = var1.n(var2, var3, var4);
      this.a = true;
      int var8;
      int var9;
      int var10;
      if(var7) {
         var6 = 15;
      } else {
         for(var8 = 0; var8 < 4; ++var8) {
            var9 = var2;
            var10 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var10 = var4 - 1;
            }

            if(var8 == 3) {
               ++var10;
            }

            var6 = this.f(var1, var9, var3, var10, var6);
            if(var1.d(var9, var3, var10) && !var1.d(var2, var3 + 1, var4)) {
               var6 = this.f(var1, var9, var3 + 1, var10, var6);
            } else if(!var1.d(var9, var3, var10)) {
               var6 = this.f(var1, var9, var3 - 1, var10, var6);
            }
         }

         if(var6 > 0) {
            --var6;
         } else {
            var6 = 0;
         }
      }

      if(var5 != var6) {
         var1.b(var2, var3, var4, var6);
         var1.b(var2, var3, var4, var2, var3, var4);
         if(var6 > 0) {
            --var6;
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = var2;
            var10 = var4;
            int var11 = var3 - 1;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var10 = var4 - 1;
            }

            if(var8 == 3) {
               ++var10;
            }

            if(var1.d(var9, var3, var10)) {
               var11 += 2;
            }

            int var12 = this.f(var1, var9, var3, var10, -1);
            if(var12 >= 0 && var12 != var6) {
               this.g(var1, var9, var3, var10);
            }

            var12 = this.f(var1, var9, var11, var10, -1);
            if(var12 >= 0 && var12 != var6) {
               this.g(var1, var9, var11, var10);
            }
         }

         if(var5 == 0 || var6 == 0) {
            var1.g(var2, var3, var4, this.bh);
            var1.g(var2 - 1, var3, var4, this.bh);
            var1.g(var2 + 1, var3, var4, this.bh);
            var1.g(var2, var3, var4 - 1, this.bh);
            var1.g(var2, var3, var4 + 1, this.bh);
            var1.g(var2, var3 - 1, var4, this.bh);
            var1.g(var2, var3 + 1, var4, this.bh);
         }
      }

   }

   private void h(em var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bh) {
         var1.g(var2, var3, var4, this.bh);
         var1.g(var2 - 1, var3, var4, this.bh);
         var1.g(var2 + 1, var3, var4, this.bh);
         var1.g(var2, var3, var4 - 1, this.bh);
         var1.g(var2, var3, var4 + 1, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         var1.g(var2, var3 + 1, var4, this.bh);
      }
   }

   public void e(em var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      if(!var1.z) {
         this.g(var1, var2, var3, var4);
         var1.g(var2, var3 + 1, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         this.h(var1, var2 - 1, var3, var4);
         this.h(var1, var2 + 1, var3, var4);
         this.h(var1, var2, var3, var4 - 1);
         this.h(var1, var2, var3, var4 + 1);
         if(var1.d(var2 - 1, var3, var4)) {
            this.h(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.d(var2 + 1, var3, var4)) {
            this.h(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.d(var2, var3, var4 - 1)) {
            this.h(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.d(var2, var3, var4 + 1)) {
            this.h(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void b(em var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(!var1.z) {
         var1.g(var2, var3 + 1, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         this.g(var1, var2, var3, var4);
         this.h(var1, var2 - 1, var3, var4);
         this.h(var1, var2 + 1, var3, var4);
         this.h(var1, var2, var3, var4 - 1);
         this.h(var1, var2, var3, var4 + 1);
         if(var1.d(var2 - 1, var3, var4)) {
            this.h(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.d(var2 + 1, var3, var4)) {
            this.h(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.d(var2, var3, var4 - 1)) {
            this.h(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.d(var2, var3, var4 + 1)) {
            this.h(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int f(em var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) != this.bh) {
         return var5;
      } else {
         int var6 = var1.b(var2, var3, var4);
         return var6 > var5?var6:var5;
      }
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      if(!var1.z) {
         int var6 = var1.b(var2, var3, var4);
         boolean var7 = this.a(var1, var2, var3, var4);
         if(!var7) {
            this.a_(var1, var2, var3, var4, var6);
            var1.d(var2, var3, var4, 0);
         } else {
            this.g(var1, var2, var3, var4);
         }

         super.b(var1, var2, var3, var4, var5);
      }
   }

   public int a(int var1, Random var2) {
      return fs.aA.aW;
   }

   public boolean d(em var1, int var2, int var3, int var4, int var5) {
      return !this.a?false:this.b((iq)var1, var2, var3, var4, var5);
   }

   public boolean b(iq var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return false;
      } else if(var1.b(var2, var3, var4) == 0) {
         return false;
      } else if(var5 == 1) {
         return true;
      } else {
         boolean var6 = b(var1, var2 - 1, var3, var4) || !var1.d(var2 - 1, var3, var4) && b(var1, var2 - 1, var3 - 1, var4);
         boolean var7 = b(var1, var2 + 1, var3, var4) || !var1.d(var2 + 1, var3, var4) && b(var1, var2 + 1, var3 - 1, var4);
         boolean var8 = b(var1, var2, var3, var4 - 1) || !var1.d(var2, var3, var4 - 1) && b(var1, var2, var3 - 1, var4 - 1);
         boolean var9 = b(var1, var2, var3, var4 + 1) || !var1.d(var2, var3, var4 + 1) && b(var1, var2, var3 - 1, var4 + 1);
         if(!var1.d(var2, var3 + 1, var4)) {
            if(var1.d(var2 - 1, var3, var4) && b(var1, var2 - 1, var3 + 1, var4)) {
               var6 = true;
            }

            if(var1.d(var2 + 1, var3, var4) && b(var1, var2 + 1, var3 + 1, var4)) {
               var7 = true;
            }

            if(var1.d(var2, var3, var4 - 1) && b(var1, var2, var3 + 1, var4 - 1)) {
               var8 = true;
            }

            if(var1.d(var2, var3, var4 + 1) && b(var1, var2, var3 + 1, var4 + 1)) {
               var9 = true;
            }
         }

         return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5?true:(var5 == 2 && var8 && !var6 && !var7?true:(var5 == 3 && var9 && !var6 && !var7?true:(var5 == 4 && var6 && !var8 && !var9?true:var5 == 5 && var7 && !var8 && !var9)));
      }
   }

   public boolean c() {
      return this.a;
   }

   public static boolean b(iq var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      return var4 == fy.av.bh?true:(var4 == 0?false:fy.m[var4].c());
   }
}
