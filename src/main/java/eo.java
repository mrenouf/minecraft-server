// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:31
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class eo extends ft {

   public ActiveConnection a;
   public MinecraftServer b;
   public jo c;
   public double d;
   public double e;
   public List<ka> f = new LinkedList<ka>();
   public Set<ka> ai = new HashSet<ka>();
   public double aj;


   public eo(MinecraftServer var1, el var2, String var3, jo var4) {
      super(var2);
      int var5 = var2.m;
      int var6 = var2.o;
      int var7 = var2.n;
      if(!var2.q.c) {
         var5 += this.V.nextInt(20) - 10;
         var7 = var2.e(var5, var6);
         var6 += this.V.nextInt(20) - 10;
      }

      this.c((double)var5 + 0.5D, (double)var7, (double)var6 + 0.5D, 0.0F, 0.0F);
      this.b = var1;
      this.R = 0.0F;
      var4.a = this;
      this.ar = var3;
      this.c = var4;
      this.G = 0.0F;
   }

   public void b_() {
   }

   public void f(dv var1) {
   }

   public boolean a(dv var1, int var2) {
      return false;
   }

   public void a(int var1) {
   }

   public void k() {
      super.b_();
      ka var1 = null;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         ka var5 = (ka)this.f.get(var4);
         double var6 = var5.a(this);
         if(var4 == 0 || var6 < var2) {
            var1 = var5;
            var2 = var5.a(this);
         }
      }

      if(var1 != null) {
         boolean var8 = false;
         if(var2 < 1024.0D) {
            var8 = true;
         }

         if(this.a.b() < 2) {
            var8 = true;
         }

         if(var8) {
            this.f.remove(var1);
            this.a.b(new dk(var1.a * 16, 0, var1.b * 16, 16, 128, 16, this.b.e));
            List var9 = this.b.e.d(var1.a * 16, 0, var1.b * 16, var1.a * 16 + 16, 128, var1.b * 16 + 16);

            for(int var10 = 0; var10 < var9.size(); ++var10) {
               av var7 = (av)var9.get(var10);
               this.a.b(new ja(var7.b, var7.c, var7.d, var7));
            }
         }
      }

   }

   public void D() {
      this.s = this.t = this.u = 0.0D;
      this.bj = false;
      super.D();
   }

   public void c(dv var1, int var2) {
      if(!var1.F && var1 instanceof gf) {
         this.a.b(new fc(((gf)var1).a, var2));
         this.b.k.a(var1, new cp(var1.g, this.g));
      }

      super.c(var1, var2);
   }

   public void E() {
      if(!this.ap) {
         this.aq = -1;
         this.ap = true;
         this.b.k.a(this, new p(this, 1));
      }

   }

   protected float s() {
      return 1.62F;
   }
}
