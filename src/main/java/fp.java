// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fp extends io {

   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g = false;


   public fp() {
   }

   public fp(int var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
