// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.HashMap;
import java.util.Map;

public class hj {

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

   public static dv a(String var0, el var1) {
      dv var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if(var3 != null) {
            var2 = (dv)var3.getConstructor(new Class[]{el.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static dv a(t var0, el var1) {
      dv var2 = null;

      try {
         Class var3 = (Class)a.get(var0.h("id"));
         if(var3 != null) {
            var2 = (dv)var3.getConstructor(new Class[]{el.class}).newInstance(new Object[]{var1});
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

   public static int a(dv var0) {
      return ((Integer)d.get(var0.getClass())).intValue();
   }

   public static String b(dv var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(du.class, "Arrow", 10);
      a(bd.class, "Snowball", 11);
      a(gf.class, "Item", 1);
      a(cf.class, "Painting", 9);
      a(jt.class, "Mob", 48);
      a(fx.class, "Monster", 49);
      a(fj.class, "Creeper", 50);
      a(ey.class, "Skeleton", 51);
      a(bs.class, "Spider", 52);
      a(r.class, "Giant", 53);
      a(ge.class, "Zombie", 54);
      a(fz.class, "Slime", 55);
      a(ax.class, "Ghast", 56);
      a(it.class, "PigZombie", 57);
      a(hn.class, "Pig", 90);
      a(cs.class, "Sheep", 91);
      a(bc.class, "Cow", 91);
      a(id.class, "Chicken", 91);
      a(ch.class, "PrimedTnt", 20);
      a(hw.class, "FallingSand", 21);
      a(jh.class, "Minecart", 40);
      a(fh.class, "Boat", 41);
   }
}
