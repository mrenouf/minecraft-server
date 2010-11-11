// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:09
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class UserId extends BaseObject {

   public String a;


   public UserId() {
   }

   public UserId(String var1) {
      this.a = var1;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.a);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.a.length() + 4;
   }
}
