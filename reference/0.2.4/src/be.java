// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:42
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class be extends ax {

   public boolean a = false;


   public be(em var1) {
      super(var1);
      this.a(0.9F, 1.3F);
   }

   public void a(v var1) {
      super.a(var1);
   }

   public void b(v var1) {
      super.b(var1);
   }

   protected String d() {
      return "mob.cow";
   }

   protected String e() {
      return "mob.cowhurt";
   }

   protected String f() {
      return "mob.cowhurt";
   }

   protected float h() {
      return 0.4F;
   }

   protected int g() {
      return fs.aD.aW;
   }

   public boolean a(fv var1) {
      hj var2 = var1.ak.b();
      if(var2 != null && var2.c == fs.au.aW) {
         var1.ak.a(var1.ak.d, new hj(fs.aE));
         return true;
      } else {
         return false;
      }
   }
}
