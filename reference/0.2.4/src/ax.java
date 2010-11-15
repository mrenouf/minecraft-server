// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public abstract class ax extends hb implements af {

   public ax(em var1) {
      super(var1);
   }

   protected float a(int var1, int var2, int var3) {
      return this.l.a(var1, var2 - 1, var3) == fy.u.bh?10.0F:this.l.j(var1, var2, var3) - 0.5F;
   }

   public void a(v var1) {
      super.a(var1);
   }

   public void b(v var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = hd.b(this.p);
      int var2 = hd.b(this.z.b);
      int var3 = hd.b(this.r);
      return this.l.a(var1, var2 - 1, var3) == fy.u.bh && this.l.h(var1, var2, var3) > 8 && super.a();
   }

   public int b() {
      return 120;
   }
}
