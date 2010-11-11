// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:13
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ec extends gx {

   public ec() {
      this.i = true;
      this.h = true;
   }

   public ec(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      this.a = var1;
      this.b = var3;
      this.d = var5;
      this.c = var7;
      this.e = var9;
      this.f = var10;
      this.g = var11;
      this.i = true;
      this.h = true;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.readObject(var1);
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.writeObject(var1);
   }

   public int a() {
      return 41;
   }
}
