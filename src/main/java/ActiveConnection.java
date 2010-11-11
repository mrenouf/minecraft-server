// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:39
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.logging.Logger;

public class ActiveConnection extends Connection implements et {

   public static Logger a = Logger.getLogger("Minecraft");
   public bf b;
   public boolean c = false;
   private MinecraftServer d;
   private eo e;
   private int f = 0;
   private double g;
   private double h;
   private double i;
   private boolean j = true;
   private hh k = null;


   public ActiveConnection(MinecraftServer var1, bf var2, eo var3) {
      this.d = var1;
      this.b = var2;
      var2.setConnection(this);
      this.e = var3;
      var3.a = this;
   }

   public void a() {
      this.b.a();
      if(this.f++ % 20 == 0) {
         this.b.a(new kc());
      }

   }

   public void c(String var1) {
      this.b.a(new jp(var1));
      this.b.c();
      this.d.f.c(this.e);
      this.c = true;
   }

   public void a(gx var1) {
      double var2;
      if(!this.j) {
         var2 = var1.b - this.h;
         if(var1.a == this.g && var2 * var2 < 0.01D && var1.c == this.i) {
            this.j = true;
         }
      }

      if(this.j) {
         this.g = this.e.p;
         this.h = this.e.q;
         this.i = this.e.r;
         var2 = this.e.p;
         double var4 = this.e.q;
         double var6 = this.e.r;
         float var8 = this.e.v;
         float var9 = this.e.w;
         double var10;
         if(var1.h) {
            var2 = var1.a;
            var4 = var1.b;
            var6 = var1.c;
            var10 = var1.d - var1.b;
            if(var10 > 1.65D || var10 < 0.1D) {
               this.c("Illegal stance");
               a.warning(this.e.ar + " had an illegal stance: " + var10);
            }

            this.e.aj = var1.d;
         }

         if(var1.i) {
            var8 = var1.e;
            var9 = var1.f;
         }

         this.e.k();
         this.e.Q = 0.0F;
         this.e.b(this.g, this.h, this.i, var8, var9);
         var10 = var2 - this.e.p;
         double var12 = var4 - this.e.q;
         double var14 = var6 - this.e.r;
         float var16 = 0.0625F;
         boolean var17 = this.d.e.a(this.e, this.e.z.b().e((double)var16, (double)var16, (double)var16)).size() == 0;
         this.e.c(var10, var12, var14);
         var10 = var2 - this.e.p;
         var12 = var4 - this.e.q;
         if(var12 > -0.5D || var12 < 0.5D) {
            var12 = 0.0D;
         }

         var14 = var6 - this.e.r;
         double var18 = var10 * var10 + var12 * var12 + var14 * var14;
         boolean var20 = false;
         if(var18 > 0.0625D) {
            var20 = true;
            a.warning(this.e.ar + " moved wrongly!");
         }

         this.e.b(var2, var4, var6, var8, var9);
         boolean var21 = this.d.e.a(this.e, this.e.z.b().e((double)var16, (double)var16, (double)var16)).size() == 0;
         if(var17 && (var20 || !var21)) {
            this.a(this.g, this.h, this.i, var8, var9);
            return;
         }

         this.e.A = var1.g;
         this.d.f.b(this.e);
      }

   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.j = false;
      this.g = var1;
      this.h = var3;
      this.i = var5;
      this.e.b(var1, var3, var5, var7, var8);
      this.e.a.b(new ec(var1, var3 + 1.6200000047683716D, var3, var5, var7, var8, false));
   }

   public void a(hx var1) {
      this.e.ak.a[this.e.ak.d] = this.k;
      boolean var2 = this.d.e.B = this.d.f.g(this.e.ar);
      boolean var3 = false;
      if(var1.e == 0) {
         var3 = true;
      }

      if(var1.e == 1) {
         var3 = true;
      }

      if(var3) {
         double var4 = this.e.q;
         this.e.q = this.e.aj;
         gk var6 = this.e.a(4.0D, 1.0F);
         this.e.q = var4;
         if(var6 == null) {
            return;
         }

         if(var6.b != var1.a || var6.c != var1.b || var6.d != var1.c || var6.e != var1.d) {
            return;
         }
      }

      int var18 = var1.a;
      int var5 = var1.b;
      int var19 = var1.c;
      int var7 = var1.d;
      int var8 = (int)hb.e((float)(var18 - this.d.e.m));
      int var9 = (int)hb.e((float)(var19 - this.d.e.o));
      if(var8 > var9) {
         var9 = var8;
      }

      if(var1.e == 0) {
         if(var9 > 16 || var2) {
            this.e.c.a(var18, var5, var19);
         }
      } else if(var1.e == 2) {
         this.e.c.a();
      } else if(var1.e == 1) {
         if(var9 > 16 || var2) {
            this.e.c.a(var18, var5, var19, var7);
         }
      } else if(var1.e == 3) {
         double var10 = this.e.p - ((double)var18 + 0.5D);
         double var12 = this.e.q - ((double)var5 + 0.5D);
         double var14 = this.e.r - ((double)var19 + 0.5D);
         double var16 = var10 * var10 + var12 * var12 + var14 * var14;
         if(var16 < 256.0D) {
            this.e.a.b(new fi(var18, var5, var19, this.d.e));
         }
      }

      this.d.e.B = false;
   }

   public void a(fv var1) {
      boolean var2 = this.d.e.B = this.d.f.g(this.e.ar);
      int var3 = var1.b;
      int var4 = var1.c;
      int var5 = var1.d;
      int var6 = var1.e;
      int var7 = (int)hb.e((float)(var3 - this.d.e.m));
      int var8 = (int)hb.e((float)(var5 - this.d.e.o));
      if(var7 > var8) {
         var8 = var7;
      }

      if(var8 > 16 || var2) {
         hh var9 = var1.a >= 0?new hh(var1.a):null;
         this.e.c.a(this.e, this.d.e, var9, var3, var4, var5, var6);
      }

      this.e.a.b(new fi(var3, var4, var5, this.d.e));
      this.d.e.B = false;
   }

   public void a(String var1) {
      a.info(this.e.ar + " lost connection: " + var1);
      this.d.f.c(this.e);
      this.c = true;
   }

   public void a(BaseObject var1) {
      a.warning(this.getClass() + " wasn\'t prepared to deal with a " + var1.getClass());
      this.c("Protocol error, unexpected packet");
   }

   public void b(BaseObject var1) {
      this.b.a(var1);
   }

   public void a(gn var1) {
      int var2 = var1.b;
      this.e.ak.d = this.e.ak.a.length - 1;
      if(var2 == 0) {
         this.k = null;
      } else {
         this.k = new hh(var2);
      }

      this.e.ak.a[this.e.ak.d] = this.k;
      this.d.k.a(this.e, new gn(this.e.g, var2));
   }

   public void a(k var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      gf var8 = new gf(this.d.e, var2, var4, var6, new hh(var1.h, var1.i));
      var8.s = (double)var1.e / 128.0D;
      var8.t = (double)var1.f / 128.0D;
      var8.u = (double)var1.g / 128.0D;
      var8.c = 10;
      this.d.e.a(var8);
   }

   public void a(be var1) {
      String var2 = var1.a;
      if(var2.length() > 100) {
         this.c("Chat message too long");
      } else {
         var2 = var2.trim();

         for(int var3 = 0; var3 < var2.length(); ++var3) {
            if(" !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\'abcdefghijklmnopqrstuvwxyz{|}~\u2302\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb".indexOf(var2.charAt(var3)) < 0) {
               this.c("Illegal characters in chat");
               return;
            }
         }

         if(var2.startsWith("/")) {
            this.d(var2);
         } else {
            var2 = "<" + this.e.ar + "> " + var2;
            a.info(var2);
            this.d.f.a(new be(var2));
         }

      }
   }

   private void d(String var1) {
      if(var1.toLowerCase().startsWith("/me ")) {
         var1 = "* " + this.e.ar + " " + var1.substring(var1.indexOf(" ")).trim();
         a.info(var1);
         this.d.f.a(new be(var1));
      } else if(var1.toLowerCase().startsWith("/tell ")) {
         String[] var2 = var1.split(" ");
         if(var2.length >= 3) {
            var1 = var1.substring(var1.indexOf(" ")).trim();
            var1 = var1.substring(var1.indexOf(" ")).trim();
            var1 = "\u00a77" + this.e.ar + " whispers " + var1;
            a.info(var1 + " to " + var2[1]);
            if(!this.d.f.a(var2[1], new be(var1))) {
               this.b(new be("\u00a7cThere\'s no player by that name online."));
            }
         }
      } else if(var1.toLowerCase().equalsIgnoreCase("/home")) {
         a.info(this.e.ar + " returned home");
         int var4 = this.d.e.e(this.d.e.m, this.d.e.o);
         this.a((double)this.d.e.m + 0.5D, (double)var4 + 1.5D, (double)this.d.e.o + 0.5D, 0.0F, 0.0F);
      } else {
         String var3;
         if(this.d.f.g(this.e.ar)) {
            var3 = var1.substring(1);
            a.info(this.e.ar + " issued server command: " + var3);
            this.d.a(var3, this);
         } else {
            var3 = var1.substring(1);
            a.info(this.e.ar + " tried command: " + var3);
         }
      }

   }

   public void a(p var1) {
      if(var1.b == 1) {
         this.e.E();
      }

   }

   public void a(jp var1) {
      this.b.a("Quitting");
   }

   public int b() {
      return this.b.d();
   }

   public void b(String var1) {
      this.b(new be("\u00a77" + var1));
   }

   public String c() {
      return this.e.ar;
   }

   public void a(s var1) {
      if(var1.a == -1) {
         this.e.ak.a = var1.b;
      }

      if(var1.a == -2) {
         this.e.ak.c = var1.b;
      }

      if(var1.a == -3) {
         this.e.ak.b = var1.b;
      }

   }

   public void d() {
      this.b.a(new s(-1, this.e.ak.a));
      this.b.a(new s(-2, this.e.ak.c));
      this.b.a(new s(-3, this.e.ak.b));
   }

   public void a(ja var1) {
      if(var1.e.d("x") == var1.a) {
         if(var1.e.d("y") == var1.b) {
            if(var1.e.d("z") == var1.c) {
               av var2 = this.d.e.k(var1.a, var1.b, var1.c);
               if(var2 != null) {
                  try {
                     var2.a(var1.e);
                  } catch (Exception var4) {
                     ;
                  }

                  var2.c();
               }

            }
         }
      }
   }

}
