// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class cs extends aw {

   public boolean a = false;


   public cs(el var1) {
      super(var1);
      this.a(0.9F, 1.3F);
   }

   public boolean a(dv var1, int var2) {
      if(!this.a && var1 instanceof jt) {
         this.a = true;
         int var3 = 1 + this.V.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            gf var5 = this.a(fw.ac.bi, 1, 1.0F);
            var5.t += (double)(this.V.nextFloat() * 0.05F);
            var5.s += (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.1F);
            var5.u += (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.1F);
         }
      }

      return super.a(var1, var2);
   }

   public void a(t var1) {
      super.a(var1);
      var1.a("Sheared", this.a);
   }

   public void b(t var1) {
      super.b(var1);
      this.a = var1.l("Sheared");
   }

   protected String d() {
      return "mob.sheep";
   }

   protected String e() {
      return "mob.sheep";
   }

   protected String f() {
      return "mob.sheep";
   }
}
