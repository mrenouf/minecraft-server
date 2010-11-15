// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gf extends io {

   public long a;


   public gf() {
   }

   public gf(long var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readLong();
   }

   public void a(DataOutputStream var1) {
      var1.writeLong(this.a);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
