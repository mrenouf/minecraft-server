// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class dm extends im {

   public int a;
   public int b;
   public boolean c;


   public dm() {
   }

   public dm(int var1, int var2, boolean var3) {
      this.j = true;
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.read() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.write(this.c?1:0);
   }

   public void a(ex var1) {
      var1.a(this);
   }

   public int a() {
      return 9;
   }
}
