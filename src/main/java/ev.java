// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:33
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ev extends fw {

   protected ev(int var1, int var2) {
      super(var1, var2, jr.c);
   }

   public int a(int var1) {
      return this.bh + (var1 == 1?1:0);
   }

   public boolean a(el var1, int var2, int var3, int var4, ft var5) {
      int var6 = var1.b(var2, var3, var4);
      if(var6 > 0) {
         this.f(var1, var2, var3, var4, var6);
         return true;
      } else {
         return false;
      }
   }

   public void f(el var1, int var2, int var3, int var4, int var5) {
      var1.a((String)null, var2, var3, var4);
      var1.b(var2, var3, var4, 0);
      int var6 = fq.aU.aW + var5 - 1;
      float var7 = 0.7F;
      double var8 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var10 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
      double var12 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      gf var14 = new gf(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, new hh(var6));
      var14.c = 10;
      var1.a(var14);
   }

   public void a(el var1, int var2, int var3, int var4, int var5, float var6) {
      if(!var1.z) {
         if(var5 > 0) {
            this.f(var1, var2, var3, var4, var5);
         }

         super.a(var1, var2, var3, var4, var5, var6);
      }
   }
}
