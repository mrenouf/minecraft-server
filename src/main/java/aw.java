// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:38
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public abstract class aw extends gz implements ad {

   public aw(el var1) {
      super(var1);
   }

   protected float a(int var1, int var2, int var3) {
      return this.l.a(var1, var2 - 1, var3) == fw.v.bi?10.0F:this.l.j(var1, var2, var3) - 0.5F;
   }

   public void a(t var1) {
      super.a(var1);
   }

   public void b(t var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = hb.b(this.p);
      int var2 = hb.b(this.z.b);
      int var3 = hb.b(this.r);
      return this.l.a(var1, var2 - 1, var3) == fw.v.bi && this.l.h(var1, var2, var3) > 8 && super.a();
   }

   public int b() {
      return 120;
   }
}
