// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ak implements jx {

   private String a;
   private jx b;
   private jx c;


   public ak(String var1, jx var2, jx var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int a() {
      return this.b.a() + this.c.a();
   }

   public hh a(int var1) {
      return var1 >= this.b.a()?this.c.a(var1 - this.b.a()):this.b.a(var1);
   }
}
