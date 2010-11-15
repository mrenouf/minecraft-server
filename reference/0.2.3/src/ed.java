// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:14
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ed implements io {

   private int a;
   private int b;
   private jn[][] c;
   private el d;


   public ed(el var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.d = var1;
      this.a = var2 >> 4;
      this.b = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.c = new jn[var8 - this.a + 1][var9 - this.b + 1];

      for(int var10 = this.a; var10 <= var8; ++var10) {
         for(int var11 = this.b; var11 <= var9; ++var11) {
            this.c[var10 - this.a][var11 - this.b] = var1.c(var10, var11);
         }
      }

   }

   public int a(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 128) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].a(var1 & 15, var2, var3 & 15);
      }
   }

   public int b(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 128) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].b(var1 & 15, var2, var3 & 15);
      }
   }

   public jr c(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?jr.a:fw.n[var4].bt;
   }

   public boolean d(int var1, int var2, int var3) {
      fw var4 = fw.n[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }
}
