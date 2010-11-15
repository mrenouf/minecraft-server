// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:38
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class aq extends fw {

   protected aq(int var1, int var2) {
      super(var1, var2, jr.u);
      this.a(true);
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 + 1, var4) == 0) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bi; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.b(var2, var3, var4);
            if(var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.bi);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public ds d(el var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return ds.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public int a(int var1) {
      return var1 == 1?this.bh - 1:(var1 == 0?this.bh + 1:this.bh);
   }

   public boolean a() {
      return false;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      return !super.a(var1, var2, var3, var4)?false:this.f(var1, var2, var3, var4);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      if(!this.f(var1, var2, var3, var4)) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean f(el var1, int var2, int var3, int var4) {
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
         return var5 == fw.aW.bi || var5 == fw.F.bi;
      }
   }

   public void a(el var1, int var2, int var3, int var4, dv var5) {
      var5.a((dv)null, 1);
   }
}
