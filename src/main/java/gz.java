// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:04
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gz extends jt {

   private co a;
   protected dv f;
   protected boolean ai = false;


   public gz(el var1) {
      super(var1);
   }

   protected void c() {
      this.ai = false;
      float var1 = 16.0F;
      if(this.f == null) {
         this.f = this.k();
         if(this.f != null) {
            this.a = this.l.a(this, this.f, var1);
         }
      } else if(!this.f.w()) {
         this.f = null;
      } else {
         float var2 = this.f.a(this);
         if(this.g(this.f)) {
            this.a(this.f, var2);
         }
      }

      if(!this.ai && this.f != null && (this.a == null || this.V.nextInt(20) == 0)) {
         this.a = this.l.a(this, this.f, var1);
      } else if(this.a == null && this.V.nextInt(80) == 0 || this.V.nextInt(80) == 0) {
         boolean var21 = false;
         int var3 = -1;
         int var4 = -1;
         int var5 = -1;
         float var6 = -99999.0F;

         for(int var7 = 0; var7 < 10; ++var7) {
            int var8 = hb.b(this.p + (double)this.V.nextInt(13) - 6.0D);
            int var9 = hb.b(this.q + (double)this.V.nextInt(7) - 3.0D);
            int var10 = hb.b(this.r + (double)this.V.nextInt(13) - 6.0D);
            float var11 = this.a(var8, var9, var10);
            if(var11 > var6) {
               var6 = var11;
               var3 = var8;
               var4 = var9;
               var5 = var10;
               var21 = true;
            }
         }

         if(var21) {
            this.a = this.l.a(this, var3, var4, var5, 10.0F);
         }
      }

      int var25 = hb.b(this.z.b);
      boolean var22 = this.r();
      boolean var24 = this.t();
      this.w = 0.0F;
      if(this.a != null && this.V.nextInt(100) != 0) {
         ba var27 = this.a.a(this);
         double var28 = (double)(this.H * 2.0F);

         while(var27 != null && var27.d(this.p, var27.b, this.r) < var28 * var28) {
            this.a.a();
            if(this.a.b()) {
               var27 = null;
               this.a = null;
            } else {
               var27 = this.a.a(this);
            }
         }

         this.bj = false;
         if(var27 != null) {
            double var23 = var27.a - this.p;
            double var26 = var27.c - this.r;
            double var12 = var27.b - (double)var25;
            float var14 = (float)(Math.atan2(var26, var23) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = var14 - this.v;

            for(this.bh = this.bl; var15 < -180.0F; var15 += 360.0F) {
               ;
            }

            while(var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.v += var15;
            if(this.ai && this.f != null) {
               double var16 = this.f.p - this.p;
               double var18 = this.f.r - this.r;
               float var20 = this.v;
               this.v = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.v + 90.0F) * 3.1415927F / 180.0F;
               this.bg = -hb.a(var15) * this.bh * 1.0F;
               this.bh = hb.b(var15) * this.bh * 1.0F;
            }

            if(var12 > 0.0D) {
               this.bj = true;
            }
         }

         if(this.f != null) {
            this.b(this.f, 30.0F);
         }

         if(this.B) {
            this.bj = true;
         }

         if(this.V.nextFloat() < 0.8F && (var22 || var24)) {
            this.bj = true;
         }

      } else {
         super.c();
         this.a = null;
      }
   }

   protected void a(dv var1, float var2) {
   }

   protected float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected dv k() {
      return null;
   }

   public boolean a() {
      int var1 = hb.b(this.p);
      int var2 = hb.b(this.z.b);
      int var3 = hb.b(this.r);
      return super.a() && this.a(var1, var2, var3) >= 0.0F;
   }
}
