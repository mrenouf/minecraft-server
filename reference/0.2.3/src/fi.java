// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:41
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fi extends im {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public fi() {
   }

   public fi(int var1, int var2, int var3, el var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4.a(var1, var2, var3);
      this.e = var4.b(var1, var2, var3);
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
      var1.write(this.e);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
