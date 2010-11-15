// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:27
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class kc {

   public int a;
   public int b;


   public kc(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public int hashCode() {
      return this.a << 8 | this.b;
   }

   public boolean equals(Object var1) {
      kc var2 = (kc)var1;
      return var2.a == this.a && var2.b == this.b;
   }

   public double a(dw var1) {
      double var2 = (double)(this.a * 16 + 8);
      double var4 = (double)(this.b * 16 + 8);
      double var6 = var2 - var1.p;
      double var8 = var4 - var1.r;
      return var6 * var6 + var8 * var8;
   }
}
