// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ct extends fq {

   private int a;


   public ct(int var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      if(var7 != 1) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         if(var8 == fw.aB.bi) {
            var3.d(var4, var5 + 1, var6, this.a);
            --var1.a;
            return true;
         } else {
            return false;
         }
      }
   }
}
