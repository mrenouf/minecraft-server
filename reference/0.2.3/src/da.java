// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class da extends fq {

   private fw[] bb;
   private float bc = 4.0F;
   private int bd;
   protected int a;


   public da(int var1, int var2, int var3, fw[] var4) {
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

   public float a(hh var1, fw var2) {
      for(int var3 = 0; var3 < this.bb.length; ++var3) {
         if(this.bb[var3] == var2) {
            return this.bc;
         }
      }

      return 1.0F;
   }

   public void a(hh var1, int var2, int var3, int var4, int var5) {
      var1.a(1);
   }
}
