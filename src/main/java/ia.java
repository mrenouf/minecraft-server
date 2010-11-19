// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;

public class ia extends fy {

   public ia(int var1, int var2) {
      super(var1, var2, jt.c);
   }

   public void a(em var1, int var2, int var3, int var4, dt var5, ArrayList var6) {
      var6.add(dt.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)var3 + 1.5D, (double)(var4 + 1)));
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return var1.a(var2, var3 - 1, var4) == this.bh?false:(!var1.c(var2, var3 - 1, var4).a()?false:super.a(var1, var2, var3, var4));
   }

   public boolean a() {
      return false;
   }
}
