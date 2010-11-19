// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ec {

   public final dk a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;


   public ec(dk var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   public void a(em var1) {
      int var2 = this.e - this.b + 1;
      int var3 = this.f - this.c + 1;
      int var4 = this.g - this.d + 1;
      int var5 = var2 * var3 * var4;
      if(var5 <= '\u8000') {
         for(int var6 = this.b; var6 <= this.e; ++var6) {
            for(int var7 = this.d; var7 <= this.g; ++var7) {
               if(var1.e(var6, 0, var7)) {
                  for(int var8 = this.c; var8 <= this.f; ++var8) {
                     if(var8 >= 0 && var8 < 128) {
                        int var9 = var1.a(this.a, var6, var8, var7);
                        boolean var10 = false;
                        int var11 = var1.a(var6, var8, var7);
                        int var12 = fy.q[var11];
                        if(var12 == 0) {
                           var12 = 1;
                        }

                        int var13 = 0;
                        if(this.a == dk.a) {
                           if(var1.i(var6, var8, var7)) {
                              var13 = 15;
                           }
                        } else if(this.a == dk.b) {
                           var13 = fy.s[var11];
                        }

                        int var14;
                        int var20;
                        if(var12 >= 15 && var13 == 0) {
                           var20 = 0;
                        } else {
                           var14 = var1.a(this.a, var6 - 1, var8, var7);
                           int var15 = var1.a(this.a, var6 + 1, var8, var7);
                           int var16 = var1.a(this.a, var6, var8 - 1, var7);
                           int var17 = var1.a(this.a, var6, var8 + 1, var7);
                           int var18 = var1.a(this.a, var6, var8, var7 - 1);
                           int var19 = var1.a(this.a, var6, var8, var7 + 1);
                           var20 = var14;
                           if(var15 > var14) {
                              var20 = var15;
                           }

                           if(var16 > var20) {
                              var20 = var16;
                           }

                           if(var17 > var20) {
                              var20 = var17;
                           }

                           if(var18 > var20) {
                              var20 = var18;
                           }

                           if(var19 > var20) {
                              var20 = var19;
                           }

                           var20 -= var12;
                           if(var20 < 0) {
                              var20 = 0;
                           }

                           if(var13 > var20) {
                              var20 = var13;
                           }
                        }

                        if(var9 != var20) {
                           var1.b(this.a, var6, var8, var7, var20);
                           var14 = var20 - 1;
                           if(var14 < 0) {
                              var14 = 0;
                           }

                           var1.a(this.a, var6 - 1, var8, var7, var14);
                           var1.a(this.a, var6, var8 - 1, var7, var14);
                           var1.a(this.a, var6, var8, var7 - 1, var14);
                           if(var6 + 1 >= this.e) {
                              var1.a(this.a, var6 + 1, var8, var7, var14);
                           }

                           if(var8 + 1 >= this.f) {
                              var1.a(this.a, var6, var8 + 1, var7, var14);
                           }

                           if(var7 + 1 >= this.g) {
                              var1.a(this.a, var6, var8, var7 + 1, var14);
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 >= this.b && var2 >= this.c && var3 >= this.d && var4 <= this.e && var5 <= this.f && var6 <= this.g) {
         return true;
      } else {
         byte var7 = 1;
         if(var1 >= this.b - var7 && var2 >= this.c - var7 && var3 >= this.d - var7 && var4 <= this.e + var7 && var5 <= this.f + var7 && var6 <= this.g + var7) {
            int var8 = this.e - this.b;
            int var9 = this.f - this.c;
            int var10 = this.g - this.d;
            if(var1 > this.b) {
               var1 = this.b;
            }

            if(var2 > this.c) {
               var2 = this.c;
            }

            if(var3 > this.d) {
               var3 = this.d;
            }

            if(var4 < this.e) {
               var4 = this.e;
            }

            if(var5 < this.f) {
               var5 = this.f;
            }

            if(var6 < this.g) {
               var6 = this.g;
            }

            int var11 = var4 - var1;
            int var12 = var5 - var2;
            int var13 = var6 - var3;
            int var14 = var8 * var9 * var10;
            int var15 = var11 * var12 * var13;
            if(var15 - var14 <= 2) {
               this.b = var1;
               this.c = var2;
               this.d = var3;
               this.e = var4;
               this.f = var5;
               this.g = var6;
               return true;
            }
         }

         return false;
      }
   }
}
