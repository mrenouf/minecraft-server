// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.List;

public class ia {

   private List<eo> a = new ArrayList<eo>();
   private fa b = new fa();
   private List<ah> c = new ArrayList<ah>();
   private MinecraftServer d;


   public ia(MinecraftServer var1) {
      this.d = var1;
   }

   public void a() {
      for(int var1 = 0; var1 < this.c.size(); ++var1) {
         (this.c.get(var1)).a();
      }

      this.c.clear();
   }

   private ah a(int var1, int var2, boolean var3) {
      long var4 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      ah var6 = (ah)this.b.a(var4);
      if(var6 == null && var3) {
         var6 = new ah(this, var1, var2);
         this.b.a(var4, var6);
      }

      return var6;
   }

   public void a(im var1, int var2, int var3, int var4) {
      int var5 = var2 >> 4;
      int var6 = var4 >> 4;
      ah var7 = this.a(var5, var6, false);
      if(var7 != null) {
         var7.a(var1);
      }

   }

   public void a(int var1, int var2, int var3) {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      ah var6 = this.a(var4, var5, false);
      if(var6 != null) {
         var6.a(var1 & 15, var2, var3 & 15);
      }

   }

   public void a(eo var1) {
      this.d.f.a(new be("\u00a7e" + var1.ar + " joined the game."));
      int var2 = (int)var1.p >> 4;
      int var3 = (int)var1.r >> 4;
      var1.d = var1.p;
      var1.e = var1.r;

      for(int var4 = var2 - 10; var4 <= var2 + 10; ++var4) {
         for(int var5 = var3 - 10; var5 <= var3 + 10; ++var5) {
            this.a(var4, var5, true).a(var1);
         }
      }

      this.a.add(var1);
   }

   public void b(eo var1) {
      this.d.f.a(new be("\u00a7e" + var1.ar + " left the game."));
      int var2 = (int)var1.p >> 4;
      int var3 = (int)var1.r >> 4;

      for(int var4 = var2 - 10; var4 <= var2 + 10; ++var4) {
         for(int var5 = var3 - 10; var5 <= var3 + 10; ++var5) {
            ah var6 = this.a(var4, var5, false);
            if(var6 != null) {
               var6.b(var1);
            }
         }
      }

      this.a.remove(var1);
   }

   private boolean a(int var1, int var2, int var3, int var4) {
      int var5 = var1 - var3;
      int var6 = var2 - var4;
      return var5 >= -10 && var5 <= 10?var6 >= -10 && var6 <= 10:false;
   }

   public void c(eo var1) {
      int var2 = (int)var1.p >> 4;
      int var3 = (int)var1.r >> 4;
      double var4 = var1.d - var1.p;
      double var6 = var1.e - var1.r;
      double var8 = var4 * var4 + var6 * var6;
      if(var8 >= 64.0D) {
         int var10 = (int)var1.d >> 4;
         int var11 = (int)var1.e >> 4;
         int var12 = var2 - var10;
         int var13 = var3 - var11;
         if(var12 != 0 || var13 != 0) {
            for(int var14 = var2 - 10; var14 <= var2 + 10; ++var14) {
               for(int var15 = var3 - 10; var15 <= var3 + 10; ++var15) {
                  if(!this.a(var14, var15, var10, var11)) {
                     this.a(var14, var15, true).a(var1);
                  }

                  if(!this.a(var14 - var12, var15 - var13, var2, var3)) {
                     ah var16 = this.a(var14 - var12, var15 - var13, false);
                     if(var16 != null) {
                        var16.b(var1);
                     }
                  }
               }
            }

            var1.d = var1.p;
            var1.e = var1.r;
         }
      }
   }

   public int b() {
      return 144;
   }

   public static MinecraftServer a(ia var1) {
      return var1.d;
   }

   public static fa b(ia var1) {
	  return var1.b;
   }

   public static List c(ia var1) {
      return var1.c;
   }
}
