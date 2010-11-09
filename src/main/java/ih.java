// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ih {

   public static final ih a = (new ih()).b(588342).a("Rainforest").a(2094168);
   public static final ih b = (new en()).b(522674).a("Swampland").a(9154376);
   public static final ih c = (new ih()).b(10215459).a("Seasonal Forest");
   public static final ih d = (new ih()).b(353825).a("Forest").a(5159473);
   public static final ih e = (new ez()).b(14278691).a("Savanna");
   public static final ih f = (new ih()).b(10595616).a("Shrubland");
   public static final ih g = (new ih()).b(3060051).a("Taiga").b().a(8107825);
   public static final ih h = (new ez()).b(16421912).a("Desert");
   public static final ih i = (new ez()).b(16767248).a("Plains");
   public static final ih j = (new ez()).b(16772499).a("Ice Desert").b().a(12899129);
   public static final ih k = (new ih()).b(5762041).a("Tundra").b().a(12899129);
   public static final ih l = (new o()).b(16711680).a("Hell");
   public String m;
   public int n;
   public byte o;
   public byte p;
   public int q;
   protected Class[] r;
   protected Class[] s;
   private static ih[] t = new ih[4096];


   public ih() {
      this.o = (byte)fw.v.bi;
      this.p = (byte)fw.w.bi;
      this.q = 5169201;
      this.r = new Class[]{bs.class, ge.class, ey.class, fj.class};
      this.s = new Class[]{cs.class, hn.class, id.class, bc.class};
   }

   public static void a() {
      for(int var0 = 0; var0 < 64; ++var0) {
         for(int var1 = 0; var1 < 64; ++var1) {
            t[var0 + var1 * 64] = a((float)var0 / 63.0F, (float)var1 / 63.0F);
         }
      }

      h.o = h.p = (byte)fw.F.bi;
      j.o = j.p = (byte)fw.F.bi;
   }

   protected ih b() {
      return this;
   }

   protected ih a(String var1) {
      this.m = var1;
      return this;
   }

   protected ih a(int var1) {
      this.q = var1;
      return this;
   }

   protected ih b(int var1) {
      this.n = var1;
      return this;
   }

   public static ih a(double var0, double var2) {
      int var4 = (int)(var0 * 63.0D);
      int var5 = (int)(var2 * 63.0D);
      return t[var4 + var5 * 64];
   }

   public static ih a(float var0, float var1) {
      var1 *= var0;
      return var0 < 0.1F?k:(var1 < 0.2F?(var0 < 0.5F?k:(var0 < 0.95F?e:h)):(var1 > 0.5F && var0 < 0.7F?b:(var0 < 0.5F?g:(var0 < 0.97F?(var1 < 0.35F?f:d):(var1 < 0.45F?i:(var1 < 0.9F?c:a))))));
   }

   public Class[] a(jl var1) {
      return var1 == jl.a?this.r:(var1 == jl.b?this.s:null);
   }

   static {
      a();
   }
}
