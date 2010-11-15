// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class hu extends fy {

   protected hu(int var1) {
      super(var1, jt.b);
      this.a(true);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.h(var2, var3 + 1, var4) < 4 && var1.c(var2, var3 + 1, var4).b()) {
         if(var5.nextInt(4) != 0) {
            return;
         }

         var1.d(var2, var3, var4, fy.v.bh);
      } else if(var1.h(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if(var1.a(var6, var7, var8) == fy.v.bh && var1.h(var6, var7 + 1, var8) >= 4 && !var1.c(var6, var7 + 1, var8).b()) {
            var1.d(var6, var7, var8, fy.u.bh);
         }
      }

   }

   public int a(int var1, Random var2) {
      return fy.v.a(0, var2);
   }
}
