// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:20
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.List;

public class cf extends dv {

   private int c;
   public int a;
   private int d;
   private int e;
   private int f;
   public hc b;


   public cf(el var1) {
      super(var1);
      this.c = 0;
      this.a = 0;
      this.G = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public cf(el var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.d = var2;
      this.e = var3;
      this.f = var4;
      ArrayList var6 = new ArrayList();
      hc[] var7 = hc.values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         hc var10 = var7[var9];
         this.b = var10;
         this.a(var5);
         if(this.c()) {
            var6.add(var10);
         }
      }

      if(var6.size() > 0) {
         this.b = (hc)var6.get(this.V.nextInt(var6.size()));
      }

      this.a(var5);
   }

   public void a(int var1) {
      this.a = var1;
      this.x = this.v = (float)(var1 * 90);
      float var2 = (float)this.b.z;
      float var3 = (float)this.b.A;
      float var4 = (float)this.b.z;
      if(var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.d + 0.5F;
      float var6 = (float)this.e + 0.5F;
      float var7 = (float)this.f + 0.5F;
      float var8 = 0.5625F;
      if(var1 == 0) {
         var7 -= var8;
      }

      if(var1 == 1) {
         var5 -= var8;
      }

      if(var1 == 2) {
         var7 += var8;
      }

      if(var1 == 3) {
         var5 += var8;
      }

      if(var1 == 0) {
         var5 -= this.c(this.b.z);
      }

      if(var1 == 1) {
         var7 += this.c(this.b.z);
      }

      if(var1 == 2) {
         var5 += this.c(this.b.z);
      }

      if(var1 == 3) {
         var7 -= this.c(this.b.z);
      }

      var6 += this.c(this.b.A);
      this.a((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.z.c((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      return var1 == 32?0.5F:(var1 == 64?0.5F:0.0F);
   }

   public void b_() {
      if(this.c++ == 100 && !this.c()) {
         this.c = 0;
         this.l();
         this.l.a(new gf(this.l, this.p, this.q, this.r, new hh(fq.aq)));
      }

   }

   public boolean c() {
      if(this.l.a(this, this.z).size() > 0) {
         return false;
      } else {
         int var1 = this.b.z / 16;
         int var2 = this.b.A / 16;
         int var3 = this.d;
         int var4 = this.e;
         int var5 = this.f;
         if(this.a == 0) {
            var3 = hb.b(this.p - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 1) {
            var5 = hb.b(this.r - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 2) {
            var3 = hb.b(this.p - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 3) {
            var5 = hb.b(this.r - (double)((float)this.b.z / 32.0F));
         }

         var4 = hb.b(this.q - (double)((float)this.b.A / 32.0F));

         int var7;
         for(int var6 = 0; var6 < var1; ++var6) {
            for(var7 = 0; var7 < var2; ++var7) {
               jr var8;
               if(this.a != 0 && this.a != 2) {
                  var8 = this.l.c(this.d, var4 + var7, var5 + var6);
               } else {
                  var8 = this.l.c(var3 + var6, var4 + var7, this.f);
               }

               if(!var8.a()) {
                  return false;
               }
            }
         }

         List var9 = this.l.b(this, this.z);

         for(var7 = 0; var7 < var9.size(); ++var7) {
            if(var9.get(var7) instanceof cf) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean c_() {
      return true;
   }

   public boolean a(dv var1, int var2) {
      this.l();
      this.l.a(new gf(this.l, this.p, this.q, this.r, new hh(fq.aq)));
      return true;
   }

   public void a(t var1) {
      var1.a("Dir", (byte)this.a);
      var1.a("Motive", this.b.y);
      var1.a("TileX", this.d);
      var1.a("TileY", this.e);
      var1.a("TileZ", this.f);
   }

   public void b(t var1) {
      this.a = var1.b("Dir");
      this.d = var1.d("TileX");
      this.e = var1.d("TileY");
      this.f = var1.d("TileZ");
      String var2 = var1.h("Motive");
      hc[] var3 = hc.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         hc var6 = var3[var5];
         if(var6.y.equals(var2)) {
            this.b = var6;
         }
      }

      if(this.b == null) {
         this.b = hc.a;
      }

      this.a(this.a);
   }
}
