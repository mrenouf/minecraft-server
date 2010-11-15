// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class cs extends fy {

   protected cs(int var1, int var2) {
      super(var1, jt.i);
      this.bg = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.a(true);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 + 1, var4) == 0) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bh; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.b(var2, var3, var4);
            if(var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.bh);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean a(em var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 == this.bh?true:(var5 != fy.u.bh && var5 != fy.v.bh?false:(var1.c(var2 - 1, var3 - 1, var4) == jt.f?true:(var1.c(var2 + 1, var3 - 1, var4) == jt.f?true:(var1.c(var2, var3 - 1, var4 - 1) == jt.f?true:var1.c(var2, var3 - 1, var4 + 1) == jt.f))));
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      this.g(var1, var2, var3, var4);
   }

   protected final void g(em var1, int var2, int var3, int var4) {
      if(!this.f(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean f(em var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2) {
      return fs.aH.aW;
   }

   public boolean a() {
      return false;
   }
}
