// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ao extends da {

   private static fw[] bb = new fw[]{fw.x, fw.ak, fw.al, fw.u, fw.ap, fw.I, fw.aj, fw.J, fw.ai, fw.H, fw.ax, fw.ay, fw.aU, fw.bc};
   private int bc;


   public ao(int var1, int var2) {
      super(var1, 2, var2, bb);
      this.bc = var2;
   }

   public boolean a(fw var1) {
      return var1 == fw.aq?this.bc == 3:(var1 != fw.ay && var1 != fw.ax?(var1 != fw.ai && var1 != fw.H?(var1 != fw.aj && var1 != fw.I?(var1 != fw.aO && var1 != fw.aP?(var1.bt == jr.d?true:var1.bt == jr.e):this.bc >= 2):this.bc >= 1):this.bc >= 2):this.bc >= 2);
   }

}
