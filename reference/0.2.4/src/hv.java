// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hv extends jv {

   public hv(em var1) {
      super(var1);
   }

   protected void a(float var1) {
   }

   public void c(float var1, float var2) {
      if(this.r()) {
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.800000011920929D;
         this.t *= 0.800000011920929D;
         this.u *= 0.800000011920929D;
      } else if(this.t()) {
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.5D;
         this.t *= 0.5D;
         this.u *= 0.5D;
      } else {
         float var3 = 0.91F;
         if(this.A) {
            var3 = 0.54600006F;
            int var4 = this.l.a(hd.b(this.p), hd.b(this.z.b) - 1, hd.b(this.r));
            if(var4 > 0) {
               var3 = fy.m[var4].bt * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.A?0.1F * var8:0.02F);
         var3 = 0.91F;
         if(this.A) {
            var3 = 0.54600006F;
            int var5 = this.l.a(hd.b(this.p), hd.b(this.z.b) - 1, hd.b(this.r));
            if(var5 > 0) {
               var3 = fy.m[var5].bt * 0.91F;
            }
         }

         this.c(this.s, this.t, this.u);
         this.s *= (double)var3;
         this.t *= (double)var3;
         this.u *= (double)var3;
      }

      this.bb = this.bc;
      double var9 = this.p - this.m;
      double var10 = this.r - this.o;
      float var7 = hd.a(var9 * var9 + var10 * var10) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.bc += (var7 - this.bc) * 0.4F;
      this.bd += this.bc;
   }

   public boolean d_() {
      return false;
   }
}
