// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class gk extends hc {

   public byte[] a;


   public gk() {
   }

   public gk(byte[] var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.a.length);
      var1.write(this.a);
   }

   void a(DataInput var1) {
      int var2 = var1.readInt();
      this.a = new byte[var2];
      var1.readFully(this.a);
   }

   public byte a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }
}
