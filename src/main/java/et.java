// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class et extends em {

   public jl A;
   public boolean B = false;
   public boolean C;
   private MinecraftServer D;
   private ib E = new ib();


   public et(MinecraftServer var1, File var2, String var3, int var4) {
      super(var2, var3, (new Random()).nextLong(), ig.a(var4));
      this.D = var1;
   }

   public void f() {
      super.f();
   }

   public void a(dw var1, boolean var2) {
      if(this.D.m && var1 instanceof ax) {
         var1.l();
      }

      if(var1.j == null || !(var1.j instanceof fv)) {
         super.a(var1, var2);
      }

   }

   protected bt a(File var1) {
      this.A = new jl(this, this.q.a(var1), this.q.c());
      return this.A;
   }

   public List d(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();

      for(int var8 = 0; var8 < this.c.size(); ++var8) {
         ay var9 = (ay)this.c.get(var8);
         if(var9.b >= var1 && var9.c >= var2 && var9.d >= var3 && var9.b < var4 && var9.c < var5 && var9.d < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }

   public boolean a(fv var1, int var2, int var3, int var4) {
      int var5 = (int)hd.e((float)(var2 - this.m));
      int var6 = (int)hd.e((float)(var4 - this.o));
      if(var5 > var6) {
         var6 = var5;
      }

      return var6 > 16 || this.D.f.g(var1.ar);
   }

   protected void b(dw var1) {
      super.b(var1);
      this.E.a(var1.g, var1);
   }

   protected void c(dw var1) {
      super.c(var1);
      this.E.d(var1.g);
   }

   public dw a(int var1) {
      return (dw)this.E.a(var1);
   }
}
