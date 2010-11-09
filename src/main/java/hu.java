// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class hu extends fw {

   protected hu(int var1, int var2) {
      super(var1, var2, jr.s);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && fw.n[var5].a()?var1.c(var2, var3 - 1, var4).c():false;
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      this.g(var1, var2, var3, var4);
   }

   private boolean g(el var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public int a(int var1, Random var2) {
      return fq.aB.aW;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(dj.b, var2, var3, var4) > 11) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      jr var6 = var1.c(var2, var3, var4);
      return var5 == 1?true:(var6 == this.bt?false:super.a(var1, var2, var3, var4, var5));
   }
}
