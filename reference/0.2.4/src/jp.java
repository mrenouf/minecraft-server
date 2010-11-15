// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:21
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class jp {

   public static boolean a;
   public byte[] b;
   public boolean c;
   public em d;
   public ho e;
   public ho f;
   public ho g;
   public byte[] h;
   public int i;
   public final int j;
   public final int k;
   public Map l;
   public List[] m;
   public boolean n;
   public boolean o;
   public boolean p;
   public boolean q;
   public boolean r;
   public long s;


   public jp(em var1, int var2, int var3) {
      this.l = new HashMap();
      this.m = new List[8];
      this.n = false;
      this.o = false;
      this.q = false;
      this.r = false;
      this.s = 0L;
      this.d = var1;
      this.j = var2;
      this.k = var3;
      this.h = new byte[256];

      for(int var4 = 0; var4 < this.m.length; ++var4) {
         this.m[var4] = new ArrayList();
      }

   }

   public jp(em var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      this.b = var2;
      this.e = new ho(var2.length);
      this.f = new ho(var2.length);
      this.g = new ho(var2.length);
   }

   public boolean a(int var1, int var2) {
      return var1 == this.j && var2 == this.k;
   }

   public int b(int var1, int var2) {
      return this.h[var2 << 4 | var1] & 255;
   }

   public void a() {
   }

   public void b() {
      int var1 = 127;

      int var2;
      int var3;
      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.h[var3 << 4 | var2] = -128;
            this.g(var2, 127, var3);
            if((this.h[var3 << 4 | var2] & 255) < var1) {
               var1 = this.h[var3 << 4 | var2] & 255;
            }
         }
      }

      this.i = var1;

      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.c(var2, var3);
         }
      }

      this.o = true;
   }

   public void c() {
      byte var1 = 32;

      for(int var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            int var4 = var2 << 11 | var3 << 7;

            int var5;
            int var6;
            for(var5 = 0; var5 < 128; ++var5) {
               var6 = fy.s[this.b[var4 + var5]];
               if(var6 > 0) {
                  this.g.a(var2, var5, var3, var6);
               }
            }

            var5 = 15;

            for(var6 = var1 - 2; var6 < 128 && var5 > 0; this.g.a(var2, var6, var3, var5)) {
               ++var6;
               byte var7 = this.b[var4 + var6];
               int var8 = fy.q[var7];
               int var9 = fy.s[var7];
               if(var8 == 0) {
                  var8 = 1;
               }

               var5 -= var8;
               if(var9 > var5) {
                  var5 = var9;
               }

               if(var5 < 0) {
                  var5 = 0;
               }
            }
         }
      }

      this.d.a(dk.b, this.j * 16, var1 - 1, this.k * 16, this.j * 16 + 16, var1 + 1, this.k * 16 + 16);
      this.o = true;
   }

   private void c(int var1, int var2) {
      int var3 = this.b(var1, var2);
      int var4 = this.j * 16 + var1;
      int var5 = this.k * 16 + var2;
      this.f(var4 - 1, var5, var3);
      this.f(var4 + 1, var5, var3);
      this.f(var4, var5 - 1, var3);
      this.f(var4, var5 + 1, var3);
   }

   private void f(int var1, int var2, int var3) {
      int var4 = this.d.d(var1, var2);
      if(var4 > var3) {
         this.d.a(dk.a, var1, var3, var2, var1, var4, var2);
      } else if(var4 < var3) {
         this.d.a(dk.a, var1, var4, var2, var1, var3, var2);
      }

      this.o = true;
   }

   private void g(int var1, int var2, int var3) {
      int var4 = this.h[var3 << 4 | var1] & 255;
      int var5 = var4;
      if(var2 > var4) {
         var5 = var2;
      }

      for(int var6 = var1 << 11 | var3 << 7; var5 > 0 && fy.q[this.b[var6 + var5 - 1]] == 0; --var5) {
         ;
      }

      if(var5 != var4) {
         this.d.f(var1, var3, var5, var4);
         this.h[var3 << 4 | var1] = (byte)var5;
         int var7;
         int var8;
         int var9;
         if(var5 < this.i) {
            this.i = var5;
         } else {
            var7 = 127;

            for(var8 = 0; var8 < 16; ++var8) {
               for(var9 = 0; var9 < 16; ++var9) {
                  if((this.h[var9 << 4 | var8] & 255) < var7) {
                     var7 = this.h[var9 << 4 | var8] & 255;
                  }
               }
            }

            this.i = var7;
         }

         var7 = this.j * 16 + var1;
         var8 = this.k * 16 + var3;
         if(var5 < var4) {
            for(var9 = var5; var9 < var4; ++var9) {
               this.f.a(var1, var9, var3, 15);
            }
         } else {
            this.d.a(dk.a, var7, var4, var8, var7, var5, var8);

            for(var9 = var4; var9 < var5; ++var9) {
               this.f.a(var1, var9, var3, 0);
            }
         }

         var9 = 15;

         int var10;
         for(var10 = var5; var5 > 0 && var9 > 0; this.f.a(var1, var5, var3, var9)) {
            --var5;
            int var11 = fy.q[this.a(var1, var5, var3)];
            if(var11 == 0) {
               var11 = 1;
            }

            var9 -= var11;
            if(var9 < 0) {
               var9 = 0;
            }
         }

         while(var5 > 0 && fy.q[this.a(var1, var5 - 1, var3)] == 0) {
            --var5;
         }

         if(var5 != var10) {
            this.d.a(dk.a, var7 - 1, var5, var8 - 1, var7 + 1, var10, var8 + 1);
         }

         this.o = true;
      }
   }

   public int a(int var1, int var2, int var3) {
      return this.b[var1 << 11 | var3 << 7 | var2];
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = (byte)var4;
      int var7 = this.h[var3 << 4 | var1] & 255;
      int var8 = this.b[var1 << 11 | var3 << 7 | var2] & 255;
      if(var8 == var4 && this.e.a(var1, var2, var3) == var5) {
         return false;
      } else {
         int var9 = this.j * 16 + var1;
         int var10 = this.k * 16 + var3;
         this.b[var1 << 11 | var3 << 7 | var2] = var6;
         if(var8 != 0 && !this.d.z) {
            fy.m[var8].b(this.d, var9, var2, var10);
         }

         this.e.a(var1, var2, var3, var5);
         if(!this.d.q.e) {
            if(fy.q[var6] != 0) {
               if(var2 >= var7) {
                  this.g(var1, var2 + 1, var3);
               }
            } else if(var2 == var7 - 1) {
               this.g(var1, var2, var3);
            }

            this.d.a(dk.a, var9, var2, var10, var9, var2, var10);
         }

         this.d.a(dk.b, var9, var2, var10, var9, var2, var10);
         this.c(var1, var3);
         if(var4 != 0) {
            fy.m[var4].e(this.d, var9, var2, var10);
         }

         this.o = true;
         return true;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      byte var5 = (byte)var4;
      int var6 = this.h[var3 << 4 | var1] & 255;
      int var7 = this.b[var1 << 11 | var3 << 7 | var2] & 255;
      if(var7 == var4) {
         return false;
      } else {
         int var8 = this.j * 16 + var1;
         int var9 = this.k * 16 + var3;
         this.b[var1 << 11 | var3 << 7 | var2] = var5;
         if(var7 != 0) {
            fy.m[var7].b(this.d, var8, var2, var9);
         }

         this.e.a(var1, var2, var3, 0);
         if(fy.q[var5] != 0) {
            if(var2 >= var6) {
               this.g(var1, var2 + 1, var3);
            }
         } else if(var2 == var6 - 1) {
            this.g(var1, var2, var3);
         }

         this.d.a(dk.a, var8, var2, var9, var8, var2, var9);
         this.d.a(dk.b, var8, var2, var9, var8, var2, var9);
         this.c(var1, var3);
         if(var4 != 0 && !this.d.z) {
            fy.m[var4].e(this.d, var8, var2, var9);
         }

         this.o = true;
         return true;
      }
   }

   public int b(int var1, int var2, int var3) {
      return this.e.a(var1, var2, var3);
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.o = true;
      this.e.a(var1, var2, var3, var4);
   }

   public int a(dk var1, int var2, int var3, int var4) {
      return var1 == dk.a?this.f.a(var2, var3, var4):(var1 == dk.b?this.g.a(var2, var3, var4):0);
   }

   public void a(dk var1, int var2, int var3, int var4, int var5) {
      this.o = true;
      if(var1 == dk.a) {
         this.f.a(var2, var3, var4, var5);
      } else {
         if(var1 != dk.b) {
            return;
         }

         this.g.a(var2, var3, var4, var5);
      }

   }

   public int c(int var1, int var2, int var3, int var4) {
      int var5 = this.f.a(var1, var2, var3);
      if(var5 > 0) {
         a = true;
      }

      var5 -= var4;
      int var6 = this.g.a(var1, var2, var3);
      if(var6 > var5) {
         var5 = var6;
      }

      return var5;
   }

   public void a(dw var1) {
      if(!this.q) {
         this.r = true;
         int var2 = hd.b(var1.p / 16.0D);
         int var3 = hd.b(var1.r / 16.0D);
         if(var2 != this.j || var3 != this.k) {
            System.out.println("Wrong location! " + var1);
         }

         int var4 = hd.b(var1.q / 16.0D);
         if(var4 < 0) {
            var4 = 0;
         }

         if(var4 >= this.m.length) {
            var4 = this.m.length - 1;
         }

         var1.ae = true;
         var1.af = this.j;
         var1.ag = var4;
         var1.ah = this.k;
         this.m[var4].add(var1);
      }
   }

   public void b(dw var1) {
      this.a(var1, var1.ag);
   }

   public void a(dw var1, int var2) {
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 >= this.m.length) {
         var2 = this.m.length - 1;
      }

      this.m[var2].remove(var1);
   }

   public boolean c(int var1, int var2, int var3) {
      return var2 >= (this.h[var3 << 4 | var1] & 255);
   }

   public ay d(int var1, int var2, int var3) {
      hn var4 = new hn(var1, var2, var3);
      ay var5 = (ay)this.l.get(var4);
      if(var5 == null) {
         int var6 = this.a(var1, var2, var3);
         if(!fy.p[var6]) {
            return null;
         }

         de var7 = (de)fy.m[var6];
         var7.e(this.d, this.j * 16 + var1, var2, this.k * 16 + var3);
         var5 = (ay)this.l.get(var4);
      }

      return var5;
   }

   public void a(ay var1) {
      int var2 = var1.b - this.j * 16;
      int var3 = var1.c;
      int var4 = var1.d - this.k * 16;
      this.a(var2, var3, var4, var1);
   }

   public void a(int var1, int var2, int var3, ay var4) {
      hn var5 = new hn(var1, var2, var3);
      var4.a = this.d;
      var4.b = this.j * 16 + var1;
      var4.c = var2;
      var4.d = this.k * 16 + var3;
      if(this.a(var1, var2, var3) != 0 && fy.m[this.a(var1, var2, var3)] instanceof de) {
         if(this.c) {
            if(this.l.get(var5) != null) {
               this.d.c.remove(this.l.get(var5));
            }

            this.d.c.add(var4);
         }

         this.l.put(var5, var4);
      } else {
         System.out.println("Attempted to place a tile entity where there was no entity tile!");
      }
   }

   public void e(int var1, int var2, int var3) {
      hn var4 = new hn(var1, var2, var3);
      if(this.c) {
         this.d.c.remove(this.l.remove(var4));
      }

   }

   public void d() {
      this.c = true;
      this.d.c.addAll(this.l.values());

      for(int var1 = 0; var1 < this.m.length; ++var1) {
         this.d.a(this.m[var1]);
      }

   }

   public void e() {
      this.c = false;
      this.d.c.removeAll(this.l.values());

      for(int var1 = 0; var1 < this.m.length; ++var1) {
         this.d.b(this.m[var1]);
      }

   }

   public void f() {
      this.o = true;
   }

   public void a(dw var1, dt var2, List var3) {
      int var4 = hd.b((var2.b - 2.0D) / 16.0D);
      int var5 = hd.b((var2.e + 2.0D) / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var5 >= this.m.length) {
         var5 = this.m.length - 1;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.m[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            dw var9 = (dw)var7.get(var8);
            if(var9 != var1 && var9.z.a(var2)) {
               var3.add(var9);
            }
         }
      }

   }

   public void a(Class var1, dt var2, List var3) {
      int var4 = hd.b((var2.b - 2.0D) / 16.0D);
      int var5 = hd.b((var2.e + 2.0D) / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var5 >= this.m.length) {
         var5 = this.m.length - 1;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.m[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            dw var9 = (dw)var7.get(var8);
            if(var1.isAssignableFrom(var9.getClass()) && var9.z.a(var2)) {
               var3.add(var9);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      return this.p?false:(this.r && this.d.e != this.s?true:this.o);
   }

   public int a(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10;
      int var11;
      int var12;
      for(var9 = var2; var9 < var5; ++var9) {
         for(var10 = var4; var10 < var7; ++var10) {
            var11 = var9 << 11 | var10 << 7 | var3;
            var12 = var6 - var3;
            System.arraycopy(this.b, var11, var1, var8, var12);
            var8 += var12;
         }
      }

      for(var9 = var2; var9 < var5; ++var9) {
         for(var10 = var4; var10 < var7; ++var10) {
            var11 = (var9 << 11 | var10 << 7 | var3) >> 1;
            var12 = (var6 - var3) / 2;
            System.arraycopy(this.e.a, var11, var1, var8, var12);
            var8 += var12;
         }
      }

      for(var9 = var2; var9 < var5; ++var9) {
         for(var10 = var4; var10 < var7; ++var10) {
            var11 = (var9 << 11 | var10 << 7 | var3) >> 1;
            var12 = (var6 - var3) / 2;
            System.arraycopy(this.g.a, var11, var1, var8, var12);
            var8 += var12;
         }
      }

      for(var9 = var2; var9 < var5; ++var9) {
         for(var10 = var4; var10 < var7; ++var10) {
            var11 = (var9 << 11 | var10 << 7 | var3) >> 1;
            var12 = (var6 - var3) / 2;
            System.arraycopy(this.f.a, var11, var1, var8, var12);
            var8 += var12;
         }
      }

      return var8;
   }

   public Random a(long var1) {
      return new Random(this.d.u + (long)(this.j * this.j * 4987142) + (long)(this.j * 5947611) + (long)(this.k * this.k) * 4392871L + (long)(this.k * 389711) ^ var1);
   }
}
