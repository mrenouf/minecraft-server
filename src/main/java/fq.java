// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fq extends io {

   public int a;
   public int b;
   public int c;
   public int d;


   public fq() {
   }

   public fq(int var1, double var2, double var4, double var6) {
      this.a = var1;
      double var8 = 0.9D;
      if(var2 < -var8) {
         var2 = -var8;
      }

      if(var4 < -var8) {
         var4 = -var8;
      }

      if(var6 < -var8) {
         var6 = -var8;
      }

      if(var2 > var8) {
         var2 = var8;
      }

      if(var4 > var8) {
         var4 = var8;
      }

      if(var6 > var8) {
         var6 = var8;
      }

      this.b = (int)(var2 * 32000.0D);
      this.c = (int)(var4 * 32000.0D);
      this.d = (int)(var6 * 32000.0D);
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readShort();
      this.d = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
      var1.writeShort(this.d);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 10;
   }
}
