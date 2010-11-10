// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:29
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cp extends im {

   public int a;
   public int b;


   public cp() {
   }

   public cp(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
