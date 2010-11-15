// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:05
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public class l extends ha {

   public float a;


   public l() {
   }

   public l(float var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeFloat(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readFloat();
   }

   public byte a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.a;
   }
}
