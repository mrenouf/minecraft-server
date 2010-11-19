// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class hx extends ay implements jz {

   private hj[] e = new hj[36];


   public int a() {
      return 27;
   }

   public hj a(int var1) {
      return this.e[var1];
   }

   public void a(int var1, hj var2) {
      this.e[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

      this.c();
   }

   public void a(v var1) {
      super.a(var1);
      ea var2 = var1.k("Items");
      this.e = new hj[this.a()];

      for(int var3 = 0; var3 < var2.b(); ++var3) {
         v var4 = (v)var2.a(var3);
         int var5 = var4.b("Slot") & 255;
         if(var5 >= 0 && var5 < this.e.length) {
            this.e[var5] = new hj(var4);
         }
      }

   }

   public void b(v var1) {
      super.b(var1);
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
}
