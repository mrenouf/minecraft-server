// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:17
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class bu implements br {

   private Random h;
   private fm i;
   private fm j;
   private fm k;
   private fm l;
   private fm m;
   public fm a;
   public fm b;
   private el n;
   private double[] o;
   private double[] p = new double[256];
   private double[] q = new double[256];
   private double[] r = new double[256];
   private fb s = new bi();
   double[] c;
   double[] d;
   double[] e;
   double[] f;
   double[] g;


   public bu(el var1, long var2) {
      this.n = var1;
      this.h = new Random(var2);
      this.i = new fm(this.h, 16);
      this.j = new fm(this.h, 16);
      this.k = new fm(this.h, 8);
      this.l = new fm(this.h, 4);
      this.m = new fm(this.h, 4);
      this.a = new fm(this.h, 10);
      this.b = new fm(this.h, 16);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 32;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.o = this.a(this.o, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.o[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.o[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.o[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.o[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.o[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.o[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.o[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.o[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if(var11 * 8 + var30 < var5) {
                           var51 = fw.E.bi;
                        }

                        if(var46 > 0.0D) {
                           var51 = fw.bc.bi;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125D;
      this.p = this.l.a(this.p, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var5, var5, 1.0D);
      this.q = this.l.a(this.q, (double)(var2 * 16), 109.0134D, (double)(var1 * 16), 16, 1, 16, var5, 1.0D, var5);
      this.r = this.m.a(this.r, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.p[var7 + var8 * 16] + this.h.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.q[var7 + var8 * 16] + this.h.nextDouble() * 0.2D > 0.0D;
            int var11 = (int)(this.r[var7 + var8 * 16] / 3.0D + 3.0D + this.h.nextDouble() * 0.25D);
            int var12 = -1;
            byte var13 = (byte)fw.bc.bi;
            byte var14 = (byte)fw.bc.bi;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var7 * 16 + var8) * 128 + var15;
               if(var15 >= 127 - this.h.nextInt(5)) {
                  var3[var16] = (byte)fw.A.bi;
               } else if(var15 <= 0 + this.h.nextInt(5)) {
                  var3[var16] = (byte)fw.A.bi;
               } else {
                  byte var17 = var3[var16];
                  if(var17 == 0) {
                     var12 = -1;
                  } else if(var17 == fw.bc.bi) {
                     if(var12 == -1) {
                        if(var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)fw.bc.bi;
                        } else if(var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)fw.bc.bi;
                           var14 = (byte)fw.bc.bi;
                           if(var10) {
                              var13 = (byte)fw.G.bi;
                           }

                           if(var10) {
                              var14 = (byte)fw.bc.bi;
                           }

                           if(var9) {
                              var13 = (byte)fw.bd.bi;
                           }

                           if(var9) {
                              var14 = (byte)fw.bd.bi;
                           }
                        }

                        if(var15 < var4 && var13 == 0) {
                           var13 = (byte)fw.E.bi;
                        }

                        var12 = var11;
                        if(var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if(var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               }
            }
         }
      }

   }

   public jn b(int var1, int var2) {
      this.h.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.s.a(this, this.n, var1, var2, var3);
      jn var4 = new jn(this.n, var3, var1, var2);
      var4.b();
      var4.c();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 2053.236D;
      this.f = this.a.a(this.f, (double)var2, (double)var3, (double)var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.g = this.b.a(this.g, (double)var2, (double)var3, (double)var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.c = this.k.a(this.c, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
      this.d = this.i.a(this.d, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      this.e = this.j.a(this.e, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;
      double[] var14 = new double[var6];

      int var15;
      for(var15 = 0; var15 < var6; ++var15) {
         var14[var15] = Math.cos((double)var15 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var16 = (double)var15;
         if(var15 > var6 / 2) {
            var16 = (double)(var6 - 1 - var15);
         }

         if(var16 < 4.0D) {
            var16 = 4.0D - var16;
            var14[var15] -= var16 * var16 * var16 * 10.0D;
         }
      }

      for(var15 = 0; var15 < var5; ++var15) {
         for(int var36 = 0; var36 < var7; ++var36) {
            double var17 = (this.f[var13] + 256.0D) / 512.0D;
            if(var17 > 1.0D) {
               var17 = 1.0D;
            }

            double var19 = 0.0D;
            double var21 = this.g[var13] / 8000.0D;
            if(var21 < 0.0D) {
               var21 = -var21;
            }

            var21 = var21 * 3.0D - 3.0D;
            if(var21 < 0.0D) {
               var21 /= 2.0D;
               if(var21 < -1.0D) {
                  var21 = -1.0D;
               }

               var21 /= 1.4D;
               var21 /= 2.0D;
               var17 = 0.0D;
            } else {
               if(var21 > 1.0D) {
                  var21 = 1.0D;
               }

               var21 /= 6.0D;
            }

            var17 += 0.5D;
            var21 = var21 * (double)var6 / 16.0D;
            ++var13;

            for(int var23 = 0; var23 < var6; ++var23) {
               double var24 = 0.0D;
               double var26 = var14[var23];
               double var28 = this.d[var12] / 512.0D;
               double var30 = this.e[var12] / 512.0D;
               double var32 = (this.c[var12] / 10.0D + 1.0D) / 2.0D;
               if(var32 < 0.0D) {
                  var24 = var28;
               } else if(var32 > 1.0D) {
                  var24 = var30;
               } else {
                  var24 = var28 + (var30 - var28) * var32;
               }

               var24 -= var26;
               double var34;
               if(var23 > var6 - 4) {
                  var34 = (double)((float)(var23 - (var6 - 4)) / 3.0F);
                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               if((double)var23 < var19) {
                  var34 = (var19 - (double)var23) / 4.0D;
                  if(var34 < 0.0D) {
                     var34 = 0.0D;
                  }

                  if(var34 > 1.0D) {
                     var34 = 1.0D;
                  }

                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               var1[var12] = var24;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(br var1, int var2, int var3) {
      fp.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;

      int var6;
      int var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < 8; ++var6) {
         var7 = var4 + this.h.nextInt(16) + 8;
         var8 = this.h.nextInt(120) + 4;
         var9 = var5 + this.h.nextInt(16) + 8;
         (new bo(fw.D.bi)).a(this.n, this.h, var7, var8, var9);
      }

      var6 = this.h.nextInt(this.h.nextInt(10) + 1) + 1;

      int var10;
      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.h.nextInt(16) + 8;
         var9 = this.h.nextInt(120) + 4;
         var10 = var5 + this.h.nextInt(16) + 8;
         (new iq()).a(this.n, this.h, var8, var9, var10);
      }

      var6 = this.h.nextInt(this.h.nextInt(10) + 1);

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.h.nextInt(16) + 8;
         var9 = this.h.nextInt(120) + 4;
         var10 = var5 + this.h.nextInt(16) + 8;
         (new fk()).a(this.n, this.h, var8, var9, var10);
      }

      for(var7 = 0; var7 < 10; ++var7) {
         var8 = var4 + this.h.nextInt(16) + 8;
         var9 = this.h.nextInt(128);
         var10 = var5 + this.h.nextInt(16) + 8;
         (new dn()).a(this.n, this.h, var8, var9, var10);
      }

      if(this.h.nextInt(1) == 0) {
         var7 = var4 + this.h.nextInt(16) + 8;
         var8 = this.h.nextInt(128);
         var9 = var5 + this.h.nextInt(16) + 8;
         (new au(fw.ag.bi)).a(this.n, this.h, var7, var8, var9);
      }

      if(this.h.nextInt(1) == 0) {
         var7 = var4 + this.h.nextInt(16) + 8;
         var8 = this.h.nextInt(128);
         var9 = var5 + this.h.nextInt(16) + 8;
         (new au(fw.ah.bi)).a(this.n, this.h, var7, var8, var9);
      }

      fp.a = false;
   }

   public boolean a(boolean var1, iv var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }
}
