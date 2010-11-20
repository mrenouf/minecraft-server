// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class m extends hc {

   public float a;


   public m() {
   }

   public m(float var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeFloat(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readFloat();
   }

   public byte a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.a;
   }
}
