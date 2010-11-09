// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:25
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class a {

   public final int a;
   public final int b;
   public final int c;
   public final int d;
   int e = -1;
   float f;
   float g;
   float h;
   a i;
   public boolean j = false;


   public a(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var1 | var2 << 10 | var3 << 20;
   }

   public float a(a var1) {
      float var2 = (float)(var1.a - this.a);
      float var3 = (float)(var1.b - this.b);
      float var4 = (float)(var1.c - this.c);
      return hb.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public boolean equals(Object var1) {
      return ((a)var1).d == this.d;
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
