// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:11
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;

public class ie {

   public el a;
   public is b;
   public boolean c = false;
   public float[] d = new float[16];
   public int e = 0;
   private float[] f = new float[4];


   public final void a(el var1) {
      this.a = var1;
      this.a();
      this.b();
   }

   protected void b() {
      float var1 = 0.05F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.d[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void a() {
      this.b = new is(this.a);
   }

   public br c() {
      return new iy(this.a, this.a.u);
   }

   public at a(File var1) {
      return new fe(var1, true);
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      return var3 == fw.F.bi;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public static ie a(int var0) {
      return (ie)(var0 == 0?new ie():(var0 == -1?new hk():null));
   }
}
