// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fd extends io {

   public int a;
   public int b;
   public int c;


   public fd() {
   }

   public fd(hj var1, int var2) {
      this.a = var1.c;
      this.b = var2;
      this.c = var1.d;
      if(var2 == 0) {
         boolean var3 = true;
      }

   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readShort();
      this.b = var1.readByte();
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeShort(this.a);
      var1.writeByte(this.b);
      var1.writeShort(this.c);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
