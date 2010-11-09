// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;

public class hk extends ie {

   public void a() {
      this.b = new ga(ih.l, 1.0D, 0.0D);
      this.c = true;
      this.e = -1;
   }

   protected void b() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.d[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public br c() {
      return new bu(this.a, this.a.u);
   }

   public at a(File var1) {
      File var2 = new File(var1, "DIM-1");
      var2.mkdirs();
      return new fe(var2, true);
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      return var3 == fw.A.bi?false:(var3 == 0?false:fw.p[var3]);
   }

   public float a(long var1, float var3) {
      return 0.5F;
   }
}
