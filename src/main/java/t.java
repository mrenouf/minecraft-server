// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class t extends ha {

   private Map a = new HashMap();


   void a(DataOutput var1) throws IOException {
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         ha var3 = (ha)var2.next();
         ha.a(var3, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1) throws IOException {
      this.a.clear();

      ha var2;
      while((var2 = ha.b(var1)).a() != 0) {
         this.a.put(var2.c(), var2);
      }

   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, ha var2) {
      this.a.put(var1, var2.m(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, (new bx(var2)).m(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, (new fs(var2)).m(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, (new bl(var2)).m(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, (new d(var2)).m(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, (new l(var2)).m(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, (new ef(var2)).m(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, (new _if(var2)).m(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, (new gh(var2)).m(var1));
   }

   public void a(String var1, t var2) {
      this.a.put(var1, var2.m(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public boolean a(String var1) {
      return this.a.containsKey(var1);
   }

   public byte b(String var1) {
      return !this.a.containsKey(var1)?0:((bx)this.a.get(var1)).a;
   }

   public short c(String var1) {
      return !this.a.containsKey(var1)?0:((fs)this.a.get(var1)).a;
   }

   public int d(String var1) {
      return !this.a.containsKey(var1)?0:((bl)this.a.get(var1)).a;
   }

   public long e(String var1) {
      return !this.a.containsKey(var1)?0L:((d)this.a.get(var1)).a;
   }

   public float f(String var1) {
      return !this.a.containsKey(var1)?0.0F:((l)this.a.get(var1)).a;
   }

   public double g(String var1) {
      return !this.a.containsKey(var1)?0.0D:((ef)this.a.get(var1)).a;
   }

   public String h(String var1) {
      return !this.a.containsKey(var1)?"":((_if)this.a.get(var1)).a;
   }

   public byte[] i(String var1) {
      return !this.a.containsKey(var1)?new byte[0]:((gh)this.a.get(var1)).a;
   }

   public t j(String var1) {
      return !this.a.containsKey(var1)?new t():(t)this.a.get(var1);
   }

   public dy k(String var1) {
      return !this.a.containsKey(var1)?new dy():(dy)this.a.get(var1);
   }

   public boolean l(String var1) {
      return this.b(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
