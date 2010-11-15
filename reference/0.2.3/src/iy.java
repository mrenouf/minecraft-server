// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class iy implements br {

   private Random j;
   private fm k;
   private fm l;
   private fm m;
   private fm n;
   private fm o;
   public fm a;
   public fm b;
   public fm c;
   private el p;
   private double[] q;
   private double[] r = new double[256];
   private double[] s = new double[256];
   private double[] t = new double[256];
   private fb u = new dz();
   private ih[] v;
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;
   int[][] i = new int[32][32];
   private double[] w;


   public iy(el var1, long var2) {
      this.p = var1;
      this.j = new Random(var2);
      this.k = new fm(this.j, 16);
      this.l = new fm(this.j, 16);
      this.m = new fm(this.j, 8);
      this.n = new fm(this.j, 4);
      this.o = new fm(this.j, 4);
      this.a = new fm(this.j, 10);
      this.b = new fm(this.j, 16);
      this.c = new fm(this.j, 8);
   }

   public void a(int var1, int var2, byte[] var3, ih[] var4, double[] var5) {
      byte var6 = 4;
      byte var7 = 64;
      int var8 = var6 + 1;
      byte var9 = 17;
      int var10 = var6 + 1;
      this.q = this.a(this.q, var1 * var6, 0, var2 * var6, var8, var9, var10);

      for(int var11 = 0; var11 < var6; ++var11) {
         for(int var12 = 0; var12 < var6; ++var12) {
            for(int var13 = 0; var13 < 16; ++var13) {
               double var14 = 0.125D;
               double var16 = this.q[((var11 + 0) * var10 + var12 + 0) * var9 + var13 + 0];
               double var18 = this.q[((var11 + 0) * var10 + var12 + 1) * var9 + var13 + 0];
               double var20 = this.q[((var11 + 1) * var10 + var12 + 0) * var9 + var13 + 0];
               double var22 = this.q[((var11 + 1) * var10 + var12 + 1) * var9 + var13 + 0];
               double var24 = (this.q[((var11 + 0) * var10 + var12 + 0) * var9 + var13 + 1] - var16) * var14;
               double var26 = (this.q[((var11 + 0) * var10 + var12 + 1) * var9 + var13 + 1] - var18) * var14;
               double var28 = (this.q[((var11 + 1) * var10 + var12 + 0) * var9 + var13 + 1] - var20) * var14;
               double var30 = (this.q[((var11 + 1) * var10 + var12 + 1) * var9 + var13 + 1] - var22) * var14;

               for(int var32 = 0; var32 < 8; ++var32) {
                  double var33 = 0.25D;
                  double var35 = var16;
                  double var37 = var18;
                  double var39 = (var20 - var16) * var33;
                  double var41 = (var22 - var18) * var33;

                  for(int var43 = 0; var43 < 4; ++var43) {
                     int var44 = var43 + var11 * 4 << 11 | 0 + var12 * 4 << 7 | var13 * 8 + var32;
                     short var45 = 128;
                     double var46 = 0.25D;
                     double var48 = var35;
                     double var50 = (var37 - var35) * var46;

                     for(int var52 = 0; var52 < 4; ++var52) {
                        double var53 = var5[(var11 * 4 + var43) * 16 + var12 * 4 + var52];
                        int var55 = 0;
                        if(var13 * 8 + var32 < var7) {
                           if(var53 < 0.5D && var13 * 8 + var32 >= var7 - 1) {
                              var55 = fw.aU.bi;
                           } else {
                              var55 = fw.C.bi;
                           }
                        }

                        if(var48 > 0.0D) {
                           var55 = fw.u.bi;
                        }

                        var3[var44] = (byte)var55;
                        var44 += var45;
                        var48 += var50;
                     }

                     var35 += var39;
                     var37 += var41;
                  }

                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
                  var22 += var30;
               }
            }
         }
      }

   }

   public void a(int var1, int var2, byte[] var3, ih[] var4) {
      byte var5 = 64;
      double var6 = 0.03125D;
      this.r = this.n.a(this.r, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var6, var6, 1.0D);
      this.s = this.n.a(this.s, (double)(var2 * 16), 109.0134D, (double)(var1 * 16), 16, 1, 16, var6, 1.0D, var6);
      this.t = this.o.a(this.t, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            ih var10 = var4[var8 * 16 + var9];
            boolean var11 = this.r[var8 + var9 * 16] + this.j.nextDouble() * 0.2D > 0.0D;
            boolean var12 = this.s[var8 + var9 * 16] + this.j.nextDouble() * 0.2D > 3.0D;
            int var13 = (int)(this.t[var8 + var9 * 16] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
            int var14 = -1;
            byte var15 = var10.o;
            byte var16 = var10.p;

            for(int var17 = 127; var17 >= 0; --var17) {
               int var18 = (var8 * 16 + var9) * 128 + var17;
               if(var17 <= 0 + this.j.nextInt(5)) {
                  var3[var18] = (byte)fw.A.bi;
               } else {
                  byte var19 = var3[var18];
                  if(var19 == 0) {
                     var14 = -1;
                  } else if(var19 == fw.u.bi) {
                     if(var14 == -1) {
                        if(var13 <= 0) {
                           var15 = 0;
                           var16 = (byte)fw.u.bi;
                        } else if(var17 >= var5 - 4 && var17 <= var5 + 1) {
                           var15 = var10.o;
                           var16 = var10.p;
                           if(var12) {
                              var15 = 0;
                           }

                           if(var12) {
                              var16 = (byte)fw.G.bi;
                           }

                           if(var11) {
                              var15 = (byte)fw.F.bi;
                           }

                           if(var11) {
                              var16 = (byte)fw.F.bi;
                           }
                        }

                        if(var17 < var5 && var15 == 0) {
                           var15 = (byte)fw.C.bi;
                        }

                        var14 = var13;
                        if(var17 >= var5 - 1) {
                           var3[var18] = var15;
                        } else {
                           var3[var18] = var16;
                        }
                     } else if(var14 > 0) {
                        --var14;
                        var3[var18] = var16;
                     }
                  }
               }
            }
         }
      }

   }

   public jn b(int var1, int var2) {
      this.j.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      jn var4 = new jn(this.p, var3, var1, var2);
      this.v = this.p.a().a(this.v, var1 * 16, var2 * 16, 16, 16);
      double[] var5 = this.p.a().a;
      this.a(var1, var2, var3, this.v, var5);
      this.a(var1, var2, var3, this.v);
      this.u.a(this, this.p, var1, var2, var3);
      var4.b();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      double[] var12 = this.p.a().a;
      double[] var13 = this.p.a().b;
      this.g = this.a.a(this.g, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.h = this.b.a(this.h, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      this.d = this.m.a(this.d, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.e = this.k.a(this.e, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      this.f = this.l.a(this.f, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      int var14 = 0;
      int var15 = 0;
      int var16 = 16 / var5;

      for(int var17 = 0; var17 < var5; ++var17) {
         int var18 = var17 * var16 + var16 / 2;

         for(int var19 = 0; var19 < var7; ++var19) {
            int var20 = var19 * var16 + var16 / 2;
            double var21 = var12[var18 * 16 + var20];
            double var23 = var13[var18 * 16 + var20] * var21;
            double var25 = 1.0D - var23;
            var25 *= var25;
            var25 *= var25;
            var25 = 1.0D - var25;
            double var27 = (this.g[var15] + 256.0D) / 512.0D;
            var27 *= var25;
            if(var27 > 1.0D) {
               var27 = 1.0D;
            }

            double var29 = this.h[var15] / 8000.0D;
            if(var29 < 0.0D) {
               var29 = -var29 * 0.3D;
            }

            var29 = var29 * 3.0D - 2.0D;
            if(var29 < 0.0D) {
               var29 /= 2.0D;
               if(var29 < -1.0D) {
                  var29 = -1.0D;
               }

               var29 /= 1.4D;
               var29 /= 2.0D;
               var27 = 0.0D;
            } else {
               if(var29 > 1.0D) {
                  var29 = 1.0D;
               }

               var29 /= 8.0D;
            }

            if(var27 < 0.0D) {
               var27 = 0.0D;
            }

            var27 += 0.5D;
            var29 = var29 * (double)var6 / 16.0D;
            double var31 = (double)var6 / 2.0D + var29 * 4.0D;
            ++var15;

            for(int var33 = 0; var33 < var6; ++var33) {
               double var34 = 0.0D;
               double var36 = ((double)var33 - var31) * 12.0D / var27;
               if(var36 < 0.0D) {
                  var36 *= 4.0D;
               }

               double var38 = this.e[var14] / 512.0D;
               double var40 = this.f[var14] / 512.0D;
               double var42 = (this.d[var14] / 10.0D + 1.0D) / 2.0D;
               if(var42 < 0.0D) {
                  var34 = var38;
               } else if(var42 > 1.0D) {
                  var34 = var40;
               } else {
                  var34 = var38 + (var40 - var38) * var42;
               }

               var34 -= var36;
               if(var33 > var6 - 4) {
                  double var44 = (double)((float)(var33 - (var6 - 4)) / 3.0F);
                  var34 = var34 * (1.0D - var44) + -10.0D * var44;
               }

               var1[var14] = var34;
               ++var14;
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
      ih var6 = this.p.a().a(var4 + 16, var5 + 16);
      this.j.setSeed(this.p.u);
      long var7 = this.j.nextLong() / 2L * 2L + 1L;
      long var9 = this.j.nextLong() / 2L * 2L + 1L;
      this.j.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.p.u);
      double var11 = 0.25D;

      int var13;
      int var14;
      int var15;
      int var16;
      for(var13 = 0; var13 < 8; ++var13) {
         var14 = var4 + this.j.nextInt(16) + 8;
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16) + 8;
         (new dw()).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 10; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16);
         (new f(32)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 20; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.w.bi, 32)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 10; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.G.bi, 32)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 20; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.J.bi, 16)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 20; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(64);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.I.bi, 8)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 2; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(32);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.H.bi, 8)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 8; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(16);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.aO.bi, 7)).a(this.p, this.j, var14, var15, var16);
      }

      for(var13 = 0; var13 < 1; ++var13) {
         var14 = var4 + this.j.nextInt(16);
         var15 = this.j.nextInt(16);
         var16 = var5 + this.j.nextInt(16);
         (new eu(fw.ax.bi, 7)).a(this.p, this.j, var14, var15, var16);
      }

      var11 = 0.5D;
      var13 = (int)((this.c.a((double)var4 * var11, (double)var5 * var11) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);
      var14 = 0;
      if(this.j.nextInt(10) == 0) {
         ++var14;
      }

      if(var6 == ih.d) {
         var14 += var13 + 5;
      }

      if(var6 == ih.a) {
         var14 += var13 + 5;
      }

      if(var6 == ih.c) {
         var14 += var13 + 2;
      }

      if(var6 == ih.g) {
         var14 += var13 + 5;
      }

      if(var6 == ih.h) {
         var14 -= 20;
      }

      if(var6 == ih.k) {
         var14 -= 20;
      }

      if(var6 == ih.i) {
         var14 -= 20;
      }

      Object var24 = new jb();
      if(this.j.nextInt(10) == 0) {
         var24 = new gy();
      }

      if(var6 == ih.a && this.j.nextInt(3) == 0) {
         var24 = new gy();
      }

      int var17;
      int var18;
      for(var16 = 0; var16 < var14; ++var16) {
         var17 = var4 + this.j.nextInt(16) + 8;
         var18 = var5 + this.j.nextInt(16) + 8;
         ((bg)var24).a(1.0D, 1.0D, 1.0D);
         ((bg)var24).a(this.p, this.j, var17, this.p.d(var17, var18), var18);
      }

      int var19;
      for(var16 = 0; var16 < 2; ++var16) {
         var17 = var4 + this.j.nextInt(16) + 8;
         var18 = this.j.nextInt(128);
         var19 = var5 + this.j.nextInt(16) + 8;
         (new au(fw.ae.bi)).a(this.p, this.j, var17, var18, var19);
      }

      if(this.j.nextInt(2) == 0) {
         var16 = var4 + this.j.nextInt(16) + 8;
         var17 = this.j.nextInt(128);
         var18 = var5 + this.j.nextInt(16) + 8;
         (new au(fw.af.bi)).a(this.p, this.j, var16, var17, var18);
      }

      if(this.j.nextInt(4) == 0) {
         var16 = var4 + this.j.nextInt(16) + 8;
         var17 = this.j.nextInt(128);
         var18 = var5 + this.j.nextInt(16) + 8;
         (new au(fw.ag.bi)).a(this.p, this.j, var16, var17, var18);
      }

      if(this.j.nextInt(8) == 0) {
         var16 = var4 + this.j.nextInt(16) + 8;
         var17 = this.j.nextInt(128);
         var18 = var5 + this.j.nextInt(16) + 8;
         (new au(fw.ah.bi)).a(this.p, this.j, var16, var17, var18);
      }

      for(var16 = 0; var16 < 10; ++var16) {
         var17 = var4 + this.j.nextInt(16) + 8;
         var18 = this.j.nextInt(128);
         var19 = var5 + this.j.nextInt(16) + 8;
         (new hd()).a(this.p, this.j, var17, var18, var19);
      }

      if(this.j.nextInt(32) == 0) {
         var16 = var4 + this.j.nextInt(16) + 8;
         var17 = this.j.nextInt(128);
         var18 = var5 + this.j.nextInt(16) + 8;
         (new ib()).a(this.p, this.j, var16, var17, var18);
      }

      var16 = 0;
      if(var6 == ih.h) {
         var16 += 10;
      }

      int var20;
      for(var17 = 0; var17 < var16; ++var17) {
         var18 = var4 + this.j.nextInt(16) + 8;
         var19 = this.j.nextInt(128);
         var20 = var5 + this.j.nextInt(16) + 8;
         (new ff()).a(this.p, this.j, var18, var19, var20);
      }

      for(var17 = 0; var17 < 50; ++var17) {
         var18 = var4 + this.j.nextInt(16) + 8;
         var19 = this.j.nextInt(this.j.nextInt(120) + 8);
         var20 = var5 + this.j.nextInt(16) + 8;
         (new in(fw.B.bi)).a(this.p, this.j, var18, var19, var20);
      }

      for(var17 = 0; var17 < 20; ++var17) {
         var18 = var4 + this.j.nextInt(16) + 8;
         var19 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
         var20 = var5 + this.j.nextInt(16) + 8;
         (new in(fw.D.bi)).a(this.p, this.j, var18, var19, var20);
      }

      this.w = this.p.a().a(this.w, var4 + 8, var5 + 8, 16, 16);

      for(var17 = var4 + 8; var17 < var4 + 8 + 16; ++var17) {
         for(var18 = var5 + 8; var18 < var5 + 8 + 16; ++var18) {
            var19 = var17 - (var4 + 8);
            var20 = var18 - (var5 + 8);
            int var21 = this.p.e(var17, var18);
            double var22 = this.w[var19 * 16 + var20] - (double)(var21 - 64) / 64.0D * 0.3D;
            if(var22 < 0.5D && var21 > 0 && var21 < 128 && this.p.a(var17, var21, var18) == 0 && this.p.c(var17, var21 - 1, var18).c() && this.p.c(var17, var21 - 1, var18) != jr.r) {
               this.p.d(var17, var21, var18, fw.aT.bi);
            }
         }
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
