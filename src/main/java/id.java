// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class id extends bi {

   public boolean a(em var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.a(var7, var8, var9) == 0 && var1.a(var7, var8 - 1, var9) == fy.u.bh && fy.ba.a(var1, var7, var8, var9)) {
            var1.a(var7, var8, var9, fy.ba.bh, var2.nextInt(4));
         }
      }

      return true;
   }
}
