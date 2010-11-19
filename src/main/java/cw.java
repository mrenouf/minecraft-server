// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class cw extends fs {

   public int a;


   public cw(int var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if(var8 == fy.aG.bh) {
         if(!var3.z) {
            var3.a(new jj(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a));
         }

         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
