// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:21
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jr extends io {

   public String a;


   public jr() {
   }

   public jr(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readUTF();
   }

   public void a(DataOutputStream var1) {
      var1.writeUTF(this.a);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
