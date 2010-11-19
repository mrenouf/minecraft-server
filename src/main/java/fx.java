// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fx extends io {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readInt();
      this.c = var1.read();
      this.d = var1.readInt();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeInt(this.b);
      var1.write(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 12;
   }
}
