// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ai extends ht {

   public ai(int var1, int var2) {
      super(var1, var2, jt.x, false);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(iq var1, int var2, int var3, int var4) {
      float var5;
      float var6;
      if(var1.a(var2 - 1, var3, var4) != this.bh && var1.a(var2 + 1, var3, var4) != this.bh) {
         var5 = 0.125F;
         var6 = 0.5F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      } else {
         var5 = 0.5F;
         var6 = 0.125F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      }

   }

   public boolean a() {
      return false;
   }

   public boolean a_(em var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if(var1.a(var2 - 1, var3, var4) == fy.ap.bh || var1.a(var2 + 1, var3, var4) == fy.ap.bh) {
         var5 = 1;
      }

      if(var1.a(var2, var3, var4 - 1) == fy.ap.bh || var1.a(var2, var3, var4 + 1) == fy.ap.bh) {
         var6 = 1;
      }

      System.out.println(var5 + ", " + var6);
      if(var5 == var6) {
         return false;
      } else {
         if(var1.a(var2 - var5, var3, var4 - var6) == 0) {
            var2 -= var5;
            var4 -= var6;
         }

         int var7;
         int var8;
         for(var7 = -1; var7 <= 2; ++var7) {
            for(var8 = -1; var8 <= 3; ++var8) {
               boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;
               if(var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
                  int var10 = var1.a(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);
                  if(var9) {
                     if(var10 != fy.ap.bh) {
                        return false;
                     }
                  } else if(var10 != 0 && var10 != fy.ar.bh) {
                     return false;
                  }
               }
            }
         }

         var1.i = true;

         for(var7 = 0; var7 < 2; ++var7) {
            for(var8 = 0; var8 < 3; ++var8) {
               var1.d(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, fy.be.bh);
            }
         }

         var1.i = false;
         return true;
      }
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if(var1.a(var2 - 1, var3, var4) == this.bh || var1.a(var2 + 1, var3, var4) == this.bh) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.a(var2, var8 - 1, var4) == this.bh; --var8) {
         ;
      }

      if(var1.a(var2, var8 - 1, var4) != fy.ap.bh) {
         var1.d(var2, var3, var4, 0);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.a(var2, var8 + var9, var4) == this.bh; ++var9) {
            ;
         }

         if(var9 == 3 && var1.a(var2, var8 + var9, var4) == fy.ap.bh) {
            boolean var10 = var1.a(var2 - 1, var3, var4) == this.bh || var1.a(var2 + 1, var3, var4) == this.bh;
            boolean var11 = var1.a(var2, var3, var4 - 1) == this.bh || var1.a(var2, var3, var4 + 1) == this.bh;
            if(var10 && var11) {
               var1.d(var2, var3, var4, 0);
            } else if((var1.a(var2 + var6, var3, var4 + var7) != fy.ap.bh || var1.a(var2 - var6, var3, var4 - var7) != this.bh) && (var1.a(var2 - var6, var3, var4 - var7) != fy.ap.bh || var1.a(var2 + var6, var3, var4 + var7) != this.bh)) {
               var1.d(var2, var3, var4, 0);
            }
         } else {
            var1.d(var2, var3, var4, 0);
         }
      }
   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(em var1, int var2, int var3, int var4, dw var5) {
      if(!var1.z) {
         var5.C();
      }
   }
}
