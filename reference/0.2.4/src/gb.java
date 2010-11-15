// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gb extends jv implements en {

   public float a;
   public float b;
   private int d = 0;
   public int c = 1;


   public gb(em var1) {
      super(var1);
      this.c = 1 << this.V.nextInt(3);
      this.G = 0.0F;
      this.d = this.V.nextInt(20) + 10;
      this.d(this.c);
   }

   public void d(int var1) {
      this.c = var1;
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.aP = var1 * var1;
      this.a(this.p, this.q, this.r);
   }

   public void a(v var1) {
      super.a(var1);
      var1.a("Size", this.c - 1);
   }

   public void b(v var1) {
      super.b(var1);
      this.c = var1.d("Size") + 1;
   }

   public void b_() {
      this.b = this.a;
      boolean var1 = this.A;
      super.b_();
      if(this.A && !var1) {
         for(int var2 = 0; var2 < this.c * 8; ++var2) {
            float var3 = this.V.nextFloat() * 3.1415927F * 2.0F;
            float var4 = this.V.nextFloat() * 0.5F + 0.5F;
            float var5 = hd.a(var3) * (float)this.c * 0.5F * var4;
            float var6 = hd.b(var3) * (float)this.c * 0.5F * var4;
            this.l.a("slime", this.p + (double)var5, this.z.b, this.r + (double)var6, 0.0D, 0.0D, 0.0D);
         }

         if(this.c > 2) {
            this.l.a(this, "mob.slime", this.h(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.a *= 0.6F;
   }

   protected void c() {
      fv var1 = this.l.a(this, 16.0D);
      if(var1 != null) {
         this.b(var1, 10.0F);
      }

      if(this.A && this.d-- <= 0) {
         this.d = this.V.nextInt(20) + 10;
         if(var1 != null) {
            this.d /= 3;
         }

         this.bp = true;
         if(this.c > 1) {
            this.l.a(this, "mob.slime", this.h(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.bm = 1.0F - this.V.nextFloat() * 2.0F;
         this.bn = (float)(1 * this.c);
      } else {
         this.bp = false;
         if(this.A) {
            this.bm = this.bn = 0.0F;
         }
      }

   }

   public void l() {
      if(this.c > 1 && this.aP == 0) {
         for(int var1 = 0; var1 < 4; ++var1) {
            float var2 = ((float)(var1 % 2) - 0.5F) * (float)this.c / 4.0F;
            float var3 = ((float)(var1 / 2) - 0.5F) * (float)this.c / 4.0F;
            gb var4 = new gb(this.l);
            var4.d(this.c / 2);
            var4.c(this.p + (double)var2, this.q + 0.5D, this.r + (double)var3, this.V.nextFloat() * 360.0F, 0.0F);
            this.l.a(var4);
         }
      }

      super.l();
   }

   public void b(fv var1) {
      if(this.c > 1 && this.g(var1) && (double)this.a(var1) < 0.6D * (double)this.c && var1.a(this, this.c)) {
         this.l.a(this, "mob.slimeattack", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected String e() {
      return "mob.slime";
   }

   protected String f() {
      return "mob.slime";
   }

   protected int g() {
      return this.c == 1?fs.aK.aW:0;
   }

   public boolean a() {
      jp var1 = this.l.b(hd.b(this.p), hd.b(this.r));
      return (this.c == 1 || this.l.k > 0) && this.V.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.q < 16.0D;
   }

   protected float h() {
      return 0.6F;
   }
}
