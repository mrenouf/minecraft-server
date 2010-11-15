// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:49
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fx extends gz implements em {

   protected int e = 2;


   public fx(el var1) {
      super(var1);
   }

   public void D() {
      float var1 = this.b(1.0F);
      if(var1 > 0.5F) {
         this.bf += 2;
      }

      super.D();
   }

   public void b_() {
      super.b_();
      if(this.l.k == 0) {
         this.l();
      }

   }

   protected dv k() {
      ft var1 = this.l.a(this, 16.0D);
      return var1 != null && this.g(var1)?var1:null;
   }

   public boolean a(dv var1, int var2) {
      if(super.a(var1, var2)) {
         if(this.j != var1 && this.k != var1) {
            if(var1 != this) {
               this.f = var1;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   protected void a(dv var1, float var2) {
      if((double)var2 < 2.5D && var1.z.e > this.z.b && var1.z.b < this.z.e) {
         this.aV = 20;
         var1.a(this, this.e);
      }

   }

   protected float a(int var1, int var2, int var3) {
      return 0.5F - this.l.j(var1, var2, var3);
   }

   public void a(t var1) {
      super.a(var1);
   }

   public void b(t var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = hb.b(this.p);
      int var2 = hb.b(this.z.b);
      int var3 = hb.b(this.r);
      if(this.l.a(dj.a, var1, var2, var3) > this.V.nextInt(32)) {
         return false;
      } else {
         int var4 = this.l.h(var1, var2, var3);
         return var4 <= this.V.nextInt(8) && super.a();
      }
   }
}
