// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class co {

   private final a[] b;
   public final int a;
   private int c;


   public co(a[] var1) {
      this.b = var1;
      this.a = var1.length;
   }

   public void a() {
      ++this.c;
   }

   public boolean b() {
      return this.c >= this.b.length;
   }

   public ba a(dv var1) {
      double var2 = (double)this.b[this.c].a + (double)((int)(var1.H + 1.0F)) * 0.5D;
      double var4 = (double)this.b[this.c].b;
      double var6 = (double)this.b[this.c].c + (double)((int)(var1.H + 1.0F)) * 0.5D;
      return ba.b(var2, var4, var6);
   }
}
