// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:06
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class p extends im {

   public int a;
   public int b;


   public p() {
   }

   public p(dv var1, int var2) {
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

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
