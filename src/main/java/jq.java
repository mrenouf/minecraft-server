// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:21
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class jq {

   private em b;
   public fv a;
   private float c;
   private float d = 0.0F;
   private int e = 0;
   private float f = 0.0F;
   private int g;
   private int h;
   private int i;


   public jq(em var1) {
      this.b = var1;
   }

   public void a(int var1, int var2, int var3) {
      int var4 = this.b.a(var1, var2, var3);
      if(var4 > 0 && this.d == 0.0F) {
         fy.m[var4].b(this.b, var1, var2, var3, this.a);
      }

      if(var4 > 0 && fy.m[var4].a(this.a) >= 1.0F) {
         this.c(var1, var2, var3);
      }

   }

   public void a() {
      this.d = 0.0F;
      this.e = 0;
   }

   public void a(int var1, int var2, int var3, int var4) {
      if(this.e > 0) {
         --this.e;
      } else {
         if(var1 == this.g && var2 == this.h && var3 == this.i) {
            int var5 = this.b.a(var1, var2, var3);
            if(var5 == 0) {
               return;
            }

            fy var6 = fy.m[var5];
            this.d += var6.a(this.a);
            ++this.f;
            if(this.d >= 1.0F) {
               this.c(var1, var2, var3);
               this.d = 0.0F;
               this.c = 0.0F;
               this.f = 0.0F;
               this.e = 5;
            }
         } else {
            this.d = 0.0F;
            this.c = 0.0F;
            this.f = 0.0F;
            this.g = var1;
            this.h = var2;
            this.i = var3;
         }

      }
   }

   public boolean b(int var1, int var2, int var3) {
      fy var4 = fy.m[this.b.a(var1, var2, var3)];
      int var5 = this.b.b(var1, var2, var3);
      boolean var6 = this.b.d(var1, var2, var3, 0);
      if(var4 != null && var6) {
         var4.a(this.b, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean c(int var1, int var2, int var3) {
      int var4 = this.b.a(var1, var2, var3);
      int var5 = this.b.b(var1, var2, var3);
      boolean var6 = this.b(var1, var2, var3);
      hj var7 = this.a.G();
      if(var7 != null) {
         var7.a(var4, var1, var2, var3);
         if(var7.a == 0) {
            var7.a(this.a);
            this.a.H();
         }
      }

      if(var6 && this.a.b(fy.m[var4])) {
         fy.m[var4].a_(this.b, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean a(fv var1, em var2, hj var3) {
      int var4 = var3.a;
      hj var5 = var3.a(var2, var1);
      if(var5 == var3 && (var5 == null || var5.a == var4)) {
         return false;
      } else {
         var1.ak.a[var1.ak.d] = var5;
         if(var5.a == 0) {
            var1.ak.a[var1.ak.d] = null;
         }

         return true;
      }
   }

   public boolean a(fv var1, em var2, hj var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      return var8 > 0 && fy.m[var8].a(var2, var4, var5, var6, var1)?true:(var3 == null?false:var3.a(var1, var2, var4, var5, var6, var7));
   }
}
