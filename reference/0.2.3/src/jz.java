// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:04
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class jz extends dv {

   private int d = -1;
   private int e = -1;
   private int f = -1;
   private int ai = 0;
   private boolean aj = false;
   public int a = 0;
   public ft b;
   private int ak;
   private int al = 0;
   private int am = 0;
   public dv c = null;


   public jz(el var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   public void b_() {
      super.b_();
      hh var1 = this.b.G();
      if(!this.b.F && this.b.w() && var1 != null && var1.a() == fq.aP && this.b(this.b) <= 1024.0D) {
         if(this.c != null) {
            if(!this.c.F) {
               this.p = this.c.p;
               this.q = this.c.z.b + (double)this.c.I * 0.8D;
               this.r = this.c.r;
               return;
            }

            this.c = null;
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.aj) {
            int var2 = this.l.a(this.d, this.e, this.f);
            if(var2 == this.ai) {
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

         ba var20 = ba.b(this.p, this.q, this.r);
         ba var3 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
         gk var4 = this.l.a(var20, var3);
         var20 = ba.b(this.p, this.q, this.r);
         var3 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
         if(var4 != null) {
            var3 = ba.b(var4.f.a, var4.f.b, var4.f.c);
         }

         dv var5 = null;
         List var6 = this.l.b(this, this.z.a(this.s, this.t, this.u).b(1.0D, 1.0D, 1.0D));
         double var7 = 0.0D;

         double var14;
         for(int var9 = 0; var9 < var6.size(); ++var9) {
            dv var10 = (dv)var6.get(var9);
            if(var10.c_() && (var10 != this.b || this.al >= 5)) {
               float var11 = 0.3F;
               ds var12 = var10.z.b((double)var11, (double)var11, (double)var11);
               gk var13 = var12.a(var20, var3);
               if(var13 != null) {
                  var14 = var20.a(var13.f);
                  if(var14 < var7 || var7 == 0.0D) {
                     var5 = var10;
                     var7 = var14;
                  }
               }
            }
         }

         if(var5 != null) {
            var4 = new gk(var5);
         }

         if(var4 != null) {
            if(var4.g != null) {
               if(var4.g.a(this.b, 0)) {
                  this.c = var4.g;
               }
            } else {
               this.aj = true;
            }
         }

         if(!this.aj) {
            this.c(this.s, this.t, this.u);
            float var21 = hb.a(this.s * this.s + this.u * this.u);
            this.v = (float)(Math.atan2(this.s, this.u) * 180.0D / 3.1415927410125732D);

            for(this.w = (float)(Math.atan2(this.t, (double)var21) * 180.0D / 3.1415927410125732D); this.w - this.y < -180.0F; this.y -= 360.0F) {
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
            float var26 = 0.92F;
            if(this.A || this.B) {
               var26 = 0.5F;
            }

            byte var22 = 5;
            double var27 = 0.0D;

            for(int var28 = 0; var28 < var22; ++var28) {
               double var15 = this.z.b + (this.z.e - this.z.b) * (double)(var28 + 0) / (double)var22 - 0.125D + 0.125D;
               double var17 = this.z.b + (this.z.e - this.z.b) * (double)(var28 + 1) / (double)var22 - 0.125D + 0.125D;
               ds var19 = ds.b(this.z.a, var15, this.z.c, this.z.d, var17, this.z.f);
               if(this.l.b(var19, jr.f)) {
                  var27 += 1.0D / (double)var22;
               }
            }

            if(var27 > 0.0D) {
               if(this.am > 0) {
                  --this.am;
               } else if(this.V.nextInt(500) == 0) {
                  this.am = this.V.nextInt(30) + 10;
                  this.t -= 0.20000000298023224D;
                  this.l.a(this, "random.splash", 0.25F, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
                  float var25 = (float)hb.b(this.z.b);

                  float var16;
                  int var23;
                  float var24;
                  for(var23 = 0; (float)var23 < 1.0F + this.H * 20.0F; ++var23) {
                     var16 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     var24 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     this.l.a("bubble", this.p + (double)var16, (double)(var25 + 1.0F), this.r + (double)var24, this.s, this.t - (double)(this.V.nextFloat() * 0.2F), this.u);
                  }

                  for(var23 = 0; (float)var23 < 1.0F + this.H * 20.0F; ++var23) {
                     var16 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     var24 = (this.V.nextFloat() * 2.0F - 1.0F) * this.H;
                     this.l.a("splash", this.p + (double)var16, (double)(var25 + 1.0F), this.r + (double)var24, this.s, this.t, this.u);
                  }
               }
            }

            if(this.am > 0) {
               this.t -= (double)(this.V.nextFloat() * this.V.nextFloat() * this.V.nextFloat()) * 0.2D;
            }

            var14 = var27 * 2.0D - 1.0D;
            this.t += 0.03999999910593033D * var14;
            if(var27 > 0.0D) {
               var26 = (float)((double)var26 * 0.9D);
               this.t *= 0.8D;
            }

            this.s *= (double)var26;
            this.t *= (double)var26;
            this.u *= (double)var26;
            this.a(this.p, this.q, this.r);
         }
      } else {
         this.l();
         this.b.at = null;
      }
   }

   public void a(t var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.f);
      var1.a("inTile", (byte)this.ai);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.aj?1:0));
   }

   public void b(t var1) {
      this.d = var1.c("xTile");
      this.e = var1.c("yTile");
      this.f = var1.c("zTile");
      this.ai = var1.b("inTile") & 255;
      this.a = var1.b("shake") & 255;
      this.aj = var1.b("inGround") == 1;
   }
}
