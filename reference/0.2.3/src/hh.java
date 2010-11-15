// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public final class hh {

   public int a;
   public int b;
   public int c;
   public int d;


   public hh(fw var1) {
      this(var1, 1);
   }

   public hh(fw var1, int var2) {
      this(var1.bi, var2);
   }

   public hh(fq var1) {
      this(var1, 1);
   }

   public hh(fq var1, int var2) {
      this(var1.aW, var2);
   }

   public hh(int var1) {
      this(var1, 1);
   }

   public hh(int var1, int var2) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
   }

   public hh(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public hh(t var1) {
      this.a = 0;
      this.b(var1);
   }

   public fq a() {
      return fq.c[this.c];
   }

   public boolean a(ft var1, el var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(fw var1) {
      return this.a().a(this, var1);
   }

   public t a(t var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(t var1) {
      this.c = var1.c("id");
      this.a = var1.b("Count");
      this.d = var1.c("Damage");
   }

   public int b() {
      return this.a().a();
   }

   public int c() {
      return fq.c[this.c].b();
   }

   public void a(int var1) {
      this.d += var1;
      if(this.d > this.c()) {
         --this.a;
         if(this.a < 0) {
            this.a = 0;
         }

         this.d = 0;
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      fq.c[this.c].a(this, var1, var2, var3, var4);
   }

   public boolean b(fw var1) {
      return fq.c[this.c].a(var1);
   }

   public void a(ft var1) {
   }

   public hh d() {
      return new hh(this.c, this.a, this.d);
   }
}
