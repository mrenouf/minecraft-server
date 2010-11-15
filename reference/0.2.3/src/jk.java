// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:49
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class jk extends fq {

   public jk(int var1) {
      super(var1);
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(var7 == 1) {
         return false;
      } else {
         byte var8 = 0;
         if(var7 == 4) {
            var8 = 1;
         }

         if(var7 == 3) {
            var8 = 2;
         }

         if(var7 == 5) {
            var8 = 3;
         }

         cf var9 = new cf(var3, var4, var5, var6, var8);
         if(var9.c()) {
            var3.a(var9);
            --var1.a;
         }

         return true;
      }
   }
}
