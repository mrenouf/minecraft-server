// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class fr extends dd {

   private Class a;
   private boolean b;


   protected fr(int var1, Class var2, boolean var3) {
      super(var1, jr.c);
      this.b = var3;
      this.bh = 4;
      this.a = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(io var1, int var2, int var3, int var4) {
      if(!this.b) {
         int var5 = var1.b(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if(var5 == 2) {
            this.a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if(var5 == 3) {
            this.a(var8, var6, 0.0F, var9, var7, var10);
         }

         if(var5 == 4) {
            this.a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if(var5 == 5) {
            this.a(0.0F, var6, var8, var10, var7, var9);
         }

      }
   }

   public boolean a() {
      return false;
   }

   protected av a_() {
      try {
         return (av)this.a.newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public int a(int var1, Random var2) {
      return fq.as.aW;
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if(this.b) {
         if(!var1.c(var2, var3 - 1, var4).a()) {
            var6 = true;
         }
      } else {
         int var7 = var1.b(var2, var3, var4);
         var6 = true;
         if(var7 == 2 && var1.c(var2, var3, var4 + 1).a()) {
            var6 = false;
         }

         if(var7 == 3 && var1.c(var2, var3, var4 - 1).a()) {
            var6 = false;
         }

         if(var7 == 4 && var1.c(var2 + 1, var3, var4).a()) {
            var6 = false;
         }

         if(var7 == 5 && var1.c(var2 - 1, var3, var4).a()) {
            var6 = false;
         }
      }

      if(var6) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

      super.b(var1, var2, var3, var4, var5);
   }
}
