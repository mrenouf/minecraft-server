// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class bn extends hc {

   public int a;


   public bn() {
   }

   public bn(int var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.a;
   }
}
