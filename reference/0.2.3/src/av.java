// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:38
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashMap;
import java.util.Map;

public class av {

   private static Map e = new HashMap();
   private static Map f = new HashMap();
   public el a;
   public int b;
   public int c;
   public int d;


   private static void a(Class var0, String var1) {
      if(f.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         e.put(var1, var0);
         f.put(var0, var1);
      }
   }

   public void a(t var1) {
      this.b = var1.d("x");
      this.c = var1.d("y");
      this.d = var1.d("z");
   }

   public void b(t var1) {
      String var2 = (String)f.get(this.getClass());
      if(var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.a("id", var2);
         var1.a("x", this.b);
         var1.a("y", this.c);
         var1.a("z", this.d);
      }
   }

   public void b() {
   }

   public static av c(t var0) {
      av var1 = null;

      try {
         Class var2 = (Class)e.get(var0.h("id"));
         if(var2 != null) {
            var1 = (av)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if(var1 != null) {
         var1.a(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.h("id"));
      }

      return var1;
   }

   public void c() {
      this.a.b(this.b, this.c, this.d, this);
   }

   static {
      a(dr.class, "Furnace");
      a(hv.class, "Chest");
      a(jg.class, "Sign");
      a(cd.class, "MobSpawner");
   }
}
