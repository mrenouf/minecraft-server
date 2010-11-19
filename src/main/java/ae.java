// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ae extends gz {

   public void a(DataInputStream var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      super.a(var1);
   }

   public int a() {
      return 33;
   }
}
