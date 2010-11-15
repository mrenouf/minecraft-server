// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:45
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class ft extends jt {

   public he ak = new he(this);
   public byte al = 0;
   public int am = 0;
   public float an;
   public float ao;
   public boolean ap = false;
   public int aq = 0;
   public String ar;
   public int as;
   private int a = 0;
   public jz at = null;


   public ft(el var1) {
      super(var1);
      this.c((double)var1.m + 0.5D, (double)(var1.n + 1), (double)var1.o + 0.5D, 0.0F, 0.0F);
      this.aP = 20;
      this.aI = "humanoid";
      this.aH = 180.0F;
      this.X = 20;
      this.aF = "/char.png";
   }

   public void y() {
      super.y();
      this.an = this.ao;
      this.ao = 0.0F;
   }

   protected void c() {
      if(this.ap) {
         ++this.aq;
         if(this.aq == 8) {
            this.aq = 0;
            this.ap = false;
         }
      } else {
         this.aq = 0;
      }

      this.aO = (float)this.aq / 8.0F;
   }

   public void D() {
      if(this.l.k == 0 && this.aP < 20 && this.W % 20 * 4 == 0) {
         this.a(1);
      }

      this.ak.c();
      this.an = this.ao;
      super.D();
      float var1 = hb.a(this.s * this.s + this.u * this.u);
      float var2 = (float)Math.atan(-this.t * 0.20000000298023224D) * 15.0F;
      if(var1 > 0.1F) {
         var1 = 0.1F;
      }

      if(!this.A || this.aP <= 0) {
         var1 = 0.0F;
      }

      if(this.A || this.aP <= 0) {
         var2 = 0.0F;
      }

      this.ao += (var1 - this.ao) * 0.4F;
      this.aX += (var2 - this.aX) * 0.8F;
      if(this.aP > 0) {
         List var3 = this.l.b(this, this.z.b(1.0D, 0.0D, 1.0D));
         if(var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               this.h((dv)var3.get(var4));
            }
         }
      }

   }

   private void h(dv var1) {
      var1.a(this);
   }

   public void f(dv var1) {
      this.a(0.2F, 0.2F);
      this.a(this.p, this.q, this.r);
      this.t = 0.10000000149011612D;
      if(this.ar.equals("Notch")) {
         this.a(new hh(fq.h, 1), true);
      }

      this.ak.f();
      if(var1 != null) {
         this.s = (double)(-hb.b((this.aT + this.v) * 3.1415927F / 180.0F) * 0.1F);
         this.u = (double)(-hb.a((this.aT + this.v) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.s = this.u = 0.0D;
      }

      this.G = 0.1F;
   }

   public void b(dv var1, int var2) {
      this.am += var2;
   }

   public void a(hh var1) {
      this.a(var1, false);
   }

   public void a(hh var1, boolean var2) {
      if(var1 != null) {
         gf var3 = new gf(this.l, this.p, this.q - 0.30000001192092896D + (double)this.s(), this.r, var1);
         var3.c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.V.nextFloat() * 0.5F;
            float var6 = this.V.nextFloat() * 3.1415927F * 2.0F;
            var3.s = (double)(-hb.a(var6) * var5);
            var3.u = (double)(hb.b(var6) * var5);
            var3.t = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.s = (double)(-hb.a(this.v / 180.0F * 3.1415927F) * hb.b(this.w / 180.0F * 3.1415927F) * var4);
            var3.u = (double)(hb.b(this.v / 180.0F * 3.1415927F) * hb.b(this.w / 180.0F * 3.1415927F) * var4);
            var3.t = (double)(-hb.a(this.w / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.V.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.V.nextFloat();
            var3.s += Math.cos((double)var5) * (double)var4;
            var3.t += (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.1F);
            var3.u += Math.sin((double)var5) * (double)var4;
         }

         this.a(var3);
      }
   }

   protected void a(gf var1) {
      this.l.a(var1);
   }

   public float a(fw var1) {
      float var2 = this.ak.a(var1);
      if(this.a(jr.f)) {
         var2 /= 5.0F;
      }

      if(!this.A) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean b(fw var1) {
      return this.ak.b(var1);
   }

   public void b(t var1) {
      super.b(var1);
      dy var2 = var1.k("Inventory");
      this.ak.b(var2);
      this.as = var1.d("Dimension");
   }

   public void a(t var1) {
      super.a(var1);
      var1.a("Inventory", this.ak.a(new dy()));
      var1.a("Dimension", this.as);
   }

   public void a(jx var1) {
   }

   public void F() {
   }

   public void c(dv var1, int var2) {
   }

   protected float s() {
      return 0.12F;
   }

   public boolean a(dv var1, int var2) {
      this.bf = 0;
      if(this.aP <= 0) {
         return false;
      } else {
         if(var1 instanceof fx || var1 instanceof du) {
            if(this.l.k == 0) {
               var2 = 0;
            }

            if(this.l.k == 1) {
               var2 = var2 / 3 + 1;
            }

            if(this.l.k == 3) {
               var2 = var2 * 3 / 2;
            }
         }

         if((float)this.ab <= (float)this.au / 2.0F) {
            int var3 = 25 - this.ak.e();
            int var4 = var2 * var3 + this.a;
            this.ak.b(var2);
            var2 = var4 / 25;
            this.a = var4 % 25;
         }

         return var2 == 0?false:super.a(var1, var2);
      }
   }

   public void a(dr var1) {
   }

   public void a(jg var1) {
   }

   public hh G() {
      return this.ak.b();
   }

   public void H() {
      this.ak.a(this.ak.d, (hh)null);
   }

   public double A() {
      return (double)(this.G - 0.5F);
   }

   public void E() {
      this.aq = -1;
      this.ap = true;
   }
}
