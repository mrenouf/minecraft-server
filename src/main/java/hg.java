// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hg implements jz {

   public hj[] a = new hj[37];
   public hj[] b = new hj[4];
   public hj[] c = new hj[4];
   public int d = 0;
   private fv f;
   public boolean e = false;


   public hg(fv var1) {
      this.f = var1;
   }

   public hj b() {
      return this.a[this.d];
   }

   private int d(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int e(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1 && this.a[var2].a < this.a[var2].b() && this.a[var2].a < this.d()) {
            return var2;
         }
      }

      return -1;
   }

   private int g() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   private int a(int var1, int var2) {
      int var3 = this.e(var1);
      if(var3 < 0) {
         var3 = this.g();
      }

      if(var3 < 0) {
         return var2;
      } else {
         if(this.a[var3] == null) {
            this.a[var3] = new hj(var1, 0);
         }

         int var4 = var2;
         if(var2 > this.a[var3].b() - this.a[var3].a) {
            var4 = this.a[var3].b() - this.a[var3].a;
         }

         if(var4 > this.d() - this.a[var3].a) {
            var4 = this.d() - this.a[var3].a;
         }

         if(var4 == 0) {
            return var2;
         } else {
            var2 -= var4;
            this.a[var3].a += var4;
            this.a[var3].b = 5;
            return var2;
         }
      }
   }

   public void c() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null && this.a[var1].b > 0) {
            --this.a[var1].b;
         }
      }

   }

   public boolean b(int var1) {
      int var2 = this.d(var1);
      if(var2 < 0) {
         return false;
      } else {
         if((this.a[var2].a -= 1) <= 0) {
            this.a[var2] = null;
         }

         return true;
      }
   }

   public boolean a(hj var1) {
      if(var1.d == 0) {
         var1.a = this.a(var1.c, var1.a);
         if(var1.a == 0) {
            return true;
         }
      }

      int var2 = this.g();
      if(var2 >= 0) {
         this.a[var2] = var1;
         this.a[var2].b = 5;
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, hj var2) {
      hj[] var3 = this.a;
      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.c;
      }

      var3[var1] = var2;
   }

   public float a(fy var1) {
      float var2 = 1.0F;
      if(this.a[this.d] != null) {
         var2 *= this.a[this.d].a(var1);
      }

      return var2;
   }

   public ea a(ea var1) {
      int var2;
      v var3;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null) {
            var3 = new v();
            var3.a("Slot", (byte)var2);
            this.a[var2].a(var3);
            var1.a(var3);
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null) {
            var3 = new v();
            var3.a("Slot", (byte)(var2 + 100));
            this.b[var2].a(var3);
            var1.a(var3);
         }
      }

      for(var2 = 0; var2 < this.c.length; ++var2) {
         if(this.c[var2] != null) {
            var3 = new v();
            var3.a("Slot", (byte)(var2 + 80));
            this.c[var2].a(var3);
            var1.a(var3);
         }
      }

      return var1;
   }

   public void b(ea var1) {
      this.a = new hj[36];
      this.b = new hj[4];
      this.c = new hj[4];

      for(int var2 = 0; var2 < var1.b(); ++var2) {
         v var3 = (v)var1.a(var2);
         int var4 = var3.b("Slot") & 255;
         if(var4 >= 0 && var4 < this.a.length) {
            this.a[var4] = new hj(var3);
         }

         if(var4 >= 80 && var4 < this.c.length + 80) {
            this.c[var4 - 80] = new hj(var3);
         }

         if(var4 >= 100 && var4 < this.b.length + 100) {
            this.b[var4 - 100] = new hj(var3);
         }
      }

   }

   public int a() {
      return this.a.length + 4;
   }

   public hj a(int var1) {
      hj[] var2 = this.a;
      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.c;
      }

      return var2[var1];
   }

   public int d() {
      return 64;
   }

   public boolean b(fy var1) {
      if(var1.bs != jt.d && var1.bs != jt.e && var1.bs != jt.t && var1.bs != jt.s) {
         return true;
      } else {
         hj var2 = this.a(this.d);
         return var2 != null?var2.b(var1):false;
      }
   }

   public int e() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         if(this.b[var4] != null && this.b[var4].a() instanceof hh) {
            int var5 = this.b[var4].c();
            int var6 = this.b[var4].d;
            int var7 = var5 - var6;
            var2 += var7;
            var3 += var5;
            int var8 = ((hh)this.b[var4].a()).bc;
            var1 += var8;
         }
      }

      if(var3 == 0) {
         return 0;
      } else {
         return (var1 - 1) * var2 / var3 + 1;
      }
   }

   public void c(int var1) {
      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].a() instanceof hh) {
            this.b[var2].a(var1);
            if(this.b[var2].a == 0) {
               this.b[var2].a(this.f);
               this.b[var2] = null;
            }
         }
      }

   }

   public void f() {
      int var1;
      for(var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.f.a(this.a[var1], true);
            this.a[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.b.length; ++var1) {
         if(this.b[var1] != null) {
            this.f.a(this.b[var1], true);
            this.b[var1] = null;
         }
      }

   }
}
