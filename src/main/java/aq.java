// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class aq extends db {

   private static fy[] bb = new fy[]{fy.w, fy.aj, fy.ak, fy.t, fy.ao, fy.H, fy.ai, fy.I, fy.ah, fy.G, fy.aw, fy.ax, fy.aT, fy.bb};
   private int bc;


   public aq(int var1, int var2) {
      super(var1, 2, var2, bb);
      this.bc = var2;
   }

   public boolean a(fy var1) {
      return var1 == fy.ap?this.bc == 3:(var1 != fy.ax && var1 != fy.aw?(var1 != fy.ah && var1 != fy.G?(var1 != fy.ai && var1 != fy.H?(var1 != fy.aN && var1 != fy.aO?(var1.bs == jt.d?true:var1.bs == jt.e):this.bc >= 2):this.bc >= 1):this.bc >= 2):this.bc >= 2);
   }

}
