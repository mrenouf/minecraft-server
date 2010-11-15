// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ci implements Comparable {

   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g;


   public ci(int var1, int var2, int var3, int var4) {
      this.g = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ci)) {
         return false;
      } else {
         ci var2 = (ci)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
   }

   public ci a(long var1) {
      this.e = var1;
      return this;
   }

   public int a(ci var1) {
      return this.e < var1.e?-1:(this.e > var1.e?1:(this.g < var1.g?-1:(this.g > var1.g?1:0)));
   }

}
