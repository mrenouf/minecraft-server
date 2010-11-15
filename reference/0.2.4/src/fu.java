// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class fu extends hc {

   public short a;


   public fu() {
   }

   public fu(short var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeShort(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.a;
   }
}
