// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ay extends fw {

   protected ay(int var1, int var2) {
      super(var1, var2, jr.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public gk a(el var1, int var2, int var3, int var4, ba var5, ba var6) {
      this.a(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(io var1, int var2, int var3, int var4) {
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

   public boolean a(el var1, int var2, int var3, int var4) {
      return var1.d(var2, var3 - 1, var4);
   }

   public void e(el var1, int var2, int var3, int var4) {
      if(!var1.z) {
         var1.b(var2, var3, var4, 15);
         this.g(var1, var2, var3, var4);
      }

   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
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
         } else if(var5 > 0 && fw.n[var5].c() && gv.a(new gv(this, var1, var2, var3, var4)) == 3) {
            this.g(var1, var2, var3, var4);
         }

      }
   }

   private void g(el var1, int var2, int var3, int var4) {
      if(!var1.z) {
         (new gv(this, var1, var2, var3, var4)).a(var1.n(var2, var3, var4));
      }
   }
}
