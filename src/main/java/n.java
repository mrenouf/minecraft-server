// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:06
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class n extends hr {

   public n(int var1, int var2) {
      super(var1, var2, jr.r, false);
      this.a(true);
   }

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      return super.a(var1, var2, var3, var4, 1 - var5);
   }

   public void b(el var1, int var2, int var3, int var4) {
      jr var5 = var1.c(var2, var3 - 1, var4);
      if(var5.c() || var5.d()) {
         var1.d(var2, var3, var4, fw.B.bi);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(dj.b, var2, var3, var4) > 11 - fw.r[this.bi]) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, fw.C.bi);
      }

   }
}
