// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class dl extends io {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public byte[] g;
   private int h;


   public dl() {
   }

   public dl(int var1, int var2, int var3, int var4, int var5, int var6, em var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      byte[] var8 = var7.c(var1, var2, var3, var4, var5, var6);
      Deflater var9 = new Deflater(1);

      try {
         var9.setInput(var8);
         var9.finish();
         this.g = new byte[var4 * var5 * var6 * 5 / 2];
         this.h = var9.deflate(this.g);
      } finally {
         var9.end();
      }

   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = var1.read() + 1;
      this.e = var1.read() + 1;
      this.f = var1.read() + 1;
      int var2 = var1.readInt();
      byte[] var3 = new byte[var2];
      var1.readFully(var3);
      this.g = new byte[this.d * this.e * this.f * 5 / 2];
      Inflater var4 = new Inflater();
      var4.setInput(var3);

      try {
         var4.inflate(this.g);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.write(this.d - 1);
      var1.write(this.e - 1);
      var1.write(this.f - 1);
      var1.writeInt(this.h);
      var1.write(this.g, 0, this.h);
   }

   public void a(ey var1) {
      var1.a(this);
   }

   public int a() {
      return 17 + this.h;
   }
}
