// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class hx extends BaseObject {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public void readObject(DataInputStream var1) throws IOException {
      this.e = var1.read();
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.write(this.e);
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
