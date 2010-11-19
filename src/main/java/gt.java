// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:46
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class gt extends fy {

   protected gt(int var1) {
      super(var1, jt.b);
      this.a(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.c(255);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return dt.b((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean a() {
      return false;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(5) == 0) {
         if(this.h(var1, var2, var3, var4)) {
            var1.b(var2, var3, var4, 7);
         } else {
            int var6 = var1.b(var2, var3, var4);
            if(var6 > 0) {
               var1.b(var2, var3, var4, var6 - 1);
            } else if(!this.g(var1, var2, var3, var4)) {
               var1.d(var2, var3, var4, fy.v.bh);
            }
         }
      }

   }

   public void b(em var1, int var2, int var3, int var4, dw var5) {
      if(var1.l.nextInt(4) == 0) {
         var1.d(var2, var3, var4, fy.v.bh);
      }

   }

   private boolean g(em var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            if(var1.a(var6, var3 + 1, var7) == fy.az.bh) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean h(em var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if(var1.c(var5, var6, var7) == jt.f) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);
      jt var6 = var1.c(var2, var3 + 1, var4);
      if(var6.a()) {
         var1.d(var2, var3, var4, fy.v.bh);
      }

   }

   public int a(int var1, Random var2) {
      return fy.v.a(0, var2);
   }
}
