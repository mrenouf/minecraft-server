// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cj extends gu {

   private boolean a = false;
   private static List b = new ArrayList();


   private boolean a(el var1, int var2, int var3, int var4, boolean var5) {
      if(var5) {
         b.add(new ir(var2, var3, var4, var1.e));
      }

      int var6 = 0;

      for(int var7 = 0; var7 < b.size(); ++var7) {
         ir var8 = (ir)b.get(var7);
         if(var8.a == var2 && var8.b == var3 && var8.c == var4) {
            ++var6;
            if(var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected cj(int var1, int var2, boolean var3) {
      super(var1, var2);
      this.a = var3;
      this.a(true);
   }

   public int b() {
      return 2;
   }

   public void e(el var1, int var2, int var3, int var4) {
      if(var1.b(var2, var3, var4) == 0) {
         super.e(var1, var2, var3, var4);
      }

      if(this.a) {
         var1.g(var2, var3 - 1, var4, this.bi);
         var1.g(var2, var3 + 1, var4, this.bi);
         var1.g(var2 - 1, var3, var4, this.bi);
         var1.g(var2 + 1, var3, var4, this.bi);
         var1.g(var2, var3, var4 - 1, this.bi);
         var1.g(var2, var3, var4 + 1, this.bi);
      }

   }

   public void b(el var1, int var2, int var3, int var4) {
      if(this.a) {
         var1.g(var2, var3 - 1, var4, this.bi);
         var1.g(var2, var3 + 1, var4, this.bi);
         var1.g(var2 - 1, var3, var4, this.bi);
         var1.g(var2 + 1, var3, var4, this.bi);
         var1.g(var2, var3, var4 - 1, this.bi);
         var1.g(var2, var3, var4 + 1, this.bi);
      }

   }

   public boolean b(io var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return false;
      } else {
         int var6 = var1.b(var2, var3, var4);
         return var6 == 5 && var5 == 1?false:(var6 == 3 && var5 == 3?false:(var6 == 4 && var5 == 2?false:(var6 == 1 && var5 == 5?false:var6 != 2 || var5 != 4)));
      }
   }

   private boolean g(el var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4);
      return var5 == 5 && var1.j(var2, var3 - 1, var4, 0)?true:(var5 == 3 && var1.j(var2, var3, var4 - 1, 2)?true:(var5 == 4 && var1.j(var2, var3, var4 + 1, 3)?true:(var5 == 1 && var1.j(var2 - 1, var3, var4, 4)?true:var5 == 2 && var1.j(var2 + 1, var3, var4, 5))));
   }

   public void a(el var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.g(var1, var2, var3, var4);

      while(b.size() > 0 && var1.e - ((ir)b.get(0)).d > 100L) {
         b.remove(0);
      }

      if(this.a) {
         if(var6) {
            var1.b(var2, var3, var4, fw.aQ.bi, var1.b(var2, var3, var4));
            if(this.a(var1, var2, var3, var4, true)) {
               var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.l.nextFloat() - var1.l.nextFloat()) * 0.8F);

               for(int var7 = 0; var7 < 5; ++var7) {
                  double var8 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
                  double var10 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
                  double var12 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
                  var1.a("smoke", var8, var10, var12, 0.0D, 0.0D, 0.0D);
               }
            }
         }
      } else if(!var6 && !this.a(var1, var2, var3, var4, false)) {
         var1.b(var2, var3, var4, fw.aR.bi, var1.b(var2, var3, var4));
      }

   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);
      var1.h(var2, var3, var4, this.bi);
   }

   public boolean d(el var1, int var2, int var3, int var4, int var5) {
      return var5 == 0?this.b(var1, var2, var3, var4, var5):false;
   }

   public int a(int var1, Random var2) {
      return fw.aR.bi;
   }

   public boolean c() {
      return true;
   }

}
