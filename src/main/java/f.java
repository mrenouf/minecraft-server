// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class f extends io {

   public String a;


   public f() {
   }

   public f(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.a);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.a.length() + 4;
   }
}
