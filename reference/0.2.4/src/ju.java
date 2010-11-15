// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:22
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


final class ju {

   public final int a;
   public final int b;


   public ju(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ju)) {
         return false;
      } else {
         ju var2 = (ju)var1;
         return this.a == var2.a && this.b == var2.b;
      }
   }

   public int hashCode() {
      return this.a << 16 ^ this.b;
   }
}
