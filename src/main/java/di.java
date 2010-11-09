// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class di extends fo {

   public di() {
      this.g = true;
   }

   public di(int var1, byte var2, byte var3) {
      super(var1);
      this.e = var2;
      this.f = var3;
      this.g = true;
   }

   public void a(DataInputStream var1) {
      super.a(var1);
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public int a() {
      return 6;
   }
}
