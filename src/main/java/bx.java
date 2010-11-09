// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class bx extends ha {

   public byte a;


   public bx() {
   }

   public bx(byte var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeByte(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readByte();
   }

   public byte a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.a;
   }
}
