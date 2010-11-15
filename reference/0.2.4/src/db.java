// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class db extends fs {

   private fy[] bb;
   private float bc = 4.0F;
   private int bd;
   protected int a;


   public db(int var1, int var2, int var3, fy[] var4) {
      super(var1);
      this.a = var3;
      this.bb = var4;
      this.aX = 1;
      this.aY = 32 << var3;
      if(var3 == 3) {
         this.aY *= 4;
      }

      this.bc = (float)((var3 + 1) * 2);
      this.bd = var2 + var3;
   }

   public float a(hj var1, fy var2) {
      for(int var3 = 0; var3 < this.bb.length; ++var3) {
         if(this.bb[var3] == var2) {
            return this.bc;
         }
      }

      return 1.0F;
   }

   public void a(hj var1, int var2, int var3, int var4, int var5) {
      var1.a(1);
   }
}
