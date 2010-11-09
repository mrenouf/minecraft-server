// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class bd extends dv {

   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e = 0;
   private boolean f = false;
   public int a = 0;
   private jt ai;
   private int aj;
   private int ak = 0;


   public bd(el var1) {
      super(var1);
      this.a(0.25F, 0.25F);
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

      ba var15 = ba.b(this.p, this.q, this.r);
      ba var2 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
      gk var3 = this.l.a(var15, var2);
      var15 = ba.b(this.p, this.q, this.r);
      var2 = ba.b(this.p + this.s, this.q + this.t, this.r + this.u);
      if(var3 != null) {
         var2 = ba.b(var3.f.a, var3.f.b, var3.f.c);
      }

      dv var4 = null;
      List var5 = this.l.b(this, this.z.a(this.s, this.t, this.u).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      int var8;
      float var10;
      for(var8 = 0; var8 < var5.size(); ++var8) {
         dv var9 = (dv)var5.get(var8);
         if(var9.c_() && (var9 != this.ai || this.ak >= 5)) {
            var10 = 0.3F;
            ds var11 = var9.z.b((double)var10, (double)var10, (double)var10);
            gk var12 = var11.a(var15, var2);
            if(var12 != null) {
               double var13 = var15.a(var12.f);
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

      if(var3 != null) {
         if(var3.g != null && var3.g.a(this.ai, 0)) {
            ;
         }

         for(var8 = 0; var8 < 8; ++var8) {
            this.l.a("snowballpoof", this.p, this.q, this.r, 0.0D, 0.0D, 0.0D);
         }

         this.l();
      }

      this.p += this.s;
      this.q += this.t;
      this.r += this.u;
      float var17 = hb.a(this.s * this.s + this.u * this.u);
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
      float var16 = 0.99F;
      var10 = 0.03F;
      if(this.r()) {
         for(int var18 = 0; var18 < 4; ++var18) {
            float var19 = 0.25F;
            this.l.a("bubble", this.p - this.s * (double)var19, this.q - this.t * (double)var19, this.r - this.u * (double)var19, this.s, this.t, this.u);
         }

         var16 = 0.8F;
      }

      this.s *= (double)var16;
      this.t *= (double)var16;
      this.u *= (double)var16;
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
