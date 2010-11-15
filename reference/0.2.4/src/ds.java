// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:11
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ds extends ay implements jz {

   private hj[] e = new hj[3];
   private int f = 0;
   private int g = 0;
   private int h = 0;


   public int a() {
      return this.e.length;
   }

   public hj a(int var1) {
      return this.e[var1];
   }

   public void a(v var1) {
      super.a(var1);
      ea var2 = var1.k("Items");
      this.e = new hj[this.a()];

      for(int var3 = 0; var3 < var2.b(); ++var3) {
         v var4 = (v)var2.a(var3);
         byte var5 = var4.b("Slot");
         if(var5 >= 0 && var5 < this.e.length) {
            this.e[var5] = new hj(var4);
         }
      }

      this.f = var1.c("BurnTime");
      this.h = var1.c("CookTime");
      this.g = this.a(this.e[1]);
   }

   public void b(v var1) {
      super.b(var1);
      var1.a("BurnTime", (short)this.f);
      var1.a("CookTime", (short)this.h);
      ea var2 = new ea();

      for(int var3 = 0; var3 < this.e.length; ++var3) {
         if(this.e[var3] != null) {
            v var4 = new v();
            var4.a("Slot", (byte)var3);
            this.e[var3].a(var4);
            var2.a(var4);
         }
      }

      var1.a("Items", var2);
   }

   public int d() {
      return 64;
   }

   public boolean e() {
      return this.f > 0;
   }

   public void b() {
      boolean var1 = this.f > 0;
      boolean var2 = false;
      if(this.f > 0) {
         --this.f;
      }

      if(!this.a.z) {
         if(this.f == 0 && this.g()) {
            this.g = this.f = this.a(this.e[1]);
            if(this.f > 0) {
               var2 = true;
               if(this.e[1] != null) {
                  --this.e[1].a;
                  if(this.e[1].a == 0) {
                     this.e[1] = null;
                  }
               }
            }
         }

         if(this.e() && this.g()) {
            ++this.h;
            if(this.h == 200) {
               this.h = 0;
               this.f();
               var2 = true;
            }
         } else {
            this.h = 0;
         }

         if(var1 != this.f > 0) {
            var2 = true;
            ei.a(this.f > 0, this.a, this.b, this.c, this.d);
         }
      }

      if(var2) {
         this.c();
      }

   }

   private boolean g() {
      if(this.e[0] == null) {
         return false;
      } else {
         int var1 = this.b(this.e[0].a().aW);
         return var1 < 0?false:(this.e[2] == null?true:(this.e[2].c != var1?false:(this.e[2].a < this.d() && this.e[2].a < this.e[2].b()?true:this.e[2].a < fs.c[var1].a())));
      }
   }

   public void f() {
      if(this.g()) {
         int var1 = this.b(this.e[0].a().aW);
         if(this.e[2] == null) {
            this.e[2] = new hj(var1, 1);
         } else if(this.e[2].c == var1) {
            ++this.e[2].a;
         }

         --this.e[0].a;
         if(this.e[0].a <= 0) {
            this.e[0] = null;
         }

      }
   }

   private int b(int var1) {
      return var1 == fy.H.bh?fs.m.aW:(var1 == fy.G.bh?fs.n.aW:(var1 == fy.aw.bh?fs.l.aW:(var1 == fy.E.bh?fy.M.bh:(var1 == fs.ao.aW?fs.ap.aW:(var1 == fs.aS.aW?fs.aT.aW:(var1 == fy.w.bh?fy.t.bh:(var1 == fs.aG.aW?fs.aF.aW:-1)))))));
   }

   private int a(hj var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = var1.a().aW;
         return var2 < 256 && fy.m[var2].bs == jt.c?300:(var2 == fs.B.aW?100:(var2 == fs.k.aW?1600:(var2 == fs.aw.aW?20000:0)));
      }
   }
}
