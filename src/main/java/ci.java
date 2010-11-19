// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ci extends dw {

   public int a;


   public ci(em var1) {
      super(var1);
      this.a = 0;
      this.i = true;
      this.a(0.98F, 0.98F);
      this.G = this.I / 2.0F;
   }

   public ci(em var1, float var2, float var3, float var4) {
      this(var1);
      this.a((double)var2, (double)var3, (double)var4);
      float var5 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.s = (double)(-hd.a(var5 * 3.1415927F / 180.0F) * 0.02F);
      this.t = 0.20000000298023224D;
      this.u = (double)(-hd.b(var5 * 3.1415927F / 180.0F) * 0.02F);
      this.L = false;
      this.a = 80;
      this.m = (double)var2;
      this.n = (double)var3;
      this.o = (double)var4;
   }

   public boolean c_() {
      return !this.F;
   }

   public void b_() {
      this.m = this.p;
      this.n = this.q;
      this.o = this.r;
      this.t -= 0.03999999910593033D;
      this.c(this.s, this.t, this.u);
      this.s *= 0.9800000190734863D;
      this.t *= 0.9800000190734863D;
      this.u *= 0.9800000190734863D;
      if(this.A) {
         this.s *= 0.699999988079071D;
         this.u *= 0.699999988079071D;
         this.t *= -0.5D;
      }

      if(this.a-- <= 0) {
         this.l();
         this.c();
      } else {
         this.l.a("smoke", this.p, this.q + 0.5D, this.r, 0.0D, 0.0D, 0.0D);
      }

   }

   private void c() {
      float var1 = 4.0F;
      this.l.a((dw)null, this.p, this.q, this.r, var1);
   }

   protected void a(v var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void b(v var1) {
      this.a = var1.b("Fuse");
   }
}
