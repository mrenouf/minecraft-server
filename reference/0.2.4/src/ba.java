// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:42
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ba extends fy {

   protected ba(int var1, int var2) {
      super(var1, var2, jt.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public gm a(em var1, int var2, int var3, int var4, bc var5, bc var6) {
      this.a(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(iq var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public int a(Random var1) {
      return 1;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return var1.d(var2, var3 - 1, var4);
   }

   public void e(em var1, int var2, int var3, int var4) {
      if(!var1.z) {
         var1.b(var2, var3, var4, 15);
         this.g(var1, var2, var3, var4);
      }

   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      if(!var1.z) {
         int var6 = var1.b(var2, var3, var4);
         boolean var7 = false;
         if(!var1.d(var2, var3 - 1, var4)) {
            var7 = true;
         }

         if(var6 == 2 && !var1.d(var2 + 1, var3, var4)) {
            var7 = true;
         }

         if(var6 == 3 && !var1.d(var2 - 1, var3, var4)) {
            var7 = true;
         }

         if(var6 == 4 && !var1.d(var2, var3, var4 - 1)) {
            var7 = true;
         }

         if(var6 == 5 && !var1.d(var2, var3, var4 + 1)) {
            var7 = true;
         }

         if(var7) {
            this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
            var1.d(var2, var3, var4, 0);
         } else if(var5 > 0 && fy.m[var5].c() && gx.a(new gx(this, var1, var2, var3, var4)) == 3) {
            this.g(var1, var2, var3, var4);
         }

      }
   }

   private void g(em var1, int var2, int var3, int var4) {
      if(!var1.z) {
         (new gx(this, var1, var2, var3, var4)).a(var1.n(var2, var3, var4));
      }
   }
}
