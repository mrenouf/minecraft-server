// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bv {

   private static Set a = new HashSet();


   protected static hn a(em var0, int var1, int var2) {
      int var3 = var1 + var0.l.nextInt(16);
      int var4 = var0.l.nextInt(128);
      int var5 = var2 + var0.l.nextInt(16);
      return new hn(var3, var4, var5);
   }

   public static final int a(em var0) {
      a.clear();

      int var1;
      for(var1 = 0; var1 < var0.d.size(); ++var1) {
         fv var2 = (fv)var0.d.get(var1);
         int var3 = hd.b(var2.p / 16.0D);
         int var4 = hd.b(var2.r / 16.0D);
         byte var5 = 8;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               a.add(new kc(var6 + var3, var7 + var4));
            }
         }
      }

      var1 = 0;

      for(int var28 = 0; var28 < jn.values().length; ++var28) {
         jn var31 = jn.values()[var28];
         if(var0.a(var31.c) <= var31.d * a.size() / 256) {
            Iterator var29 = a.iterator();

            label88:
            while(var29.hasNext()) {
               kc var33 = (kc)var29.next();
               if(var0.l.nextInt(50) == 0) {
                  ij var32 = var0.a().a(var33);
                  Class[] var34 = var32.a(var31);
                  if(var34 != null && var34.length != 0) {
                     int var8 = var0.l.nextInt(var34.length);
                     hn var9 = a(var0, var33.a * 16, var33.b * 16);
                     int var10 = var9.a;
                     int var11 = var9.b;
                     int var12 = var9.c;
                     if(!var0.d(var10, var11, var12) && var0.c(var10, var11, var12) == jt.a) {
                        int var13 = 0;

                        for(int var14 = 0; var14 < 3; ++var14) {
                           int var15 = var10;
                           int var16 = var11;
                           int var17 = var12;
                           byte var18 = 6;

                           for(int var19 = 0; var19 < 4; ++var19) {
                              var15 += var0.l.nextInt(var18) - var0.l.nextInt(var18);
                              var16 += var0.l.nextInt(1) - var0.l.nextInt(1);
                              var17 += var0.l.nextInt(var18) - var0.l.nextInt(var18);
                              if(var0.d(var15, var16 - 1, var17) && !var0.d(var15, var16, var17) && !var0.c(var15, var16, var17).d() && !var0.d(var15, var16 + 1, var17)) {
                                 float var20 = (float)var15 + 0.5F;
                                 float var21 = (float)var16;
                                 float var22 = (float)var17 + 0.5F;
                                 if(var0.a((double)var20, (double)var21, (double)var22, 24.0D) == null) {
                                    float var23 = var20 - (float)var0.m;
                                    float var24 = var21 - (float)var0.n;
                                    float var25 = var22 - (float)var0.o;
                                    float var26 = var23 * var23 + var24 * var24 + var25 * var25;
                                    if(var26 >= 576.0F) {
                                       jv var35;
                                       try {
                                          var35 = (jv)var34[var8].getConstructor(new Class[]{em.class}).newInstance(new Object[]{var0});
                                       } catch (Exception var27) {
                                          var27.printStackTrace();
                                          return var1;
                                       }

                                       var35.c((double)var20, (double)var21, (double)var22, var0.l.nextFloat() * 360.0F, 0.0F);
                                       if(var35.a()) {
                                          ++var13;
                                          var0.a(var35);
                                          if(var35 instanceof bu && var0.l.nextInt(100) == 0) {
                                             ez var30 = new ez(var0);
                                             var30.c((double)var20, (double)var21, (double)var22, var35.v, 0.0F);
                                             var0.a(var30);
                                             var30.e(var35);
                                          }

                                          if(var13 >= var35.i()) {
                                             continue label88;
                                          }
                                       }

                                       var1 += var13;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

}
