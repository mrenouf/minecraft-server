// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hn extends aw {

   public boolean a = false;


   public hn(el var1) {
      super(var1);
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   public void a(t var1) {
      super.a(var1);
      var1.a("Saddle", this.a);
   }

   public void b(t var1) {
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

   protected int g() {
      return fq.ao.aW;
   }
}
