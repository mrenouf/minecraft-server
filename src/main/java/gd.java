// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gd extends BaseObject {

   public long a;


   public gd() {
   }

   public gd(long var1) {
      this.a = var1;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readLong();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeLong(this.a);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
