// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gi extends fq {

   public gi(int var1) {
      super(var1);
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(!var3.c(var4, var5, var6).a()) {
         return false;
      } else {
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

         if(!fw.aE.a(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               var3.b(var4, var5, var6, fw.aE.bi, hb.b((double)((var2.v + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15);
            } else {
               var3.b(var4, var5, var6, fw.aJ.bi, var7);
            }

            --var1.a;
            jg var8 = (jg)var3.k(var4, var5, var6);
            if(var8 != null) {
               var2.a(var8);
            }

            return true;
         }
      }
   }
}
