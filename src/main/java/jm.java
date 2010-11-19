// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class jm extends fs {

   public jm(int var1) {
      super(var1);
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
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

         cg var9 = new cg(var3, var4, var5, var6, var8);
         if(var9.c()) {
            var3.a(var9);
            --var1.a;
         }

         return true;
      }
   }
}
