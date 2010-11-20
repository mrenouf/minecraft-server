// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:17
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.List;

public class jj extends dw implements jz {

   private hj[] aj;
   public int a;
   public int b;
   public int c;
   private boolean ak;
   public int d;
   public int e;
   public double f;
   public double ai;
   private static final int[][][] al = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int am;
   private double an;
   private double ao;
   private double ap;
   private double aq;
   private double ar;


   public jj(em var1) {
      super(var1);
      this.aj = new hj[36];
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.ak = false;
      this.i = true;
      this.a(0.98F, 0.7F);
      this.G = this.I / 2.0F;
      this.L = false;
   }

   public dt d(dw var1) {
      return var1.z;
   }

   public dt q() {
      return null;
   }

   public boolean u() {
      return true;
   }

   public jj(em var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.a(var2, var4 + (double)this.G, var6);
      this.s = 0.0D;
      this.t = 0.0D;
      this.u = 0.0D;
      this.m = var2;
      this.n = var4;
      this.o = var6;
      this.d = var8;
   }

   public double j() {
      return (double)this.I * 0.0D - 0.30000001192092896D;
   }

   public boolean a(dw var1, int var2) {
      if(this.l.z) {
         return true;
      } else {
         this.c = -this.c;
         this.b = 10;
         this.a += var2 * 10;
         if(this.a > 40) {
            this.a(fs.ax.aW, 1, 0.0F);
            if(this.d == 1) {
               this.a(fy.au.bh, 1, 0.0F);
            } else if(this.d == 2) {
               this.a(fy.aB.bh, 1, 0.0F);
            }

            this.l();
         }

         return true;
      }
   }

   public boolean c_() {
      return !this.F;
   }

   public void l() {
      for(int var1 = 0; var1 < this.a(); ++var1) {
         hj var2 = this.a(var1);
         if(var2 != null) {
            float var3 = this.V.nextFloat() * 0.8F + 0.1F;
            float var4 = this.V.nextFloat() * 0.8F + 0.1F;
            float var5 = this.V.nextFloat() * 0.8F + 0.1F;

            while(var2.a > 0) {
               int var6 = this.V.nextInt(21) + 10;
               if(var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               gh var7 = new gh(this.l, this.p + (double)var3, this.q + (double)var4, this.r + (double)var5, new hj(var2.c, var6, var2.d));
               float var8 = 0.05F;
               var7.s = (double)((float)this.V.nextGaussian() * var8);
               var7.t = (double)((float)this.V.nextGaussian() * var8 + 0.2F);
               var7.u = (double)((float)this.V.nextGaussian() * var8);
               this.l.a(var7);
            }
         }
      }

      super.l();
   }

   public void b_() {
      double var7;
      if(this.l.z && this.am > 0) {
         if(this.am > 0) {
            double var42 = this.p + (this.an - this.p) / (double)this.am;
            double var48 = this.q + (this.ao - this.q) / (double)this.am;
            double var5 = this.r + (this.ap - this.r) / (double)this.am;

            for(var7 = this.aq - (double)this.v; var7 < -180.0D; var7 += 360.0D) {
               ;
            }

            while(var7 >= 180.0D) {
               var7 -= 360.0D;
            }

            this.v = (float)((double)this.v + var7 / (double)this.am);
            this.w = (float)((double)this.w + (this.ar - (double)this.w) / (double)this.am);
            --this.am;
            this.a(var42, var48, var5);
            this.b(this.v, this.w);
         } else {
            this.a(this.p, this.q, this.r);
            this.b(this.v, this.w);
         }

      } else {
         if(this.b > 0) {
            --this.b;
         }

         if(this.a > 0) {
            --this.a;
         }

         this.m = this.p;
         this.n = this.q;
         this.o = this.r;
         this.t -= 0.03999999910593033D;
         int var1 = hd.b(this.p);
         int var2 = hd.b(this.q);
         int var3 = hd.b(this.r);
         if(this.l.a(var1, var2 - 1, var3) == fy.aG.bh) {
            --var2;
         }

         double var4 = 0.4D;
         boolean var6 = false;
         var7 = 0.0078125D;
         if(this.l.a(var1, var2, var3) == fy.aG.bh) {
            bc var9 = this.g(this.p, this.q, this.r);
            int var10 = this.l.b(var1, var2, var3);
            this.q = (double)var2;
            if(var10 >= 2 && var10 <= 5) {
               this.q = (double)(var2 + 1);
            }

            if(var10 == 2) {
               this.s -= var7;
            }

            if(var10 == 3) {
               this.s += var7;
            }

            if(var10 == 4) {
               this.u += var7;
            }

            if(var10 == 5) {
               this.u -= var7;
            }

            int[][] var11 = al[var10];
            double var12 = (double)(var11[1][0] - var11[0][0]);
            double var14 = (double)(var11[1][2] - var11[0][2]);
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.s * var12 + this.u * var14;
            if(var18 < 0.0D) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.s * this.s + this.u * this.u);
            this.s = var20 * var12 / var16;
            this.u = var20 * var14 / var16;
            double var22 = 0.0D;
            double var24 = (double)var1 + 0.5D + (double)var11[0][0] * 0.5D;
            double var26 = (double)var3 + 0.5D + (double)var11[0][2] * 0.5D;
            double var28 = (double)var1 + 0.5D + (double)var11[1][0] * 0.5D;
            double var30 = (double)var3 + 0.5D + (double)var11[1][2] * 0.5D;
            var12 = var28 - var24;
            var14 = var30 - var26;
            double var34;
            double var32;
            double var36;
            if(var12 == 0.0D) {
               this.p = (double)var1 + 0.5D;
               var22 = this.r - (double)var3;
            } else if(var14 == 0.0D) {
               this.r = (double)var3 + 0.5D;
               var22 = this.p - (double)var1;
            } else {
               var32 = this.p - var24;
               var34 = this.r - var26;
               var36 = (var32 * var12 + var34 * var14) * 2.0D;
               var22 = var36;
            }

            this.p = var24 + var12 * var22;
            this.r = var26 + var14 * var22;
            this.a(this.p, this.q + (double)this.G, this.r);
            var32 = this.s;
            var34 = this.u;
            if(this.j != null) {
               var32 *= 0.75D;
               var34 *= 0.75D;
            }

            if(var32 < -var4) {
               var32 = -var4;
            }

            if(var32 > var4) {
               var32 = var4;
            }

            if(var34 < -var4) {
               var34 = -var4;
            }

            if(var34 > var4) {
               var34 = var4;
            }

            this.c(var32, 0.0D, var34);
            if(var11[0][1] != 0 && hd.b(this.p) - var1 == var11[0][0] && hd.b(this.r) - var3 == var11[0][2]) {
               this.a(this.p, this.q + (double)var11[0][1], this.r);
            } else if(var11[1][1] != 0 && hd.b(this.p) - var1 == var11[1][0] && hd.b(this.r) - var3 == var11[1][2]) {
               this.a(this.p, this.q + (double)var11[1][1], this.r);
            }

            if(this.j != null) {
               this.s *= 0.996999979019165D;
               this.t *= 0.0D;
               this.u *= 0.996999979019165D;
            } else {
               if(this.d == 2) {
                  var36 = (double)hd.a(this.f * this.f + this.ai * this.ai);
                  if(var36 > 0.01D) {
                     var6 = true;
                     this.f /= var36;
                     this.ai /= var36;
                     double var38 = 0.04D;
                     this.s *= 0.800000011920929D;
                     this.t *= 0.0D;
                     this.u *= 0.800000011920929D;
                     this.s += this.f * var38;
                     this.u += this.ai * var38;
                  } else {
                     this.s *= 0.8999999761581421D;
                     this.t *= 0.0D;
                     this.u *= 0.8999999761581421D;
                  }
               }

               this.s *= 0.9599999785423279D;
               this.t *= 0.0D;
               this.u *= 0.9599999785423279D;
            }

            bc var43 = this.g(this.p, this.q, this.r);
            if(var43 != null && var9 != null) {
               double var37 = (var9.b - var43.b) * 0.05D;
               var20 = Math.sqrt(this.s * this.s + this.u * this.u);
               if(var20 > 0.0D) {
                  this.s = this.s / var20 * (var20 + var37);
                  this.u = this.u / var20 * (var20 + var37);
               }

               this.a(this.p, var43.b, this.r);
            }

            int var44 = hd.b(this.p);
            int var47 = hd.b(this.r);
            if(var44 != var1 || var47 != var3) {
               var20 = Math.sqrt(this.s * this.s + this.u * this.u);
               this.s = var20 * (double)(var44 - var1);
               this.u = var20 * (double)(var47 - var3);
            }

            if(this.d == 2) {
               double var39 = (double)hd.a(this.f * this.f + this.ai * this.ai);
               if(var39 > 0.01D && this.s * this.s + this.u * this.u > 0.0010D) {
                  this.f /= var39;
                  this.ai /= var39;
                  if(this.f * this.s + this.ai * this.u < 0.0D) {
                     this.f = 0.0D;
                     this.ai = 0.0D;
                  } else {
                     this.f = this.s;
                     this.ai = this.u;
                  }
               }
            }
         } else {
            if(this.s < -var4) {
               this.s = -var4;
            }

            if(this.s > var4) {
               this.s = var4;
            }

            if(this.u < -var4) {
               this.u = -var4;
            }

            if(this.u > var4) {
               this.u = var4;
            }

            if(this.A) {
               this.s *= 0.5D;
               this.t *= 0.5D;
               this.u *= 0.5D;
            }

            this.c(this.s, this.t, this.u);
            if(!this.A) {
               this.s *= 0.949999988079071D;
               this.t *= 0.949999988079071D;
               this.u *= 0.949999988079071D;
            }
         }

         this.w = 0.0F;
         double var41 = this.m - this.p;
         double var46 = this.o - this.r;
         if(var41 * var41 + var46 * var46 > 0.0010D) {
            this.v = (float)(Math.atan2(var46, var41) * 180.0D / 3.141592653589793D);
            if(this.ak) {
               this.v += 180.0F;
            }
         }

         double var13;
         for(var13 = (double)(this.v - this.x); var13 >= 180.0D; var13 -= 360.0D) {
            ;
         }

         while(var13 < -180.0D) {
            var13 += 360.0D;
         }

         if(var13 < -170.0D || var13 >= 170.0D) {
            this.v += 180.0F;
            this.ak = !this.ak;
         }

         this.b(this.v, this.w);
         List var15 = this.l.b(this, this.z.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var15 != null && var15.size() > 0) {
            for(int var45 = 0; var45 < var15.size(); ++var45) {
               dw var17 = (dw)var15.get(var45);
               if(var17 != this.j && var17.u() && var17 instanceof jj) {
                  var17.c(this);
               }
            }
         }

         if(this.j != null && this.j.F) {
            this.j = null;
         }

         if(var6 && this.V.nextInt(4) == 0) {
            --this.e;
            if(this.e < 0) {
               this.f = this.ai = 0.0D;
            }

            this.l.a("largesmoke", this.p, this.q + 0.8D, this.r, 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public bc g(double var1, double var3, double var5) {
      int var7 = hd.b(var1);
      int var8 = hd.b(var3);
      int var9 = hd.b(var5);
      if(this.l.a(var7, var8 - 1, var9) == fy.aG.bh) {
         --var8;
      }

      if(this.l.a(var7, var8, var9) == fy.aG.bh) {
         int var10 = this.l.b(var7, var8, var9);
         var3 = (double)var8;
         if(var10 >= 2 && var10 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var11 = al[var10];
         double var12 = 0.0D;
         double var14 = (double)var7 + 0.5D + (double)var11[0][0] * 0.5D;
         double var16 = (double)var8 + 0.5D + (double)var11[0][1] * 0.5D;
         double var18 = (double)var9 + 0.5D + (double)var11[0][2] * 0.5D;
         double var20 = (double)var7 + 0.5D + (double)var11[1][0] * 0.5D;
         double var22 = (double)var8 + 0.5D + (double)var11[1][1] * 0.5D;
         double var24 = (double)var9 + 0.5D + (double)var11[1][2] * 0.5D;
         double var26 = var20 - var14;
         double var28 = (var22 - var16) * 2.0D;
         double var30 = var24 - var18;
         if(var26 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var12 = var5 - (double)var9;
         } else if(var30 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var12 = var1 - (double)var7;
         } else {
            double var32 = var1 - var14;
            double var34 = var5 - var18;
            double var36 = (var32 * var26 + var34 * var30) * 2.0D;
            var12 = var36;
         }

         var1 = var14 + var26 * var12;
         var3 = var16 + var28 * var12;
         var5 = var18 + var30 * var12;
         if(var28 < 0.0D) {
            ++var3;
         }

         if(var28 > 0.0D) {
            var3 += 0.5D;
         }

         return bc.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void a(v var1) {
      var1.a("Type", this.d);
      if(this.d == 2) {
         var1.a("PushX", this.f);
         var1.a("PushZ", this.ai);
         var1.a("Fuel", (short)this.e);
      } else if(this.d == 1) {
         ea var2 = new ea();

         for(int var3 = 0; var3 < this.aj.length; ++var3) {
            if(this.aj[var3] != null) {
               v var4 = new v();
               var4.a("Slot", (byte)var3);
               this.aj[var3].a(var4);
               var2.a(var4);
            }
         }

         var1.a("Items", var2);
      }

   }

   protected void b(v var1) {
      this.d = var1.d("Type");
      if(this.d == 2) {
         this.f = var1.g("PushX");
         this.ai = var1.g("PushZ");
         this.e = var1.c("Fuel");
      } else if(this.d == 1) {
         ea var2 = var1.k("Items");
         this.aj = new hj[this.a()];

         for(int var3 = 0; var3 < var2.b(); ++var3) {
            v var4 = (v)var2.a(var3);
            int var5 = var4.b("Slot") & 255;
            if(var5 >= 0 && var5 < this.aj.length) {
               this.aj[var5] = new hj(var4);
            }
         }
      }

   }

   public void c(dw var1) {
      if(!this.l.z) {
         if(var1 != this.j) {
            if(var1 instanceof jv && !(var1 instanceof fv) && this.d == 0 && this.s * this.s + this.u * this.u > 0.01D && this.j == null && var1.k == null) {
               var1.e(this);
            }

            double var2 = var1.p - this.p;
            double var4 = var1.r - this.r;
            double var6 = var2 * var2 + var4 * var4;
            if(var6 >= 9.999999747378752E-5D) {
               var6 = (double)hd.a(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.T);
               var4 *= (double)(1.0F - this.T);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if(var1 instanceof jj) {
                  double var10 = var1.s + this.s;
                  double var12 = var1.u + this.u;
                  if(((jj)var1).d == 2 && this.d != 2) {
                     this.s *= 0.20000000298023224D;
                     this.u *= 0.20000000298023224D;
                     this.f(var1.s - var2, 0.0D, var1.u - var4);
                     var1.s *= 0.699999988079071D;
                     var1.u *= 0.699999988079071D;
                  } else if(((jj)var1).d != 2 && this.d == 2) {
                     var1.s *= 0.20000000298023224D;
                     var1.u *= 0.20000000298023224D;
                     var1.f(this.s + var2, 0.0D, this.u + var4);
                     this.s *= 0.699999988079071D;
                     this.u *= 0.699999988079071D;
                  } else {
                     var10 /= 2.0D;
                     var12 /= 2.0D;
                     this.s *= 0.20000000298023224D;
                     this.u *= 0.20000000298023224D;
                     this.f(var10 - var2, 0.0D, var12 - var4);
                     var1.s *= 0.20000000298023224D;
                     var1.u *= 0.20000000298023224D;
                     var1.f(var10 + var2, 0.0D, var12 + var4);
                  }
               } else {
                  this.f(-var2, 0.0D, -var4);
                  var1.f(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public int a() {
      return 27;
   }

   public hj a(int var1) {
      return this.aj[var1];
   }

   public boolean a(fv var1) {
      if(this.d == 0) {
         if(this.j != null && this.j instanceof fv && this.j != var1) {
            return true;
         }

         if(!this.l.z) {
            var1.e(this);
         }
      } else if(this.d == 1) {
         var1.a((jz)this);
      } else if(this.d == 2) {
         hj var2 = var1.ak.b();
         if(var2 != null && var2.c == fs.k.aW) {
            if((var2.a -= 1) == 0) {
               var1.ak.a(var1.ak.d, (hj)null);
            }

            this.e += 1200;
         }

         this.f = this.p - var1.p;
         this.ai = this.r - var1.r;
      }

      return true;
   }

}
