// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fo extends BaseObject {

   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g = false;


   public fo() {
   }

   public fo(int var1) {
      this.a = var1;
   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
