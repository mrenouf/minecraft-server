// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:11
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.List;

public class dt {

   private static List g = new ArrayList();
   private static int h = 0;
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;


   public static dt a(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new dt(var0, var2, var4, var6, var8, var10);
   }

   public static void a() {
      h = 0;
   }

   public static dt b(double var0, double var2, double var4, double var6, double var8, double var10) {
      if(h >= g.size()) {
         g.add(a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
      }

      return ((dt)g.get(h++)).c(var0, var2, var4, var6, var8, var10);
   }

   private dt(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
   }

   public dt c(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
      return this;
   }

   public dt a(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if(var1 < 0.0D) {
         var7 += var1;
      }

      if(var1 > 0.0D) {
         var13 += var1;
      }

      if(var3 < 0.0D) {
         var9 += var3;
      }

      if(var3 > 0.0D) {
         var15 += var3;
      }

      if(var5 < 0.0D) {
         var11 += var5;
      }

      if(var5 > 0.0D) {
         var17 += var5;
      }

      return b(var7, var9, var11, var13, var15, var17);
   }

   public dt b(double var1, double var3, double var5) {
      double var7 = this.a - var1;
      double var9 = this.b - var3;
      double var11 = this.c - var5;
      double var13 = this.d + var1;
      double var15 = this.e + var3;
      double var17 = this.f + var5;
      return b(var7, var9, var11, var13, var15, var17);
   }

   public dt c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5, this.d + var1, this.e + var3, this.f + var5);
   }

   public double a(dt var1, double var2) {
      if(var1.e > this.b && var1.b < this.e) {
         if(var1.f > this.c && var1.c < this.f) {
            double var4;
            if(var2 > 0.0D && var1.d <= this.a) {
               var4 = this.a - var1.d;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.a >= this.d) {
               var4 = this.d - var1.a;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double b(dt var1, double var2) {
      if(var1.d > this.a && var1.a < this.d) {
         if(var1.f > this.c && var1.c < this.f) {
            double var4;
            if(var2 > 0.0D && var1.e <= this.b) {
               var4 = this.b - var1.e;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.b >= this.e) {
               var4 = this.e - var1.b;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double c(dt var1, double var2) {
      if(var1.d > this.a && var1.a < this.d) {
         if(var1.e > this.b && var1.b < this.e) {
            double var4;
            if(var2 > 0.0D && var1.f <= this.c) {
               var4 = this.c - var1.f;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.c >= this.f) {
               var4 = this.f - var1.c;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean a(dt var1) {
      return var1.d > this.a && var1.a < this.d?(var1.e > this.b && var1.b < this.e?var1.f > this.c && var1.c < this.f:false):false;
   }

   public dt d(double var1, double var3, double var5) {
      this.a += var1;
      this.b += var3;
      this.c += var5;
      this.d += var1;
      this.e += var3;
      this.f += var5;
      return this;
   }

   public dt e(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if(var1 < 0.0D) {
         var7 -= var1;
      }

      if(var1 > 0.0D) {
         var13 -= var1;
      }

      if(var3 < 0.0D) {
         var9 -= var3;
      }

      if(var3 > 0.0D) {
         var15 -= var3;
      }

      if(var5 < 0.0D) {
         var11 -= var5;
      }

      if(var5 > 0.0D) {
         var17 -= var5;
      }

      return b(var7, var9, var11, var13, var15, var17);
   }

   public dt b() {
      return b(this.a, this.b, this.c, this.d, this.e, this.f);
   }

   public gm a(bc var1, bc var2) {
      bc var3 = var1.a(var2, this.a);
      bc var4 = var1.a(var2, this.d);
      bc var5 = var1.b(var2, this.b);
      bc var6 = var1.b(var2, this.e);
      bc var7 = var1.c(var2, this.c);
      bc var8 = var1.c(var2, this.f);
      if(!this.a(var3)) {
         var3 = null;
      }

      if(!this.a(var4)) {
         var4 = null;
      }

      if(!this.b(var5)) {
         var5 = null;
      }

      if(!this.b(var6)) {
         var6 = null;
      }

      if(!this.c(var7)) {
         var7 = null;
      }

      if(!this.c(var8)) {
         var8 = null;
      }

      bc var9 = null;
      if(var3 != null && (var9 == null || var1.b(var3) < var1.b(var9))) {
         var9 = var3;
      }

      if(var4 != null && (var9 == null || var1.b(var4) < var1.b(var9))) {
         var9 = var4;
      }

      if(var5 != null && (var9 == null || var1.b(var5) < var1.b(var9))) {
         var9 = var5;
      }

      if(var6 != null && (var9 == null || var1.b(var6) < var1.b(var9))) {
         var9 = var6;
      }

      if(var7 != null && (var9 == null || var1.b(var7) < var1.b(var9))) {
         var9 = var7;
      }

      if(var8 != null && (var9 == null || var1.b(var8) < var1.b(var9))) {
         var9 = var8;
      }

      if(var9 == null) {
         return null;
      } else {
         byte var10 = -1;
         if(var9 == var3) {
            var10 = 4;
         }

         if(var9 == var4) {
            var10 = 5;
         }

         if(var9 == var5) {
            var10 = 0;
         }

         if(var9 == var6) {
            var10 = 1;
         }

         if(var9 == var7) {
            var10 = 2;
         }

         if(var9 == var8) {
            var10 = 3;
         }

         return new gm(0, 0, 0, var10, var9);
      }
   }

   private boolean a(bc var1) {
      return var1 == null?false:var1.b >= this.b && var1.b <= this.e && var1.c >= this.c && var1.c <= this.f;
   }

   private boolean b(bc var1) {
      return var1 == null?false:var1.a >= this.a && var1.a <= this.d && var1.c >= this.c && var1.c <= this.f;
   }

   private boolean c(bc var1) {
      return var1 == null?false:var1.a >= this.a && var1.a <= this.d && var1.b >= this.b && var1.b <= this.e;
   }

   public void b(dt var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
   }

}
