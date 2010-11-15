// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public abstract class de extends fy {

   protected de(int var1, jt var2) {
      super(var1, var2);
      p[var1] = true;
   }

   protected de(int var1, int var2, jt var3) {
      super(var1, var2, var3);
   }

   public void e(em var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a_());
   }

   public void b(em var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.l(var2, var3, var4);
   }

   protected abstract ay a_();
}
