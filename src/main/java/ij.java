// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ij {

   public static final ij a = (new ij()).b(588342).a("Rainforest").a(2094168);
   public static final ij b = (new eo()).b(522674).a("Swampland").a(9154376);
   public static final ij c = (new ij()).b(10215459).a("Seasonal Forest");
   public static final ij d = (new ij()).b(353825).a("Forest").a(5159473);
   public static final ij e = (new fa()).b(14278691).a("Savanna");
   public static final ij f = (new ij()).b(10595616).a("Shrubland");
   public static final ij g = (new ij()).b(3060051).a("Taiga").b().a(8107825);
   public static final ij h = (new fa()).b(16421912).a("Desert");
   public static final ij i = (new fa()).b(16767248).a("Plains");
   public static final ij j = (new fa()).b(16772499).a("Ice Desert").b().a(12899129);
   public static final ij k = (new ij()).b(5762041).a("Tundra").b().a(12899129);
   public static final ij l = (new p()).b(16711680).a("Hell");
   public String m;
   public int n;
   public byte o;
   public byte p;
   public int q;
   protected Class[] r;
   protected Class[] s;
   private static ij[] t = new ij[4096];


   public ij() {
      this.o = (byte)fy.u.bh;
      this.p = (byte)fy.v.bh;
      this.q = 5169201;
      this.r = new Class[]{bu.class, gg.class, ez.class, fk.class};
      this.s = new Class[]{ct.class, hp.class, if_.class, be.class};
   }

   public static void a() {
      for(int var0 = 0; var0 < 64; ++var0) {
         for(int var1 = 0; var1 < 64; ++var1) {
            t[var0 + var1 * 64] = a((float)var0 / 63.0F, (float)var1 / 63.0F);
         }
      }

      h.o = h.p = (byte)fy.E.bh;
      j.o = j.p = (byte)fy.E.bh;
   }

   protected ij b() {
      return this;
   }

   protected ij a(String var1) {
      this.m = var1;
      return this;
   }

   protected ij a(int var1) {
      this.q = var1;
      return this;
   }

   protected ij b(int var1) {
      this.n = var1;
      return this;
   }

   public static ij a(double var0, double var2) {
      int var4 = (int)(var0 * 63.0D);
      int var5 = (int)(var2 * 63.0D);
      return t[var4 + var5 * 64];
   }

   public static ij a(float var0, float var1) {
      var1 *= var0;
      return var0 < 0.1F?k:(var1 < 0.2F?(var0 < 0.5F?k:(var0 < 0.95F?e:h)):(var1 > 0.5F && var0 < 0.7F?b:(var0 < 0.5F?g:(var0 < 0.97F?(var1 < 0.35F?f:d):(var1 < 0.45F?i:(var1 < 0.9F?c:a))))));
   }

   public Class[] a(jn var1) {
      return var1 == jn.a?this.r:(var1 == jn.b?this.s:null);
   }

   static {
      a();
   }
}
