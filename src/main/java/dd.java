// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public abstract class dd extends fw {

   protected dd(int var1, jr var2) {
      super(var1, var2);
      q[var1] = true;
   }

   protected dd(int var1, int var2, jr var3) {
      super(var1, var2, var3);
   }

   public void e(el var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a_());
   }

   public void b(el var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.l(var2, var3, var4);
   }

   protected abstract av a_();
}
