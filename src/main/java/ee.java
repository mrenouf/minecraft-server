// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:14
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ee extends fo {

   public ee() {
   }

   public ee(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void readObject(DataInputStream var1) throws IOException {
      super.readObject(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      super.writeObject(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
   }

   public int a() {
      return 7;
   }
}
