// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:24
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class jv extends dw {

   public int au = 20;
   public float av;
   public float aw;
   public float ax = (float)(Math.random() + 1.0D) * 0.01F;
   public float ay = 0.0F;
   public float az = 0.0F;
   protected float aA;
   protected float aB;
   protected float aC;
   protected float aD;
   protected boolean aE = true;
   protected String aF = "/mob/char.png";
   protected boolean aG = true;
   protected float aH = 0.0F;
   protected String aI = null;
   protected float aJ = 1.0F;
   protected int aK = 0;
   protected float aL = 0.0F;
   public boolean aM = false;
   public float aN;
   public float aO;
   public int aP = 10;
   public int aQ;
   private int a;
   public int aR;
   public int aS;
   public float aT = 0.0F;
   public int aU = 0;
   public int aV = 0;
   public float aW;
   public float aX;
   protected boolean aY = false;
   public int aZ = -1;
   public float ba = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
   public float bb;
   public float bc;
   public float bd;
   protected int be;
   protected double bf;
   protected double bg;
   protected double bh;
   protected double bi;
   protected double bj;
   float bk = 0.0F;
   private int b = 0;
   protected int bl = 0;
   protected float bm;
   protected float bn;
   protected float bo;
   protected boolean bp = false;
   protected float bq = 0.0F;
   protected float br = 0.7F;
   private dw c;
   private int d = 0;


   public jv(em var1) {
      super(var1);
      this.a(this.p, this.q, this.r);
      this.av = (float)Math.random() * 12398.0F;
      this.v = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.aw = 1.0F;
      this.R = 0.5F;
   }

   public boolean g(dw var1) {
      return this.l.a(bc.b(this.p, this.q + (double)this.s(), this.r), bc.b(var1.p, var1.q + (double)var1.s(), var1.r)) == null;
   }

   public boolean c_() {
      return !this.F;
   }

   public boolean u() {
      return !this.F;
   }

   public float s() {
      return this.I * 0.85F;
   }

   public int b() {
      return 80;
   }

   public void m() {
      this.aN = this.aO;
      super.m();
      if(this.V.nextInt(1000) < this.a++) {
         this.a = -this.b();
         String var1 = this.d();
         if(var1 != null) {
            this.l.a(this, var1, this.h(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if(this.w() && this.x()) {
         this.a((dw)null, 1);
      }

      if(this.ad) {
         this.Y = 0;
      }

      int var8;
      if(this.w() && this.a(jt.f)) {
         --this.ac;
         if(this.ac == -20) {
            this.ac = 0;

            for(var8 = 0; var8 < 8; ++var8) {
               float var2 = this.V.nextFloat() - this.V.nextFloat();
               float var3 = this.V.nextFloat() - this.V.nextFloat();
               float var4 = this.V.nextFloat() - this.V.nextFloat();
               this.l.a("bubble", this.p + (double)var2, this.q + (double)var3, this.r + (double)var4, this.s, this.t, this.u);
            }

            this.a((dw)null, 2);
         }

         this.Y = 0;
      } else {
         this.ac = this.Z;
      }

      this.aW = this.aX;
      if(this.aV > 0) {
         --this.aV;
      }

      if(this.aR > 0) {
         --this.aR;
      }

      if(this.ab > 0) {
         --this.ab;
      }

      if(this.aP <= 0) {
         ++this.aU;
         if(this.aU > 20) {
            this.K();
            this.l();

            for(var8 = 0; var8 < 20; ++var8) {
               double var9 = this.V.nextGaussian() * 0.02D;
               double var10 = this.V.nextGaussian() * 0.02D;
               double var6 = this.V.nextGaussian() * 0.02D;
               this.l.a("explode", this.p + (double)(this.V.nextFloat() * this.H * 2.0F) - (double)this.H, this.q + (double)(this.V.nextFloat() * this.I), this.r + (double)(this.V.nextFloat() * this.H * 2.0F) - (double)this.H, var9, var10, var6);
            }
         }
      }

      this.aD = this.aC;
      this.az = this.ay;
      this.x = this.v;
      this.y = this.w;
   }

   public void I() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.V.nextGaussian() * 0.02D;
         double var4 = this.V.nextGaussian() * 0.02D;
         double var6 = this.V.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.l.a("explode", this.p + (double)(this.V.nextFloat() * this.H * 2.0F) - (double)this.H - var2 * var8, this.q + (double)(this.V.nextFloat() * this.I) - var4 * var8, this.r + (double)(this.V.nextFloat() * this.H * 2.0F) - (double)this.H - var6 * var8, var2, var4, var6);
      }

   }

   public void y() {
      super.y();
      this.aA = this.aB;
      this.aB = 0.0F;
   }

   public void b_() {
      super.b_();
      this.D();
      double var1 = this.p - this.m;
      double var3 = this.r - this.o;
      float var5 = hd.a(var1 * var1 + var3 * var3);
      float var6 = this.ay;
      float var7 = 0.0F;
      this.aA = this.aB;
      float var8 = 0.0F;
      if(var5 > 0.05F) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / 3.1415927F - 90.0F;
      }

      if(this.aO > 0.0F) {
         var6 = this.v;
      }

      if(!this.A) {
         var8 = 0.0F;
      }

      this.aB += (var8 - this.aB) * 0.3F;

      float var9;
      for(var9 = var6 - this.ay; var9 < -180.0F; var9 += 360.0F) {
         ;
      }

      while(var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.ay += var9 * 0.3F;

      float var10;
      for(var10 = this.v - this.ay; var10 < -180.0F; var10 += 360.0F) {
         ;
      }

      while(var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if(var10 < -75.0F) {
         var10 = -75.0F;
      }

      if(var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.ay = this.v - var10;
      if(var10 * var10 > 2500.0F) {
         this.ay += var10 * 0.2F;
      }

      if(var11) {
         var7 *= -1.0F;
      }

      while(this.v - this.x < -180.0F) {
         this.x -= 360.0F;
      }

      while(this.v - this.x >= 180.0F) {
         this.x += 360.0F;
      }

      while(this.ay - this.az < -180.0F) {
         this.az -= 360.0F;
      }

      while(this.ay - this.az >= 180.0F) {
         this.az += 360.0F;
      }

      while(this.w - this.y < -180.0F) {
         this.y -= 360.0F;
      }

      while(this.w - this.y >= 180.0F) {
         this.y += 360.0F;
      }

      this.aC += var7;
   }

   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void a(int var1) {
      if(this.aP > 0) {
         this.aP += var1;
         if(this.aP > 20) {
            this.aP = 20;
         }

         this.ab = this.au / 2;
      }
   }

   public boolean a(dw var1, int var2) {
      if(this.l.z) {
         var2 = 0;
      }

      this.bl = 0;
      if(this.aP <= 0) {
         return false;
      } else {
         this.bc = 1.5F;
         boolean var3 = true;
         if((float)this.ab > (float)this.au / 2.0F) {
            if(var2 <= this.b) {
               return false;
            }

            this.c(var2 - this.b);
            this.b = var2;
            var3 = false;
         } else {
            this.b = var2;
            this.aQ = this.aP;
            this.ab = this.au;
            this.c(var2);
            this.aR = this.aS = 10;
         }

         this.aT = 0.0F;
         if(var3) {
            if(var1 != null) {
               double var4 = var1.p - this.p;

               double var6;
               for(var6 = var1.r - this.r; var4 * var4 + var6 * var6 < 1.0E-4D; var6 = (Math.random() - Math.random()) * 0.01D) {
                  var4 = (Math.random() - Math.random()) * 0.01D;
               }

               this.aT = (float)(Math.atan2(var6, var4) * 180.0D / 3.1415927410125732D) - this.v;
               this.a(var1, var2, var4, var6);
            } else {
               this.aT = (float)((int)(Math.random() * 2.0D) * 180);
            }
         }

         if(this.aP <= 0) {
            if(var3) {
               this.l.a(this, this.f(), this.h(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
            }

            this.f(var1);
         } else if(var3) {
            this.l.a(this, this.e(), this.h(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
         }

         return true;
      }
   }

   protected void c(int var1) {
      this.aP -= var1;
   }

   protected float h() {
      return 1.0F;
   }

   protected String d() {
      return null;
   }

   protected String e() {
      return "random.hurt";
   }

   protected String f() {
      return "random.hurt";
   }

   public void a(dw var1, int var2, double var3, double var5) {
      float var7 = hd.a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.s /= 2.0D;
      this.t /= 2.0D;
      this.u /= 2.0D;
      this.s -= var3 / (double)var7 * (double)var8;
      this.t += 0.4000000059604645D;
      this.u -= var5 / (double)var7 * (double)var8;
      if(this.t > 0.4000000059604645D) {
         this.t = 0.4000000059604645D;
      }

   }

   public void f(dw var1) {
      if(this.aK > 0 && var1 != null) {
         var1.b(this, this.aK);
      }

      this.aY = true;
      int var2 = this.g();
      if(var2 > 0) {
         int var3 = this.V.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.a(var2, 1);
         }
      }

   }

   protected int g() {
      return 0;
   }

   protected void a(float var1) {
      int var2 = (int)Math.ceil((double)(var1 - 3.0F));
      if(var2 > 0) {
         this.a((dw)null, var2);
         int var3 = this.l.a(hd.b(this.p), hd.b(this.q - 0.20000000298023224D - (double)this.G), hd.b(this.r));
         if(var3 > 0) {
            cc var4 = fy.m[var3].bq;
            this.l.a(this, var4.c(), var4.a() * 0.5F, var4.b() * 0.75F);
         }
      }

   }

   public void c(float var1, float var2) {
      double var3;
      if(this.r()) {
         var3 = this.q;
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.800000011920929D;
         this.t *= 0.800000011920929D;
         this.u *= 0.800000011920929D;
         this.t -= 0.02D;
         if(this.B && this.b(this.s, this.t + 0.6000000238418579D - this.q + var3, this.u)) {
            this.t = 0.30000001192092896D;
         }
      } else if(this.t()) {
         var3 = this.q;
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.5D;
         this.t *= 0.5D;
         this.u *= 0.5D;
         this.t -= 0.02D;
         if(this.B && this.b(this.s, this.t + 0.6000000238418579D - this.q + var3, this.u)) {
            this.t = 0.30000001192092896D;
         }
      } else {
         float var10 = 0.91F;
         if(this.A) {
            var10 = 0.54600006F;
            int var4 = this.l.a(hd.b(this.p), hd.b(this.z.b) - 1, hd.b(this.r));
            if(var4 > 0) {
               var10 = fy.m[var4].bt * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var10 * var10 * var10);
         this.a(var1, var2, this.A?0.1F * var8:0.02F);
         var10 = 0.91F;
         if(this.A) {
            var10 = 0.54600006F;
            int var5 = this.l.a(hd.b(this.p), hd.b(this.z.b) - 1, hd.b(this.r));
            if(var5 > 0) {
               var10 = fy.m[var5].bt * 0.91F;
            }
         }

         if(this.d_()) {
            this.M = 0.0F;
            if(this.t < -0.15D) {
               this.t = -0.15D;
            }
         }

         this.c(this.s, this.t, this.u);
         if(this.B && this.d_()) {
            this.t = 0.2D;
         }

         this.t -= 0.08D;
         this.t *= 0.9800000190734863D;
         this.s *= (double)var10;
         this.u *= (double)var10;
      }

      this.bb = this.bc;
      var3 = this.p - this.m;
      double var9 = this.r - this.o;
      float var7 = hd.a(var3 * var3 + var9 * var9) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.bc += (var7 - this.bc) * 0.4F;
      this.bd += this.bc;
   }

   public boolean d_() {
      int var1 = hd.b(this.p);
      int var2 = hd.b(this.z.b);
      int var3 = hd.b(this.r);
      return this.l.a(var1, var2, var3) == fy.aF.bh || this.l.a(var1, var2 + 1, var3) == fy.aF.bh;
   }

   public void a(v var1) {
      var1.a("Health", (short)this.aP);
      var1.a("HurtTime", (short)this.aR);
      var1.a("DeathTime", (short)this.aU);
      var1.a("AttackTime", (short)this.aV);
   }

   public void b(v var1) {
      this.aP = var1.c("Health");
      if(!var1.a("Health")) {
         this.aP = 10;
      }

      this.aR = var1.c("HurtTime");
      this.aU = var1.c("DeathTime");
      this.aV = var1.c("AttackTime");
   }

   public boolean w() {
      return !this.F && this.aP > 0;
   }

   public void D() {
      if(this.be > 0) {
         double var1 = this.p + (this.bf - this.p) / (double)this.be;
         double var3 = this.q + (this.bg - this.q) / (double)this.be;
         double var5 = this.r + (this.bh - this.r) / (double)this.be;

         double var7;
         for(var7 = this.bi - (double)this.v; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.v = (float)((double)this.v + var7 / (double)this.be);
         this.w = (float)((double)this.w + (this.bj - (double)this.w) / (double)this.be);
         --this.be;
         this.a(var1, var3, var5);
         this.b(this.v, this.w);
      }

      if(this.aP <= 0) {
         this.bp = false;
         this.bm = 0.0F;
         this.bn = 0.0F;
         this.bo = 0.0F;
      } else if(!this.aM) {
         this.c();
      }

      boolean var9 = this.r();
      boolean var2 = this.t();
      if(this.bp) {
         if(var9) {
            this.t += 0.03999999910593033D;
         } else if(var2) {
            this.t += 0.03999999910593033D;
         } else if(this.A) {
            this.J();
         }
      }

      this.bm *= 0.98F;
      this.bn *= 0.98F;
      this.bo *= 0.9F;
      this.c(this.bm, this.bn);
      List var10 = this.l.b(this, this.z.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var10 != null && var10.size() > 0) {
         for(int var4 = 0; var4 < var10.size(); ++var4) {
            dw var11 = (dw)var10.get(var4);
            if(var11.u()) {
               var11.c(this);
            }
         }
      }

   }

   protected void J() {
      this.t = 0.41999998688697815D;
   }

   protected void c() {
      ++this.bl;
      fv var1 = this.l.a(this, -1.0D);
      if(var1 != null) {
         double var2 = var1.p - this.p;
         double var4 = var1.q - this.q;
         double var6 = var1.r - this.r;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if(var8 > 16384.0D) {
            this.l();
         }

         if(this.bl > 600 && this.V.nextInt(800) == 0) {
            if(var8 < 1024.0D) {
               this.bl = 0;
            } else {
               this.l();
            }
         }
      }

      this.bm = 0.0F;
      this.bn = 0.0F;
      float var10 = 8.0F;
      if(this.V.nextFloat() < 0.02F) {
         var1 = this.l.a(this, (double)var10);
         if(var1 != null) {
            this.c = var1;
            this.d = 10 + this.V.nextInt(20);
         } else {
            this.bo = (this.V.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if(this.c != null) {
         this.b(this.c, 10.0F);
         if(this.d-- <= 0 || this.c.F || this.c.b(this) > (double)(var10 * var10)) {
            this.c = null;
         }
      } else {
         if(this.V.nextFloat() < 0.05F) {
            this.bo = (this.V.nextFloat() - 0.5F) * 20.0F;
         }

         this.v += this.bo;
         this.w = this.bq;
      }

      boolean var3 = this.r();
      boolean var11 = this.t();
      if(var3 || var11) {
         this.bp = this.V.nextFloat() < 0.8F;
      }

   }

   public void b(dw var1, float var2) {
      double var3 = var1.p - this.p;
      double var7 = var1.r - this.r;
      double var5;
      if(var1 instanceof jv) {
         jv var9 = (jv)var1;
         var5 = var9.q + (double)var9.s() - (this.q + (double)this.s());
      } else {
         var5 = (var1.z.b + var1.z.e) / 2.0D - (this.q + (double)this.s());
      }

      double var13 = (double)hd.a(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
      float var12 = (float)(Math.atan2(var5, var13) * 180.0D / 3.1415927410125732D);
      this.w = this.b(this.w, var12, var2);
      this.v = this.b(this.v, var11, var2);
   }

   private float b(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void K() {
   }

   public boolean a() {
      return this.l.a(this.z) && this.l.a(this, this.z).size() == 0 && !this.l.b(this.z);
   }

   protected void o() {
      this.a((dw)null, 4);
   }

   public bc c(float var1) {
      if(var1 == 1.0F) {
         return bc.b(this.p, this.q, this.r);
      } else {
         double var2 = this.m + (this.p - this.m) * (double)var1;
         double var4 = this.n + (this.q - this.n) * (double)var1;
         double var6 = this.o + (this.r - this.o) * (double)var1;
         return bc.b(var2, var4, var6);
      }
   }

   public bc B() {
      return this.d(1.0F);
   }

   public bc d(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if(var1 == 1.0F) {
         var2 = hd.b(-this.v * 0.017453292F - 3.1415927F);
         var3 = hd.a(-this.v * 0.017453292F - 3.1415927F);
         var4 = -hd.b(-this.w * 0.017453292F);
         var5 = hd.a(-this.w * 0.017453292F);
         return bc.b((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.y + (this.w - this.y) * var1;
         var3 = this.x + (this.v - this.x) * var1;
         var4 = hd.b(-var3 * 0.017453292F - 3.1415927F);
         var5 = hd.a(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -hd.b(-var2 * 0.017453292F);
         float var7 = hd.a(-var2 * 0.017453292F);
         return bc.b((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public gm a(double var1, float var3) {
      bc var4 = this.c(var3);
      bc var5 = this.d(var3);
      bc var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.l.a(var4, var6);
   }

   public int i() {
      return 4;
   }
}
