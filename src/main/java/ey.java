// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:33
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ey extends fx {

   private static final hh a = new hh(fq.i, 1);


   public ey(el var1) {
      super(var1);
   }

   protected String d() {
      return "mob.skeleton";
   }

   protected String e() {
      return "mob.skeletonhurt";
   }

   protected String f() {
      return "mob.skeletonhurt";
   }

   public void D() {
      if(this.l.b()) {
         float var1 = this.b(1.0F);
         if(var1 > 0.5F && this.l.g(hb.b(this.p), hb.b(this.q), hb.b(this.r)) && this.V.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.Y = 300;
         }
      }

      super.D();
   }

   protected void a(dv var1, float var2) {
      if(var2 < 10.0F) {
         double var3 = var1.p - this.p;
         double var5 = var1.r - this.r;
         if(this.aV == 0) {
            du var7 = new du(this.l, this);
            ++var7.q;
            double var8 = var1.q - 0.20000000298023224D - var7.q;
            float var10 = hb.a(var3 * var3 + var5 * var5) * 0.2F;
            this.l.a(this, "random.bow", 1.0F, 1.0F / (this.V.nextFloat() * 0.4F + 0.8F));
            this.l.a(var7);
            var7.a(var3, var8 + (double)var10, var5, 0.6F, 12.0F);
            this.aV = 30;
         }

         this.v = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.ai = true;
      }

   }

   public void a(t var1) {
      super.a(var1);
   }

   public void b(t var1) {
      super.b(var1);
   }

   protected int g() {
      return fq.j.aW;
   }

}
