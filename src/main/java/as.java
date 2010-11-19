// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class as extends fy {

   protected as(int var1, int var2) {
      super(var1, var2, jt.u);
      this.a(true);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 + 1, var4) == 0) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bh; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.b(var2, var3, var4);
            if(var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.bh);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public dt d(em var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return dt.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public int a(int var1) {
      return var1 == 1?this.bg - 1:(var1 == 0?this.bg + 1:this.bg);
   }

   public boolean a() {
      return false;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return !super.a(var1, var2, var3, var4)?false:this.f(var1, var2, var3, var4);
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      if(!this.f(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean f(em var1, int var2, int var3, int var4) {
      if(var1.c(var2 - 1, var3, var4).a()) {
         return false;
      } else if(var1.c(var2 + 1, var3, var4).a()) {
         return false;
      } else if(var1.c(var2, var3, var4 - 1).a()) {
         return false;
      } else if(var1.c(var2, var3, var4 + 1).a()) {
         return false;
      } else {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == fy.aV.bh || var5 == fy.E.bh;
      }
   }

   public void a(em var1, int var2, int var3, int var4, dw var5) {
      var5.a((dw)null, 1);
   }
}
