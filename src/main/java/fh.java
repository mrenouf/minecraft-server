// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:37
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fh extends fs {

   private String a;


   protected fh(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.aX = 1;
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == fy.aY.bh && var3.b(var4, var5, var6) == 0) {
         var3.b(var4, var5, var6, this.aW - fs.aU.aW + 1);
         var3.a(this.a, var4, var5, var6);
         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
