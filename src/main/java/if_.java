// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:11
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class if_ extends ha {

   public String a;


   public if_() {
   }

   public if_(String var1) {
      this.a = var1;
      if(var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) throws IOException {
      var1.writeUTF(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readUTF();
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.a;
   }
}
