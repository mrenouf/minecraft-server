// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fg extends fq {

   private String a;


   protected fg(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.aX = 1;
   }

   public boolean a(hh var1, ft var2, el var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == fw.aZ.bi && var3.b(var4, var5, var6) == 0) {
         var3.b(var4, var5, var6, this.aW - fq.aU.aW + 1);
         var3.a(this.a, var4, var5, var6);
         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
