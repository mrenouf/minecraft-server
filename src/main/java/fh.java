// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class fh extends dv {

   public int a = 0;
   public int b = 0;
   public int c = 1;


   public fh(el var1) {
      super(var1);
      this.a(1.5F, 0.6F);
      this.G = this.I / 2.0F;
      this.L = false;
   }

   public ds d(dv var1) {
      return var1.z;
   }

   public ds q() {
      return this.z;
   }

   public boolean u() {
      return true;
   }

   public double j() {
      return (double)this.I * 0.0D - 0.30000001192092896D;
   }

   public boolean a(dv var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if(this.a > 40) {
         int var3;
         for(var3 = 0; var3 < 3; ++var3) {
            this.a(fw.y.bi, 1, 0.0F);
         }

         for(var3 = 0; var3 < 2; ++var3) {
            this.a(fq.B.aW, 1, 0.0F);
         }

         this.l();
      }

      return true;
   }

   public boolean c_() {
      return !this.F;
   }

   public void b_() {
      super.b_();
      if(this.b > 0) {
         --this.b;
      }

      if(this.a > 0) {
         --this.a;
      }

      this.m = this.p;
      this.n = this.q;
      this.o = this.r;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.z.b + (this.z.e - this.z.b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.z.b + (this.z.e - this.z.b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         ds var9 = ds.b(this.z.a, var5, this.z.c, this.z.d, var7, this.z.f);
         if(this.l.b(var9, jr.f)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var24 = var2 * 2.0D - 1.0D;
      this.t += 0.03999999910593033D * var24;
      if(this.j != null) {
         this.s += this.j.s * 0.2D;
         this.u += this.j.u * 0.2D;
      }

      double var6 = 0.4D;
      if(this.s < -var6) {
         this.s = -var6;
      }

      if(this.s > var6) {
         this.s = var6;
      }

      if(this.u < -var6) {
         this.u = -var6;
      }

      if(this.u > var6) {
         this.u = var6;
      }

      if(this.A) {
         this.s *= 0.5D;
         this.t *= 0.5D;
         this.u *= 0.5D;
      }

      this.c(this.s, this.t, this.u);
      double var8 = Math.sqrt(this.s * this.s + this.u * this.u);
      double var10;
      double var12;
      if(var8 > 0.15D) {
         var10 = Math.cos((double)this.v * 3.141592653589793D / 180.0D);
         var12 = Math.sin((double)this.v * 3.141592653589793D / 180.0D);

         for(int var14 = 0; (double)var14 < 1.0D + var8 * 60.0D; ++var14) {
            double var15 = (double)(this.V.nextFloat() * 2.0F - 1.0F);
            double var17 = (double)(this.V.nextInt(2) * 2 - 1) * 0.7D;
            double var19;
            double var21;
            if(this.V.nextBoolean()) {
               var19 = this.p - var10 * var15 * 0.8D + var12 * var17;
               var21 = this.r - var12 * var15 * 0.8D - var10 * var17;
               this.l.a("splash", var19, this.q - 0.125D, var21, this.s, this.t, this.u);
            } else {
               var19 = this.p + var10 + var12 * var15 * 0.7D;
               var21 = this.r + var12 - var10 * var15 * 0.7D;
               this.l.a("splash", var19, this.q - 0.125D, var21, this.s, this.t, this.u);
            }
         }
      }

      if(this.B && var8 > 0.15D) {
         this.l();

         int var25;
         for(var25 = 0; var25 < 3; ++var25) {
            this.a(fw.y.bi, 1, 0.0F);
         }

         for(var25 = 0; var25 < 2; ++var25) {
            this.a(fq.B.aW, 1, 0.0F);
         }
      } else {
         this.s *= 0.9900000095367432D;
         this.t *= 0.949999988079071D;
         this.u *= 0.9900000095367432D;
      }

      this.w = 0.0F;
      var10 = (double)this.v;
      var12 = this.m - this.p;
      double var26 = this.o - this.r;
      if(var12 * var12 + var26 * var26 > 0.0010D) {
         var10 = (double)((float)(Math.atan2(var26, var12) * 180.0D / 3.141592653589793D));
      }

      double var16;
      for(var16 = var10 - (double)this.v; var16 >= 180.0D; var16 -= 360.0D) {
         ;
      }

      while(var16 < -180.0D) {
         var16 += 360.0D;
      }

      if(var16 > 20.0D) {
         var16 = 20.0D;
      }

      if(var16 < -20.0D) {
         var16 = -20.0D;
      }

      this.v = (float)((double)this.v + var16);
      this.b(this.v, this.w);
      List var18 = this.l.b(this, this.z.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var18 != null && var18.size() > 0) {
         for(int var23 = 0; var23 < var18.size(); ++var23) {
            dv var20 = (dv)var18.get(var23);
            if(var20 != this.j && var20.u() && var20 instanceof fh) {
               var20.c(this);
            }
         }
      }

      if(this.j != null && this.j.F) {
         this.j = null;
      }

   }

   protected void z() {
      double var1 = Math.cos((double)this.v * 3.141592653589793D / 180.0D) * 0.4D;
      double var3 = Math.sin((double)this.v * 3.141592653589793D / 180.0D) * 0.4D;
      this.j.a(this.p + var1, this.q + this.j() + this.j.A(), this.r + var3);
   }

   protected void a(t var1) {
   }

   protected void b(t var1) {
   }
}
