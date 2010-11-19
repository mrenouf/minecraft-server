// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class gg extends fz {

   public gg(em var1) {
      super(var1);
   }

   public void D() {
      if(this.l.b()) {
         float var1 = this.b(1.0F);
         if(var1 > 0.5F && this.l.g(hd.b(this.p), hd.b(this.q), hd.b(this.r)) && this.V.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.Y = 300;
         }
      }

      super.D();
   }

   protected String d() {
      return "mob.zombie";
   }

   protected String e() {
      return "mob.zombiehurt";
   }

   protected String f() {
      return "mob.zombiedeath";
   }

   protected int g() {
      return fs.J.aW;
   }
}
