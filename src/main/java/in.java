// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:13
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class in extends bg {

   private int a;


   public in(int var1) {
      this.a = var1;
   }

   public boolean a(el var1, Random var2, int var3, int var4, int var5) {
      if(var1.a(var3, var4 + 1, var5) != fw.u.bi) {
         return false;
      } else if(var1.a(var3, var4 - 1, var5) != fw.u.bi) {
         return false;
      } else if(var1.a(var3, var4, var5) != 0 && var1.a(var3, var4, var5) != fw.u.bi) {
         return false;
      } else {
         int var6 = 0;
         if(var1.a(var3 - 1, var4, var5) == fw.u.bi) {
            ++var6;
         }

         if(var1.a(var3 + 1, var4, var5) == fw.u.bi) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 - 1) == fw.u.bi) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 + 1) == fw.u.bi) {
            ++var6;
         }

         int var7 = 0;
         if(var1.a(var3 - 1, var4, var5) == 0) {
            ++var7;
         }

         if(var1.a(var3 + 1, var4, var5) == 0) {
            ++var7;
         }

         if(var1.a(var3, var4, var5 - 1) == 0) {
            ++var7;
         }

         if(var1.a(var3, var4, var5 + 1) == 0) {
            ++var7;
         }

         if(var6 == 3 && var7 == 1) {
            var1.d(var3, var4, var5, this.a);
            var1.a = true;
            fw.n[this.a].a(var1, var3, var4, var5, var2);
            var1.a = false;
         }

         return true;
      }
   }
}
