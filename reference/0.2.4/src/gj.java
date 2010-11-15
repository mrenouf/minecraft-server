// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gj extends fs {

   public gj(int var1) {
      super(var1);
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
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

         if(!fy.aD.a(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               var3.b(var4, var5, var6, fy.aD.bh, hd.b((double)((var2.v + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15);
            } else {
               var3.b(var4, var5, var6, fy.aI.bh, var7);
            }

            --var1.a;
            ji var8 = (ji)var3.k(var4, var5, var6);
            if(var8 != null) {
               var2.a(var8);
            }

            return true;
         }
      }
   }
}
