// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class gb extends hg {

   protected gb(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.h(var2, var3 + 1, var4) >= 9 && var5.nextInt(5) == 0) {
         int var6 = var1.b(var2, var3, var4);
         if(var6 < 15) {
            var1.b(var2, var3, var4, var6 + 1);
         } else {
            var1.a(var2, var3, var4, 0);
            Object var7 = new jb();
            if(var5.nextInt(10) == 0) {
               var7 = new gy();
            }

            if(!((bg)var7).a(var1, var5, var2, var3, var4)) {
               var1.a(var2, var3, var4, this.bi);
            }
         }
      }

   }
}
