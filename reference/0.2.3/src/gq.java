// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gq {

   public dv a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i = 0;
   private double l;
   private double m;
   private double n;
   private boolean o = false;
   public boolean j = false;
   public Set k = new HashSet();


   public gq(dv var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = hb.b(var1.p * 32.0D);
      this.e = hb.b(var1.q * 32.0D);
      this.f = hb.b(var1.r * 32.0D);
      this.g = hb.d(var1.v * 256.0F / 360.0F);
      this.h = hb.d(var1.w * 256.0F / 360.0F);
   }

   public boolean equals(Object var1) {
      return var1 instanceof gq?((gq)var1).a.g == this.a.g:false;
   }

   public int hashCode() {
      return this.a.g;
   }

   public void a(List var1) {
      this.j = false;
      if(!this.o || this.a.d(this.l, this.m, this.n) > 16.0D) {
         this.b(var1);
         this.l = this.a.p;
         this.m = this.a.q;
         this.n = this.a.r;
         this.o = true;
         this.j = true;
      }

      if(this.i++ % this.c == 0) {
         int var2 = hb.b(this.a.p * 32.0D);
         int var3 = hb.b(this.a.q * 32.0D);
         int var4 = hb.b(this.a.r * 32.0D);
         int var5 = hb.d(this.a.v * 256.0F / 360.0F);
         int var6 = hb.d(this.a.w * 256.0F / 360.0F);
         boolean var7 = var2 != this.d || var3 != this.e || var4 != this.f;
         boolean var8 = var5 != this.g || var6 != this.h;
         int var9 = var2 - this.d;
         int var10 = var3 - this.e;
         int var11 = var4 - this.f;
         Object var12 = null;
         if(var9 >= -128 && var9 < 128 && var10 >= -128 && var10 < 128 && var11 >= -128 && var11 < 128) {
            if(var7 && var8) {
               var12 = new bn(this.a.g, (byte)var9, (byte)var10, (byte)var11, (byte)var5, (byte)var6);
            } else if(var7) {
               var12 = new ee(this.a.g, (byte)var9, (byte)var10, (byte)var11);
            } else if(var8) {
               var12 = new di(this.a.g, (byte)var5, (byte)var6);
            } else {
               var12 = new fo(this.a.g);
            }
         } else {
            var12 = new cq(this.a.g, var2, var3, var4, (byte)var5, (byte)var6);
         }

         if(var12 != null) {
            this.a((im)var12);
         }

         this.d = var2;
         this.e = var3;
         this.f = var4;
         this.g = var5;
         this.h = var6;
      }

   }

   public void a(im var1) {
      Iterator var2 = this.k.iterator();

      while(var2.hasNext()) {
         eo var3 = (eo)var2.next();
         var3.a.b(var1);
      }

   }

   public void a() {
      this.a(new de(this.a.g));
   }

   public void a(eo var1) {
      if(var1 != this.a) {
         double var2 = var1.p - (double)(this.d / 32);
         double var4 = var1.r - (double)(this.f / 32);
         if(var2 >= (double)(-this.b) && var2 <= (double)this.b && var4 >= (double)(-this.b) && var4 <= (double)this.b) {
            if(!this.k.contains(var1)) {
               this.k.add(var1);
               var1.a.b(this.b());
            }
         } else if(this.k.contains(var1)) {
            this.k.remove(var1);
            var1.a.b(new de(this.a.g));
         }

      }
   }

   public void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.a((eo)var1.get(var2));
      }

   }

   private im b() {
      if(this.a instanceof gf) {
         gf var3 = (gf)this.a;
         k var2 = new k(var3);
         var3.p = (double)var2.b / 32.0D;
         var3.q = (double)var2.c / 32.0D;
         var3.r = (double)var2.d / 32.0D;
         var3.s = (double)var2.e / 128.0D;
         var3.t = (double)var2.f / 128.0D;
         var3.u = (double)var2.g / 128.0D;
         return var2;
      } else if(this.a instanceof eo) {
         return new c((ft)this.a);
      } else {
         if(this.a instanceof jh) {
            jh var1 = (jh)this.a;
            if(var1.d == 0) {
               return new dx(this.a, 10);
            }

            if(var1.d == 1) {
               return new dx(this.a, 11);
            }

            if(var1.d == 2) {
               return new dx(this.a, 12);
            }
         }

         if(this.a instanceof fh) {
            return new dx(this.a, 1);
         } else if(this.a instanceof ad) {
            return new ho((jt)this.a);
         } else if(this.a instanceof jz) {
            return new cb(this.a, 1);
         } else {
            throw new IllegalArgumentException("Don\'t know how to add " + this.a.getClass() + "!");
         }
      }
   }
}
