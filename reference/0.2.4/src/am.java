// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class am implements jz {

   private String a;
   private jz b;
   private jz c;


   public am(String var1, jz var2, jz var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int a() {
      return this.b.a() + this.c.a();
   }

   public hj a(int var1) {
      return var1 >= this.b.a()?this.c.a(var1 - this.b.a()):this.b.a(var1);
   }
}
