// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:58
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gx extends BaseObject {

   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;


   public void a(Connection var1) {
      var1.a(this);
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.g = var1.read() != 0;
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.write(this.g?1:0);
   }

   public int a() {
      return 1;
   }
}
