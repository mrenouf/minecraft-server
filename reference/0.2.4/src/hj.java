// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public final class hj {

   public int a;
   public int b;
   public int c;
   public int d;


   public hj(fy var1) {
      this(var1, 1);
   }

   public hj(fy var1, int var2) {
      this(var1.bh, var2);
   }

   public hj(fs var1) {
      this(var1, 1);
   }

   public hj(fs var1, int var2) {
      this(var1.aW, var2);
   }

   public hj(int var1) {
      this(var1, 1);
   }

   public hj(int var1, int var2) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
   }

   public hj(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public hj(v var1) {
      this.a = 0;
      this.b(var1);
   }

   public fs a() {
      return fs.c[this.c];
   }

   public boolean a(fv var1, em var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(fy var1) {
      return this.a().a(this, var1);
   }

   public hj a(em var1, fv var2) {
      return this.a().a(this, var1, var2);
   }

   public v a(v var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(v var1) {
      this.c = var1.c("id");
      this.a = var1.b("Count");
      this.d = var1.c("Damage");
   }

   public int b() {
      return this.a().a();
   }

   public int c() {
      return fs.c[this.c].b();
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
      fs.c[this.c].a(this, var1, var2, var3, var4);
   }

   public boolean b(fy var1) {
      return fs.c[this.c].a(var1);
   }

   public void a(fv var1) {
   }

   public hj d() {
      return new hj(this.c, this.a, this.d);
   }
}
