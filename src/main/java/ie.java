// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ie extends io {

   public int a;
   public int b;
   public short[] c;
   public byte[] d;
   public byte[] e;
   public int f;


   public ie() {
   }

   public ie(int var1, int var2, short[] var3, int var4, em var5) {
      this.a = var1;
      this.b = var2;
      this.f = var4;
      this.c = new short[var4];
      this.d = new byte[var4];
      this.e = new byte[var4];
      jp var6 = var5.c(var1, var2);

      for(int var7 = 0; var7 < var4; ++var7) {
         int var8 = var3[var7] >> 12 & 15;
         int var9 = var3[var7] >> 8 & 15;
         int var10 = var3[var7] & 255;
         this.c[var7] = var3[var7];
         this.d[var7] = (byte)var6.a(var8, var10, var9);
         this.e[var7] = (byte)var6.b(var8, var10, var9);
      }

   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.f = var1.readShort() & '\uffff';
      this.c = new short[this.f];
      this.d = new byte[this.f];
      this.e = new byte[this.f];

      for(int var2 = 0; var2 < this.f; ++var2) {
         this.c[var2] = var1.readShort();
      }

      var1.readFully(this.d);
      var1.readFully(this.e);
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeShort((short)this.f);

      for(int var2 = 0; var2 < this.f; ++var2) {
         var1.writeShort(this.c[var2]);
      }

      var1.write(this.d);
      var1.write(this.e);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 10 + this.f * 4;
   }
}
