// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class go extends gx {

   public void readObject(DataInputStream var1) throws IOException {
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.readObject(var1);
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.writeObject(var1);
   }

   public int a() {
      return 9;
   }
}
