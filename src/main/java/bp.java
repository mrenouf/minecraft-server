// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class bp extends fp {

   public bp() {
      this.g = true;
   }

   public bp(int var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = true;
   }

   public void a(DataInputStream var1) throws IOException {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      super.a(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public int a() {
      return 9;
   }
}
