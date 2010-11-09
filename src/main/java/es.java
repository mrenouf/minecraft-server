// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:31
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class es extends el {

   public jj A;
   public boolean B = false;
   public boolean C;


   public es(File var1, String var2, int var3) {
      super(var1, var2, (new Random()).nextLong(), ie.a(var3));
   }

   public void f() {
      super.f();
   }

   protected br a(File var1) {
      this.A = new jj(this, new fe(var1, true), this.q.c());
      return this.A;
   }

   public List d(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();

      for(int var8 = 0; var8 < this.c.size(); ++var8) {
         av var9 = (av)this.c.get(var8);
         if(var9.b >= var1 && var9.c >= var2 && var9.d >= var3 && var9.b < var4 && var9.c < var5 && var9.d < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }
}
