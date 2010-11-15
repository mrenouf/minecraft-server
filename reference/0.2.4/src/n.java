// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class n extends hi {

   protected n(int var1, int var2) {
      super(var1, var2);
      this.bg = var2;
      this.a(true);
      float var3 = 0.5F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean b(int var1) {
      return var1 == fy.aA.bh;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.h(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.b(var2, var3, var4);
         if(var6 < 7) {
            float var7 = this.h(var1, var2, var3, var4);
            if(var5.nextInt((int)(100.0F / var7)) == 0) {
               ++var6;
               var1.b(var2, var3, var4, var6);
            }
         }
      }

   }

   private float h(em var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bh || var9 == this.bh;
      boolean var15 = var6 == this.bh || var7 == this.bh;
      boolean var16 = var10 == this.bh || var11 == this.bh || var12 == this.bh || var13 == this.bh;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == fy.aA.bh) {
               var20 = 1.0F;
               if(var1.b(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public void a(em var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);

      for(int var6 = 0; var6 < 3; ++var6) {
         if(var1.l.nextInt(15) <= var5) {
            float var7 = 0.7F;
            float var8 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var9 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var10 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            gh var11 = new gh(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new hj(fs.Q));
            var11.c = 10;
            var1.a(var11);
         }
      }

   }

   public int a(int var1, Random var2) {
      return var1 == 7?fs.R.aW:-1;
   }

   public int a(Random var1) {
      return 1;
   }
}
