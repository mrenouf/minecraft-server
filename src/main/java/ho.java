// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ho extends BaseObject {

   public int a;
   public byte b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;


   public ho() {
   }

   public ho(jt var1) {
      this.a = var1.g;
      this.b = (byte)hj.a(var1);
      this.c = hb.b(var1.p * 32.0D);
      this.d = hb.b(var1.q * 32.0D);
      this.e = hb.b(var1.r * 32.0D);
      this.f = (byte)((int)(var1.v * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.w * 256.0F / 360.0F));
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 19;
   }
}
