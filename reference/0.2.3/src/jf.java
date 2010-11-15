// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class jf {

   private a[] a = new a[1024];
   private int b = 0;


   public a a(a var1) {
      if(var1.e >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if(this.b == this.a.length) {
            a[] var2 = new a[this.b << 1];
            System.arraycopy(this.a, 0, var2, 0, this.b);
            this.a = var2;
         }

         this.a[this.b] = var1;
         var1.e = this.b;
         this.a(this.b++);
         return var1;
      }
   }

   public void a() {
      this.b = 0;
   }

   public a b() {
      a var1 = this.a[0];
      this.a[0] = this.a[this.b -= 1];
      this.a[this.b] = null;
      if(this.b > 0) {
         this.b(0);
      }

      var1.e = -1;
      return var1;
   }

   public void a(a var1, float var2) {
      float var3 = var1.h;
      var1.h = var2;
      if(var2 < var3) {
         this.a(var1.e);
      } else {
         this.b(var1.e);
      }

   }

   private void a(int var1) {
      a var2 = this.a[var1];

      int var4;
      for(float var3 = var2.h; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >> 1;
         a var5 = this.a[var4];
         if(var3 >= var5.h) {
            break;
         }

         this.a[var1] = var5;
         var5.e = var1;
      }

      this.a[var1] = var2;
      var2.e = var1;
   }

   private void b(int var1) {
      a var2 = this.a[var1];
      float var3 = var2.h;

      while(true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if(var4 >= this.b) {
            break;
         }

         a var6 = this.a[var4];
         float var7 = var6.h;
         a var8;
         float var9;
         if(var5 >= this.b) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.a[var5];
            var9 = var8.h;
         }

         if(var7 < var9) {
            if(var7 >= var3) {
               break;
            }

            this.a[var1] = var6;
            var6.e = var1;
            var1 = var4;
         } else {
            if(var9 >= var3) {
               break;
            }

            this.a[var1] = var8;
            var8.e = var1;
            var1 = var5;
         }
      }

      this.a[var1] = var2;
      var2.e = var1;
   }

   public boolean c() {
      return this.b == 0;
   }
}
