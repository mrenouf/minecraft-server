// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ge extends fx {

   public ge(el var1) {
      super(var1);
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
      return fq.J.aW;
   }
}
