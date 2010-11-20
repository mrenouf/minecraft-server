// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashMap;
import java.util.Map;

public class hl {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();


   private static void a(Class var0, String var1, int var2) {
      a.put(var1, var0);
      b.put(var0, var1);
      c.put(Integer.valueOf(var2), var0);
      d.put(var0, Integer.valueOf(var2));
   }

   public static dw a(String var0, em var1) {
      dw var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if(var3 != null) {
            var2 = (dw)var3.getConstructor(new Class[]{em.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static dw a(v var0, em var1) {
      dw var2 = null;

      try {
         Class var3 = (Class)a.get(var0.h("id"));
         if(var3 != null) {
            var2 = (dw)var3.getConstructor(new Class[]{em.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.h("id"));
      }

      return var2;
   }

   public static int a(dw var0) {
      return ((Integer)d.get(var0.getClass())).intValue();
   }

   public static String b(dw var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(dv.class, "Arrow", 10);
      a(bf.class, "Snowball", 11);
      a(gh.class, "Item", 1);
      a(cg.class, "Painting", 9);
      a(jv.class, "Mob", 48);
      a(fz.class, "Monster", 49);
      a(fk.class, "Creeper", 50);
      a(ez.class, "Skeleton", 51);
      a(bu.class, "Spider", 52);
      a(t.class, "Giant", 53);
      a(gg.class, "Zombie", 54);
      a(gb.class, "Slime", 55);
      a(az.class, "Ghast", 56);
      a(iv.class, "PigZombie", 57);
      a(hp.class, "Pig", 90);
      a(ct.class, "Sheep", 91);
      a(be.class, "Cow", 92);
      a(if_.class, "Chicken", 93);
      a(ci.class, "PrimedTnt", 20);
      a(hy.class, "FallingSand", 21);
      a(jj.class, "Minecart", 40);
      a(fi.class, "Boat", 41);
   }
}
