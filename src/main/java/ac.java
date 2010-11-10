// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:25
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ac extends gx {

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void a(DataOutputStream var1) throws IOException {
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
