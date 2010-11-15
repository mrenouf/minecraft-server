// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:49
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.Random;

public class fw {

   public static final ca e = new ca("stone", 1.0F, 1.0F);
   public static final ca f = new ca("wood", 1.0F, 1.0F);
   public static final ca g = new ca("gravel", 1.0F, 1.0F);
   public static final ca h = new ca("grass", 1.0F, 1.0F);
   public static final ca i = new ca("stone", 1.0F, 1.0F);
   public static final ca j = new ca("stone", 1.0F, 1.5F);
   public static final ca k = new af("stone", 1.0F, 1.0F);
   public static final ca l = new ca("cloth", 1.0F, 1.0F);
   public static final ca m = new ae("sand", 1.0F, 1.0F);
   public static final fw[] n = new fw[256];
   public static final boolean[] o = new boolean[256];
   public static final boolean[] p = new boolean[256];
   public static final boolean[] q = new boolean[256];
   public static final int[] r = new int[256];
   public static final boolean[] s = new boolean[256];
   public static final int[] t = new int[256];
   public static final fw u = (new dq(1, 1)).c(1.5F).b(10.0F).a(i);
   public static final hs v = (hs)(new hs(2)).c(0.6F).a(h);
   public static final fw w = (new ar(3, 2)).c(0.5F).a(g);
   public static final fw x = (new fw(4, 16, jr.d)).c(2.0F).b(10.0F).a(i);
   public static final fw y = (new fw(5, 4, jr.c)).c(2.0F).b(5.0F).a(f);
   public static final fw z = (new gb(6, 15)).c(0.0F).a(h);
   public static final fw A = (new fw(7, 17, jr.d)).c(-1.0F).b(6000000.0F).a(i);
   public static final fw B = (new ap(8, jr.f)).c(100.0F).c(3);
   public static final fw C = (new y(9, jr.f)).c(100.0F).c(3);
   public static final fw D = (new ap(10, jr.g)).c(0.0F).a(1.0F).c(255);
   public static final fw E = (new y(11, jr.g)).c(100.0F).a(1.0F).c(255);
   public static final fw F = (new fp(12, 18)).c(0.5F).a(m);
   public static final fw G = (new j(13, 19)).c(0.6F).a(g);
   public static final fw H = (new g(14, 32)).c(3.0F).b(5.0F).a(i);
   public static final fw I = (new g(15, 33)).c(3.0F).b(5.0F).a(i);
   public static final fw J = (new g(16, 34)).c(3.0F).b(5.0F).a(i);
   public static final fw K = (new gm(17)).c(2.0F).a(f);
   public static final cc L = (cc)(new cc(18, 52)).c(0.2F).c(1).a(h);
   public static final fw M = (new ig(19)).c(0.6F).a(h);
   public static final fw N = (new er(20, 49, jr.o, false)).c(0.3F).a(k);
   public static final fw O = null;
   public static final fw P = null;
   public static final fw Q = null;
   public static final fw R = null;
   public static final fw S = null;
   public static final fw T = null;
   public static final fw U = null;
   public static final fw V = null;
   public static final fw W = null;
   public static final fw X = null;
   public static final fw Y = null;
   public static final fw Z = null;
   public static final fw aa = null;
   public static final fw ab = null;
   public static final fw ac = (new fw(35, 64, jr.k)).c(0.8F).a(l);
   public static final fw ad = null;
   public static final hg ae = (hg)(new hg(37, 13)).c(0.0F).a(h);
   public static final hg af = (hg)(new hg(38, 12)).c(0.0F).a(h);
   public static final hg ag = (hg)(new ew(39, 29)).c(0.0F).a(h).a(0.125F);
   public static final hg ah = (hg)(new ew(40, 28)).c(0.0F).a(h);
   public static final fw ai = (new i(41, 39)).c(3.0F).b(10.0F).a(j);
   public static final fw aj = (new i(42, 38)).c(5.0F).b(10.0F).a(j);
   public static final fw ak = (new jq(43, true)).c(2.0F).b(10.0F).a(i);
   public static final fw al = (new jq(44, false)).c(2.0F).b(10.0F).a(i);
   public static final fw am = (new fw(45, 7, jr.d)).c(2.0F).b(10.0F).a(i);
   public static final fw an = (new z(46, 8)).c(0.0F).a(h);
   public static final fw ao = (new fy(47, 35)).c(1.5F).a(f);
   public static final fw ap = (new fw(48, 36, jr.d)).c(2.0F).b(10.0F).a(i);
   public static final fw aq = (new ek(49, 37)).c(10.0F).b(2000.0F).a(i);
   public static final fw ar = (new gu(50, 80)).c(0.0F).a(0.9375F).a(f);
   public static final jm as = (jm)((jm)(new jm(51, 31)).c(0.0F).a(1.0F).a(f));
   public static final fw at = (new cl(52, 65)).c(5.0F).a(j);
   public static final fw au = new ea(53, y);
   public static final fw av = (new b(54)).c(2.5F).a(f);
   public static final fw aw = (new dt(55, 84)).c(0.0F).a(e);
   public static final fw ax = (new g(56, 50)).c(3.0F).b(5.0F).a(i);
   public static final fw ay = (new i(57, 40)).c(5.0F).b(10.0F).a(j);
   public static final fw az = (new eq(58)).c(2.5F).a(f);
   public static final fw aA = (new m(59, 88)).c(0.0F).a(h);
   public static final fw aB = (new gr(60)).c(0.6F).a(g);
   public static final fw aC = (new eh(61, false)).c(3.5F).a(i);
   public static final fw aD = (new eh(62, true)).c(3.5F).a(i).a(0.875F);
   public static final fw aE = (new fr(63, jg.class, true)).c(1.0F).a(f);
   public static final fw aF = (new je(64, jr.c)).c(3.0F).a(f);
   public static final fw aG = (new cy(65, 83)).c(0.4F).a(f);
   public static final fw aH = (new ay(66, 128)).c(0.7F).a(j);
   public static final fw aI = new ea(67, x);
   public static final fw aJ = (new fr(68, jg.class, false)).c(1.0F).a(f);
   public static final fw aK = (new ip(69, 96)).c(0.5F).a(f);
   public static final fw aL = (new bb(70, u.bh, db.b)).c(0.5F).a(i);
   public static final fw aM = (new je(71, jr.e)).c(5.0F).a(j);
   public static final fw aN = (new bb(72, y.bh, db.a)).c(0.5F).a(f);
   public static final fw aO = (new az(73, 51, false)).c(3.0F).b(5.0F).a(i);
   public static final fw aP = (new az(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(i);
   public static final fw aQ = (new cj(75, 115, false)).c(0.0F).a(f);
   public static final fw aR = (new cj(76, 99, true)).c(0.0F).a(0.5F).a(f);
   public static final fw aS = (new an(77, u.bh)).c(0.5F).a(i);
   public static final fw aT = (new hu(78, 66)).c(0.1F).a(l);
   public static final fw aU = (new n(79, 67)).c(0.5F).c(3).a(k);
   public static final fw aV = (new v(80, 66)).c(0.2F).a(l);
   public static final fw aW = (new aq(81, 70)).c(0.4F).a(l);
   public static final fw aX = (new dg(82, 72)).c(0.6F).a(g);
   public static final fw aY = (new cr(83, 73)).c(0.0F).a(h);
   public static final fw aZ = (new ev(84, 74)).c(2.0F).b(10.0F).a(i);
   public static final fw ba = (new hy(85, 4)).c(2.0F).b(5.0F).a(f);
   public static final fw bb = (new ej(86, 102, false)).c(1.0F).a(f);
   public static final fw bc = (new jd(87, 103)).c(0.4F).a(i);
   public static final fw bd = (new aa(88, 104)).c(0.5F).a(m);
   public static final fw be = (new kb(89, 105, jr.o)).c(0.3F).a(k).a(1.0F);
   public static final ag bf = (ag)((ag)(new ag(90, 14)).c(-1.0F).a(k).a(0.75F));
   public static final fw bg = (new ej(91, 102, true)).c(1.0F).a(f).a(1.0F);
   public int bh;
   public final int bi;
   protected float bj;
   protected float bk;
   public double bl;
   public double bm;
   public double bn;
   public double bo;
   public double bp;
   public double bq;
   public ca br;
   public float bs;
   public final jr bt;
   public float bu;


   protected fw(int var1, jr var2) {
      this.br = e;
      this.bs = 1.0F;
      this.bu = 0.6F;
      if(n[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + n[var1] + " when adding " + this);
      } else {
         this.bt = var2;
         n[var1] = this;
         this.bi = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         p[var1] = this.a();
         r[var1] = this.a()?255:0;
         s[var1] = this.e();
         q[var1] = false;
      }
   }

   protected fw(int var1, int var2, jr var3) {
      this(var1, var3);
      this.bh = var2;
   }

   protected fw a(ca var1) {
      this.br = var1;
      return this;
   }

   protected fw c(int var1) {
      r[this.bi] = var1;
      return this;
   }

   protected fw a(float var1) {
      t[this.bi] = (int)(15.0F * var1);
      return this;
   }

   protected fw b(float var1) {
      this.bk = var1 * 3.0F;
      return this;
   }

   private boolean e() {
      return false;
   }

   protected fw c(float var1) {
      this.bj = var1;
      if(this.bk < var1 * 5.0F) {
         this.bk = var1 * 5.0F;
      }

      return this;
   }

   protected void a(boolean var1) {
      o[this.bi] = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bl = (double)var1;
      this.bm = (double)var2;
      this.bn = (double)var3;
      this.bo = (double)var4;
      this.bp = (double)var5;
      this.bq = (double)var6;
   }

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.bm > 0.0D?true:(var5 == 1 && this.bp < 1.0D?true:(var5 == 2 && this.bn > 0.0D?true:(var5 == 3 && this.bq < 1.0D?true:(var5 == 4 && this.bl > 0.0D?true:(var5 == 5 && this.bo < 1.0D?true:!var1.d(var2, var3, var4))))));
   }

   public int a(int var1) {
      return this.bh;
   }

   public void a(el var1, int var2, int var3, int var4, ds var5, ArrayList var6) {
      ds var7 = this.d(var1, var2, var3, var4);
      if(var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public ds d(el var1, int var2, int var3, int var4) {
      return ds.b((double)var2 + this.bl, (double)var3 + this.bm, (double)var4 + this.bn, (double)var2 + this.bo, (double)var3 + this.bp, (double)var4 + this.bq);
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

   public void a(el var1, int var2, int var3, int var4, Random var5) {
   }

   public void a(el var1, int var2, int var3, int var4, int var5) {
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
   }

   public int b() {
      return 10;
   }

   public void e(el var1, int var2, int var3, int var4) {
   }

   public void b(el var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2) {
      return this.bi;
   }

   public float a(ft var1) {
      return this.bj < 0.0F?0.0F:(!var1.b(this)?1.0F / this.bj / 100.0F:var1.a(this) / this.bj / 30.0F);
   }

   public void a_(el var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 1.0F);
   }

   public void a(el var1, int var2, int var3, int var4, int var5, float var6) {
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
                  gf var17 = new gf(var1, (double)var2 + var11, (double)var3 + var13, (double)var4 + var15, new hh(var9));
                  var17.c = 10;
                  var1.a(var17);
               }
            }
         }

      }
   }

   public float a(dv var1) {
      return this.bk / 5.0F;
   }

   public gk a(el var1, int var2, int var3, int var4, ba var5, ba var6) {
      this.a(var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      ba var7 = var5.a(var6, this.bl);
      ba var8 = var5.a(var6, this.bo);
      ba var9 = var5.b(var6, this.bm);
      ba var10 = var5.b(var6, this.bp);
      ba var11 = var5.c(var6, this.bn);
      ba var12 = var5.c(var6, this.bq);
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

      ba var13 = null;
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

         return new gk(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(ba var1) {
      return var1 == null?false:var1.b >= this.bm && var1.b <= this.bp && var1.c >= this.bn && var1.c <= this.bq;
   }

   private boolean b(ba var1) {
      return var1 == null?false:var1.a >= this.bl && var1.a <= this.bo && var1.c >= this.bn && var1.c <= this.bq;
   }

   private boolean c(ba var1) {
      return var1 == null?false:var1.a >= this.bl && var1.a <= this.bo && var1.b >= this.bm && var1.b <= this.bp;
   }

   public void c(el var1, int var2, int var3, int var4) {
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || n[var5].bt.d();
   }

   public boolean a(el var1, int var2, int var3, int var4, ft var5) {
      return false;
   }

   public void b(el var1, int var2, int var3, int var4, dv var5) {
   }

   public void c(el var1, int var2, int var3, int var4, int var5) {
   }

   public void b(el var1, int var2, int var3, int var4, ft var5) {
   }

   public void a(el var1, int var2, int var3, int var4, dv var5, ba var6) {
   }

   public void a(io var1, int var2, int var3, int var4) {
   }

   public boolean b(io var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean c() {
      return false;
   }

   public void a(el var1, int var2, int var3, int var4, dv var5) {
   }

   public boolean d(el var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean f(el var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(el var1, int var2, int var3, int var4, jt var5) {
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         if(n[var0] != null) {
            fq.c[var0] = new bq(var0 - 256);
         }
      }

   }
}
