// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:47
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gz extends io {

   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;


   public void a(ey var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.g = var1.read() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.write(this.g?1:0);
   }

   public int a() {
      return 1;
   }
}
