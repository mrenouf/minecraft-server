// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class jm extends fw {

   private int[] a = new int[256];
   private int[] b = new int[256];


   protected jm(int var1, int var2) {
      super(var1, var2, jr.l);
      this.a(fw.y.bi, 5, 20);
      this.a(fw.K.bi, 5, 5);
      this.a(fw.L.bi, 30, 60);
      this.a(fw.ao.bi, 30, 20);
      this.a(fw.an.bi, 15, 100);
      this.a(fw.ac.bi, 30, 60);
      this.a(true);
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.b[var1] = var3;
   }

   public ds d(el var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public int b() {
      return 10;
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = var1.a(var2, var3 - 1, var4) == fw.bc.bi;
      int var7 = var1.b(var2, var3, var4);
      if(var7 < 15) {
         var1.b(var2, var3, var4, var7 + 1);
         var1.h(var2, var3, var4, this.bi);
      }

      if(!var6 && !this.g(var1, var2, var3, var4)) {
         if(!var1.d(var2, var3 - 1, var4) || var7 > 3) {
            var1.d(var2, var3, var4, 0);
         }

      } else if(!var6 && !this.b((io)var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
         var1.d(var2, var3, var4, 0);
      } else {
         if(var7 % 2 == 0 && var7 > 2) {
            this.a(var1, var2 + 1, var3, var4, 300, var5);
            this.a(var1, var2 - 1, var3, var4, 300, var5);
            this.a(var1, var2, var3 - 1, var4, 200, var5);
            this.a(var1, var2, var3 + 1, var4, 250, var5);
            this.a(var1, var2, var3, var4 - 1, 300, var5);
            this.a(var1, var2, var3, var4 + 1, 300, var5);

            for(int var8 = var2 - 1; var8 <= var2 + 1; ++var8) {
               for(int var9 = var4 - 1; var9 <= var4 + 1; ++var9) {
                  for(int var10 = var3 - 1; var10 <= var3 + 4; ++var10) {
                     if(var8 != var2 || var10 != var3 || var9 != var4) {
                        int var11 = 100;
                        if(var10 > var3 + 1) {
                           var11 += (var10 - (var3 + 1)) * 100;
                        }

                        int var12 = this.h(var1, var8, var10, var9);
                        if(var12 > 0 && var5.nextInt(var11) <= var12) {
                           var1.d(var8, var10, var9, this.bi);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private void a(el var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.b[var1.a(var2, var3, var4)];
      if(var6.nextInt(var5) < var7) {
         boolean var8 = var1.a(var2, var3, var4) == fw.an.bi;
         if(var6.nextInt(2) == 0) {
            var1.d(var2, var3, var4, this.bi);
         } else {
            var1.d(var2, var3, var4, 0);
         }

         if(var8) {
            fw.an.a(var1, var2, var3, var4, 0);
         }
      }

   }

   private boolean g(el var1, int var2, int var3, int var4) {
      return this.b((io)var1, var2 + 1, var3, var4)?true:(this.b((io)var1, var2 - 1, var3, var4)?true:(this.b((io)var1, var2, var3 - 1, var4)?true:(this.b((io)var1, var2, var3 + 1, var4)?true:(this.b((io)var1, var2, var3, var4 - 1)?true:this.b((io)var1, var2, var3, var4 + 1)))));
   }

   private int h(el var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if(var1.a(var2, var3, var4) != 0) {
         return 0;
      } else {
         int var6 = this.f(var1, var2 + 1, var3, var4, var5);
         var6 = this.f(var1, var2 - 1, var3, var4, var6);
         var6 = this.f(var1, var2, var3 - 1, var4, var6);
         var6 = this.f(var1, var2, var3 + 1, var4, var6);
         var6 = this.f(var1, var2, var3, var4 - 1, var6);
         var6 = this.f(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean d() {
      return false;
   }

   public boolean b(io var1, int var2, int var3, int var4) {
      return this.a[var1.a(var2, var3, var4)] > 0;
   }

   public int f(el var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[var1.a(var2, var3, var4)];
      return var6 > var5?var6:var5;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      return var1.d(var2, var3 - 1, var4) || this.g(var1, var2, var3, var4);
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      if(!var1.d(var2, var3 - 1, var4) && !this.g(var1, var2, var3, var4)) {
         var1.d(var2, var3, var4, 0);
      }
   }

   public void e(el var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3 - 1, var4) != fw.aq.bi || !fw.bf.a_(var1, var2, var3, var4)) {
         if(!var1.d(var2, var3 - 1, var4) && !this.g(var1, var2, var3, var4)) {
            var1.d(var2, var3, var4, 0);
         } else {
            var1.h(var2, var3, var4, this.bi);
         }
      }
   }
}
