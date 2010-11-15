// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:20
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class dx extends bi {

   public boolean a(em var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               jt var13 = var1.c(var10, var11, var12);
               if(var11 == var4 - 1 && !var13.a()) {
                  return false;
               }

               if(var11 == var4 + var6 + 1 && !var13.a()) {
                  return false;
               }

               if((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.a(var10, var11, var12) == 0 && var1.a(var10, var11 + 1, var12) == 0) {
                  ++var9;
               }
            }
         }
      }

      if(var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if(var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.d(var10, var11, var12, 0);
                  } else if(var11 >= 0 && !var1.c(var10, var11 - 1, var12).a()) {
                     var1.d(var10, var11, var12, 0);
                  } else if(var1.c(var10, var11, var12).a()) {
                     if(var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.d(var10, var11, var12, fy.ao.bh);
                     } else {
                        var1.d(var10, var11, var12, fy.w.bh);
                     }
                  }
               }
            }
         }

         var10 = 0;

         while(var10 < 2) {
            var11 = 0;

            while(true) {
               if(var11 < 3) {
                  label204: {
                     var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
                     int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
                     if(var1.a(var12, var4, var14) == 0) {
                        int var15 = 0;
                        if(var1.c(var12 - 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.c(var12 + 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.c(var12, var4, var14 - 1).a()) {
                           ++var15;
                        }

                        if(var1.c(var12, var4, var14 + 1).a()) {
                           ++var15;
                        }

                        if(var15 == 1) {
                           var1.d(var12, var4, var14, fy.au.bh);
                           hx var16 = (hx)var1.k(var12, var4, var14);

                           for(int var17 = 0; var17 < 8; ++var17) {
                              hj var18 = this.a(var2);
                              if(var18 != null) {
                                 var16.a(var2.nextInt(var16.a()), var18);
                              }
                           }
                           break label204;
                        }
                     }

                     ++var11;
                     continue;
                  }
               }

               ++var10;
               break;
            }
         }

         var1.d(var3, var4, var5, fy.as.bh);
         ce var19 = (ce)var1.k(var3, var4, var5);
         var19.f = this.b(var2);
         return true;
      } else {
         return false;
      }
   }

   private hj a(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0?new hj(fs.ay):(var2 == 1?new hj(fs.m, var1.nextInt(4) + 1):(var2 == 2?new hj(fs.S):(var2 == 3?new hj(fs.R, var1.nextInt(4) + 1):(var2 == 4?new hj(fs.K, var1.nextInt(4) + 1):(var2 == 5?new hj(fs.I, var1.nextInt(4) + 1):(var2 == 6?new hj(fs.au):(var2 == 7 && var1.nextInt(100) == 0?new hj(fs.ar):(var2 == 8 && var1.nextInt(2) == 0?new hj(fs.aA, var1.nextInt(4) + 1):(var2 == 9 && var1.nextInt(10) == 0?new hj(fs.c[fs.aU.aW + var1.nextInt(2)]):null)))))))));
   }

   private String b(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0?"Skeleton":(var2 == 1?"Zombie":(var2 == 2?"Zombie":(var2 == 3?"Spider":"")));
   }
}
