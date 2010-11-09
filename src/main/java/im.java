// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class im {

   private static Map<Integer, Class<? extends im>> a = new HashMap<Integer, Class<? extends im>>();
   private static Map<Class<? extends im>, Integer> b = new HashMap<Class<? extends im>, Integer>();
   public boolean j = false;


   static void a(int var0, Class<? extends im> var1) {
      if(a.containsKey(Integer.valueOf(var0))) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      } else {
         a.put(Integer.valueOf(var0), var1);
         b.put(var1, Integer.valueOf(var0));
      }
   }

   public static im a(int var0) {
      try {
    	  Class<? extends im> var1 = a.get(Integer.valueOf(var0));
         return var1 == null?null:(im)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return ((Integer)b.get(this.getClass())).intValue();
   }

   public static im b(DataInputStream var0) {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         im var2 = a(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.a(var0);
            return var2;
         }
      }
   }

   public static void a(im var0, DataOutputStream var1) {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(ex var1);

   public abstract int a();

   static {
      a(0, kc.class);
      a(1, ab.class);
      a(2, e.class);
      a(3, be.class);
      a(4, gd.class);
      a(5, s.class);
      a(6, cm.class);
      a(10, gx.class);
      a(11, ac.class);
      a(12, go.class);
      a(13, ec.class);
      a(14, hx.class);
      a(15, fv.class);
      a(16, gn.class);
      a(17, fc.class);
      a(18, p.class);
      a(20, c.class);
      a(21, k.class);
      a(22, cp.class);
      a(23, dx.class);
      a(24, ho.class);
      a(29, de.class);
      a(30, fo.class);
      a(31, ee.class);
      a(32, di.class);
      a(33, bn.class);
      a(34, cq.class);
      a(50, dm.class);
      a(51, dk.class);
      a(52, ic.class);
      a(53, fi.class);
      a(59, ja.class);
      a(255, jp.class);
   }
}
