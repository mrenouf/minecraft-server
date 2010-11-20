// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class cj implements Comparable {

   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g;


   public cj(int var1, int var2, int var3, int var4) {
      this.g = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof cj)) {
         return false;
      } else {
         cj var2 = (cj)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
   }

   public cj a(long var1) {
      this.e = var1;
      return this;
   }

   public int a(cj var1) {
      return this.e < var1.e?-1:(this.e > var1.e?1:(this.g < var1.g?-1:(this.g > var1.g?1:0)));
   }

   public int compareTo(Object o) {
      return a((cj)o);
   }
}
