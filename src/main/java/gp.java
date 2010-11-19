// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:45
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gp extends io {

   public int a;
   public int b;


   public gp() {
   }

   public gp(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 6;
   }
}
