// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:58
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class c extends de {

   private Random a = new Random();


   protected c(int var1) {
      super(var1, jt.c);
   }

   public int a(int var1) {
      return var1 == 1?this.bg - 1:(var1 == 0?this.bg - 1:(var1 == 3?this.bg + 1:this.bg));
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this.bh) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this.bh) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this.bh) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this.bh) {
         ++var5;
      }

      return var5 > 1?false:(this.g(var1, var2 - 1, var3, var4)?false:(this.g(var1, var2 + 1, var3, var4)?false:(this.g(var1, var2, var3, var4 - 1)?false:!this.g(var1, var2, var3, var4 + 1))));
   }

   private boolean g(em var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this.bh?false:(var1.a(var2 - 1, var3, var4) == this.bh?true:(var1.a(var2 + 1, var3, var4) == this.bh?true:(var1.a(var2, var3, var4 - 1) == this.bh?true:var1.a(var2, var3, var4 + 1) == this.bh)));
   }

   public void b(em var1, int var2, int var3, int var4) {
      hx var5 = (hx)var1.k(var2, var3, var4);

      for(int var6 = 0; var6 < var5.a(); ++var6) {
         hj var7 = var5.a(var6);
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
               gh var12 = new gh(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new hj(var7.c, var11, var7.d));
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

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      Object var6 = (hx)var1.k(var2, var3, var4);
      if(var1.d(var2, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 - 1, var3, var4) == this.bh && var1.d(var2 - 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 + 1, var3, var4) == this.bh && var1.d(var2 + 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2, var3, var4 - 1) == this.bh && var1.d(var2, var3 + 1, var4 - 1)) {
         return true;
      } else if(var1.a(var2, var3, var4 + 1) == this.bh && var1.d(var2, var3 + 1, var4 + 1)) {
         return true;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this.bh) {
            var6 = new am("Large chest", (hx)var1.k(var2 - 1, var3, var4), (jz)var6);
         }

         if(var1.a(var2 + 1, var3, var4) == this.bh) {
            var6 = new am("Large chest", (jz)var6, (hx)var1.k(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this.bh) {
            var6 = new am("Large chest", (hx)var1.k(var2, var3, var4 - 1), (jz)var6);
         }

         if(var1.a(var2, var3, var4 + 1) == this.bh) {
            var6 = new am("Large chest", (jz)var6, (hx)var1.k(var2, var3, var4 + 1));
         }

         var5.a((jz)var6);
         return true;
      }
   }

   protected ay a_() {
      return new hx();
   }
}
