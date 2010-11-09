// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class fs extends ha {

   public short a;


   public fs() {
   }

   public fs(short var1) {
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
