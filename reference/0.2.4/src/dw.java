// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;
import java.util.Random;

public abstract class dw {

   private static int a = 0;
   public int g;
   public double h;
   public boolean i;
   public dw j;
   public dw k;
   public em l;
   public double m;
   public double n;
   public double o;
   public double p;
   public double q;
   public double r;
   public double s;
   public double t;
   public double u;
   public float v;
   public float w;
   public float x;
   public float y;
   public final dt z;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E;
   public boolean F;
   public float G;
   public float H;
   public float I;
   public float J;
   public float K;
   protected boolean L;
   protected float M;
   private int b;
   public double N;
   public double O;
   public double P;
   public float Q;
   public float R;
   public boolean S;
   public float T;
   public boolean U;
   protected Random V;
   public int W;
   public int X;
   public int Y;
   protected int Z;
   protected boolean aa;
   public int ab;
   public int ac;
   private boolean c;
   protected boolean ad;
   private double d;
   private double e;
   public boolean ae;
   public int af;
   public int ag;
   public int ah;


   public dw(em var1) {
      this.g = a++;
      this.h = 1.0D;
      this.i = false;
      this.z = dt.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.A = false;
      this.D = false;
      this.E = true;
      this.F = false;
      this.G = 0.0F;
      this.H = 0.6F;
      this.I = 1.8F;
      this.J = 0.0F;
      this.K = 0.0F;
      this.L = true;
      this.M = 0.0F;
      this.b = 1;
      this.Q = 0.0F;
      this.R = 0.0F;
      this.S = false;
      this.T = 0.0F;
      this.U = false;
      this.V = new Random();
      this.W = 0;
      this.X = 1;
      this.Y = 0;
      this.Z = 300;
      this.aa = false;
      this.ab = 0;
      this.ac = 300;
      this.c = true;
      this.ad = false;
      this.ae = false;
      this.l = var1;
      this.a(0.0D, 0.0D, 0.0D);
   }

   public boolean equals(Object var1) {
      return var1 instanceof dw?((dw)var1).g == this.g:false;
   }

   public int hashCode() {
      return this.g;
   }

   public void l() {
      this.F = true;
   }

   protected void a(float var1, float var2) {
      this.H = var1;
      this.I = var2;
   }

   protected void b(float var1, float var2) {
      this.v = var1;
      this.w = var2;
   }

   public void a(double var1, double var3, double var5) {
      this.p = var1;
      this.q = var3;
      this.r = var5;
      float var7 = this.H / 2.0F;
      float var8 = this.I;
      this.z.c(var1 - (double)var7, var3 - (double)this.G + (double)this.Q, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.G + (double)this.Q + (double)var8, var5 + (double)var7);
   }

   public void b_() {
      this.m();
   }

   public void m() {
      if(this.k != null && this.k.F) {
         this.k = null;
      }

      ++this.W;
      this.J = this.K;
      this.m = this.p;
      this.n = this.q;
      this.o = this.r;
      this.y = this.w;
      this.x = this.v;
      if(this.r()) {
         if(!this.aa && !this.c) {
            float var1 = hd.a(this.s * this.s * 0.20000000298023224D + this.t * this.t + this.u * this.u * 0.20000000298023224D) * 0.2F;
            if(var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.l.a(this, "random.splash", var1, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
            float var2 = (float)hd.b(this.z.b);

            int var3;
            float var4;
            float var5;
            for(var3 = 0; (float)var3 < 1.0F + this.H * 20.0F; ++var3) {
               var4 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
               var5 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
               this.l.a("bubble", this.p + (double)var4, (double)(var2 + 1.0F), this.r + (double)var5, this.s, this.t - (double)(this.V.nextFloat() * 0.2F), this.u);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.H * 20.0F; ++var3) {
               var4 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
               var5 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
               this.l.a("splash", this.p + (double)var4, (double)(var2 + 1.0F), this.r + (double)var5, this.s, this.t, this.u);
            }
         }

         this.M = 0.0F;
         this.aa = true;
         this.Y = 0;
      } else {
         this.aa = false;
      }

      if(this.Y > 0) {
         if(this.ad) {
            this.Y -= 4;
            if(this.Y < 0) {
               this.Y = 0;
            }
         } else {
            if(this.Y % 20 == 0) {
               this.a((dw)null, 1);
            }

            --this.Y;
         }
      }

      if(this.t()) {
         this.n();
      }

      if(this.q < -64.0D) {
         this.o();
      }

      this.c = false;
   }

   protected void n() {
      if(!this.ad) {
         this.a((dw)null, 4);
         this.Y = 600;
      }

   }

   protected void o() {
      this.l();
   }

   public boolean b(double var1, double var3, double var5) {
      dt var7 = this.z.c(var1, var3, var5);
      List var8 = this.l.a(this, var7);
      return var8.size() > 0?false:!this.l.b(var7);
   }

   public void c(double var1, double var3, double var5) {
      if(this.S) {
         this.z.d(var1, var3, var5);
         this.p = (this.z.a + this.z.d) / 2.0D;
         this.q = this.z.b + (double)this.G - (double)this.Q;
         this.r = (this.z.c + this.z.f) / 2.0D;
      } else {
         double var7 = this.p;
         double var9 = this.r;
         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         dt var17 = this.z.b();
         boolean var18 = this.A && this.p();
         if(var18) {
            double var19;
            for(var19 = 0.05D; var1 != 0.0D && this.l.a(this, this.z.c(var1, -1.0D, 0.0D)).size() == 0; var11 = var1) {
               if(var1 < var19 && var1 >= -var19) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }
            }

            for(; var5 != 0.0D && this.l.a(this, this.z.c(0.0D, -1.0D, var5)).size() == 0; var15 = var5) {
               if(var5 < var19 && var5 >= -var19) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var38 = this.l.a(this, this.z.a(var1, var3, var5));

         for(int var20 = 0; var20 < var38.size(); ++var20) {
            var3 = ((dt)var38.get(var20)).b(this.z, var3);
         }

         this.z.d(0.0D, var3, 0.0D);
         if(!this.E && var13 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var37 = this.A || var13 != var3 && var13 < 0.0D;

         int var21;
         for(var21 = 0; var21 < var38.size(); ++var21) {
            var1 = ((dt)var38.get(var21)).a(this.z, var1);
         }

         this.z.d(var1, 0.0D, 0.0D);
         if(!this.E && var11 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var21 = 0; var21 < var38.size(); ++var21) {
            var5 = ((dt)var38.get(var21)).c(this.z, var5);
         }

         this.z.d(0.0D, 0.0D, var5);
         if(!this.E && var15 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var23;
         int var28;
         double var40;
         if(this.R > 0.0F && var37 && this.Q < 0.05F && (var11 != var1 || var15 != var5)) {
            var40 = var1;
            var23 = var3;
            double var25 = var5;
            var1 = var11;
            var3 = (double)this.R;
            var5 = var15;
            dt var27 = this.z.b();
            this.z.b(var17);
            var38 = this.l.a(this, this.z.a(var11, var3, var15));

            for(var28 = 0; var28 < var38.size(); ++var28) {
               var3 = ((dt)var38.get(var28)).b(this.z, var3);
            }

            this.z.d(0.0D, var3, 0.0D);
            if(!this.E && var13 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var38.size(); ++var28) {
               var1 = ((dt)var38.get(var28)).a(this.z, var1);
            }

            this.z.d(var1, 0.0D, 0.0D);
            if(!this.E && var11 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var38.size(); ++var28) {
               var5 = ((dt)var38.get(var28)).c(this.z, var5);
            }

            this.z.d(0.0D, 0.0D, var5);
            if(!this.E && var15 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(var40 * var40 + var25 * var25 >= var1 * var1 + var5 * var5) {
               var1 = var40;
               var3 = var23;
               var5 = var25;
               this.z.b(var27);
            } else {
               this.Q = (float)((double)this.Q + 0.5D);
            }
         }

         this.p = (this.z.a + this.z.d) / 2.0D;
         this.q = this.z.b + (double)this.G - (double)this.Q;
         this.r = (this.z.c + this.z.f) / 2.0D;
         this.B = var11 != var1 || var15 != var5;
         this.C = var13 != var3;
         this.A = var13 != var3 && var13 < 0.0D;
         this.D = this.B || this.C;
         if(this.A) {
            if(this.M > 0.0F) {
               this.a(this.M);
               this.M = 0.0F;
            }
         } else if(var3 < 0.0D) {
            this.M = (float)((double)this.M - var3);
         }

         if(var11 != var1) {
            this.s = 0.0D;
         }

         if(var13 != var3) {
            this.t = 0.0D;
         }

         if(var15 != var5) {
            this.u = 0.0D;
         }

         var40 = this.p - var7;
         var23 = this.r - var9;
         this.K = (float)((double)this.K + (double)hd.a(var40 * var40 + var23 * var23) * 0.6D);
         int var26;
         int var35;
         int var41;
         if(this.L && !var18) {
            var41 = hd.b(this.p);
            var26 = hd.b(this.q - 0.20000000298023224D - (double)this.G);
            var35 = hd.b(this.r);
            var28 = this.l.a(var41, var26, var35);
            if(this.K > (float)this.b && var28 > 0) {
               ++this.b;
               cc var29 = fy.m[var28].bq;
               if(this.l.a(var41, var26 + 1, var35) == fy.aS.bh) {
                  var29 = fy.aS.bq;
                  this.l.a(this, var29.c(), var29.a() * 0.15F, var29.b());
               } else if(!fy.m[var28].bs.d()) {
                  this.l.a(this, var29.c(), var29.a() * 0.15F, var29.b());
               }

               fy.m[var28].b(this.l, var41, var26, var35, this);
            }
         }

         var41 = hd.b(this.z.a);
         var26 = hd.b(this.z.b);
         var35 = hd.b(this.z.c);
         var28 = hd.b(this.z.d);
         int var39 = hd.b(this.z.e);
         int var30 = hd.b(this.z.f);

         for(int var31 = var41; var31 <= var28; ++var31) {
            for(int var32 = var26; var32 <= var39; ++var32) {
               for(int var33 = var35; var33 <= var30; ++var33) {
                  int var34 = this.l.a(var31, var32, var33);
                  if(var34 > 0) {
                     fy.m[var34].a(this.l, var31, var32, var33, this);
                  }
               }
            }
         }

         this.Q *= 0.4F;
         boolean var36 = this.r();
         if(this.l.c(this.z)) {
            this.b(1);
            if(!var36) {
               ++this.Y;
               if(this.Y == 0) {
                  this.Y = 300;
               }
            }
         } else if(this.Y <= 0) {
            this.Y = -this.X;
         }

         if(var36 && this.Y > 0) {
            this.l.a(this, "random.fizz", 0.7F, 1.6F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
            this.Y = -this.X;
         }

      }
   }

   public boolean p() {
      return false;
   }

   public dt q() {
      return null;
   }

   protected void b(int var1) {
      if(!this.ad) {
         this.a((dw)null, var1);
      }

   }

   protected void a(float var1) {
   }

   public boolean r() {
      return this.l.a(this.z.b(0.0D, -0.4000000059604645D, 0.0D), jt.f, this);
   }

   public boolean a(jt var1) {
      double var2 = this.q + (double)this.s();
      int var4 = hd.b(this.p);
      int var5 = hd.d((float)hd.b(var2));
      int var6 = hd.b(this.r);
      int var7 = this.l.a(var4, var5, var6);
      if(var7 != 0 && fy.m[var7].bs == var1) {
         float var8 = cy.b(this.l.b(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float s() {
      return 0.0F;
   }

   public boolean t() {
      return this.l.a(this.z.b(0.0D, -0.4000000059604645D, 0.0D), jt.g);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = hd.c(var1 * var1 + var2 * var2);
      if(var4 >= 0.01F) {
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = hd.a(this.v * 3.1415927F / 180.0F);
         float var6 = hd.b(this.v * 3.1415927F / 180.0F);
         this.s += (double)(var1 * var6 - var2 * var5);
         this.u += (double)(var2 * var6 + var1 * var5);
      }
   }

   public float b(float var1) {
      int var2 = hd.b(this.p);
      double var3 = (this.z.e - this.z.b) * 0.66D;
      int var5 = hd.b(this.q - (double)this.G + var3);
      int var6 = hd.b(this.r);
      return this.l.j(var2, var5, var6);
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.m = this.p = var1;
      this.n = this.q = var3;
      this.o = this.r = var5;
      this.x = this.v = var7;
      this.y = this.w = var8;
      this.Q = 0.0F;
      double var9 = (double)(this.x - var7);
      if(var9 < -180.0D) {
         this.x += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.x -= 360.0F;
      }

      this.a(this.p, this.q, this.r);
      this.b(var7, var8);
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      this.m = this.p = var1;
      this.n = this.q = var3 + (double)this.G;
      this.o = this.r = var5;
      this.v = var7;
      this.w = var8;
      this.a(this.p, this.q, this.r);
   }

   public float a(dw var1) {
      float var2 = (float)(this.p - var1.p);
      float var3 = (float)(this.q - var1.q);
      float var4 = (float)(this.r - var1.r);
      return hd.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double d(double var1, double var3, double var5) {
      double var7 = this.p - var1;
      double var9 = this.q - var3;
      double var11 = this.r - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double e(double var1, double var3, double var5) {
      double var7 = this.p - var1;
      double var9 = this.q - var3;
      double var11 = this.r - var5;
      return (double)hd.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double b(dw var1) {
      double var2 = this.p - var1.p;
      double var4 = this.q - var1.q;
      double var6 = this.r - var1.r;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void b(fv var1) {
   }

   public void c(dw var1) {
      if(var1.j != this && var1.k != this) {
         double var2 = var1.p - this.p;
         double var4 = var1.r - this.r;
         double var6 = hd.a(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double)hd.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.T);
            var4 *= (double)(1.0F - this.T);
            this.f(-var2, 0.0D, -var4);
            var1.f(var2, 0.0D, var4);
         }

      }
   }

   public void f(double var1, double var3, double var5) {
      this.s += var1;
      this.t += var3;
      this.u += var5;
   }

   public boolean a(dw var1, int var2) {
      return false;
   }

   public boolean c_() {
      return false;
   }

   public boolean u() {
      return false;
   }

   public void b(dw var1, int var2) {
   }

   public boolean c(v var1) {
      String var2 = this.v();
      if(!this.F && var2 != null) {
         var1.a("id", var2);
         this.d(var1);
         return true;
      } else {
         return false;
      }
   }

   public void d(v var1) {
      var1.a("Pos", this.a(new double[]{this.p, this.q, this.r}));
      var1.a("Motion", this.a(new double[]{this.s, this.t, this.u}));
      var1.a("Rotation", this.a(new float[]{this.v, this.w}));
      var1.a("FallDistance", this.M);
      var1.a("Fire", (short)this.Y);
      var1.a("Air", (short)this.ac);
      var1.a("OnGround", this.A);
      this.a(var1);
   }

   public void e(v var1) {
      ea var2 = var1.k("Pos");
      ea var3 = var1.k("Motion");
      ea var4 = var1.k("Rotation");
      this.a(0.0D, 0.0D, 0.0D);
      this.s = ((eg)var3.a(0)).a;
      this.t = ((eg)var3.a(1)).a;
      this.u = ((eg)var3.a(2)).a;
      this.m = this.N = this.p = ((eg)var2.a(0)).a;
      this.n = this.O = this.q = ((eg)var2.a(1)).a;
      this.o = this.P = this.r = ((eg)var2.a(2)).a;
      this.x = this.v = ((m)var4.a(0)).a;
      this.y = this.w = ((m)var4.a(1)).a;
      this.M = var1.f("FallDistance");
      this.Y = var1.c("Fire");
      this.ac = var1.c("Air");
      this.A = var1.l("OnGround");
      this.a(this.p, this.q, this.r);
      this.b(var1);
   }

   protected final String v() {
      return hl.b(this);
   }

   protected abstract void b(v var1);

   protected abstract void a(v var1);

   protected ea a(double ... var1) {
      ea var2 = new ea();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a(new eg(var6));
      }

      return var2;
   }

   protected ea a(float ... var1) {
      ea var2 = new ea();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a(new m(var6));
      }

      return var2;
   }

   public gh a(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public gh a(int var1, int var2, float var3) {
      gh var4 = new gh(this.l, this.p, this.q + (double)var3, this.r, new hj(var1, var2));
      var4.c = 10;
      this.l.a(var4);
      return var4;
   }

   public boolean w() {
      return !this.F;
   }

   public boolean x() {
      int var1 = hd.b(this.p);
      int var2 = hd.b(this.q + (double)this.s());
      int var3 = hd.b(this.r);
      return this.l.d(var1, var2, var3);
   }

   public boolean a(fv var1) {
      return false;
   }

   public dt d(dw var1) {
      return null;
   }

   public void y() {
      if(this.k.F) {
         this.k = null;
      } else {
         this.s = 0.0D;
         this.t = 0.0D;
         this.u = 0.0D;
         this.b_();
         this.k.z();
         this.e += (double)(this.k.v - this.k.x);

         for(this.d += (double)(this.k.w - this.k.y); this.e >= 180.0D; this.e -= 360.0D) {
            ;
         }

         while(this.e < -180.0D) {
            this.e += 360.0D;
         }

         while(this.d >= 180.0D) {
            this.d -= 360.0D;
         }

         while(this.d < -180.0D) {
            this.d += 360.0D;
         }

         double var1 = this.e * 0.5D;
         double var3 = this.d * 0.5D;
         float var5 = 10.0F;
         if(var1 > (double)var5) {
            var1 = (double)var5;
         }

         if(var1 < (double)(-var5)) {
            var1 = (double)(-var5);
         }

         if(var3 > (double)var5) {
            var3 = (double)var5;
         }

         if(var3 < (double)(-var5)) {
            var3 = (double)(-var5);
         }

         this.e -= var1;
         this.d -= var3;
         this.v = (float)((double)this.v + var1);
         this.w = (float)((double)this.w + var3);
      }
   }

   public void z() {
      this.j.a(this.p, this.q + this.j() + this.j.A(), this.r);
   }

   public double A() {
      return (double)this.G;
   }

   public double j() {
      return (double)this.I * 0.75D;
   }

   public void e(dw var1) {
      this.d = 0.0D;
      this.e = 0.0D;
      if(var1 == null) {
         if(this.k != null) {
            this.c(this.k.p, this.k.z.b + (double)this.k.I, this.k.r, this.v, this.w);
            this.k.j = null;
         }

         this.k = null;
      } else if(this.k == var1) {
         this.k.j = null;
         this.k = null;
         this.c(var1.p, var1.z.b + (double)var1.I, var1.r, this.v, this.w);
      } else {
         if(this.k != null) {
            this.k.j = null;
         }

         if(var1.j != null) {
            var1.j.k = null;
         }

         this.k = var1;
         var1.j = this;
      }
   }

   public bc B() {
      return null;
   }

   public void C() {
   }

}
