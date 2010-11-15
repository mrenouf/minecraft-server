// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class o extends ht {

   public o(int var1, int var2) {
      super(var1, var2, jt.r, false);
      this.a(true);
   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      return super.a(var1, var2, var3, var4, 1 - var5);
   }

   public void b(em var1, int var2, int var3, int var4) {
      jt var5 = var1.c(var2, var3 - 1, var4);
      if(var5.c() || var5.d()) {
         var1.d(var2, var3, var4, fy.A.bh);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(dk.b, var2, var3, var4) > 11 - fy.q[this.bh]) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, fy.B.bh);
      }

   }
}
