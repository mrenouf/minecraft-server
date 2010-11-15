// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:42
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;
import java.util.Random;

public class bd extends fy {

   private dc a;


   protected bd(int var1, int var2, dc var3) {
      super(var1, var2, jt.d);
      this.a = var3;
      this.a(true);
      float var4 = 0.0625F;
      this.a(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
   }

   public int b() {
      return 20;
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return var1.d(var2, var3 - 1, var4);
   }

   public void e(em var1, int var2, int var3, int var4) {
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if(!var1.d(var2, var3 - 1, var4)) {
         var6 = true;
      }

      if(var6) {
         this.a_(var1, var2, var3, var4, var1.b(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      if(var1.b(var2, var3, var4) != 0) {
         this.g(var1, var2, var3, var4);
      }
   }

   public void a(em var1, int var2, int var3, int var4, dw var5) {
      if(var1.b(var2, var3, var4) != 1) {
         this.g(var1, var2, var3, var4);
      }
   }

   private void g(em var1, int var2, int var3, int var4) {
      boolean var5 = var1.b(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if(this.a == dc.a) {
         var8 = var1.b((dw)null, dt.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.a == dc.b) {
         var8 = var1.a(jv.class, dt.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.a == dc.c) {
         var8 = var1.a(fv.class, dt.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(var8.size() > 0) {
         var6 = true;
      }

      if(var6 && !var5) {
         var1.b(var2, var3, var4, 1);
         var1.g(var2, var3, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         var1.b(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(!var6 && var5) {
         var1.b(var2, var3, var4, 0);
         var1.g(var2, var3, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         var1.b(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if(var6) {
         var1.h(var2, var3, var4, this.bh);
      }

   }

   public void b(em var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      if(var5 > 0) {
         var1.g(var2, var3, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
      }

      super.b(var1, var2, var3, var4);
   }

   public void a(iq var1, int var2, int var3, int var4) {
      boolean var5 = var1.b(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if(var5) {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }

   }

   public boolean b(iq var1, int var2, int var3, int var4, int var5) {
      return var1.b(var2, var3, var4) > 0;
   }

   public boolean d(em var1, int var2, int var3, int var4, int var5) {
      return var1.b(var2, var3, var4) == 0?false:var5 == 1;
   }

   public boolean c() {
      return true;
   }
}
