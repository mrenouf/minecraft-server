// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class bo extends dw {

   private int e = -1;
   private int f = -1;
   private int ai = -1;
   private int aj = 0;
   private boolean ak = false;
   public int a = 0;
   private jv al;
   private int am;
   private int an = 0;
   public double b;
   public double c;
   public double d;


   public bo(em var1) {
      super(var1);
      this.a(1.0F, 1.0F);
   }

   public bo(em var1, jv var2, double var3, double var5, double var7) {
      super(var1);
      this.al = var2;
      this.a(1.0F, 1.0F);
      this.c(var2.p, var2.q, var2.r, var2.v, var2.w);
      this.a(this.p, this.q, this.r);
      this.G = 0.0F;
      this.s = this.t = this.u = 0.0D;
      var3 += this.V.nextGaussian() * 0.4D;
      var5 += this.V.nextGaussian() * 0.4D;
      var7 += this.V.nextGaussian() * 0.4D;
      double var9 = (double)hd.a(var3 * var3 + var5 * var5 + var7 * var7);
      this.b = var3 / var9 * 0.1D;
      this.c = var5 / var9 * 0.1D;
      this.d = var7 / var9 * 0.1D;
   }

   public void b_() {
      super.b_();
      this.Y = 10;
      if(this.a > 0) {
         --this.a;
      }

      if(this.ak) {
         int var1 = this.l.a(this.e, this.f, this.ai);
         if(var1 == this.aj) {
            ++this.am;
            if(this.am == 1200) {
               this.l();
            }

            return;
         }

         this.ak = false;
         this.s *= (double)(this.V.nextFloat() * 0.2F);
         this.t *= (double)(this.V.nextFloat() * 0.2F);
         this.u *= (double)(this.V.nextFloat() * 0.2F);
         this.am = 0;
         this.an = 0;
      } else {
         ++this.an;
      }

      bc var16 = bc.b(this.p, this.q, this.r);
      bc var2 = bc.b(this.p + this.s, this.q + this.t, this.r + this.u);
      gm var3 = this.l.a(var16, var2);
      var16 = bc.b(this.p, this.q, this.r);
      var2 = bc.b(this.p + this.s, this.q + this.t, this.r + this.u);
      if(var3 != null) {
         var2 = bc.b(var3.f.a, var3.f.b, var3.f.c);
      }

      dw var4 = null;
      List var5 = this.l.b(this, this.z.a(this.s, this.t, this.u).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      for(int var8 = 0; var8 < var5.size(); ++var8) {
         dw var9 = (dw)var5.get(var8);
         if(var9.c_() && (var9 != this.al || this.an >= 25)) {
            float var10 = 0.3F;
            dt var11 = var9.z.b((double)var10, (double)var10, (double)var10);
            gm var12 = var11.a(var16, var2);
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
         var3 = new gm(var4);
      }

      if(var3 != null) {
         if(var3.g != null && var3.g.a(this.al, 0)) {
            ;
         }

         ch var15 = new ch();
         var15.a = true;
         var15.a(this.l, this, this.p, this.q, this.r, 1.0F);
         this.l();
      }

      this.p += this.s;
      this.q += this.t;
      this.r += this.u;
      float var17 = hd.a(this.s * this.s + this.u * this.u);
      this.v = (float)(Math.atan2(this.s, this.u) * 180.0D / 3.1415927410125732D);

      for(this.w = (float)(Math.atan2(this.t, (double)var17) * 180.0D / 3.1415927410125732D); this.w - this.y < -180.0F; this.y -= 360.0F) {
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
      float var18 = 0.95F;
      if(this.r()) {
         for(int var19 = 0; var19 < 4; ++var19) {
            float var20 = 0.25F;
            this.l.a("bubble", this.p - this.s * (double)var20, this.q - this.t * (double)var20, this.r - this.u * (double)var20, this.s, this.t, this.u);
         }

         var18 = 0.8F;
      }

      this.s += this.b;
      this.t += this.c;
      this.u += this.d;
      this.s *= (double)var18;
      this.t *= (double)var18;
      this.u *= (double)var18;
      this.l.a("smoke", this.p, this.q + 0.5D, this.r, 0.0D, 0.0D, 0.0D);
      this.a(this.p, this.q, this.r);
   }

   public void a(v var1) {
      var1.a("xTile", (short)this.e);
      var1.a("yTile", (short)this.f);
      var1.a("zTile", (short)this.ai);
      var1.a("inTile", (byte)this.aj);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.ak?1:0));
   }

   public void b(v var1) {
      this.e = var1.c("xTile");
      this.f = var1.c("yTile");
      this.ai = var1.c("zTile");
      this.aj = var1.b("inTile") & 255;
      this.a = var1.b("shake") & 255;
      this.ak = var1.b("inGround") == 1;
   }

   public boolean c_() {
      return true;
   }

   public boolean a(dw var1, int var2) {
      if(var1 != null) {
         bc var3 = var1.B();
         if(var3 != null) {
            this.s = var3.a;
            this.t = var3.b;
            this.u = var3.c;
            this.b = this.s * 0.1D;
            this.c = this.t * 0.1D;
            this.d = this.u * 0.1D;
         }

         return true;
      } else {
         return false;
      }
   }
}
