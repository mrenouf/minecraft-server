// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:37
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fe {

   private iq a;
   private jh b = new jh();
   private ib c = new ib();
   private b[] d = new b[32];


   public fe(iq var1) {
      this.a = var1;
   }

   public cp a(dw var1, dw var2, float var3) {
      return this.a(var1, var2.p, var2.z.b, var2.r, var3);
   }

   public cp a(dw var1, int var2, int var3, int var4, float var5) {
      return this.a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private cp a(dw var1, double var2, double var4, double var6, float var8) {
      this.b.a();
      this.c.a();
      b var9 = this.a(hd.b(var1.z.a), hd.b(var1.z.b), hd.b(var1.z.c));
      b var10 = this.a(hd.b(var2 - (double)(var1.H / 2.0F)), hd.b(var4), hd.b(var6 - (double)(var1.H / 2.0F)));
      b var11 = new b(hd.d(var1.H + 1.0F), hd.d(var1.I + 1.0F), hd.d(var1.H + 1.0F));
      cp var12 = this.a(var1, var9, var10, var11, var8);
      return var12;
   }

   private cp a(dw var1, b var2, b var3, b var4, float var5) {
      var2.f = 0.0F;
      var2.g = var2.a(var3);
      var2.h = var2.g;
      this.b.a();
      this.b.a(var2);
      b var6 = var2;

      while(!this.b.c()) {
         b var7 = this.b.b();
         if(var7.d == var3.d) {
            return this.a(var2, var3);
         }

         if(var7.a(var3) < var6.a(var3)) {
            var6 = var7;
         }

         var7.j = true;
         int var8 = this.b(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            b var10 = this.d[var9];
            float var11 = var7.f + var7.a(var10);
            if(!var10.a() || var11 < var10.f) {
               var10.i = var7;
               var10.f = var11;
               var10.g = var10.a(var3);
               if(var10.a()) {
                  this.b.a(var10, var10.f + var10.g);
               } else {
                  var10.h = var10.f + var10.g;
                  this.b.a(var10);
               }
            }
         }
      }

      if(var6 == var2) {
         return null;
      } else {
         return this.a(var2, var6);
      }
   }

   private int b(dw var1, b var2, b var3, b var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if(this.a(var1, var2.a, var2.b + 1, var2.c, var3) > 0) {
         var7 = 1;
      }

      b var8 = this.a(var1, var2.a, var2.b, var2.c + 1, var3, var7);
      b var9 = this.a(var1, var2.a - 1, var2.b, var2.c, var3, var7);
      b var10 = this.a(var1, var2.a + 1, var2.b, var2.c, var3, var7);
      b var11 = this.a(var1, var2.a, var2.b, var2.c - 1, var3, var7);
      if(var8 != null && !var8.j && var8.a(var4) < var5) {
         this.d[var6++] = var8;
      }

      if(var9 != null && !var9.j && var9.a(var4) < var5) {
         this.d[var6++] = var9;
      }

      if(var10 != null && !var10.j && var10.a(var4) < var5) {
         this.d[var6++] = var10;
      }

      if(var11 != null && !var11.j && var11.a(var4) < var5) {
         this.d[var6++] = var11;
      }

      return var6;
   }

   private b a(dw var1, int var2, int var3, int var4, b var5, int var6) {
      b var7 = null;
      if(this.a(var1, var2, var3, var4, var5) > 0) {
         var7 = this.a(var2, var3, var4);
      }

      if(var7 == null && this.a(var1, var2, var3 + var6, var4, var5) > 0) {
         var7 = this.a(var2, var3 + var6, var4);
         var3 += var6;
      }

      if(var7 != null) {
         int var8 = 0;

         int var10;
         for(boolean var9 = false; var3 > 0 && (var10 = this.a(var1, var2, var3 - 1, var4, var5)) > 0; --var3) {
            if(var10 < 0) {
               return null;
            }

            ++var8;
            if(var8 >= 4) {
               return null;
            }
         }

         if(var3 > 0) {
            var7 = this.a(var2, var3, var4);
         }
      }

      return var7;
   }

   private final b a(int var1, int var2, int var3) {
      int var4 = var1 | var2 << 10 | var3 << 20;
      b var5 = (b)this.c.a(var4);
      if(var5 == null) {
         var5 = new b(var1, var2, var3);
         this.c.a(var4, var5);
      }

      return var5;
   }

   private int a(dw var1, int var2, int var3, int var4, b var5) {
      for(int var6 = var2; var6 < var2 + var5.a; ++var6) {
         for(int var7 = var3; var7 < var3 + var5.b; ++var7) {
            for(int var8 = var4; var8 < var4 + var5.c; ++var8) {
               jt var9 = this.a.c(var2, var3, var4);
               if(var9.c()) {
                  return 0;
               }

               if(var9 == jt.f || var9 == jt.g) {
                  return -1;
               }
            }
         }
      }

      return 1;
   }

   private cp a(b var1, b var2) {
      int var3 = 1;

      b var4;
      for(var4 = var2; var4.i != null; var4 = var4.i) {
         ++var3;
      }

      b[] var5 = new b[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.i != null; var5[var3] = var4) {
         var4 = var4.i;
         --var3;
      }

      return new cp(var5);
   }
}
