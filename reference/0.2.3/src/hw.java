// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hw extends dv {

   public int a;
   public int b = 0;


   public hw(el var1) {
      super(var1);
   }

   public hw(el var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.a = var5;
      this.i = true;
      this.a(0.98F, 0.98F);
      this.G = this.I / 2.0F;
      this.a((double)var2, (double)var3, (double)var4);
      this.s = 0.0D;
      this.t = 0.0D;
      this.u = 0.0D;
      this.L = false;
      this.m = (double)var2;
      this.n = (double)var3;
      this.o = (double)var4;
   }

   public boolean c_() {
      return !this.F;
   }

   public void b_() {
      if(this.a == 0) {
         this.l();
      } else {
         this.m = this.p;
         this.n = this.q;
         this.o = this.r;
         ++this.b;
         this.t -= 0.03999999910593033D;
         this.c(this.s, this.t, this.u);
         this.s *= 0.9800000190734863D;
         this.t *= 0.9800000190734863D;
         this.u *= 0.9800000190734863D;
         int var1 = hb.b(this.p);
         int var2 = hb.b(this.q);
         int var3 = hb.b(this.r);
         if(this.l.a(var1, var2, var3) == this.a) {
            this.l.d(var1, var2, var3, 0);
         }

         if(this.A) {
            this.s *= 0.699999988079071D;
            this.u *= 0.699999988079071D;
            this.t *= -0.5D;
            this.l();
            if(!this.l.a(this.a, var1, var2, var3, true) || !this.l.d(var1, var2, var3, this.a)) {
               this.a(this.a, 1);
            }
         } else if(this.b > 100) {
            this.a(this.a, 1);
            this.l();
         }

      }
   }

   protected void a(t var1) {
      var1.a("Tile", (byte)this.a);
   }

   protected void b(t var1) {
      this.a = var1.b("Tile") & 255;
   }
}
