// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class b {

   public final int a;
   public final int b;
   public final int c;
   public final int d;
   int e = -1;
   float f;
   float g;
   float h;
   b i;
   public boolean j = false;


   public b(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var1 | var2 << 10 | var3 << 20;
   }

   public float a(b var1) {
      float var2 = (float)(var1.a - this.a);
      float var3 = (float)(var1.b - this.b);
      float var4 = (float)(var1.c - this.c);
      return hd.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public boolean equals(Object var1) {
      return ((b)var1).d == this.d;
   }

   public int hashCode() {
      return this.d;
   }

   public boolean a() {
      return this.e >= 0;
   }

   public String toString() {
      return this.a + ", " + this.b + ", " + this.c;
   }
}
