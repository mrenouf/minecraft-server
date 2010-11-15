// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:25
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ab extends im {

   public int a;
   public String b;
   public String c;
   public long d;
   public byte e;


   public ab() {
   }

   public ab(String var1, String var2, int var3, long var4, byte var6) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
      this.d = var4;
      this.e = var6;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readUTF();
      this.d = var1.readLong();
      this.e = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeUTF(this.c);
      var1.writeLong(this.d);
      var1.writeByte(this.e);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.b.length() + this.c.length() + 4 + 5;
   }
}
