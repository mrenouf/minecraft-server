// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:26
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class dz extends io {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public dz() {
   }

   public dz(dw var1, int var2) {
      this.a = var1.g;
      this.b = hd.b(var1.p * 32.0D);
      this.c = hd.b(var1.q * 32.0D);
      this.d = hd.b(var1.r * 32.0D);
      this.e = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.e = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.e);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 17;
   }
}
