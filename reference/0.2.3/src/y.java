// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class y extends cx {

   protected y(int var1, jr var2) {
      super(var1, var2);
      this.a(false);
      if(var2 == jr.g) {
         this.a(true);
      }

   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);
      if(var1.a(var2, var3, var4) == this.bi) {
         this.i(var1, var2, var3, var4);
      }

   }

   private void i(el var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      var1.i = true;
      var1.a(var2, var3, var4, this.bi - 1, var5);
      var1.b(var2, var3, var4, var2, var3, var4);
      var1.h(var2, var3, var4, this.bi - 1);
      var1.i = false;
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      if(this.bt == jr.g) {
         int var6 = var5.nextInt(3);

         for(int var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.a(var2, var3, var4);
            if(var8 == 0) {
               if(this.j(var1, var2 - 1, var3, var4) || this.j(var1, var2 + 1, var3, var4) || this.j(var1, var2, var3, var4 - 1) || this.j(var1, var2, var3, var4 + 1) || this.j(var1, var2, var3 - 1, var4) || this.j(var1, var2, var3 + 1, var4)) {
                  var1.d(var2, var3, var4, fw.as.bi);
                  return;
               }
            } else if(fw.n[var8].bt.c()) {
               return;
            }
         }
      }

   }

   private boolean j(el var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4).e();
   }
}
