// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:14
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ej extends fw {

   private boolean a;


   protected ej(int var1, int var2, boolean var3) {
      super(var1, jr.w);
      this.bh = var2;
      this.a(true);
      this.a = var3;
   }

   public int a(int var1) {
      return var1 == 1?this.bh:(var1 == 0?this.bh:(var1 == 3?this.bh + 1 + 16:this.bh + 16));
   }

   public void e(el var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return (var5 == 0 || fw.n[var5].bt.d()) && var1.d(var2, var3 - 1, var4);
   }

   public void a(el var1, int var2, int var3, int var4, jt var5) {
      int var6 = hb.b((double)(var5.v * 4.0F / 360.0F) + 0.5D) & 3;
      var1.b(var2, var3, var4, var6);
   }
}
