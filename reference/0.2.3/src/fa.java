// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class fa {

   private transient ce[] a = new ce[16];
   private transient int b;
   private int c = 12;
   private final float d = 0.75F;
   private transient volatile int e;


   private static int e(long var0) {
      return a((int)(var0 ^ var0 >>> 32));
   }

   private static int a(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object a(long var1) {
      int var3 = e(var1);

      for(ce var4 = this.a[a(var3, this.a.length)]; var4 != null; var4 = var4.c) {
         if(var4.a == var1) {
            return var4.b;
         }
      }

      return null;
   }

   public void a(long var1, Object var3) {
      int var4 = e(var1);
      int var5 = a(var4, this.a.length);

      for(ce var6 = this.a[var5]; var6 != null; var6 = var6.c) {
         if(var6.a == var1) {
            var6.b = var3;
         }
      }

      ++this.e;
      this.a(var4, var1, var3, var5);
   }

   private void b(int var1) {
      ce[] var2 = this.a;
      int var3 = var2.length;
      if(var3 == 1073741824) {
         this.c = Integer.MAX_VALUE;
      } else {
         ce[] var4 = new ce[var1];
         this.a(var4);
         this.a = var4;
         this.c = (int)((float)var1 * this.d);
      }
   }

   private void a(ce[] var1) {
      ce[] var2 = this.a;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         ce var5 = var2[var4];
         if(var5 != null) {
            var2[var4] = null;

            ce var6;
            do {
               var6 = var5.c;
               int var7 = a(var5.d, var3);
               var5.c = var1[var7];
               var1[var7] = var5;
               var5 = var6;
            } while(var6 != null);
         }
      }

   }

   public Object b(long var1) {
      ce var3 = this.c(var1);
      return var3 == null?null:var3.b;
   }

   final ce c(long var1) {
      int var3 = e(var1);
      int var4 = a(var3, this.a.length);
      ce var5 = this.a[var4];

      ce var6;
      ce var7;
      for(var6 = var5; var6 != null; var6 = var7) {
         var7 = var6.c;
         if(var6.a == var1) {
            ++this.e;
            --this.b;
            if(var5 == var6) {
               this.a[var4] = var7;
            } else {
               var5.c = var7;
            }

            return var6;
         }

         var5 = var6;
      }

      return var6;
   }

   private void a(int var1, long var2, Object var4, int var5) {
      ce var6 = this.a[var5];
      this.a[var5] = new ce(var1, var2, var4, var6);
      if(this.b++ >= this.c) {
         this.b(2 * this.a.length);
      }

   }
}
