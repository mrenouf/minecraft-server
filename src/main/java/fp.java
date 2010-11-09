// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class fp extends fw {

   public static boolean a = false;


   public fp(int var1, int var2) {
      super(var1, var2, jr.m);
   }

   public void e(el var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.bi);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.bi);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(el var1, int var2, int var3, int var4) {
      if(g(var1, var2, var3 - 1, var4) && var3 >= 0) {
         hw var8 = new hw(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F, this.bi);
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

   public static boolean g(el var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == fw.as.bi) {
         return true;
      } else {
         jr var5 = fw.n[var4].bt;
         return var5 == jr.f?true:var5 == jr.g;
      }
   }

}
