// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class fv extends jv {

   public hg ak = new hg(this);
   public byte al = 0;
   public int am = 0;
   public float an;
   public float ao;
   public boolean ap = false;
   public int aq = 0;
   public String ar;
   public int as;
   private int a = 0;
   public kb at = null;


   public fv(em var1) {
      super(var1);
      this.c((double)var1.m + 0.5D, (double)(var1.n + 1), (double)var1.o + 0.5D, 0.0F, 0.0F);
      this.aP = 20;
      this.aI = "humanoid";
      this.aH = 180.0F;
      this.X = 20;
      this.aF = "/mob/char.png";
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
      float var1 = hd.a(this.s * this.s + this.u * this.u);
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
               this.h((dw)var3.get(var4));
            }
         }
      }

   }

   private void h(dw var1) {
      var1.b(this);
   }

   public void f(dw var1) {
      this.a(0.2F, 0.2F);
      this.a(this.p, this.q, this.r);
      this.t = 0.10000000149011612D;
      if(this.ar.equals("Notch")) {
         this.a(new hj(fs.h, 1), true);
      }

      this.ak.f();
      if(var1 != null) {
         this.s = (double)(-hd.b((this.aT + this.v) * 3.1415927F / 180.0F) * 0.1F);
         this.u = (double)(-hd.a((this.aT + this.v) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.s = this.u = 0.0D;
      }

      this.G = 0.1F;
   }

   public void b(dw var1, int var2) {
      this.am += var2;
   }

   public void a(hj var1) {
      this.a(var1, false);
   }

   public void a(hj var1, boolean var2) {
      if(var1 != null) {
         gh var3 = new gh(this.l, this.p, this.q - 0.30000001192092896D + (double)this.s(), this.r, var1);
         var3.c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.V.nextFloat() * 0.5F;
            float var6 = this.V.nextFloat() * 3.1415927F * 2.0F;
            var3.s = (double)(-hd.a(var6) * var5);
            var3.u = (double)(hd.b(var6) * var5);
            var3.t = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.s = (double)(-hd.a(this.v / 180.0F * 3.1415927F) * hd.b(this.w / 180.0F * 3.1415927F) * var4);
            var3.u = (double)(hd.b(this.v / 180.0F * 3.1415927F) * hd.b(this.w / 180.0F * 3.1415927F) * var4);
            var3.t = (double)(-hd.a(this.w / 180.0F * 3.1415927F) * var4 + 0.1F);
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

   protected void a(gh var1) {
      this.l.a(var1);
   }

   public float a(fy var1) {
      float var2 = this.ak.a(var1);
      if(this.a(jt.f)) {
         var2 /= 5.0F;
      }

      if(!this.A) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean b(fy var1) {
      return this.ak.b(var1);
   }

   public void b(v var1) {
      super.b(var1);
      ea var2 = var1.k("Inventory");
      this.ak.b(var2);
      this.as = var1.d("Dimension");
   }

   public void a(v var1) {
      super.a(var1);
      var1.a("Inventory", this.ak.a(new ea()));
      var1.a("Dimension", this.as);
   }

   public void a(jz var1) {
   }

   public void F() {
   }

   public void c(dw var1, int var2) {
   }

   public float s() {
      return 0.12F;
   }

   public boolean a(dw var1, int var2) {
      this.bl = 0;
      if(this.aP <= 0) {
         return false;
      } else {
         if(var1 instanceof fz || var1 instanceof dv) {
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

         return var2 == 0?false:super.a(var1, var2);
      }
   }

   protected void c(int var1) {
      int var2 = 25 - this.ak.e();
      int var3 = var1 * var2 + this.a;
      this.ak.c(var1);
      var1 = var3 / 25;
      this.a = var3 % 25;
      super.c(var1);
   }

   public void a(ds var1) {
   }

   public void a(ji var1) {
   }

   public hj G() {
      return this.ak.b();
   }

   public void H() {
      this.ak.a(this.ak.d, (hj)null);
   }

   public double A() {
      return (double)(this.G - 0.5F);
   }

   public void E() {
      this.aq = -1;
      this.ap = true;
   }
}
