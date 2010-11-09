// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class du extends dv {

   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e = 0;
   private boolean f = false;
   public int a = 0;
   private jt ai;
   private int aj;
   private int ak = 0;


   public du(el var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public du(el var1, jt var2) {
      super(var1);
      this.ai = var2;
      this.a(0.5F, 0.5F);
      this.c(var2.p, var2.q, var2.r, var2.v, var2.w);
      this.p -= (double)(hb.b(this.v / 180.0F * 3.1415927F) * 0.16F);
      this.q -= 0.10000000149011612D;
      this.r -= (double)(hb.a(this.v / 180.0F * 3.1415927F) * 0.16F);
      this.a(this.p, this.q, this.r);
      this.G = 0.0F;
      this.s = (double)(-hb.a(this.v / 180.0F * 3.1415927F) * hb.b(this.w / 180.0F * 3.1415927F));
      this.u = (double)(hb.b(this.v / 180.0F * 3.1415927F) * hb.b(this.w / 180.0F * 3.1415927F));
      this.t = (double)(-hb.a(this.w / 180.0F * 3.1415927F));
      this.a(this.s, this.t, this.u, 1.5F, 1.0F);
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = hb.a(var1 * var1 + var3 * var3 + var5 * var5);
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
      float var10 = hb.a(var1 * var1 + var5 * var5);
      this.x = this.v = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.y = this.w = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.aj = 0;
   }

   public void b_() {
      super.b_();
      if(this.a > 0) {
         --this.a;
      }

      if(this.f) {
         int var1 = this.l.a(this.b, this.c, this.d);
         if(var1 == this.e) {
            ++this.aj;
            if(this.aj == 1200) {
               this.l();
            }

            return;
         }

         this.f = false;
         this.s *= (double)(this.V.nextFloat() * 0.2F);
         this.t *= (double)(this.V.nextFloat() * 0.2F);
         this.u *= (double)(this.V.nextFloat() * 0.2F);
         this.aj = 0;
         this.ak = 0;
      } else {
         ++this.ak;
      }

      ba var16 = ba.b(this.p, this.q, this.r);
      ba var2 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
      gk var3 = this.l.a(var16, var2);
      var16 = ba.b(this.p, this.q, this.r);
      var2 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
      if(var3 != null) {
         var2 = ba.b(var3.f.a, var3.f.b, var3.f.c);
      }

      dv var4 = null;
      List var5 = this.l.b(this, this.z.a(this.s, this.t, this.u).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      float var10;
      for(int var8 = 0; var8 < var5.size(); ++var8) {
         dv var9 = (dv)var5.get(var8);
         if(var9.c_() && (var9 != this.ai || this.ak >= 5)) {
            var10 = 0.3F;
            ds var11 = var9.z.b((double)var10, (double)var10, (double)var10);
            gk var12 = var11.a(var16, var2);
            if(var12 != null) {
               double var13 = var16.a(var12.f);
               if(var13 < var6 || var6 == 0.0D) {
                  var4 = var9;
                  var6 = var13;
               }
            }
         }
      }

      if(var4 != null) {
         var3 = new gk(var4);
      }

      float var15;
      if(var3 != null) {
         if(var3.g != null) {
            if(var3.g.a(this.ai, 4)) {
               this.l.a(this, "random.drr", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
               this.l();
            } else {
               this.s *= -0.10000000149011612D;
               this.t *= -0.10000000149011612D;
               this.u *= -0.10000000149011612D;
               this.v += 180.0F;
               this.x += 180.0F;
               this.ak = 0;
            }
         } else {
            this.b = var3.b;
            this.c = var3.c;
            this.d = var3.d;
            this.e = this.l.a(this.b, this.c, this.d);
            this.s = (double)((float)(var3.f.a - this.p));
            this.t = (double)((float)(var3.f.b - this.q));
            this.u = (double)((float)(var3.f.c - this.r));
            var15 = hb.a(this.s * this.s + this.t * this.t + this.u * this.u);
            this.p -= this.s / (double)var15 * 0.05000000074505806D;
            this.q -= this.t / (double)var15 * 0.05000000074505806D;
            this.r -= this.u / (double)var15 * 0.05000000074505806D;
            this.l.a(this, "random.drr", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
            this.f = true;
            this.a = 7;
         }
      }

      this.p += this.s;
      this.q += this.t;
      this.r += this.u;
      var15 = hb.a(this.s * this.s + this.u * this.u);
      this.v = (float)(Math.atan2(this.s, this.u) * 180.0D / 3.1415927410125732D);

      for(this.w = (float)(Math.atan2(this.t, (double)var15) * 180.0D / 3.1415927410125732D); this.w - this.y < -180.0F; this.y -= 360.0F) {
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
      float var17 = 0.99F;
      var10 = 0.03F;
      if(this.r()) {
         for(int var18 = 0; var18 < 4; ++var18) {
            float var19 = 0.25F;
            this.l.a("bubble", this.p - this.s * (double)var19, this.q - this.t * (double)var19, this.r - this.u * (double)var19, this.s, this.t, this.u);
         }

         var17 = 0.8F;
      }

      this.s *= (double)var17;
      this.t *= (double)var17;
      this.u *= (double)var17;
      this.t -= (double)var10;
      this.a(this.p, this.q, this.r);
   }

   public void a(t var1) {
      var1.a("xTile", (short)this.b);
      var1.a("yTile", (short)this.c);
      var1.a("zTile", (short)this.d);
      var1.a("inTile", (byte)this.e);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.f?1:0));
   }

   public void b(t var1) {
      this.b = var1.c("xTile");
      this.c = var1.c("yTile");
      this.d = var1.c("zTile");
      this.e = var1.b("inTile") & 255;
      this.a = var1.b("shake") & 255;
      this.f = var1.b("inGround") == 1;
   }

   public void a(ft var1) {
      if(this.f && this.ai == var1 && this.a <= 0 && var1.ak.a(new hh(fq.j.aW, 1))) {
         this.l.a(this, "random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.c(this, 1);
         this.l();
      }

   }
}
