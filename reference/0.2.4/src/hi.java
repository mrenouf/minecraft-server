// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class hi extends fy {

   protected hi(int var1, int var2) {
      super(var1, jt.i);
      this.bg = var2;
      this.a(true);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return this.b(var1.a(var2, var3 - 1, var4));
   }

   protected boolean b(int var1) {
      return var1 == fy.u.bh || var1 == fy.v.bh || var1 == fy.aA.bh;
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);
      this.g(var1, var2, var3, var4);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      this.g(var1, var2, var3, var4);
   }

   protected final void g(em var1, int var2, int var3, int var4) {
      if(!this.f(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean f(em var1, int var2, int var3, int var4) {
      return (var1.h(var2, var3, var4) >= 8 || var1.g(var2, var3, var4)) && this.b(var1.a(var2, var3 - 1, var4));
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }
}
