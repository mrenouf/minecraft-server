// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class cc extends q {

   private int b;
   private int c = 0;


   protected cc(int var1, int var2) {
      super(var1, var2, jr.h, false);
      this.b = var2;
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      this.c = 0;
      this.g(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public void g(el var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public int a(int var1, Random var2) {
      return fw.z.bi;
   }

   public boolean a() {
      return !this.a;
   }

   public void b(el var1, int var2, int var3, int var4, dv var5) {
      super.b(var1, var2, var3, var4, var5);
   }
}
