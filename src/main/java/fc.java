// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:36
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fc extends im {

   public int a;
   public int b;
   public int c;


   public fc() {
   }

   public fc(hh var1, int var2) {
      this.a = var1.c;
      this.b = var2;
      this.c = var1.d;
      if(var2 == 0) {
         boolean var3 = true;
      }

   }

   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readByte();
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeByte(this.b);
      var1.writeShort(this.c);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
