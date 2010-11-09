// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class z extends fw {

   public z(int var1, int var2) {
      super(var1, var2, jr.p);
   }

   public int a(int var1) {
      return var1 == 0?this.bh + 2:(var1 == 1?this.bh + 1:this.bh);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && fw.n[var5].c() && var1.n(var2, var3, var4)) {
         this.a(var1, var2, var3, var4, 0);
         var1.d(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void c(el var1, int var2, int var3, int var4) {
      ch var5 = new ch(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var5.a = var1.l.nextInt(var5.a / 4) + var5.a / 8;
      var1.a(var5);
   }

   public void a(el var1, int var2, int var3, int var4, int var5) {
      ch var6 = new ch(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var1.a(var6);
      var1.a(var6, "random.fuse", 1.0F, 1.0F);
   }
}
