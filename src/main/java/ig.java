// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:11
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ig extends fw {

   protected ig(int var1) {
      super(var1, jr.j);
   }

   public void e(el var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               if(var1.c(var6, var7, var8) == jr.f) {
                  ;
               }
            }
         }
      }

   }

   public void b(el var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               var1.g(var6, var7, var8, var1.a(var6, var7, var8));
            }
         }
      }

   }
}
