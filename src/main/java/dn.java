// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:33
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class dn extends bg {

   public boolean a(el var1, Random var2, int var3, int var4, int var5) {
      if(var1.a(var3, var4, var5) != 0) {
         return false;
      } else if(var1.a(var3, var4 + 1, var5) != fw.bc.bi) {
         return false;
      } else {
         var1.d(var3, var4, var5, fw.be.bi);

         for(int var6 = 0; var6 < 1500; ++var6) {
            int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var8 = var4 - var2.nextInt(12);
            int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var1.a(var7, var8, var9) == 0) {
               int var10 = 0;

               for(int var11 = 0; var11 < 6; ++var11) {
                  int var12 = 0;
                  if(var11 == 0) {
                     var12 = var1.a(var7 - 1, var8, var9);
                  }

                  if(var11 == 1) {
                     var12 = var1.a(var7 + 1, var8, var9);
                  }

                  if(var11 == 2) {
                     var12 = var1.a(var7, var8 - 1, var9);
                  }

                  if(var11 == 3) {
                     var12 = var1.a(var7, var8 + 1, var9);
                  }

                  if(var11 == 4) {
                     var12 = var1.a(var7, var8, var9 - 1);
                  }

                  if(var11 == 5) {
                     var12 = var1.a(var7, var8, var9 + 1);
                  }

                  if(var12 == fw.be.bi) {
                     ++var10;
                  }
               }

               if(var10 == 1) {
                  var1.d(var7, var8, var9, fw.be.bi);
               }
            }
         }

         return true;
      }
   }
}
