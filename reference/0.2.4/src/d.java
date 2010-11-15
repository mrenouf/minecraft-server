// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class d extends io {

   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;


   public d() {
   }

   public d(fv var1) {
      this.a = var1.g;
      this.b = var1.ar;
      this.c = hd.b(var1.p * 32.0D);
      this.d = hd.b(var1.q * 32.0D);
      this.e = hd.b(var1.r * 32.0D);
      this.f = (byte)((int)(var1.v * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.w * 256.0F / 360.0F));
      hj var2 = var1.ak.b();
      this.h = var2 == null?0:var2.c;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 28;
   }
}
