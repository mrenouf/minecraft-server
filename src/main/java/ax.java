// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ax extends ht implements em {

   public int a = 0;
   public double b;
   public double c;
   public double d;
   private dv ai = null;
   private int aj = 0;
   public int e = 0;
   public int f = 0;


   public ax(el var1) {
      super(var1);
      this.a(4.0F, 4.0F);
      this.ad = true;
   }

   protected void c() {
      if(this.l.k == 0) {
         this.l();
      }

      this.e = this.f;
      double var1 = this.b - this.p;
      double var3 = this.c - this.q;
      double var5 = this.d - this.r;
      double var7 = (double)hb.a(var1 * var1 + var3 * var3 + var5 * var5);
      if(var7 < 1.0D || var7 > 60.0D) {
         this.b = this.p + (double)((this.V.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.c = this.q + (double)((this.V.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.d = this.r + (double)((this.V.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if(this.a-- <= 0) {
         this.a += this.V.nextInt(5) + 2;
         if(this.a(this.b, this.c, this.d, var7)) {
            this.s += var1 / var7 * 0.1D;
            this.t += var3 / var7 * 0.1D;
            this.u += var5 / var7 * 0.1D;
         } else {
            this.b = this.p;
            this.c = this.q;
            this.d = this.r;
         }
      }

      if(this.ai != null && this.ai.F) {
         this.ai = null;
      }

      if(this.ai == null || this.aj-- <= 0) {
         this.ai = this.l.a(this, 100.0D);
         if(this.ai != null) {
            this.aj = 20;
         }
      }

      double var9 = 64.0D;
      if(this.ai != null && this.ai.b(this) < var9 * var9) {
         double var11 = this.ai.p - this.p;
         double var13 = this.ai.z.b + (double)(this.ai.I / 2.0F) - (this.q + (double)(this.I / 2.0F));
         double var15 = this.ai.r - this.r;
         this.ay = this.v = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if(this.g(this.ai)) {
            if(this.f == 10) {
               this.l.a(this, "mob.ghast.charge", this.h(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
            }

            ++this.f;
            if(this.f == 20) {
               this.l.a(this, "mob.ghast.fireball", this.h(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
               bm var17 = new bm(this.l, this, var11, var13, var15);
               double var18 = 4.0D;
               ba var20 = this.d(1.0F);
               var17.p = this.p + var20.a * var18;
               var17.q = this.q + (double)(this.I / 2.0F) + 0.5D;
               var17.r = this.r + var20.c * var18;
               this.l.a(var17);
               this.f = -40;
            }
         } else if(this.f > 0) {
            --this.f;
         }
      } else {
         this.ay = this.v = -((float)Math.atan2(this.s, this.u)) * 180.0F / 3.1415927F;
         if(this.f > 0) {
            --this.f;
         }
      }

      this.aF = this.f > 10?"/mob/ghast_fire.png":"/mob/ghast.png";
   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.b - this.p) / var7;
      double var11 = (this.c - this.q) / var7;
      double var13 = (this.d - this.r) / var7;
      ds var15 = this.z.b();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.d(var9, var11, var13);
         if(this.l.a(this, var15).size() > 0) {
            return false;
         }
      }

      return true;
   }

   protected String d() {
      return "mob.ghast.moan";
   }

   protected String e() {
      return "mob.ghast.scream";
   }

   protected String f() {
      return "mob.ghast.death";
   }

   protected int g() {
      return fq.K.aW;
   }

   protected float h() {
      return 10.0F;
   }

   public boolean a() {
      return this.V.nextInt(20) == 0 && super.a() && this.l.k > 0;
   }

   public int i() {
      return 1;
   }
}
