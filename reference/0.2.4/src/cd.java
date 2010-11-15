// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:59
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class cd extends r {

   private int b;
   private int c = 0;


   protected cd(int var1, int var2) {
      super(var1, var2, jt.h, false);
      this.b = var2;
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      this.c = 0;
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public void e(em var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) == this.bh) {
         int var6 = var1.b(var2, var3, var4);
         if(var6 != 0 && var6 == var5 - 1) {
            this.g(var1, var2, var3, var4);
         }
      }
   }

   public void g(em var1, int var2, int var3, int var4) {
      if(this == null) {
         if(this.c++ < 100) {
            int var5 = var1.c(var2, var3 - 1, var4).a()?16:0;
            int var6 = var1.b(var2, var3, var4);
            if(var6 == 0) {
               var6 = 1;
               var1.b(var2, var3, var4, 1);
            }

            var5 = this.f(var1, var2, var3 - 1, var4, var5);
            var5 = this.f(var1, var2, var3, var4 - 1, var5);
            var5 = this.f(var1, var2, var3, var4 + 1, var5);
            var5 = this.f(var1, var2 - 1, var3, var4, var5);
            var5 = this.f(var1, var2 + 1, var3, var4, var5);
            int var7 = var5 - 1;
            if(var7 < 10) {
               var7 = 1;
            }

            if(var7 != var6) {
               var1.b(var2, var3, var4, var7);
               this.e(var1, var2, var3 - 1, var4, var6);
               this.e(var1, var2, var3 + 1, var4, var6);
               this.e(var1, var2, var3, var4 - 1, var6);
               this.e(var1, var2, var3, var4 + 1, var6);
               this.e(var1, var2 - 1, var3, var4, var6);
               this.e(var1, var2 + 1, var3, var4, var6);
            }

         }
      }
   }

   private int f(em var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.a(var2, var3, var4);
      if(var6 == fy.J.bh) {
         return 16;
      } else {
         if(var6 == this.bh) {
            int var7 = var1.b(var2, var3, var4);
            if(var7 != 0 && var7 > var5) {
               return var7;
            }
         }

         return var5;
      }
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(this == null) {
         int var6 = var1.b(var2, var3, var4);
         if(var6 == 0) {
            this.c = 0;
            this.g(var1, var2, var3, var4);
         } else if(var6 == 1) {
            this.h(var1, var2, var3, var4);
         } else if(var5.nextInt(10) == 0) {
            this.g(var1, var2, var3, var4);
         }

      }
   }

   private void h(em var1, int var2, int var3, int var4) {
      this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
      var1.d(var2, var3, var4, 0);
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public int a(int var1, Random var2) {
      return fy.y.bh;
   }

   public boolean a() {
      return !this.a;
   }

   public void b(em var1, int var2, int var3, int var4, dw var5) {
      super.b(var1, var2, var3, var4, var5);
   }
}
