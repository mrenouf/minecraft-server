// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class be extends im {

   public String a;


   public be() {
   }

   public be(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.a);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
