// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class hw extends fy {

   protected hw(int var1, int var2) {
      super(var1, var2, jt.s);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && fy.m[var5].a()?var1.c(var2, var3 - 1, var4).c():false;
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      this.g(var1, var2, var3, var4);
   }

   private boolean g(em var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public int a(int var1, Random var2) {
      return fs.aB.aW;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(dk.b, var2, var3, var4) > 11) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      jt var6 = var1.c(var2, var3, var4);
      return var5 == 1?true:(var6 == this.bs?false:super.a(var1, var2, var3, var4, var5));
   }
}
