// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ek extends fy {

   private boolean a;


   protected ek(int var1, int var2, boolean var3) {
      super(var1, jt.w);
      this.bg = var2;
      this.a(true);
      this.a = var3;
   }

   public int a(int var1) {
      return var1 == 1?this.bg:(var1 == 0?this.bg:(var1 == 3?this.bg + 1 + 16:this.bg + 16));
   }

   public void e(em var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return (var5 == 0 || fy.m[var5].bs.d()) && var1.d(var2, var3 - 1, var4);
   }

   public void a(em var1, int var2, int var3, int var4, jv var5) {
      int var6 = hd.b((double)(var5.v * 4.0F / 360.0F) + 0.5D) & 3;
      var1.b(var2, var3, var4, var6);
   }
}
