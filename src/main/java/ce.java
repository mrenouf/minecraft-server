// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:59
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ce extends ay {

   public int e = -1;
   public String f = "Pig";
   public double g;
   public double h = 0.0D;


   public ce() {
      this.e = 20;
   }

   public boolean a() {
      return this.a.a((double)this.b + 0.5D, (double)this.c + 0.5D, (double)this.d + 0.5D, 16.0D) != null;
   }

   public void b() {
      this.h = this.g;
      if(this.a()) {
         double var1 = (double)((float)this.b + this.a.l.nextFloat());
         double var3 = (double)((float)this.c + this.a.l.nextFloat());
         double var5 = (double)((float)this.d + this.a.l.nextFloat());
         this.a.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
         this.a.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);

         for(this.g += (double)(1000.0F / ((float)this.e + 200.0F)); this.g > 360.0D; this.h -= 360.0D) {
            this.g -= 360.0D;
         }

         if(this.e == -1) {
            this.d();
         }

         if(this.e > 0) {
            --this.e;
         } else {
            byte var7 = 4;

            for(int var8 = 0; var8 < var7; ++var8) {
               jv var9 = (jv)((jv)hl.a(this.f, this.a));
               if(var9 == null) {
                  return;
               }

               int var10 = this.a.a(var9.getClass(), dt.b((double)this.b, (double)this.c, (double)this.d, (double)(this.b + 1), (double)(this.c + 1), (double)(this.d + 1)).b(8.0D, 4.0D, 8.0D)).size();
               if(var10 >= 6) {
                  this.d();
                  return;
               }

               if(var9 != null) {
                  double var11 = (double)this.b + (this.a.l.nextDouble() - this.a.l.nextDouble()) * 4.0D;
                  double var13 = (double)(this.c + this.a.l.nextInt(3) - 1);
                  double var15 = (double)this.d + (this.a.l.nextDouble() - this.a.l.nextDouble()) * 4.0D;
                  var9.c(var11, var13, var15, this.a.l.nextFloat() * 360.0F, 0.0F);
                  if(var9.a()) {
                     this.a.a(var9);

                     for(int var17 = 0; var17 < 20; ++var17) {
                        var1 = (double)this.b + 0.5D + ((double)this.a.l.nextFloat() - 0.5D) * 2.0D;
                        var3 = (double)this.c + 0.5D + ((double)this.a.l.nextFloat() - 0.5D) * 2.0D;
                        var5 = (double)this.d + 0.5D + ((double)this.a.l.nextFloat() - 0.5D) * 2.0D;
                        this.a.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
                        this.a.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
                     }

                     var9.I();
                     this.d();
                  }
               }
            }

            super.b();
         }
      }
   }

   private void d() {
      this.e = 200 + this.a.l.nextInt(600);
   }

   public void a(v var1) {
      super.a(var1);
      this.f = var1.h("EntityId");
      this.e = var1.c("Delay");
   }

   public void b(v var1) {
      super.b(var1);
      var1.a("EntityId", this.f);
      var1.a("Delay", (short)this.e);
   }
}
