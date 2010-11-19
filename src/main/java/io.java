// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class io {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public boolean j = false;


   static void a(int var0, Class var1) {
      if(a.containsKey(Integer.valueOf(var0))) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      } else {
         a.put(Integer.valueOf(var0), var1);
         b.put(var1, Integer.valueOf(var0));
      }
   }

   public static io a(int var0) {
      try {
         Class var1 = (Class)a.get(Integer.valueOf(var0));
         return var1 == null?null:(io)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return ((Integer)b.get(this.getClass())).intValue();
   }

   public static io b(DataInputStream var0) {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         io var2 = a(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.a(var0);
            return var2;
         }
      }
   }

   public static void a(io var0, DataOutputStream var1) {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(ey var1);

   public abstract int a();

   static {
      a(0, ke.class);
      a(1, ad.class);
      a(2, f.class);
      a(3, bg.class);
      a(4, gf.class);
      a(5, u.class);
      a(6, cn.class);
      a(7, a.class);
      a(10, gz.class);
      a(11, ae.class);
      a(12, gq.class);
      a(13, ed.class);
      a(14, hz.class);
      a(15, fx.class);
      a(16, gp.class);
      a(17, fd.class);
      a(18, q.class);
      a(20, d.class);
      a(21, l.class);
      a(22, cq.class);
      a(23, dz.class);
      a(24, hq.class);
      a(28, fq.class);
      a(29, df.class);
      a(30, fp.class);
      a(31, ef.class);
      a(32, dj.class);
      a(33, bp.class);
      a(34, cr.class);
      a(39, s.class);
      a(50, dn.class);
      a(51, dl.class);
      a(52, ie.class);
      a(53, fj.class);
      a(59, jc.class);
      a(255, jr.class);
   }
}
