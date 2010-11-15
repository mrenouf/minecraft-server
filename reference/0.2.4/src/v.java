// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class v extends hc {

   private Map a = new HashMap();


   void a(DataOutput var1) {
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         hc var3 = (hc)var2.next();
         hc.a(var3, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1) {
      this.a.clear();

      hc var2;
      while((var2 = hc.b(var1)).a() != 0) {
         this.a.put(var2.c(), var2);
      }

   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, hc var2) {
      this.a.put(var1, var2.m(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, (new bz(var2)).m(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, (new fu(var2)).m(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, (new bn(var2)).m(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, (new e(var2)).m(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, (new m(var2)).m(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, (new eg(var2)).m(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, (new ih(var2)).m(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, (new gk(var2)).m(var1));
   }

   public void a(String var1, v var2) {
      this.a.put(var1, var2.m(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public boolean a(String var1) {
      return this.a.containsKey(var1);
   }

   public byte b(String var1) {
      return !this.a.containsKey(var1)?0:((bz)this.a.get(var1)).a;
   }

   public short c(String var1) {
      return !this.a.containsKey(var1)?0:((fu)this.a.get(var1)).a;
   }

   public int d(String var1) {
      return !this.a.containsKey(var1)?0:((bn)this.a.get(var1)).a;
   }

   public long e(String var1) {
      return !this.a.containsKey(var1)?0L:((e)this.a.get(var1)).a;
   }

   public float f(String var1) {
      return !this.a.containsKey(var1)?0.0F:((m)this.a.get(var1)).a;
   }

   public double g(String var1) {
      return !this.a.containsKey(var1)?0.0D:((eg)this.a.get(var1)).a;
   }

   public String h(String var1) {
      return !this.a.containsKey(var1)?"":((ih)this.a.get(var1)).a;
   }

   public byte[] i(String var1) {
      return !this.a.containsKey(var1)?new byte[0]:((gk)this.a.get(var1)).a;
   }

   public v j(String var1) {
      return !this.a.containsKey(var1)?new v():(v)this.a.get(var1);
   }

   public ea k(String var1) {
      return !this.a.containsKey(var1)?new ea():(ea)this.a.get(var1);
   }

   public boolean l(String var1) {
      return this.b(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
