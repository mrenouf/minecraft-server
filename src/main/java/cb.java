// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class cb extends im {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;
   public byte g;
   public int h;


   public cb() {
   }

   public cb(dv var1, int var2) {
      this.a = var1.g;
      this.b = hb.b(var1.p * 32.0D);
      this.c = hb.b(var1.q * 32.0D);
      this.d = hb.b(var1.r * 32.0D);
      this.e = (byte)((int)(var1.s * 128.0D));
      this.f = (byte)((int)(var1.t * 128.0D));
      this.g = (byte)((int)(var1.u * 128.0D));
      this.h = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.h = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.h);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 20;
   }
}
