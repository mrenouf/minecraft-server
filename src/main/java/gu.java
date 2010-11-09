// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:56
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class gu extends fw {

   protected gu(int var1, int var2) {
      super(var1, var2, jr.n);
      this.a(true);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      return var1.d(var2 - 1, var3, var4)?true:(var1.d(var2 + 1, var3, var4)?true:(var1.d(var2, var3, var4 - 1)?true:(var1.d(var2, var3, var4 + 1)?true:var1.d(var2, var3 - 1, var4))));
   }

   public void c(el var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      if(var5 == 1 && var1.d(var2, var3 - 1, var4)) {
         var6 = 5;
      }

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

      var1.b(var2, var3, var4, var6);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.b(var2, var3, var4) == 0) {
         this.e(var1, var2, var3, var4);
      }

   }

   public void e(el var1, int var2, int var3, int var4) {
      if(var1.d(var2 - 1, var3, var4)) {
         var1.b(var2, var3, var4, 1);
      } else if(var1.d(var2 + 1, var3, var4)) {
         var1.b(var2, var3, var4, 2);
      } else if(var1.d(var2, var3, var4 - 1)) {
         var1.b(var2, var3, var4, 3);
      } else if(var1.d(var2, var3, var4 + 1)) {
         var1.b(var2, var3, var4, 4);
      } else if(var1.d(var2, var3 - 1, var4)) {
         var1.b(var2, var3, var4, 5);
      }

      this.g(var1, var2, var3, var4);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      if(this.g(var1, var2, var3, var4)) {
         int var6 = var1.b(var2, var3, var4);
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

         if(!var1.d(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
            var1.d(var2, var3, var4, 0);
         }
      }

   }

   private boolean g(el var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public gk a(el var1, int var2, int var3, int var4, ba var5, ba var6) {
      int var7 = var1.b(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.a(var1, var2, var3, var4, var5, var6);
   }
}
