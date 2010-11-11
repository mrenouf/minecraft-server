// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class dx extends BaseObject {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public dx() {
   }

   public dx(dv var1, int var2) {
      this.a = var1.g;
      this.b = hb.b(var1.p * 32.0D);
      this.c = hb.b(var1.q * 32.0D);
      this.d = hb.b(var1.r * 32.0D);
      this.e = var2;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.e = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.e);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 17;
   }
}
