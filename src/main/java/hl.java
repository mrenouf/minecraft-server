// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hl {

   public final int a;
   public final int b;
   public final int c;


   public hl(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof hl)) {
         return false;
      } else {
         hl var2 = (hl)var1;
         return var2.a == this.a && var2.b == this.b && var2.c == this.c;
      }
   }

   public int hashCode() {
      return this.a * 8976890 + this.b * 981131 + this.c;
   }
}
