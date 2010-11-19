// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hp extends ax {

   public boolean a = false;


   public hp(em var1) {
      super(var1);
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   public void a(v var1) {
      super.a(var1);
      var1.a("Saddle", this.a);
   }

   public void b(v var1) {
      super.b(var1);
      this.a = var1.l("Saddle");
   }

   protected String d() {
      return "mob.pig";
   }

   protected String e() {
      return "mob.pig";
   }

   protected String f() {
      return "mob.pigdeath";
   }

   public boolean a(fv var1) {
      if(this.a) {
         var1.e(this);
         return true;
      } else {
         return false;
      }
   }

   protected int g() {
      return fs.ao.aW;
   }
}
