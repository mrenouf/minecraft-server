// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class bs extends fs {

   private int a;


   public bs(int var1) {
      super(var1);
      this.a = var1 + 256;
      this.a(fy.m[var1 + 256].a(2));
   }

   public boolean a(hj var1, fv var2, em var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == fy.aS.bh) {
         var7 = 0;
      } else {
         if(var7 == 0) {
            --var5;
         }

         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }
      }

      if(var1.a == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false)) {
            fy var8 = fy.m[this.a];
            if(var3.d(var4, var5, var6, this.a)) {
               fy.m[this.a].c(var3, var4, var5, var6, var7);
               fy.m[this.a].a(var3, var4, var5, var6, var2);
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var8.bq.c(), (var8.bq.a() + 1.0F) / 2.0F, var8.bq.b() * 0.8F);
               --var1.a;
            }
         }

         return true;
      }
   }
}
