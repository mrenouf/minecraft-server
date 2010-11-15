// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class fr extends fy {

   public static boolean a = false;


   public fr(int var1, int var2) {
      super(var1, var2, jt.m);
   }

   public void e(em var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.bh);
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.bh);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(em var1, int var2, int var3, int var4) {
      if(g(var1, var2, var3 - 1, var4) && var3 >= 0) {
         hy var8 = new hy(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F, this.bh);
         if(a) {
            while(!var8.F) {
               var8.b_();
            }
         } else {
            var1.a(var8);
         }
      }

   }

   public int b() {
      return 3;
   }

   public static boolean g(em var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == fy.ar.bh) {
         return true;
      } else {
         jt var5 = fy.m[var4].bs;
         return var5 == jt.f?true:var5 == jt.g;
      }
   }

}
