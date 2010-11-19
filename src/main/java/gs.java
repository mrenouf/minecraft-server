// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:45
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gs {

   public dw a;
   public boolean b = false;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public double j;
   public double k;
   public double l;
   public int m = 0;
   private double p;
   private double q;
   private double r;
   private boolean s = false;
   private boolean t;
   public boolean n = false;
   public Set o = new HashSet();


   public gs(dw var1, int var2, int var3, boolean var4) {
      this.a = var1;
      this.c = var2;
      this.d = var3;
      this.t = var4;
      this.e = hd.b(var1.p * 32.0D);
      this.f = hd.b(var1.q * 32.0D);
      this.g = hd.b(var1.r * 32.0D);
      this.h = hd.d(var1.v * 256.0F / 360.0F);
      this.i = hd.d(var1.w * 256.0F / 360.0F);
   }

   public boolean equals(Object var1) {
      return var1 instanceof gs?((gs)var1).a.g == this.a.g:false;
   }

   public int hashCode() {
      return this.a.g;
   }

   public void a(List var1) {
      this.n = false;
      if(!this.s || this.a.d(this.p, this.q, this.r) > 16.0D) {
         this.b(var1);
         this.p = this.a.p;
         this.q = this.a.q;
         this.r = this.a.r;
         this.s = true;
         this.n = true;
      }

      if(this.m++ % this.d == 0) {
         int var2 = hd.b(this.a.p * 32.0D);
         int var3 = hd.b(this.a.q * 32.0D);
         int var4 = hd.b(this.a.r * 32.0D);
         int var5 = hd.d(this.a.v * 256.0F / 360.0F);
         int var6 = hd.d(this.a.w * 256.0F / 360.0F);
         boolean var7 = var2 != this.e || var3 != this.f || var4 != this.g;
         boolean var8 = var5 != this.h || var6 != this.i;
         int var9 = var2 - this.e;
         int var10 = var3 - this.f;
         int var11 = var4 - this.g;
         Object var12 = null;
         if(var9 >= -128 && var9 < 128 && var10 >= -128 && var10 < 128 && var11 >= -128 && var11 < 128) {
            if(var7 && var8) {
               var12 = new bp(this.a.g, (byte)var9, (byte)var10, (byte)var11, (byte)var5, (byte)var6);
            } else if(var7) {
               var12 = new ef(this.a.g, (byte)var9, (byte)var10, (byte)var11);
            } else if(var8) {
               var12 = new dj(this.a.g, (byte)var5, (byte)var6);
            } else {
               var12 = new fp(this.a.g);
            }
         } else {
            var12 = new cr(this.a.g, var2, var3, var4, (byte)var5, (byte)var6);
         }

         if(this.t) {
            double var13 = this.a.s - this.j;
            double var15 = this.a.t - this.k;
            double var17 = this.a.u - this.l;
            double var19 = 0.02D;
            double var21 = var13 * var13 + var15 * var15 + var17 * var17;
            if(var21 > var19 * var19 || var21 > 0.0D && this.a.s == 0.0D && this.a.t == 0.0D && this.a.u == 0.0D) {
               this.j = this.a.s;
               this.k = this.a.t;
               this.l = this.a.u;
               this.a(new fq(this.a.g, this.j, this.k, this.l));
            }
         }

         if(var12 != null) {
            this.a((io)var12);
         }

         if(this.b && this.a.k == null) {
            this.b = false;
            this.a(new q(this.a, 3));
         } else if(!this.b && this.a.k != null) {
            this.b = true;
            this.a(new q(this.a, 2));
         }

         this.e = var2;
         this.f = var3;
         this.g = var4;
         this.h = var5;
         this.i = var6;
      }

   }

   public void a(io var1) {
      Iterator var2 = this.o.iterator();

      while(var2.hasNext()) {
         ep var3 = (ep)var2.next();
         var3.a.b(var1);
      }

   }

   public void a() {
      this.a(new df(this.a.g));
   }

   public void a(ep var1) {
      if(var1 != this.a) {
         double var2 = var1.p - (double)(this.e / 32);
         double var4 = var1.r - (double)(this.g / 32);
         if(var2 >= (double)(-this.c) && var2 <= (double)this.c && var4 >= (double)(-this.c) && var4 <= (double)this.c) {
            if(!this.o.contains(var1)) {
               this.o.add(var1);
               var1.a.b(this.b());
               if(this.b) {
                  var1.a.b(new q(this.a, 2));
               }

               if(this.t) {
                  var1.a.b(new fq(this.a.g, this.a.s, this.a.t, this.a.u));
               }
            }
         } else if(this.o.contains(var1)) {
            this.o.remove(var1);
            var1.a.b(new df(this.a.g));
         }

      }
   }

   public void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.a((ep)var1.get(var2));
      }

   }

   private io b() {
      if(this.a instanceof gh) {
         gh var3 = (gh)this.a;
         l var2 = new l(var3);
         var3.p = (double)var2.b / 32.0D;
         var3.q = (double)var2.c / 32.0D;
         var3.r = (double)var2.d / 32.0D;
         return var2;
      } else if(this.a instanceof ep) {
         return new d((fv)this.a);
      } else {
         if(this.a instanceof jj) {
            jj var1 = (jj)this.a;
            if(var1.d == 0) {
               return new dz(this.a, 10);
            }

            if(var1.d == 1) {
               return new dz(this.a, 11);
            }

            if(var1.d == 2) {
               return new dz(this.a, 12);
            }
         }

         if(this.a instanceof fi) {
            return new dz(this.a, 1);
         } else if(this.a instanceof af) {
            return new hq((jv)this.a);
         } else if(this.a instanceof kb) {
            return new dz(this.a, 90);
         } else {
            throw new IllegalArgumentException("Don\'t know how to add " + this.a.getClass() + "!");
         }
      }
   }
}
