// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ht extends jt {

   public ht(el var1) {
      super(var1);
   }

   protected void a(float var1) {
   }

   public void c(float var1, float var2) {
      double var3;
      if(this.r()) {
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.800000011920929D;
         this.t *= 0.800000011920929D;
         this.u *= 0.800000011920929D;
      } else if(this.t()) {
         var3 = this.q;
         this.a(var1, var2, 0.02F);
         this.c(this.s, this.t, this.u);
         this.s *= 0.5D;
         this.t *= 0.5D;
         this.u *= 0.5D;
      } else {
         float var10 = 0.91F;
         if(this.A) {
            var10 = 0.54600006F;
            int var4 = this.l.a(hb.b(this.p), hb.b(this.z.b) - 1, hb.b(this.r));
            if(var4 > 0) {
               var10 = fw.n[var4].bu * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var10 * var10 * var10);
         this.a(var1, var2, this.A?0.1F * var8:0.02F);
         var10 = 0.91F;
         if(this.A) {
            var10 = 0.54600006F;
            int var5 = this.l.a(hb.b(this.p), hb.b(this.z.b) - 1, hb.b(this.r));
            if(var5 > 0) {
               var10 = fw.n[var5].bu * 0.91F;
            }
         }

         this.c(this.s, this.t, this.u);
         this.s *= (double)var10;
         this.t *= (double)var10;
         this.u *= (double)var10;
      }

      this.bb = this.bc;
      var3 = this.p - this.m;
      double var9 = this.r - this.o;
      float var7 = hb.a(var3 * var3 + var9 * var9) * 4.0F;
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
