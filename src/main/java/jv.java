// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:59
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class jv extends fq {

   private int a;


   public jv(int var1, fw var2) {
      super(var1);
      this.a = var2.bi;
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == fw.aT.bi) {
         var7 = 0;
      } else {
         if(var7 == 0) {
            --var5;
         }

         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }
      }

      if(var1.a == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false)) {
            fw var8 = fw.n[this.a];
            if(var3.d(var4, var5, var6, this.a)) {
               fw.n[this.a].c(var3, var4, var5, var6, var7);
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var8.br.c(), (var8.br.a() + 1.0F) / 2.0F, var8.br.b() * 0.8F);
               --var1.a;
            }
         }

         return true;
      }
   }
}
