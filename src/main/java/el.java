// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class el implements io {

   public boolean a = false;
   private List A = new ArrayList();
   public List b = new ArrayList();
   private List B = new ArrayList();
   private TreeSet C = new TreeSet();
   private Set D = new HashSet();
   public List c = new ArrayList();
   public List d = new ArrayList();
   public long e = 0L;
   private long E = 16777215L;
   public int f = 0;
   protected int g = (new Random()).nextInt();
   protected int h = 1013904223;
   public boolean i = false;
   private long F = System.currentTimeMillis();
   protected int j = 40;
   public int k;
   public Random l = new Random();
   public int m;
   public int n;
   public int o;
   public boolean p = false;
   public final ie q;
   protected List r = new ArrayList();
   private br G;
   public File s;
   public File t;
   public long u = 0L;
   private t H;
   public long v = 0L;
   public final String w;
   public boolean x;
   private ArrayList I = new ArrayList();
   private int J = 0;
   static int y = 0;
   private Set K = new HashSet();
   private int L;
   private List M;
   public boolean z;


   public is a() {
      return this.q.b;
   }

   public el(File var1, String var2, long var3, ie var5) {
      this.L = this.l.nextInt(12000);
      this.M = new ArrayList();
      this.z = false;
      this.s = var1;
      this.w = var2;
      var1.mkdirs();
      this.t = new File(var1, var2);
      this.t.mkdirs();

      try {
         File var6 = new File(this.t, "session.lock");
         DataOutputStream var7 = new DataOutputStream(new FileOutputStream(var6));

         try {
            var7.writeLong(this.F);
         } finally {
            var7.close();
         }
      } catch (IOException var16) {
         var16.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      Object var18 = new ie();
      File var19 = new File(this.t, "level.dat");
      this.p = !var19.exists();
      if(var19.exists()) {
         try {
            t var8 = am.a(new FileInputStream(var19));
            t var9 = var8.j("Data");
            this.u = var9.e("RandomSeed");
            this.m = var9.d("SpawnX");
            this.n = var9.d("SpawnY");
            this.o = var9.d("SpawnZ");
            this.e = var9.e("Time");
            this.v = var9.e("SizeOnDisk");
            if(var9.a("Player")) {
               this.H = var9.j("Player");
               int var10 = this.H.d("Dimension");
               if(var10 == -1) {
                  var18 = new hk();
               }
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      if(var5 != null) {
         var18 = var5;
      }

      boolean var17 = false;
      if(this.u == 0L) {
         this.u = var3;
         var17 = true;
      }

      this.q = (ie)var18;
      this.q.a(this);
      this.G = this.a(this.t);
      if(var17) {
         this.x = true;
         this.m = 0;
         this.n = 64;

         for(this.o = 0; !this.q.a(this.m, this.o); this.o += this.l.nextInt(64) - this.l.nextInt(64)) {
            this.m += this.l.nextInt(64) - this.l.nextInt(64);
         }

         this.x = false;
      }

      this.e();
   }

   protected br a(File var1) {
      return new iu(this, this.q.a(var1), this.q.c());
   }

   public int a(int var1, int var2) {
      int var3;
      for(var3 = 63; this.a(var1, var3 + 1, var2) != 0; ++var3) {
         ;
      }

      return this.a(var1, var3, var2);
   }

   public void a(boolean var1, iv var2) {
      if(this.G.b()) {
         if(var2 != null) {
            var2.a("Saving level");
         }

         this.i();
         if(var2 != null) {
            var2.b("Saving chunks");
         }

         this.G.a(var1, var2);
      }
   }

   private void i() {
      this.h();
      t var1 = new t();
      var1.a("RandomSeed", this.u);
      var1.a("SpawnX", this.m);
      var1.a("SpawnY", this.n);
      var1.a("SpawnZ", this.o);
      var1.a("Time", this.e);
      var1.a("SizeOnDisk", this.v);
      var1.a("LastPlayed", System.currentTimeMillis());
      ft var2 = null;
      if(this.d.size() > 0) {
         var2 = (ft)this.d.get(0);
      }

      t var3;
      if(var2 != null) {
         var3 = new t();
         var2.d(var3);
         var1.a("Player", var3);
      }

      var3 = new t();
      var3.a("Data", var1);

      try {
         File var4 = new File(this.t, "level.dat_new");
         File var5 = new File(this.t, "level.dat_old");
         File var6 = new File(this.t, "level.dat");
         am.a(var3, new FileOutputStream(var4));
         if(var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if(var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if(var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public int a(int var1, int var2, int var3) {
      return var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000?(var2 < 0?0:(var2 >= 128?0:this.c(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15))):0;
   }

   public boolean e(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128?this.f(var1 >> 4, var3 >> 4):false;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.f(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean f(int var1, int var2) {
      return this.G.a(var1, var2);
   }

   public jn b(int var1, int var2) {
      return this.c(var1 >> 4, var2 >> 4);
   }

   public jn c(int var1, int var2) {
      return this.G.b(var1, var2);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            jn var6 = this.c(var1 >> 4, var3 >> 4);
            return var6.a(var1 & 15, var2, var3 & 15, var4, var5);
         }
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            jn var5 = this.c(var1 >> 4, var3 >> 4);
            return var5.a(var1 & 15, var2, var3 & 15, var4);
         }
      } else {
         return false;
      }
   }

   public jr c(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?jr.a:fw.n[var4].bt;
   }

   public int b(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            return 0;
         } else {
            jn var4 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.b(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      if(this.c(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, this.a(var1, var2, var3));
      }

   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            jn var5 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            var5.b(var1, var2, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if(this.a(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if(this.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void f(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.r.size(); ++var4) {
         ((bj)this.r.get(var4)).a(var1, var2, var3);
      }

   }

   protected void e(int var1, int var2, int var3, int var4) {
      this.f(var1, var2, var3);
      this.g(var1, var2, var3, var4);
   }

   public void f(int var1, int var2, int var3, int var4) {
      if(var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.b(var1, var3, var2, var1, var4, var2);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.r.size(); ++var7) {
         ((bj)this.r.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void g(int var1, int var2, int var3, int var4) {
      this.k(var1 - 1, var2, var3, var4);
      this.k(var1 + 1, var2, var3, var4);
      this.k(var1, var2 - 1, var3, var4);
      this.k(var1, var2 + 1, var3, var4);
      this.k(var1, var2, var3 - 1, var4);
      this.k(var1, var2, var3 + 1, var4);
   }

   private void k(int var1, int var2, int var3, int var4) {
      if(!this.i && !this.z) {
         fw var5 = fw.n[this.a(var1, var2, var3)];
         if(var5 != null) {
            var5.b(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean g(int var1, int var2, int var3) {
      return this.c(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15);
   }

   public int h(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         int var5;
         if(var4) {
            var5 = this.a(var1, var2, var3);
            if(var5 == fw.al.bi || var5 == fw.aB.bi) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            var5 = 15 - this.f;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            jn var11 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.c(var1, var2, var3, this.f);
         }
      } else {
         return 15;
      }
   }

   public boolean i(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return true;
         } else if(!this.f(var1 >> 4, var3 >> 4)) {
            return false;
         } else {
            jn var4 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.c(var1, var2, var3);
         }
      } else {
         return false;
      }
   }

   public int d(int var1, int var2) {
      if(var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if(!this.f(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            jn var3 = this.c(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public void a(dj var1, int var2, int var3, int var4, int var5) {
      if(!this.q.c || var1 != dj.a) {
         if(this.e(var2, var3, var4)) {
            if(var1 == dj.a) {
               if(this.i(var2, var3, var4)) {
                  var5 = 15;
               }
            } else if(var1 == dj.b) {
               int var6 = this.a(var2, var3, var4);
               if(fw.t[var6] > var5) {
                  var5 = fw.t[var6];
               }
            }

            if(this.a(var1, var2, var3, var4) != var5) {
               this.a(var1, var2, var3, var4, var2, var3, var4);
            }

         }
      }
   }

   public int a(dj var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.f(var5, var6)) {
            return 0;
         } else {
            jn var7 = this.c(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void b(dj var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         if(var3 >= 0) {
            if(var3 < 128) {
               if(this.f(var2 >> 4, var4 >> 4)) {
                  jn var6 = this.c(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.r.size(); ++var7) {
                     ((bj)this.r.get(var7)).a(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public float j(int var1, int var2, int var3) {
      return this.q.d[this.h(var1, var2, var3)];
   }

   public boolean b() {
      return this.f < 4;
   }

   public gk a(ba var1, ba var2) {
      return this.a(var1, var2, false);
   }

   public gk a(ba var1, ba var2, boolean var3) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var4 = hb.b(var2.a);
            int var5 = hb.b(var2.b);
            int var6 = hb.b(var2.c);
            int var7 = hb.b(var1.a);
            int var8 = hb.b(var1.b);
            int var9 = hb.b(var1.c);
            int var10 = 200;

            while(var10-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var7 == var4 && var8 == var5 && var9 == var6) {
                  return null;
               }

               double var11 = 999.0D;
               double var13 = 999.0D;
               double var15 = 999.0D;
               if(var4 > var7) {
                  var11 = (double)var7 + 1.0D;
               }

               if(var4 < var7) {
                  var11 = (double)var7 + 0.0D;
               }

               if(var5 > var8) {
                  var13 = (double)var8 + 1.0D;
               }

               if(var5 < var8) {
                  var13 = (double)var8 + 0.0D;
               }

               if(var6 > var9) {
                  var15 = (double)var9 + 1.0D;
               }

               if(var6 < var9) {
                  var15 = (double)var9 + 0.0D;
               }

               double var17 = 999.0D;
               double var19 = 999.0D;
               double var21 = 999.0D;
               double var23 = var2.a - var1.a;
               double var25 = var2.b - var1.b;
               double var27 = var2.c - var1.c;
               if(var11 != 999.0D) {
                  var17 = (var11 - var1.a) / var23;
               }

               if(var13 != 999.0D) {
                  var19 = (var13 - var1.b) / var25;
               }

               if(var15 != 999.0D) {
                  var21 = (var15 - var1.c) / var27;
               }

               boolean var29 = false;
               byte var35;
               if(var17 < var19 && var17 < var21) {
                  if(var4 > var7) {
                     var35 = 4;
                  } else {
                     var35 = 5;
                  }

                  var1.a = var11;
                  var1.b += var25 * var17;
                  var1.c += var27 * var17;
               } else if(var19 < var21) {
                  if(var5 > var8) {
                     var35 = 0;
                  } else {
                     var35 = 1;
                  }

                  var1.a += var23 * var19;
                  var1.b = var13;
                  var1.c += var27 * var19;
               } else {
                  if(var6 > var9) {
                     var35 = 2;
                  } else {
                     var35 = 3;
                  }

                  var1.a += var23 * var21;
                  var1.b += var25 * var21;
                  var1.c = var15;
               }

               ba var30 = ba.b(var1.a, var1.b, var1.c);
               var7 = (int)(var30.a = (double)hb.b(var1.a));
               if(var35 == 5) {
                  --var7;
                  ++var30.a;
               }

               var8 = (int)(var30.b = (double)hb.b(var1.b));
               if(var35 == 1) {
                  --var8;
                  ++var30.b;
               }

               var9 = (int)(var30.c = (double)hb.b(var1.c));
               if(var35 == 3) {
                  --var9;
                  ++var30.c;
               }

               int var31 = this.a(var7, var8, var9);
               int var32 = this.b(var7, var8, var9);
               fw var33 = fw.n[var31];
               if(var31 > 0 && var33.a(var32, var3)) {
                  gk var34 = var33.a(this, var7, var8, var9, var1, var2);
                  if(var34 != null) {
                     return var34;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(dv var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((bj)this.r.get(var5)).a(var2, var1.p, var1.q - (double)var1.G, var1.r, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.r.size(); ++var10) {
         ((bj)this.r.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((bj)this.r.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.r.size(); ++var14) {
         ((bj)this.r.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean a(dv var1) {
      int var2 = hb.b(var1.p / 16.0D);
      int var3 = hb.b(var1.r / 16.0D);
      boolean var4 = false;
      if(var1 instanceof ft) {
         var4 = true;
      }

      if(!var4 && !this.f(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof ft) {
            this.d.add((ft)var1);
            System.out.println("Player count: " + this.d.size());
         }

         this.c(var2, var3).a(var1);
         this.b.add(var1);
         this.b(var1);
         return true;
      }
   }

   protected void b(dv var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((bj)this.r.get(var2)).a(var1);
      }

   }

   protected void c(dv var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((bj)this.r.get(var2)).b(var1);
      }

   }

   public void d(dv var1) {
      var1.l();
      if(var1 instanceof ft) {
         this.d.remove((ft)var1);
         System.out.println("Player count: " + this.d.size());
      }

   }

   public void a(bj var1) {
      this.r.add(var1);
   }

   public List a(dv var1, ds var2) {
      this.I.clear();
      int var3 = hb.b(var2.a);
      int var4 = hb.b(var2.d + 1.0D);
      int var5 = hb.b(var2.b);
      int var6 = hb.b(var2.e + 1.0D);
      int var7 = hb.b(var2.c);
      int var8 = hb.b(var2.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.e(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  fw var12 = fw.n[this.a(var9, var11, var10)];
                  if(var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.I);
                  }
               }
            }
         }
      }

      double var14 = 0.25D;
      List var16 = this.b(var1, var2.b(var14, var14, var14));

      for(int var15 = 0; var15 < var16.size(); ++var15) {
         ds var13 = ((dv)var16.get(var15)).q();
         if(var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }

         var13 = var1.d((dv)var16.get(var15));
         if(var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }
      }

      return this.I;
   }

   public int a(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (hb.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return (int)(var3 * 11.0F);
   }

   public float b(float var1) {
      return this.q.a(this.e, var1);
   }

   public int e(int var1, int var2) {
      jn var3 = this.b(var1, var2);

      int var4;
      for(var4 = 127; this.c(var1, var4, var2).c() && var4 > 0; --var4) {
         ;
      }

      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.a(var1, var4, var2);
         if(var5 != 0 && (fw.n[var5].bt.c() || fw.n[var5].bt.d())) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public void h(int var1, int var2, int var3, int var4) {
      ci var5 = new ci(var1, var2, var3, var4);
      byte var6 = 8;
      if(this.a) {
         if(this.a(var5.a - var6, var5.b - var6, var5.c - var6, var5.a + var6, var5.b + var6, var5.c + var6)) {
            int var7 = this.a(var5.a, var5.b, var5.c);
            if(var7 == var5.d && var7 > 0) {
               fw.n[var7].a(this, var5.a, var5.b, var5.c, this.l);
            }
         }

      } else {
         if(this.a(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
            if(var4 > 0) {
               var5.a((long)fw.n[var4].b() + this.e);
            }

            if(!this.D.contains(var5)) {
               this.D.add(var5);
               this.C.add(var5);
            }
         }

      }
   }

   public void c() {
      this.b.removeAll(this.B);

      int var1;
      dv var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.B.size(); ++var1) {
         var2 = (dv)this.B.get(var1);
         var3 = var2.af;
         var4 = var2.ah;
         if(var2.ae && this.f(var3, var4)) {
            this.c(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.B.size(); ++var1) {
         this.c((dv)this.B.get(var1));
      }

      this.B.clear();

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         var2 = (dv)this.b.get(var1);
         if(var2.k != null) {
            if(!var2.k.F && var2.k.j == var2) {
               continue;
            }

            var2.k.j = null;
            var2.k = null;
         }

         if(!var2.F) {
            this.e(var2);
         }

         if(var2.F) {
            var3 = var2.af;
            var4 = var2.ah;
            if(var2.ae && this.f(var3, var4)) {
               this.c(var3, var4).b(var2);
            }

            this.b.remove(var1--);
            this.c(var2);
         }
      }

      for(var1 = 0; var1 < this.c.size(); ++var1) {
         av var5 = (av)this.c.get(var1);
         var5.b();
      }

   }

   public void e(dv var1) {
      this.a(var1, true);
   }

   public void a(dv var1, boolean var2) {
      int var3 = hb.b(var1.p);
      int var4 = hb.b(var1.r);
      byte var5 = 16;
      if(var2 || this.a(var3 - var5, 0, var4 - var5, var3 + var5, 128, var4 + var5)) {
         var1.N = var1.p;
         var1.O = var1.q;
         var1.P = var1.r;
         var1.x = var1.v;
         var1.y = var1.w;
         if(var2 && var1.ae) {
            if(var1.k != null) {
               var1.y();
            } else {
               var1.b_();
            }
         }

         int var6 = hb.b(var1.p / 16.0D);
         int var7 = hb.b(var1.q / 16.0D);
         int var8 = hb.b(var1.r / 16.0D);
         if(!var1.ae || var1.af != var6 || var1.ag != var7 || var1.ah != var8) {
            if(var1.ae && this.f(var1.af, var1.ah)) {
               this.c(var1.af, var1.ah).a(var1, var1.ag);
            }

            if(this.f(var6, var8)) {
               var1.ae = true;
               this.c(var6, var8).a(var1);
            } else {
               var1.ae = false;
            }
         }

         if(var2 && var1.ae && var1.j != null) {
            if(!var1.j.F && var1.j.k == var1) {
               this.e(var1.j);
            } else {
               var1.j.k = null;
               var1.j = null;
            }
         }

         if(Double.isNaN(var1.p) || Double.isInfinite(var1.p)) {
            var1.p = var1.N;
         }

         if(Double.isNaN(var1.q) || Double.isInfinite(var1.q)) {
            var1.q = var1.O;
         }

         if(Double.isNaN(var1.r) || Double.isInfinite(var1.r)) {
            var1.r = var1.P;
         }

         if(Double.isNaN((double)var1.w) || Double.isInfinite((double)var1.w)) {
            var1.w = var1.y;
         }

         if(Double.isNaN((double)var1.v) || Double.isInfinite((double)var1.v)) {
            var1.v = var1.x;
         }

      }
   }

   public boolean a(ds var1) {
      List var2 = this.b((dv)null, var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         dv var4 = (dv)var2.get(var3);
         if(!var4.F && var4.i) {
            return false;
         }
      }

      return true;
   }

   public boolean b(ds var1) {
      int var2 = hb.b(var1.a);
      int var3 = hb.b(var1.d + 1.0D);
      int var4 = hb.b(var1.b);
      int var5 = hb.b(var1.e + 1.0D);
      int var6 = hb.b(var1.c);
      int var7 = hb.b(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               fw var11 = fw.n[this.a(var8, var9, var10)];
               if(var11 != null && var11.bt.d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(ds var1) {
      int var2 = hb.b(var1.a);
      int var3 = hb.b(var1.d + 1.0D);
      int var4 = hb.b(var1.b);
      int var5 = hb.b(var1.e + 1.0D);
      int var6 = hb.b(var1.c);
      int var7 = hb.b(var1.f + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               int var11 = this.a(var8, var9, var10);
               if(var11 == fw.as.bi || var11 == fw.D.bi || var11 == fw.E.bi) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(ds var1, jr var2, dv var3) {
      int var4 = hb.b(var1.a);
      int var5 = hb.b(var1.d + 1.0D);
      int var6 = hb.b(var1.b);
      int var7 = hb.b(var1.e + 1.0D);
      int var8 = hb.b(var1.c);
      int var9 = hb.b(var1.f + 1.0D);
      boolean var10 = false;
      ba var11 = ba.b(0.0D, 0.0D, 0.0D);

      for(int var12 = var4; var12 < var5; ++var12) {
         for(int var13 = var6; var13 < var7; ++var13) {
            for(int var14 = var8; var14 < var9; ++var14) {
               fw var15 = fw.n[this.a(var12, var13, var14)];
               if(var15 != null && var15.bt == var2) {
                  double var16 = (double)((float)(var13 + 1) - cx.b(this.b(var12, var13, var14)));
                  if((double)var7 >= var16) {
                     var10 = true;
                     var15.a(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if(var11.c() > 0.0D) {
         var11 = var11.b();
         double var18 = 0.0040D;
         var3.s += var11.a * var18;
         var3.t += var11.b * var18;
         var3.u += var11.c * var18;
      }

      return var10;
   }

   public boolean a(ds var1, jr var2) {
      int var3 = hb.b(var1.a);
      int var4 = hb.b(var1.d + 1.0D);
      int var5 = hb.b(var1.b);
      int var6 = hb.b(var1.e + 1.0D);
      int var7 = hb.b(var1.c);
      int var8 = hb.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               fw var12 = fw.n[this.a(var9, var10, var11)];
               if(var12 != null && var12.bt == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(ds var1, jr var2) {
      int var3 = hb.b(var1.a);
      int var4 = hb.b(var1.d + 1.0D);
      int var5 = hb.b(var1.b);
      int var6 = hb.b(var1.e + 1.0D);
      int var7 = hb.b(var1.c);
      int var8 = hb.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               fw var12 = fw.n[this.a(var9, var10, var11)];
               if(var12 != null && var12.bt == var2) {
                  int var13 = this.b(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public void a(dv var1, double var2, double var4, double var6, float var8) {
      (new cg()).a(this, var1, var2, var4, var6, var8);
   }

   public float a(ba var1, ds var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * (double)var11;
               double var16 = var2.b + (var2.e - var2.b) * (double)var12;
               double var18 = var2.c + (var2.f - var2.c) * (double)var13;
               if(this.a(ba.b(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public av k(int var1, int var2, int var3) {
      jn var4 = this.c(var1 >> 4, var3 >> 4);
      return var4 != null?var4.d(var1 & 15, var2, var3 & 15):null;
   }

   public void a(int var1, int var2, int var3, av var4) {
      jn var5 = this.c(var1 >> 4, var3 >> 4);
      if(var5 != null) {
         var5.a(var1 & 15, var2, var3 & 15, var4);
      }

   }

   public void l(int var1, int var2, int var3) {
      jn var4 = this.c(var1 >> 4, var3 >> 4);
      if(var4 != null) {
         var4.e(var1 & 15, var2, var3 & 15);
      }

   }

   public boolean d(int var1, int var2, int var3) {
      fw var4 = fw.n[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }

   public boolean d() {
      if(this.J >= 10) {
         return false;
      } else {
         ++this.J;

         boolean var2;
         try {
            int var1 = 100;

            while(this.A.size() > 0) {
               --var1;
               if(var1 <= 0) {
                  var2 = true;
                  return var2;
               }

               ((eb)this.A.remove(this.A.size() - 1)).a(this);
            }

            var2 = false;
         } finally {
            --this.J;
         }

         return var2;
      }
   }

   public void a(dj var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void a(dj var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      if(!this.q.c || var1 != dj.a) {
         ++y;
         if(y == 50) {
            --y;
         } else {
            int var9 = (var5 + var2) / 2;
            int var10 = (var7 + var4) / 2;
            if(!this.e(var9, 64, var10)) {
               --y;
            } else {
               int var11 = this.A.size();
               if(var8) {
                  int var12 = 4;
                  if(var12 > var11) {
                     var12 = var11;
                  }

                  for(int var13 = 0; var13 < var12; ++var13) {
                     eb var14 = (eb)this.A.get(this.A.size() - var13 - 1);
                     if(var14.a == var1 && var14.a(var2, var3, var4, var5, var6, var7)) {
                        --y;
                        return;
                     }
                  }
               }

               this.A.add(new eb(var1, var2, var3, var4, var5, var6, var7));
               if(this.A.size() > 100000) {
                  this.A.clear();
               }

               --y;
            }
         }
      }
   }

   public void e() {
      int var1 = this.a(1.0F);
      if(var1 != this.f) {
         this.f = var1;
      }

   }

   public void f() {
      bt.a(this);
      this.G.a();
      int var1 = this.a(1.0F);
      if(var1 != this.f) {
         this.f = var1;

         for(int var2 = 0; var2 < this.r.size(); ++var2) {
            ((bj)this.r.get(var2)).a();
         }
      }

      ++this.e;
      if(this.e % (long)this.j == 0L) {
         this.a(false, (iv)null);
      }

      this.a(false);
      this.g();
   }

   protected void g() {
      this.K.clear();

      int var3;
      int var4;
      int var6;
      int var7;
      for(int var1 = 0; var1 < this.d.size(); ++var1) {
         ft var2 = (ft)this.d.get(var1);
         var3 = hb.b(var2.p / 16.0D);
         var4 = hb.b(var2.r / 16.0D);
         byte var5 = 9;

         for(var6 = -var5; var6 <= var5; ++var6) {
            for(var7 = -var5; var7 <= var5; ++var7) {
               this.K.add(new ka(var6 + var3, var7 + var4));
            }
         }
      }

      if(this.L > 0) {
         --this.L;
      }

      Iterator var12 = this.K.iterator();

      while(var12.hasNext()) {
         ka var13 = (ka)var12.next();
         var3 = var13.a * 16;
         var4 = var13.b * 16;
         jn var15 = this.c(var13.a, var13.b);
         int var8;
         int var9;
         int var10;
         if(this.L == 0) {
            this.g = this.g * 3 + this.h;
            var6 = this.g >> 2;
            var7 = var6 & 15;
            var8 = var6 >> 8 & 15;
            var9 = var6 >> 16 & 127;
            var10 = var15.a(var7, var9, var8);
            var7 += var3;
            var8 += var4;
            if(var10 == 0 && this.h(var7, var9, var8) <= this.l.nextInt(8) && this.a(dj.a, var7, var9, var8) <= 0) {
               ft var11 = this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, 8.0D);
               if(var11 != null && var11.d((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D) > 4.0D) {
                  this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.l.nextFloat() * 0.2F);
                  this.L = this.l.nextInt(12000) + 6000;
               }
            }
         }

         for(var6 = 0; var6 < 80; ++var6) {
            this.g = this.g * 3 + this.h;
            var7 = this.g >> 2;
            var8 = var7 & 15;
            var9 = var7 >> 8 & 15;
            var10 = var7 >> 16 & 127;
            byte var14 = var15.b[var8 << 11 | var9 << 7 | var10];
            if(fw.o[var14]) {
               fw.n[var14].a(this, var8 + var3, var10, var9 + var4, this.l);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      int var2 = this.C.size();
      if(var2 != this.D.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            ci var4 = (ci)this.C.first();
            if(!var1 && var4.e > this.e) {
               break;
            }

            this.C.remove(var4);
            this.D.remove(var4);
            byte var5 = 8;
            if(this.a(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               int var6 = this.a(var4.a, var4.b, var4.c);
               if(var6 == var4.d && var6 > 0) {
                  fw.n[var6].a(this, var4.a, var4.b, var4.c, this.l);
               }
            }
         }

         return this.C.size() != 0;
      }
   }

   public List b(dv var1, ds var2) {
      this.M.clear();
      int var3 = hb.b((var2.a - 2.0D) / 16.0D);
      int var4 = hb.b((var2.d + 2.0D) / 16.0D);
      int var5 = hb.b((var2.c - 2.0D) / 16.0D);
      int var6 = hb.b((var2.f + 2.0D) / 16.0D);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if(this.f(var7, var8)) {
               this.c(var7, var8).a(var1, var2, this.M);
            }
         }
      }

      return this.M;
   }

   public List a(Class var1, ds var2) {
      int var3 = hb.b((var2.a - 2.0D) / 16.0D);
      int var4 = hb.b((var2.d + 2.0D) / 16.0D);
      int var5 = hb.b((var2.c - 2.0D) / 16.0D);
      int var6 = hb.b((var2.f + 2.0D) / 16.0D);
      ArrayList var7 = new ArrayList();

      for(int var8 = var3; var8 <= var4; ++var8) {
         for(int var9 = var5; var9 <= var6; ++var9) {
            if(this.f(var8, var9)) {
               this.c(var8, var9).a(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public void b(int var1, int var2, int var3, av var4) {
      if(this.e(var1, var2, var3)) {
         this.b(var1, var3).f();
      }

      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((bj)this.r.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int a(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         dv var4 = (dv)this.b.get(var3);
         if(var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.b.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.b((dv)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.B.addAll(var1);
   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a(var2, var3, var4);
      fw var7 = fw.n[var6];
      fw var8 = fw.n[var1];
      ds var9 = var8.d(this, var2, var3, var4);
      if(var5) {
         var9 = null;
      }

      return var9 != null && !this.a(var9)?false:(var7 != fw.B && var7 != fw.C && var7 != fw.D && var7 != fw.E && var7 != fw.as && var7 != fw.aT?var1 > 0 && var7 == null && var8.a(this, var2, var3, var4):true);
   }

   public co a(dv var1, dv var2, float var3) {
      int var4 = hb.b(var1.p);
      int var5 = hb.b(var1.q);
      int var6 = hb.b(var1.r);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      ed var14 = new ed(this, var8, var9, var10, var11, var12, var13);
      return (new fd(var14)).a(var1, var2, var3);
   }

   public co a(dv var1, int var2, int var3, int var4, float var5) {
      int var6 = hb.b(var1.p);
      int var7 = hb.b(var1.q);
      int var8 = hb.b(var1.r);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      ed var16 = new ed(this, var10, var11, var12, var13, var14, var15);
      return (new fd(var16)).a(var1, var2, var3, var4, var5);
   }

   public boolean i(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0?false:fw.n[var5].d(this, var1, var2, var3, var4);
   }

   public boolean m(int var1, int var2, int var3) {
      return this.i(var1, var2 - 1, var3, 0)?true:(this.i(var1, var2 + 1, var3, 1)?true:(this.i(var1, var2, var3 - 1, 2)?true:(this.i(var1, var2, var3 + 1, 3)?true:(this.i(var1 - 1, var2, var3, 4)?true:this.i(var1 + 1, var2, var3, 5)))));
   }

   public boolean j(int var1, int var2, int var3, int var4) {
      if(this.d(var1, var2, var3)) {
         return this.m(var1, var2, var3);
      } else {
         int var5 = this.a(var1, var2, var3);
         return var5 == 0?false:fw.n[var5].b((io)this, var1, var2, var3, var4);
      }
   }

   public boolean n(int var1, int var2, int var3) {
      return this.j(var1, var2 - 1, var3, 0)?true:(this.j(var1, var2 + 1, var3, 1)?true:(this.j(var1, var2, var3 - 1, 2)?true:(this.j(var1, var2, var3 + 1, 3)?true:(this.j(var1 - 1, var2, var3, 4)?true:this.j(var1 + 1, var2, var3, 5)))));
   }

   public ft a(dv var1, double var2) {
      return this.a(var1.p, var1.q, var1.r, var2);
   }

   public ft a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      ft var11 = null;

      for(int var12 = 0; var12 < this.d.size(); ++var12) {
         ft var13 = (ft)this.d.get(var12);
         double var14 = var13.d(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public byte[] c(int var1, int var2, int var3, int var4, int var5, int var6) {
      byte[] var7 = new byte[var4 * var5 * var6 * 5 / 2];
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if(var2 < 0) {
         var13 = 0;
      }

      if(var14 > 128) {
         var14 = 128;
      }

      for(int var15 = var8; var15 <= var10; ++var15) {
         int var16 = var1 - var15 * 16;
         int var17 = var1 + var4 - var15 * 16;
         if(var16 < 0) {
            var16 = 0;
         }

         if(var17 > 16) {
            var17 = 16;
         }

         for(int var18 = var9; var18 <= var11; ++var18) {
            int var19 = var3 - var18 * 16;
            int var20 = var3 + var6 - var18 * 16;
            if(var19 < 0) {
               var19 = 0;
            }

            if(var20 > 16) {
               var20 = 16;
            }

            var12 = this.c(var15, var18).a(var7, var16, var13, var19, var17, var14, var20, var12);
         }
      }

      return var7;
   }

   public void h() {
      try {
         File var1 = new File(this.t, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if(var2.readLong() != this.F) {
               throw new fu("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new fu("Failed to check session lock, aborting");
      }
   }

}
