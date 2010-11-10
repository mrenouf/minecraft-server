// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cq extends im {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;


   public cq() {
   }

   public cq(dv var1) {
      this.a = var1.g;
      this.b = hb.b(var1.p * 32.0D);
      this.c = hb.b(var1.q * 32.0D);
      this.d = hb.b(var1.r * 32.0D);
      this.e = (byte)((int)(var1.v * 256.0F / 360.0F));
      this.f = (byte)((int)(var1.w * 256.0F / 360.0F));
   }

   public cq(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = (byte)var1.read();
      this.f = (byte)var1.read();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
      var1.write(this.f);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 34;
   }
}
