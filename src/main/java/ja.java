// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ja extends BaseObject {

   public int a;
   public int b;
   public int c;
   public byte[] d;
   public t e;


   public ja() {
   }

   public ja(int var1, int var2, int var3, av var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = new t();
      var4.b(this.e);

      try {
         this.d = am.a(this.e);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public void readObject(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      int var2 = var1.readShort() & '\uffff';
      this.d = new byte[var2];
      var1.readFully(this.d);
      this.e = am.a(this.d);
   }

   public void writeObject(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.writeShort((short)this.d.length);
      var1.write(this.d);
   }

   public void a(Connection var1) {
      var1.a(this);
   }

   public int a() {
      return this.d.length + 2 + 10;
   }
}
