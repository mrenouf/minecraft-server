// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class b extends dd {

   private Random a = new Random();


   protected b(int var1) {
      super(var1, jr.c);
   }

   public int a(int var1) {
      return var1 == 1?this.bh - 1:(var1 == 0?this.bh - 1:(var1 == 3?this.bh + 1:this.bh));
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this.bi) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this.bi) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this.bi) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this.bi) {
         ++var5;
      }

      return var5 > 1?false:(this.g(var1, var2 - 1, var3, var4)?false:(this.g(var1, var2 + 1, var3, var4)?false:(this.g(var1, var2, var3, var4 - 1)?false:!this.g(var1, var2, var3, var4 + 1))));
   }

   private boolean g(el var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this.bi?false:(var1.a(var2 - 1, var3, var4) == this.bi?true:(var1.a(var2 + 1, var3, var4) == this.bi?true:(var1.a(var2, var3, var4 - 1) == this.bi?true:var1.a(var2, var3, var4 + 1) == this.bi)));
   }

   public void b(el var1, int var2, int var3, int var4) {
      hv var5 = (hv)var1.k(var2, var3, var4);

      for(int var6 = 0; var6 < var5.a(); ++var6) {
         hh var7 = var5.a(var6);
         if(var7 != null) {
            float var8 = this.a.nextFloat() * 0.8F + 0.1F;
            float var9 = this.a.nextFloat() * 0.8F + 0.1F;
            float var10 = this.a.nextFloat() * 0.8F + 0.1F;

            while(var7.a > 0) {
               int var11 = this.a.nextInt(21) + 10;
               if(var11 > var7.a) {
                  var11 = var7.a;
               }

               var7.a -= var11;
               gf var12 = new gf(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new hh(var7.c, var11, var7.d));
               float var13 = 0.05F;
               var12.s = (double)((float)this.a.nextGaussian() * var13);
               var12.t = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
               var12.u = (double)((float)this.a.nextGaussian() * var13);
               var1.a(var12);
            }
         }
      }

      super.b(var1, var2, var3, var4);
   }

   public boolean a(el var1, int var2, int var3, int var4, ft var5) {
      Object var6 = (hv)var1.k(var2, var3, var4);
      if(var1.d(var2, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 - 1, var3, var4) == this.bi && var1.d(var2 - 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 + 1, var3, var4) == this.bi && var1.d(var2 + 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2, var3, var4 - 1) == this.bi && var1.d(var2, var3 + 1, var4 - 1)) {
         return true;
      } else if(var1.a(var2, var3, var4 + 1) == this.bi && var1.d(var2, var3 + 1, var4 + 1)) {
         return true;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this.bi) {
            var6 = new ak("Large chest", (hv)var1.k(var2 - 1, var3, var4), (jx)var6);
         }

         if(var1.a(var2 + 1, var3, var4) == this.bi) {
            var6 = new ak("Large chest", (jx)var6, (hv)var1.k(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this.bi) {
            var6 = new ak("Large chest", (hv)var1.k(var2, var3, var4 - 1), (jx)var6);
         }

         if(var1.a(var2, var3, var4 + 1) == this.bi) {
            var6 = new ak("Large chest", (jx)var6, (hv)var1.k(var2, var3, var4 + 1));
         }

         var5.a((jx)var6);
         return true;
      }
   }

   protected av a_() {
      return new hv();
   }
}
