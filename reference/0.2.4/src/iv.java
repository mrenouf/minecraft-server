// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:55
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class iv extends gg {

   private int a = 0;
   private int b = 0;
   private static final hj c = new hj(fs.E, 1);


   public iv(em var1) {
      super(var1);
   }

   public void b_() {
      this.br = this.f != null?0.95F:0.5F;
      if(this.b > 0 && (this.b -= 1) == 0) {
         this.l.a(this, "mob.zombiepig.zpigangry", this.h() * 2.0F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.b_();
   }

   public boolean a() {
      return this.l.k > 0 && this.l.a(this.z) && this.l.a(this, this.z).size() == 0 && !this.l.b(this.z);
   }

   public void a(v var1) {
      super.a(var1);
      var1.a("Anger", (short)this.a);
   }

   public void b(v var1) {
      super.b(var1);
      this.a = var1.c("Anger");
   }

   protected dw k() {
      return this.a == 0?null:super.k();
   }

   public void D() {
      super.D();
   }

   public boolean a(dw var1, int var2) {
      if(var1 instanceof fv) {
         List var3 = this.l.b(this, this.z.b(32.0D, 32.0D, 32.0D));

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            dw var5 = (dw)var3.get(var4);
            if(var5 instanceof iv) {
               iv var6 = (iv)var5;
               var6.h(var1);
            }
         }

         this.h(var1);
      }

      return super.a(var1, var2);
   }

   private void h(dw var1) {
      this.f = var1;
      this.a = 400 + this.V.nextInt(400);
      this.b = this.V.nextInt(40);
   }

   protected String d() {
      return "mob.zombiepig.zpig";
   }

   protected String e() {
      return "mob.zombiepig.zpighurt";
   }

   protected String f() {
      return "mob.zombiepig.zpigdeath";
   }

   protected int g() {
      return fs.ap.aW;
   }

}
