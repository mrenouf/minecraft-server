// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:47
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gy extends fs {

   public gy(int var1) {
      super(var1);
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
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

      if(var3.a(var4, var5, var6) != 0) {
         return false;
      } else {
         if(fy.av.a(var3, var4, var5, var6)) {
            --var1.a;
            var3.d(var4, var5, var6, fy.av.bh);
         }

         return true;
      }
   }
}
