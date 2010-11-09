// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:27
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ag extends hr {

   public ag(int var1, int var2) {
      super(var1, var2, jr.x, false);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(io var1, int var2, int var3, int var4) {
      float var5;
      float var6;
      if(var1.a(var2 - 1, var3, var4) != this.bi && var1.a(var2 + 1, var3, var4) != this.bi) {
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

   public boolean a_(el var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if(var1.a(var2 - 1, var3, var4) == fw.aq.bi || var1.a(var2 + 1, var3, var4) == fw.aq.bi) {
         var5 = 1;
      }

      if(var1.a(var2, var3, var4 - 1) == fw.aq.bi || var1.a(var2, var3, var4 + 1) == fw.aq.bi) {
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
                     if(var10 != fw.aq.bi) {
                        return false;
                     }
                  } else if(var10 != 0 && var10 != fw.as.bi) {
                     return false;
                  }
               }
            }
         }

         var1.i = true;

         for(var7 = 0; var7 < 2; ++var7) {
            for(var8 = 0; var8 < 3; ++var8) {
               var1.d(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, fw.bf.bi);
            }
         }

         var1.i = false;
         return true;
      }
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if(var1.a(var2 - 1, var3, var4) == this.bi || var1.a(var2 + 1, var3, var4) == this.bi) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.a(var2, var8 - 1, var4) == this.bi; --var8) {
         ;
      }

      if(var1.a(var2, var8 - 1, var4) != fw.aq.bi) {
         var1.d(var2, var3, var4, 0);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.a(var2, var8 + var9, var4) == this.bi; ++var9) {
            ;
         }

         if(var9 == 3 && var1.a(var2, var8 + var9, var4) == fw.aq.bi) {
            boolean var10 = var1.a(var2 - 1, var3, var4) == this.bi || var1.a(var2 + 1, var3, var4) == this.bi;
            boolean var11 = var1.a(var2, var3, var4 - 1) == this.bi || var1.a(var2, var3, var4 + 1) == this.bi;
            if(var10 && var11) {
               var1.d(var2, var3, var4, 0);
            } else if((var1.a(var2 + var6, var3, var4 + var7) != fw.aq.bi || var1.a(var2 - var6, var3, var4 - var7) != this.bi) && (var1.a(var2 - var6, var3, var4 - var7) != fw.aq.bi || var1.a(var2 + var6, var3, var4 + var7) != this.bi)) {
               var1.d(var2, var3, var4, 0);
            }
         } else {
            var1.d(var2, var3, var4, 0);
         }
      }
   }

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(el var1, int var2, int var3, int var4, dv var5) {
      if(!var1.z) {
         var5.C();
      }
   }
}
