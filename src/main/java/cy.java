// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class cy extends fw {

   protected cy(int var1, int var2) {
      super(var1, var2, jr.n);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      float var6 = 0.125F;
      if(var5 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 4) {
         this.a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.d(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      return var1.d(var2 - 1, var3, var4)?true:(var1.d(var2 + 1, var3, var4)?true:(var1.d(var2, var3, var4 - 1)?true:var1.d(var2, var3, var4 + 1)));
   }

   public void c(el var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      if((var6 == 0 || var5 == 2) && var1.d(var2, var3, var4 + 1)) {
         var6 = 2;
      }

      if((var6 == 0 || var5 == 3) && var1.d(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if((var6 == 0 || var5 == 4) && var1.d(var2 + 1, var3, var4)) {
         var6 = 4;
      }

      if((var6 == 0 || var5 == 5) && var1.d(var2 - 1, var3, var4)) {
         var6 = 5;
      }

      var1.b(var2, var3, var4, var6);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      boolean var7 = false;
      if(var6 == 2 && var1.d(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if(var6 == 3 && var1.d(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if(var6 == 4 && var1.d(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if(var6 == 5 && var1.d(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if(!var7) {
         this.a_(var1, var2, var3, var4, var6);
         var1.d(var2, var3, var4, 0);
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 1;
   }
}
