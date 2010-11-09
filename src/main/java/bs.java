// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:00
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class bs extends fx {

   public bs(el var1) {
      super(var1);
      this.a(1.4F, 0.9F);
      this.bl = 0.8F;
   }

   public double j() {
      return (double)this.I * 0.75D - 0.5D;
   }

   protected dv k() {
      float var1 = this.b(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.l.a(this, var2);
      } else {
         return null;
      }
   }

   protected String d() {
      return "mob.spider";
   }

   protected String e() {
      return "mob.spider";
   }

   protected String f() {
      return "mob.spiderdeath";
   }

   protected void a(dv var1, float var2) {
      float var3 = this.b(1.0F);
      if(var3 > 0.5F && this.V.nextInt(100) == 0) {
         this.f = null;
      } else {
         if(var2 > 2.0F && var2 < 6.0F && this.V.nextInt(10) == 0) {
            if(this.A) {
               double var4 = var1.p - this.p;
               double var6 = var1.r - this.r;
               float var8 = hb.a(var4 * var4 + var6 * var6);
               this.s = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.s * 0.20000000298023224D;
               this.u = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.u * 0.20000000298023224D;
               this.t = 0.4000000059604645D;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   public void a(t var1) {
      super.a(var1);
   }

   public void b(t var1) {
      super.b(var1);
   }

   protected int g() {
      return fq.I.aW;
   }
}
