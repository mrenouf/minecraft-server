// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class hf extends bi {

   public boolean a(em var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 20; ++var6) {
         int var7 = var3 + var2.nextInt(4) - var2.nextInt(4);
         int var8 = var4;
         int var9 = var5 + var2.nextInt(4) - var2.nextInt(4);
         if(var1.a(var7, var4, var9) == 0 && (var1.c(var7 - 1, var4 - 1, var9) == jt.f || var1.c(var7 + 1, var4 - 1, var9) == jt.f || var1.c(var7, var4 - 1, var9 - 1) == jt.f || var1.c(var7, var4 - 1, var9 + 1) == jt.f)) {
            int var10 = 2 + var2.nextInt(var2.nextInt(3) + 1);

            for(int var11 = 0; var11 < var10; ++var11) {
               if(fy.aX.f(var1, var7, var8 + var11, var9)) {
                  var1.a(var7, var8 + var11, var9, fy.aX.bh);
               }
            }
         }
      }

      return true;
   }
}
