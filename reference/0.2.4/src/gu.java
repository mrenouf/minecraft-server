// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:46
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gu extends fs {

   private jt a;


   public gu(int var1, jt var2) {
      super(var1);
      this.a = var2;
      this.aY = 64;
      this.aX = 1;
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         fy var8;
         if(this.a == jt.c) {
            var8 = fy.aE;
         } else {
            var8 = fy.aL;
         }

         if(!var8.a(var3, var4, var5, var6)) {
            return false;
         } else {
            int var9 = hd.b((double)((var2.v + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
            byte var10 = 0;
            byte var11 = 0;
            if(var9 == 0) {
               var11 = 1;
            }

            if(var9 == 1) {
               var10 = -1;
            }

            if(var9 == 2) {
               var11 = -1;
            }

            if(var9 == 3) {
               var10 = 1;
            }

            int var12 = (var3.d(var4 - var10, var5, var6 - var11)?1:0) + (var3.d(var4 - var10, var5 + 1, var6 - var11)?1:0);
            int var13 = (var3.d(var4 + var10, var5, var6 + var11)?1:0) + (var3.d(var4 + var10, var5 + 1, var6 + var11)?1:0);
            boolean var14 = var3.a(var4 - var10, var5, var6 - var11) == var8.bh || var3.a(var4 - var10, var5 + 1, var6 - var11) == var8.bh;
            boolean var15 = var3.a(var4 + var10, var5, var6 + var11) == var8.bh || var3.a(var4 + var10, var5 + 1, var6 + var11) == var8.bh;
            boolean var16 = false;
            if(var14 && !var15) {
               var16 = true;
            } else if(var13 > var12) {
               var16 = true;
            }

            if(var16) {
               var9 = var9 - 1 & 3;
               var9 += 4;
            }

            var3.d(var4, var5, var6, var8.bh);
            var3.b(var4, var5, var6, var9);
            var3.d(var4, var5 + 1, var6, var8.bh);
            var3.b(var4, var5 + 1, var6, var9 + 8);
            --var1.a;
            return true;
         }
      }
   }
}
