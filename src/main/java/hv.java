// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hv extends av implements jx {

   private hh[] e = new hh[36];


   public int a() {
      return 27;
   }

   public hh a(int var1) {
      return this.e[var1];
   }

   public void a(int var1, hh var2) {
      this.e[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

      this.c();
   }

   public void a(t var1) {
      super.a(var1);
      dy var2 = var1.k("Items");
      this.e = new hh[this.a()];

      for(int var3 = 0; var3 < var2.b(); ++var3) {
         t var4 = (t)var2.a(var3);
         int var5 = var4.b("Slot") & 255;
         if(var5 >= 0 && var5 < this.e.length) {
            this.e[var5] = new hh(var4);
         }
      }

   }

   public void b(t var1) {
      super.b(var1);
      dy var2 = new dy();

      for(int var3 = 0; var3 < this.e.length; ++var3) {
         if(this.e[var3] != null) {
            t var4 = new t();
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
}
