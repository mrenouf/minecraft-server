// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class hp {

   final int a;
   Object b;
   hp c;
   final int d;


   hp(int var1, int var2, Object var3, hp var4) {
      this.b = var3;
      this.c = var4;
      this.a = var2;
      this.d = var1;
   }

   public final int a() {
      return this.a;
   }

   public final Object b() {
      return this.b;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof hp)) {
         return false;
      } else {
         hp var2 = (hp)var1;
         Integer var3 = Integer.valueOf(this.a());
         Integer var4 = Integer.valueOf(var2.a());
         if(var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.b();
            Object var6 = var2.b();
            if(var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return hz.f(this.a);
   }

   public final String toString() {
      return this.a() + "=" + this.b();
   }
}
