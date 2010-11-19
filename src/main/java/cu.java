// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class cu extends fs {

   private int a;


   public cu(int var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
      if(var7 != 1) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         if(var8 == fy.aA.bh) {
            var3.d(var4, var5 + 1, var6, this.a);
            --var1.a;
            return true;
         } else {
            return false;
         }
      }
   }
}
