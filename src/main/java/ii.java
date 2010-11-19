// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ii extends fy {

   protected ii(int var1) {
      super(var1, jt.j);
   }

   public void e(em var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               if(var1.c(var6, var7, var8) == jt.f) {
                  ;
               }
            }
         }
      }

   }

   public void b(em var1, int var2, int var3, int var4) {
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
