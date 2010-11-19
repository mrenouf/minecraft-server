// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fk extends fz {

   int a;
   int b;
   int c = 30;
   int d = -1;


   public fk(em var1) {
      super(var1);
   }

   public void a(v var1) {
      super.a(var1);
   }

   public void b(v var1) {
      super.b(var1);
   }

   protected void c() {
      this.b = this.a;
      if(this.a > 0 && this.d < 0) {
         --this.a;
      }

      if(this.d >= 0) {
         this.d = 2;
      }

      super.c();
      if(this.d != 1) {
         this.d = -1;
      }

   }

   protected String e() {
      return "mob.creeper";
   }

   protected String f() {
      return "mob.creeperdeath";
   }

   public void f(dw var1) {
      super.f(var1);
      if(var1 instanceof ez) {
         this.a(fs.aU.aW + this.V.nextInt(2), 1);
      }

   }

   protected void a(dw var1, float var2) {
      if(this.d <= 0 && var2 < 3.0F || this.d > 0 && var2 < 7.0F) {
         if(this.a == 0) {
            this.l.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.d = 1;
         ++this.a;
         if(this.a == this.c) {
            this.l.a(this, this.p, this.q, this.r, 3.0F);
            this.l();
         }

         this.ai = true;
      }

   }

   protected int g() {
      return fs.K.aW;
   }
}
