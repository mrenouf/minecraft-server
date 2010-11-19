// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.List;

class aj {

   private List b;
   private int c;
   private int d;
   private kc e;
   private short[] f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;


   public aj(ic var1, int var2, int var3) {
      this.a = var1;
      super();
      this.b = new ArrayList();
      this.f = new short[10];
      this.g = 0;
      this.c = var2;
      this.d = var3;
      this.e = new kc(var2, var3);
      ic.a(var1).e.A.d(var2, var3);
   }

   public void a(ep var1) {
      if(this.b.contains(var1)) {
         throw new IllegalStateException("Failed to add player. " + var1 + " already is in chunk " + this.c + ", " + this.d);
      } else {
         var1.ai.add(this.e);
         var1.a.b(new dn(this.e.a, this.e.b, true));
         this.b.add(var1);
         var1.f.add(this.e);
      }
   }

   public void b(ep var1) {
      if(!this.b.contains(var1)) {
         (new IllegalStateException("Failed to remove player. " + var1 + " isn\'t in chunk " + this.c + ", " + this.d)).printStackTrace();
      } else {
         this.b.remove(var1);
         if(this.b.size() == 0) {
            long var2 = (long)this.c + 2147483647L | (long)this.d + 2147483647L << 32;
            ic.b(this.a).b(var2);
            if(this.g > 0) {
               ic.c(this.a).remove(this);
            }

            ic.a(this.a).e.A.c(this.c, this.d);
         }

         var1.f.remove(this.e);
         if(var1.ai.contains(this.e)) {
            var1.a.b(new dn(this.c, this.d, false));
         }

      }
   }

   public void a(int var1, int var2, int var3) {
      if(this.g == 0) {
         ic.c(this.a).add(this);
         this.h = this.i = var1;
         this.j = this.k = var2;
         this.l = this.m = var3;
      }

      if(this.h > var1) {
         this.h = var1;
      }

      if(this.i < var1) {
         this.i = var1;
      }

      if(this.j > var2) {
         this.j = var2;
      }

      if(this.k < var2) {
         this.k = var2;
      }

      if(this.l > var3) {
         this.l = var3;
      }

      if(this.m < var3) {
         this.m = var3;
      }

      if(this.g < 10) {
         short var4 = (short)(var1 << 12 | var3 << 8 | var2);

         for(int var5 = 0; var5 < this.g; ++var5) {
            if(this.f[var5] == var4) {
               return;
            }
         }

         this.f[this.g++] = var4;
      }

   }

   public void a(io var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         ep var3 = (ep)this.b.get(var2);
         if(var3.ai.contains(this.e)) {
            var3.a.b(var1);
         }
      }

   }

   public void a() {
      if(this.g != 0) {
         int var1;
         int var2;
         int var3;
         if(this.g == 1) {
            var1 = this.c * 16 + this.h;
            var2 = this.j;
            var3 = this.d * 16 + this.l;
            this.a(new fj(var1, var2, var3, ic.a(this.a).e));
            if(fy.p[ic.a(this.a).e.a(var1, var2, var3)]) {
               this.a(new jc(var1, var2, var3, ic.a(this.a).e.k(var1, var2, var3)));
            }
         } else {
            int var4;
            if(this.g == 10) {
               this.j = this.j / 2 * 2;
               this.k = (this.k / 2 + 1) * 2;
               var1 = this.h + this.c * 16;
               var2 = this.j;
               var3 = this.l + this.d * 16;
               var4 = this.i - this.h + 1;
               int var5 = this.k - this.j + 2;
               int var6 = this.m - this.l + 1;
               this.a(new dl(var1, var2, var3, var4, var5, var6, ic.a(this.a).e));
               List var7 = ic.a(this.a).e.d(var1, var2, var3, var1 + var4, var2 + var5, var3 + var6);

               for(int var8 = 0; var8 < var7.size(); ++var8) {
                  ay var9 = (ay)var7.get(var8);
                  this.a(new jc(var9.b, var9.c, var9.d, var9));
               }
            } else {
               this.a(new ie(this.c, this.d, this.f, this.g, ic.a(this.a).e));

               for(var1 = 0; var1 < this.g; ++var1) {
                  var2 = this.c * 16 + (this.g >> 12 & 15);
                  var3 = this.g & 255;
                  var4 = this.d * 16 + (this.g >> 8 & 15);
                  if(fy.p[ic.a(this.a).e.a(var2, var3, var4)]) {
                     this.a(new jc(var2, var3, var4, ic.a(this.a).e.k(var2, var3, var4)));
                  }
               }
            }
         }

         this.g = 0;
      }
   }
}
