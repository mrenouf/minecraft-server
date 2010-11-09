// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class iz extends fq {

   public iz(int var1, int var2) {
      super(var1);
      this.aY = 32 << var2;
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      jr var9 = var3.c(var4, var5 + 1, var6);
      if((var9.a() || var8 != fw.v.bi) && var8 != fw.w.bi) {
         return false;
      } else {
         fw var10 = fw.aB;
         var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var10.br.c(), (var10.br.a() + 1.0F) / 2.0F, var10.br.b() * 0.8F);
         var3.d(var4, var5, var6, var10.bi);
         var1.a(1);
         if(var3.l.nextInt(8) == 0 && var8 == fw.v.bi) {
            byte var11 = 1;

            for(int var12 = 0; var12 < var11; ++var12) {
               float var13 = 0.7F;
               float var14 = var3.l.nextFloat() * var13 + (1.0F - var13) * 0.5F;
               float var15 = 1.2F;
               float var16 = var3.l.nextFloat() * var13 + (1.0F - var13) * 0.5F;
               gf var17 = new gf(var3, (double)((float)var4 + var14), (double)((float)var5 + var15), (double)((float)var6 + var16), new hh(fq.Q));
               var17.c = 10;
               var3.a(var17);
            }
         }

         return true;
      }
   }
}
