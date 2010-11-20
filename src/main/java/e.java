// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:26
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class e extends hc {

   public long a;


   public e() {
   }

   public e(long var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeLong(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readLong();
   }

   public byte a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.a;
   }
}
