// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class cr extends fw {

   protected cr(int var1, int var2) {
      super(var1, jr.i);
      this.bh = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.a(true);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 + 1, var4) == 0) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bi; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.b(var2, var3, var4);
            if(var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.bi);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean a(el var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 == this.bi?true:(var5 != fw.v.bi && var5 != fw.w.bi?false:(var1.c(var2 - 1, var3 - 1, var4) == jr.f?true:(var1.c(var2 + 1, var3 - 1, var4) == jr.f?true:(var1.c(var2, var3 - 1, var4 - 1) == jr.f?true:var1.c(var2, var3 - 1, var4 + 1) == jr.f))));
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      this.g(var1, var2, var3, var4);
   }

   protected final void g(el var1, int var2, int var3, int var4) {
      if(!this.f(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean f(el var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2) {
      return fq.aH.aW;
   }

   public boolean a() {
      return false;
   }
}
