// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class a extends io {

   public int a;
   public int b;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
