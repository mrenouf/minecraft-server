// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseObject {

   private static Map<Integer, Class<? extends BaseObject>> a = new HashMap<Integer, Class<? extends BaseObject>>();
   private static Map<Class<? extends BaseObject>, Integer> b = new HashMap<Class<? extends BaseObject>, Integer>();
   public boolean j = false;


   static void registerObject(int packetId, Class<? extends BaseObject> objectType) {
      if(a.containsKey(Integer.valueOf(packetId))) {
         throw new IllegalArgumentException("Duplicate packet id:" + packetId);
      } else if(b.containsKey(objectType)) {
         throw new IllegalArgumentException("Duplicate packet class:" + objectType);
      } else {
         a.put(Integer.valueOf(packetId), objectType);
         b.put(objectType, Integer.valueOf(packetId));
      }
   }

   public static BaseObject createObject(int packetId) throws IOException {
      try {
    	  Class<? extends BaseObject> var1 = a.get(Integer.valueOf(packetId));
         return var1 == null?null:(BaseObject)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + packetId);
         return null;
      }
   }

   public final int getPacketId() {
      return ((Integer)b.get(this.getClass())).intValue();
   }

   public static BaseObject read(DataInputStream var0) throws IOException {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         BaseObject var2 = createObject(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.readObject(var0);
            return var2;
         }
      }
   }

   public static void write(BaseObject baseObj, DataOutputStream out) throws IOException {
      out.write(baseObj.getPacketId());
      baseObj.writeObject(out);
   }
   /** read */
   public abstract void readObject(DataInputStream var1) throws IOException;
   /** write */
   public abstract void writeObject(DataOutputStream var1) throws IOException;

   public abstract void a(Connection var1);

   public abstract int a();

   static {
      registerObject(0, kc.class);
      registerObject(1, ab.class);
      registerObject(2, e.class);
      registerObject(3, be.class);
      registerObject(4, gd.class);
      registerObject(5, s.class);
      registerObject(6, cm.class);
      registerObject(10, gx.class);
      registerObject(11, ac.class);
      registerObject(12, go.class);
      registerObject(13, ec.class);
      registerObject(14, hx.class);
      registerObject(15, fv.class);
      registerObject(16, gn.class);
      registerObject(17, fc.class);
      registerObject(18, p.class);
      registerObject(20, c.class);
      registerObject(21, k.class);
      registerObject(22, cp.class);
      registerObject(23, dx.class);
      registerObject(24, ho.class);
      registerObject(29, de.class);
      registerObject(30, fo.class);
      registerObject(31, ee.class);
      registerObject(32, di.class);
      registerObject(33, bn.class);
      registerObject(34, cq.class);
      registerObject(50, dm.class);
      registerObject(51, dk.class);
      registerObject(52, ic.class);
      registerObject(53, fi.class);
      registerObject(59, ja.class);
      registerObject(255, jp.class);
   }
}
