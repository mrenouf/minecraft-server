// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:28
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ef extends fp {

   public ef() {
   }

   public ef(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void a(DataInputStream var1) {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
   }

   public int a() {
      return 7;
   }
}
