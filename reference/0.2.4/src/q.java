// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class q extends io {

   public int a;
   public int b;


   public q() {
   }

   public q(dw var1, int var2) {
      this.a = var1.g;
      this.b = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
