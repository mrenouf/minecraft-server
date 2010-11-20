// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:42
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.Random;

public class fy {

   public static final cc d = new cc("stone", 1.0F, 1.0F);
   public static final cc e = new cc("wood", 1.0F, 1.0F);
   public static final cc f = new cc("gravel", 1.0F, 1.0F);
   public static final cc g = new cc("grass", 1.0F, 1.0F);
   public static final cc h = new cc("stone", 1.0F, 1.0F);
   public static final cc i = new cc("stone", 1.0F, 1.5F);
   public static final cc j = new ah("stone", 1.0F, 1.0F);
   public static final cc k = new cc("cloth", 1.0F, 1.0F);
   public static final cc l = new ag("sand", 1.0F, 1.0F);
   public static final fy[] m = new fy[256];
   public static final boolean[] n = new boolean[256];
   public static final boolean[] o = new boolean[256];
   public static final boolean[] p = new boolean[256];
   public static final int[] q = new int[256];
   public static final boolean[] r = new boolean[256];
   public static final int[] s = new int[256];
   public static final fy t = (new dr(1, 1)).c(1.5F).b(10.0F).a(h);
   public static final hu u = (hu)(new hu(2)).c(0.6F).a(g);
   public static final fy v = (new at(3, 2)).c(0.5F).a(f);
   public static final fy w = (new fy(4, 16, jt.d)).c(2.0F).b(10.0F).a(h);
   public static final fy x = (new fy(5, 4, jt.c)).c(2.0F).b(5.0F).a(e);
   public static final fy y = (new gd(6, 15)).c(0.0F).a(g);
   public static final fy z = (new fy(7, 17, jt.d)).c(-1.0F).b(6000000.0F).a(h);
   public static final fy A = (new ar(8, jt.f)).c(100.0F).c(3);
   public static final fy B = (new z(9, jt.f)).c(100.0F).c(3);
   public static final fy C = (new ar(10, jt.g)).c(0.0F).a(1.0F).c(255);
   public static final fy D = (new z(11, jt.g)).c(100.0F).a(1.0F).c(255);
   public static final fy E = (new fr(12, 18)).c(0.5F).a(l);
   public static final fy F = (new k(13, 19)).c(0.6F).a(f);
   public static final fy G = (new h(14, 32)).c(3.0F).b(5.0F).a(h);
   public static final fy H = (new h(15, 33)).c(3.0F).b(5.0F).a(h);
   public static final fy I = (new h(16, 34)).c(3.0F).b(5.0F).a(h);
   public static final fy J = (new go(17)).c(2.0F).a(e);
   public static final cd K = (cd)(new cd(18, 52)).c(0.2F).c(1).a(g);
   public static final fy L = (new ii(19)).c(0.6F).a(g);
   public static final fy M = (new es(20, 49, jt.o, false)).c(0.3F).a(j);
   public static final fy N = null;
   public static final fy O = null;
   public static final fy P = null;
   public static final fy Q = null;
   public static final fy R = null;
   public static final fy S = null;
   public static final fy T = null;
   public static final fy U = null;
   public static final fy V = null;
   public static final fy W = null;
   public static final fy X = null;
   public static final fy Y = null;
   public static final fy Z = null;
   public static final fy aa = null;
   public static final fy ab = (new fy(35, 64, jt.k)).c(0.8F).a(k);
   public static final fy ac = null;
   public static final hi ad = (hi)(new hi(37, 13)).c(0.0F).a(g);
   public static final hi ae = (hi)(new hi(38, 12)).c(0.0F).a(g);
   public static final hi af = (hi)(new ex(39, 29)).c(0.0F).a(g).a(0.125F);
   public static final hi ag = (hi)(new ex(40, 28)).c(0.0F).a(g);
   public static final fy ah = (new j(41, 39)).c(3.0F).b(10.0F).a(i);
   public static final fy ai = (new j(42, 38)).c(5.0F).b(10.0F).a(i);
   public static final fy aj = (new js(43, true)).c(2.0F).b(10.0F).a(h);
   public static final fy ak = (new js(44, false)).c(2.0F).b(10.0F).a(h);
   public static final fy al = (new fy(45, 7, jt.d)).c(2.0F).b(10.0F).a(h);
   public static final fy am = (new ab(46, 8)).c(0.0F).a(g);
   public static final fy an = (new ga(47, 35)).c(1.5F).a(e);
   public static final fy ao = (new fy(48, 36, jt.d)).c(2.0F).b(10.0F).a(h);
   public static final fy ap = (new el(49, 37)).c(10.0F).b(2000.0F).a(h);
   public static final fy aq = (new gw(50, 80)).c(0.0F).a(0.9375F).a(e);
   public static final jo ar = (jo)((jo)(new jo(51, 31)).c(0.0F).a(1.0F).a(e));
   public static final fy as = (new cm(52, 65)).c(5.0F).a(i);
   public static final fy at = new eb(53, x);
   public static final fy au = (new c(54)).c(2.5F).a(e);
   public static final fy av = (new du(55, 84)).c(0.0F).a(d);
   public static final fy aw = (new h(56, 50)).c(3.0F).b(5.0F).a(h);
   public static final fy ax = (new j(57, 40)).c(5.0F).b(10.0F).a(i);
   public static final fy ay = (new er(58)).c(2.5F).a(e);
   public static final fy az = (new n(59, 88)).c(0.0F).a(g);
   public static final fy aA = (new gt(60)).c(0.6F).a(f);
   public static final fy aB = (new ei(61, false)).c(3.5F).a(h);
   public static final fy aC = (new ei(62, true)).c(3.5F).a(h).a(0.875F);
   public static final fy aD = (new ft(63, ji.class, true)).c(1.0F).a(e);
   public static final fy aE = (new jg(64, jt.c)).c(3.0F).a(e);
   public static final fy aF = (new cz(65, 83)).c(0.4F).a(e);
   public static final fy aG = (new ba(66, 128)).c(0.7F).a(i);
   public static final fy aH = new eb(67, w);
   public static final fy aI = (new ft(68, ji.class, false)).c(1.0F).a(e);
   public static final fy aJ = (new ir(69, 96)).c(0.5F).a(e);
   public static final fy aK = (new bd(70, t.bg, dc.b)).c(0.5F).a(h);
   public static final fy aL = (new jg(71, jt.e)).c(5.0F).a(i);
   public static final fy aM = (new bd(72, x.bg, dc.a)).c(0.5F).a(e);
   public static final fy aN = (new bb(73, 51, false)).c(3.0F).b(5.0F).a(h);
   public static final fy aO = (new bb(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(h);
   public static final fy aP = (new ck(75, 115, false)).c(0.0F).a(e);
   public static final fy aQ = (new ck(76, 99, true)).c(0.0F).a(0.5F).a(e);
   public static final fy aR = (new ap(77, t.bg)).c(0.5F).a(h);
   public static final fy aS = (new hw(78, 66)).c(0.1F).a(k);
   public static final fy aT = (new o(79, 67)).c(0.5F).c(3).a(j);
   public static final fy aU = (new x(80, 66)).c(0.2F).a(k);
   public static final fy aV = (new as(81, 70)).c(0.4F).a(k);
   public static final fy aW = (new dh(82, 72)).c(0.6F).a(f);
   public static final fy aX = (new cs(83, 73)).c(0.0F).a(g);
   public static final fy aY = (new ew(84, 74)).c(2.0F).b(10.0F).a(h);
   public static final fy aZ = (new ia(85, 4)).c(2.0F).b(5.0F).a(e);
   public static final fy ba = (new ek(86, 102, false)).c(1.0F).a(e);
   public static final fy bb = (new jf(87, 103)).c(0.4F).a(h);
   public static final fy bc_ = (new ac(88, 104)).c(0.5F).a(l);
   public static final fy bd = (new kd(89, 105, jt.o)).c(0.3F).a(j).a(1.0F);
   public static final ai be = (ai)((ai)(new ai(90, 14)).c(-1.0F).a(j).a(0.75F));
   public static final fy bf = (new ek(91, 102, true)).c(1.0F).a(e).a(1.0F);
   public int bg;
   public final int bh;
   protected float bi;
   protected float bj;
   public double bk;
   public double bl;
   public double bm;
   public double bn;
   public double bo;
   public double bp;
   public cc bq;
   public float br;
   public final jt bs;
   public float bt;


   protected fy(int var1, jt var2) {
      this.bq = d;
      this.br = 1.0F;
      this.bt = 0.6F;
      if(m[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + m[var1] + " when adding " + this);
      } else {
         this.bs = var2;
         m[var1] = this;
         this.bh = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         o[var1] = this.a();
         q[var1] = this.a()?255:0;
         r[var1] = this.e();
         p[var1] = false;
      }
   }

   protected fy(int var1, int var2, jt var3) {
      this(var1, var3);
      this.bg = var2;
   }

   protected fy a(cc var1) {
      this.bq = var1;
      return this;
   }

   protected fy c(int var1) {
      q[this.bh] = var1;
      return this;
   }

   protected fy a(float var1) {
      s[this.bh] = (int)(15.0F * var1);
      return this;
   }

   protected fy b(float var1) {
      this.bj = var1 * 3.0F;
      return this;
   }

   private boolean e() {
      return false;
   }

   protected fy c(float var1) {
      this.bi = var1;
      if(this.bj < var1 * 5.0F) {
         this.bj = var1 * 5.0F;
      }

      return this;
   }

   protected void a(boolean var1) {
      n[this.bh] = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bk = (double)var1;
      this.bl = (double)var2;
      this.bm = (double)var3;
      this.bn = (double)var4;
      this.bo = (double)var5;
      this.bp = (double)var6;
   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.bl > 0.0D?true:(var5 == 1 && this.bo < 1.0D?true:(var5 == 2 && this.bm > 0.0D?true:(var5 == 3 && this.bp < 1.0D?true:(var5 == 4 && this.bk > 0.0D?true:(var5 == 5 && this.bn < 1.0D?true:!var1.d(var2, var3, var4))))));
   }

   public int a(int var1) {
      return this.bg;
   }

   public void a(em var1, int var2, int var3, int var4, dt var5, ArrayList var6) {
      dt var7 = this.d(var1, var2, var3, var4);
      if(var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public dt d(em var1, int var2, int var3, int var4) {
      return dt.b((double)var2 + this.bk, (double)var3 + this.bl, (double)var4 + this.bm, (double)var2 + this.bn, (double)var3 + this.bo, (double)var4 + this.bp);
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.d();
   }

   public boolean d() {
      return true;
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
   }

   public void a(em var1, int var2, int var3, int var4, int var5) {
   }

   public void b(em var1, int var2, int var3, int var4, int var5) {
   }

   public int b() {
      return 10;
   }

   public void e(em var1, int var2, int var3, int var4) {
   }

   public void b(em var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2) {
      return this.bh;
   }

   public float a(fv var1) {
      return this.bi < 0.0F?0.0F:(!var1.b(this)?1.0F / this.bi / 100.0F:var1.a(this) / this.bi / 30.0F);
   }

   public void a_(em var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 1.0F);
   }

   public void a(em var1, int var2, int var3, int var4, int var5, float var6) {
      if(!var1.z) {
         int var7 = this.a(var1.l);

         for(int var8 = 0; var8 < var7; ++var8) {
            if(var1.l.nextFloat() <= var6) {
               int var9 = this.a(var5, var1.l);
               if(var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  double var13 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  double var15 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  gh var17 = new gh(var1, (double)var2 + var11, (double)var3 + var13, (double)var4 + var15, new hj(var9));
                  var17.c = 10;
                  var1.a(var17);
               }
            }
         }

      }
   }

   public float a(dw var1) {
      return this.bj / 5.0F;
   }

   public gm a(em var1, int var2, int var3, int var4, bc var5, bc var6) {
      this.a(var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      bc var7 = var5.a(var6, this.bk);
      bc var8 = var5.a(var6, this.bn);
      bc var9 = var5.b(var6, this.bl);
      bc var10 = var5.b(var6, this.bo);
      bc var11 = var5.c(var6, this.bm);
      bc var12 = var5.c(var6, this.bp);
      if(!this.a(var7)) {
         var7 = null;
      }

      if(!this.a(var8)) {
         var8 = null;
      }

      if(!this.b(var9)) {
         var9 = null;
      }

      if(!this.b(var10)) {
         var10 = null;
      }

      if(!this.c(var11)) {
         var11 = null;
      }

      if(!this.c(var12)) {
         var12 = null;
      }

      bc var13 = null;
      if(var7 != null && (var13 == null || var5.a(var7) < var5.a(var13))) {
         var13 = var7;
      }

      if(var8 != null && (var13 == null || var5.a(var8) < var5.a(var13))) {
         var13 = var8;
      }

      if(var9 != null && (var13 == null || var5.a(var9) < var5.a(var13))) {
         var13 = var9;
      }

      if(var10 != null && (var13 == null || var5.a(var10) < var5.a(var13))) {
         var13 = var10;
      }

      if(var11 != null && (var13 == null || var5.a(var11) < var5.a(var13))) {
         var13 = var11;
      }

      if(var12 != null && (var13 == null || var5.a(var12) < var5.a(var13))) {
         var13 = var12;
      }

      if(var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if(var13 == var7) {
            var14 = 4;
         }

         if(var13 == var8) {
            var14 = 5;
         }

         if(var13 == var9) {
            var14 = 0;
         }

         if(var13 == var10) {
            var14 = 1;
         }

         if(var13 == var11) {
            var14 = 2;
         }

         if(var13 == var12) {
            var14 = 3;
         }

         return new gm(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(bc var1) {
      return var1 == null?false:var1.b >= this.bl && var1.b <= this.bo && var1.c >= this.bm && var1.c <= this.bp;
   }

   private boolean b(bc var1) {
      return var1 == null?false:var1.a >= this.bk && var1.a <= this.bn && var1.c >= this.bm && var1.c <= this.bp;
   }

   private boolean c(bc var1) {
      return var1 == null?false:var1.a >= this.bk && var1.a <= this.bn && var1.b >= this.bl && var1.b <= this.bo;
   }

   public void c(em var1, int var2, int var3, int var4) {
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || m[var5].bs.d();
   }

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      return false;
   }

   public void b(em var1, int var2, int var3, int var4, dw var5) {
   }

   public void c(em var1, int var2, int var3, int var4, int var5) {
   }

   public void b(em var1, int var2, int var3, int var4, fv var5) {
   }

   public void a(em var1, int var2, int var3, int var4, dw var5, bc var6) {
   }

   public void a(iq var1, int var2, int var3, int var4) {
   }

   public boolean b(iq var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean c() {
      return false;
   }

   public void a(em var1, int var2, int var3, int var4, dw var5) {
   }

   public boolean d(em var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean f(em var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(em var1, int var2, int var3, int var4, jv var5) {
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         if(m[var0] != null) {
            fs.c[var0] = new bs(var0 - 256);
         }
      }

   }
}
