// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:27
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class kb extends dw {

   private int d = -1;
   private int e = -1;
   private int f = -1;
   private int ai = 0;
   private boolean aj = false;
   public int a = 0;
   public fv b;
   private int ak;
   private int al = 0;
   private int am = 0;
   public dw c = null;
   private int an;
   private double ao;
   private double ap;
   private double aq;
   private double ar;
   private double as;


   public kb(em var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   public kb(em var1, fv var2) {
      super(var1);
      this.b = var2;
      this.b.at = this;
      this.a(0.25F, 0.25F);
      this.c(var2.p, var2.q + 1.62D - (double)var2.G, var2.r, var2.v, var2.w);
      this.p -= (double)(hd.b(this.v / 180.0F * 3.1415927F) * 0.16F);
      this.q -= 0.10000000149011612D;
      this.r -= (double)(hd.a(this.v / 180.0F * 3.1415927F) * 0.16F);
      this.a(this.p, this.q, this.r);
      this.G = 0.0F;
      float var3 = 0.4F;
      this.s = (double)(-hd.a(this.v / 180.0F * 3.1415927F) * hd.b(this.w / 180.0F * 3.1415927F) * var3);
      this.u = (double)(hd.b(this.v / 180.0F * 3.1415927F) * hd.b(this.w / 180.0F * 3.1415927F) * var3);
      this.t = (double)(-hd.a(this.w / 180.0F * 3.1415927F) * var3);
      this.a(this.s, this.t, this.u, 1.5F, 1.0F);
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = hd.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.V.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.V.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.V.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.s = var1;
      this.t = var3;
      this.u = var5;
      float var10 = hd.a(var1 * var1 + var5 * var5);
      this.x = this.v = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.y = this.w = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.ak = 0;
   }

   public void b_() {
      super.b_();
      if(this.an > 0) {
         double var26 = this.p + (this.ao - this.p) / (double)this.an;
         double var29 = this.q + (this.ap - this.q) / (double)this.an;
         double var30 = this.r + (this.aq - this.r) / (double)this.an;

         double var7;
         for(var7 = this.ar - (double)this.v; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.v = (float)((double)this.v + var7 / (double)this.an);
         this.w = (float)((double)this.w + (this.as - (double)this.w) / (double)this.an);
         --this.an;
         this.a(var26, var29, var30);
         this.b(this.v, this.w);
      } else {
         if(!this.l.z) {
            hj var1 = this.b.G();
            if(this.b.F || !this.b.w() || var1 == null || var1.a() != fs.aP || this.b((dw)this.b) > 1024.0D) {
               this.l();
               this.b.at = null;
               return;
            }

            if(this.c != null) {
               if(!this.c.F) {
                  this.p = this.c.p;
                  this.q = this.c.z.b + (double)this.c.I * 0.8D;
                  this.r = this.c.r;
                  return;
               }

               this.c = null;
            }
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.aj) {
            int var27 = this.l.a(this.d, this.e, this.f);
            if(var27 == this.ai) {
               ++this.ak;
               if(this.ak == 1200) {
                  this.l();
               }

               return;
            }

            this.aj = false;
            this.s *= (double)(this.V.nextFloat() * 0.2F);
            this.t *= (double)(this.V.nextFloat() * 0.2F);
            this.u *= (double)(this.V.nextFloat() * 0.2F);
            this.ak = 0;
            this.al = 0;
         } else {
            ++this.al;
         }

         bc var22 = bc.b(this.p, this.q, this.r);
         bc var2 = bc.b(this.p + this.s, this.q + this.t, this.r + this.u);
         gm var3 = this.l.a(var22, var2);
         var22 = bc.b(this.p, this.q, this.r);
         var2 = bc.b(this.p + this.s, this.q + this.t, this.r + this.u);
         if(var3 != null) {
            var2 = bc.b(var3.f.a, var3.f.b, var3.f.c);
         }

         dw var4 = null;
         List var5 = this.l.b(this, this.z.a(this.s, this.t, this.u).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            dw var9 = (dw)var5.get(var8);
            if(var9.c_() && (var9 != this.b || this.al >= 5)) {
               float var10 = 0.3F;
               dt var11 = var9.z.b((double)var10, (double)var10, (double)var10);
               gm var12 = var11.a(var22, var2);
               if(var12 != null) {
                  var13 = var22.a(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new gm(var4);
         }

         if(var3 != null) {
            if(var3.g != null) {
               if(var3.g.a(this.b, 0)) {
                  this.c = var3.g;
               }
            } else {
               this.aj = true;
            }
         }

         if(!this.aj) {
            this.c(this.s, this.t, this.u);
            float var19 = hd.a(this.s * this.s + this.u * this.u);
            this.v = (float)(Math.atan2(this.s, this.u) * 180.0D / 3.1415927410125732D);

            for(this.w = (float)(Math.atan2(this.t, (double)var19) * 180.0D / 3.1415927410125732D); this.w - this.y < -180.0F; this.y -= 360.0F) {
               ;
            }

            while(this.w - this.y >= 180.0F) {
               this.y += 360.0F;
            }

            while(this.v - this.x < -180.0F) {
               this.x -= 360.0F;
            }

            while(this.v - this.x >= 180.0F) {
               this.x += 360.0F;
            }

            this.w = this.y + (this.w - this.y) * 0.2F;
            this.v = this.x + (this.v - this.x) * 0.2F;
            float var21 = 0.92F;
            if(this.A || this.B) {
               var21 = 0.5F;
            }

            byte var28 = 5;
            double var23 = 0.0D;

            for(int var24 = 0; var24 < var28; ++var24) {
               double var14 = this.z.b + (this.z.e - this.z.b) * (double)(var24 + 0) / (double)var28 - 0.125D + 0.125D;
               double var16 = this.z.b + (this.z.e - this.z.b) * (double)(var24 + 1) / (double)var28 - 0.125D + 0.125D;
               dt var18 = dt.b(this.z.a, var14, this.z.c, this.z.d, var16, this.z.f);
               if(this.l.b(var18, jt.f)) {
                  var23 += 1.0D / (double)var28;
               }
            }

            if(var23 > 0.0D) {
               if(this.am > 0) {
                  --this.am;
               } else if(this.V.nextInt(500) == 0) {
                  this.am = this.V.nextInt(30) + 10;
                  this.t -= 0.20000000298023224D;
                  this.l.a(this, "random.splash", 0.25F, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
                  float var25 = (float)hd.b(this.z.b);

                  float var15;
                  float var20;
                  int var31;
                  for(var31 = 0; (float)var31 < 1.0F + this.H * 20.0F; ++var31) {
                     var15 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     var20 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     this.l.a("bubble", this.p + (double)var15, (double)(var25 + 1.0F), this.r + (double)var20, this.s, this.t - (double)(this.V.nextFloat() * 0.2F), this.u);
                  }

                  for(var31 = 0; (float)var31 < 1.0F + this.H * 20.0F; ++var31) {
                     var15 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     var20 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     this.l.a("splash", this.p + (double)var15, (double)(var25 + 1.0F), this.r + (double)var20, this.s, this.t, this.u);
                  }
               }
            }

            if(this.am > 0) {
               this.t -= (double)(this.V.nextFloat() * this.V.nextFloat() * this.V.nextFloat()) * 0.2D;
            }

            var13 = var23 * 2.0D - 1.0D;
            this.t += 0.03999999910593033D * var13;
            if(var23 > 0.0D) {
               var21 = (float)((double)var21 * 0.9D);
               this.t *= 0.8D;
            }

            this.s *= (double)var21;
            this.t *= (double)var21;
            this.u *= (double)var21;
            this.a(this.p, this.q, this.r);
         }
      }
   }

   public void a(v var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.f);
      var1.a("inTile", (byte)this.ai);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.aj?1:0));
   }

   public void b(v var1) {
      this.d = var1.c("xTile");
      this.e = var1.c("yTile");
      this.f = var1.c("zTile");
      this.ai = var1.b("inTile") & 255;
      this.a = var1.b("shake") & 255;
      this.aj = var1.b("inGround") == 1;
   }

   public int c() {
      byte var1 = 0;
      if(this.c != null) {
         double var2 = this.b.p - this.p;
         double var4 = this.b.q - this.q;
         double var6 = this.b.r - this.r;
         double var8 = (double)hd.a(var2 * var2 + var4 * var4 + var6 * var6);
         double var10 = 0.1D;
         this.c.s += var2 * var10;
         this.c.t += var4 * var10 + (double)hd.a(var8) * 0.08D;
         this.c.u += var6 * var10;
         var1 = 3;
      } else if(this.am > 0) {
         gh var13 = new gh(this.l, this.p, this.q, this.r, new hj(fs.aS.aW));
         double var3 = this.b.p - this.p;
         double var5 = this.b.q - this.q;
         double var7 = this.b.r - this.r;
         double var9 = (double)hd.a(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 0.1D;
         var13.s = var3 * var11;
         var13.t = var5 * var11 + (double)hd.a(var9) * 0.08D;
         var13.u = var7 * var11;
         this.l.a(var13);
         var1 = 1;
      }

      if(this.aj) {
         var1 = 2;
      }

      this.l();
      this.b.at = null;
      return var1;
   }
}
