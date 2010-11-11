// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:06
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class p extends BaseObject {

   public int a;
   public int b;


   public p() {
   }

   public p(dv var1, int var2) {
      this.a = var1.g;
      this.b = var2;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
