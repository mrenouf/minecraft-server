// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ap extends fy {

   protected ap(int var1, int var2) {
      super(var1, var2, jt.n);
      this.a(true);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public int b() {
      return 20;
   }

   public boolean a() {
      return false;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return var1.d(var2 - 1, var3, var4)?true:(var1.d(var2 + 1, var3, var4)?true:(var1.d(var2, var3, var4 - 1)?true:var1.d(var2, var3, var4 + 1)));
   }

   public void c(em var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      int var7 = var6 & 8;
      var6 &= 7;
      if(var5 == 2 && var1.d(var2, var3, var4 + 1)) {
         var6 = 4;
      }

      if(var5 == 3 && var1.d(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if(var5 == 4 && var1.d(var2 + 1, var3, var4)) {
         var6 = 2;
      }

      if(var5 == 5 && var1.d(var2 - 1, var3, var4)) {
         var6 = 1;
      }

      var1.b(var2, var3, var4, var6 + var7);
   }

   public void e(em var1, int var2, int var3, int var4) {
      if(var1.d(var2 - 1, var3, var4)) {
         var1.b(var2, var3, var4, 1);
      } else if(var1.d(var2 + 1, var3, var4)) {
         var1.b(var2, var3, var4, 2);
      } else if(var1.d(var2, var3, var4 - 1)) {
         var1.b(var2, var3, var4, 3);
      } else if(var1.d(var2, var3, var4 + 1)) {
         var1.b(var2, var3, var4, 4);
      }

      this.g(var1, var2, var3, var4);
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      if(this.g(var1, var2, var3, var4)) {
         int var6 = var1.b(var2, var3, var4) & 7;
         boolean var7 = false;
         if(!var1.d(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if(!var1.d(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if(!var1.d(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if(!var1.d(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if(var7) {
            this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
            var1.d(var2, var3, var4, 0);
         }
      }

   }

   private boolean g(em var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void a(iq var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      float var8 = 0.375F;
      float var9 = 0.625F;
      float var10 = 0.1875F;
      float var11 = 0.125F;
      if(var7) {
         var11 = 0.0625F;
      }

      if(var6 == 1) {
         this.a(0.0F, var8, 0.5F - var10, var11, var9, 0.5F + var10);
      } else if(var6 == 2) {
         this.a(1.0F - var11, var8, 0.5F - var10, 1.0F, var9, 0.5F + var10);
      } else if(var6 == 3) {
         this.a(0.5F - var10, var8, 0.0F, 0.5F + var10, var9, var11);
      } else if(var6 == 4) {
         this.a(0.5F - var10, var8, 1.0F - var11, 0.5F + var10, var9, 1.0F);
      }

   }

   public void b(em var1, int var2, int var3, int var4, fv var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      int var6 = var1.b(var2, var3, var4);
      int var7 = var6 & 7;
      int var8 = 8 - (var6 & 8);
      if(var8 == 0) {
         return true;
      } else {
         var1.b(var2, var3, var4, var7 + var8);
         var1.b(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
         var1.g(var2, var3, var4, this.bh);
         if(var7 == 1) {
            var1.g(var2 - 1, var3, var4, this.bh);
         } else if(var7 == 2) {
            var1.g(var2 + 1, var3, var4, this.bh);
         } else if(var7 == 3) {
            var1.g(var2, var3, var4 - 1, this.bh);
         } else if(var7 == 4) {
            var1.g(var2, var3, var4 + 1, this.bh);
         } else {
            var1.g(var2, var3 - 1, var4, this.bh);
         }

         var1.h(var2, var3, var4, this.bh);
         return true;
      }
   }

   public void b(em var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      if((var5 & 8) > 0) {
         var1.g(var2, var3, var4, this.bh);
         int var6 = var5 & 7;
         if(var6 == 1) {
            var1.g(var2 - 1, var3, var4, this.bh);
         } else if(var6 == 2) {
            var1.g(var2 + 1, var3, var4, this.bh);
         } else if(var6 == 3) {
            var1.g(var2, var3, var4 - 1, this.bh);
         } else if(var6 == 4) {
            var1.g(var2, var3, var4 + 1, this.bh);
         } else {
            var1.g(var2, var3 - 1, var4, this.bh);
         }
      }

      super.b(var1, var2, var3, var4);
   }

   public boolean b(iq var1, int var2, int var3, int var4, int var5) {
      return (var1.b(var2, var3, var4) & 8) > 0;
   }

   public boolean d(em var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      if((var6 & 8) == 0) {
         return false;
      } else {
         int var7 = var6 & 7;
         return var7 == 5 && var5 == 1?true:(var7 == 4 && var5 == 2?true:(var7 == 3 && var5 == 3?true:(var7 == 2 && var5 == 4?true:var7 == 1 && var5 == 5)));
      }
   }

   public boolean c() {
      return true;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.b(var2, var3, var4);
      if((var6 & 8) != 0) {
         var1.b(var2, var3, var4, var6 & 7);
         var1.g(var2, var3, var4, this.bh);
         int var7 = var6 & 7;
         if(var7 == 1) {
            var1.g(var2 - 1, var3, var4, this.bh);
         } else if(var7 == 2) {
            var1.g(var2 + 1, var3, var4, this.bh);
         } else if(var7 == 3) {
            var1.g(var2, var3, var4 - 1, this.bh);
         } else if(var7 == 4) {
            var1.g(var2, var3, var4 + 1, this.bh);
         } else {
            var1.g(var2, var3 - 1, var4, this.bh);
         }

         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
         var1.b(var2, var3, var4, var2, var3, var4);
      }
   }
}
