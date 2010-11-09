// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gf extends dv {

   public hh a;
   private int e;
   public int b = 0;
   public int c;
   private int f = 5;
   public float d = (float)(Math.random() * 3.141592653589793D * 2.0D);


   public gf(el var1, double var2, double var4, double var6, hh var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.G = this.I / 2.0F;
      this.a(var2, var4, var6);
      this.a = var8;
      this.v = (float)(Math.random() * 360.0D);
      this.s = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.t = 0.20000000298023224D;
      this.u = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.L = false;
   }

   public gf(el var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.G = this.I / 2.0F;
   }

   public void b_() {
      super.b_();
      if(this.c > 0) {
         --this.c;
      }

      this.m = this.p;
      this.n = this.q;
      this.o = this.r;
      this.t -= 0.03999999910593033D;
      if(this.l.c(hb.b(this.p), hb.b(this.q), hb.b(this.r)) == jr.g) {
         this.t = 0.20000000298023224D;
         this.s = (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
         this.u = (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
         this.l.a(this, "random.fizz", 0.4F, 2.0F + this.V.nextFloat() * 0.4F);
      }

      this.g(this.p, this.q, this.r);
      this.r();
      this.c(this.s, this.t, this.u);
      float var1 = 0.98F;
      if(this.A) {
         var1 = 0.58800006F;
         int var2 = this.l.a(hb.b(this.p), hb.b(this.z.b) - 1, hb.b(this.r));
         if(var2 > 0) {
            var1 = fw.n[var2].bu * 0.98F;
         }
      }

      this.s *= (double)var1;
      this.t *= 0.9800000190734863D;
      this.u *= (double)var1;
      if(this.A) {
         this.t *= -0.5D;
      }

      ++this.e;
      ++this.b;
      if(this.b >= 6000) {
         this.l();
      }

   }

   public boolean r() {
      return this.l.a(this.z, jr.f, this);
   }

   private boolean g(double var1, double var3, double var5) {
      int var7 = hb.b(var1);
      int var8 = hb.b(var3);
      int var9 = hb.b(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if(fw.p[this.l.a(var7, var8, var9)]) {
         boolean var16 = !fw.p[this.l.a(var7 - 1, var8, var9)];
         boolean var17 = !fw.p[this.l.a(var7 + 1, var8, var9)];
         boolean var18 = !fw.p[this.l.a(var7, var8 - 1, var9)];
         boolean var19 = !fw.p[this.l.a(var7, var8 + 1, var9)];
         boolean var20 = !fw.p[this.l.a(var7, var8, var9 - 1)];
         boolean var21 = !fw.p[this.l.a(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0D;
         if(var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if(var17 && 1.0D - var10 < var23) {
            var23 = 1.0D - var10;
            var22 = 1;
         }

         if(var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if(var19 && 1.0D - var12 < var23) {
            var23 = 1.0D - var12;
            var22 = 3;
         }

         if(var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if(var21 && 1.0D - var14 < var23) {
            var23 = 1.0D - var14;
            var22 = 5;
         }

         float var25 = this.V.nextFloat() * 0.2F + 0.1F;
         if(var22 == 0) {
            this.s = (double)(-var25);
         }

         if(var22 == 1) {
            this.s = (double)var25;
         }

         if(var22 == 2) {
            this.t = (double)(-var25);
         }

         if(var22 == 3) {
            this.t = (double)var25;
         }

         if(var22 == 4) {
            this.u = (double)(-var25);
         }

         if(var22 == 5) {
            this.u = (double)var25;
         }
      }

      return false;
   }

   protected void b(int var1) {
      this.a((dv)null, var1);
   }

   public boolean a(dv var1, int var2) {
      this.f -= var2;
      if(this.f <= 0) {
         this.l();
      }

      return false;
   }

   public void a(t var1) {
      var1.a("Health", (short)((byte)this.f));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.a(new t()));
   }

   public void b(t var1) {
      this.f = var1.c("Health") & 255;
      this.b = var1.c("Age");
      t var2 = var1.j("Item");
      this.a = new hh(var2);
   }

   public void a(ft var1) {
      if(!this.l.z) {
         int var2 = this.a.a;
         if(this.c == 0 && var1.ak.a(this.a)) {
            this.l.a(this, "random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.c(this, var2);
            this.l();
         }

      }
   }
}
