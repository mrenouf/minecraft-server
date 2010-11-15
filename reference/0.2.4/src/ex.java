// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ex extends hi {

   protected ex(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   protected boolean b(int var1) {
      return fy.o[var1];
   }

   public boolean f(em var1, int var2, int var3, int var4) {
      return var1.h(var2, var3, var4) <= 13 && this.b(var1.a(var2, var3 - 1, var4));
   }
}
