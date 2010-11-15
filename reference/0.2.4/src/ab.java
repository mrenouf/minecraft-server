// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class ab extends fy {

   public ab(int var1, int var2) {
      super(var1, var2, jt.p);
   }

   public int a(int var1) {
      return var1 == 0?this.bg + 2:(var1 == 1?this.bg + 1:this.bg);
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && fy.m[var5].c() && var1.n(var2, var3, var4)) {
         this.a(var1, var2, var3, var4, 0);
         var1.d(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void c(em var1, int var2, int var3, int var4) {
      ci var5 = new ci(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var5.a = var1.l.nextInt(var5.a / 4) + var5.a / 8;
      var1.a(var5);
   }

   public void a(em var1, int var2, int var3, int var4, int var5) {
      ci var6 = new ci(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var1.a(var6);
      var1.a(var6, "random.fuse", 1.0F, 1.0F);
   }
}
