// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:35
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class am {

   public static t a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      t var2;
      try {
         var2 = a(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(t var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, var2);
      } finally {
         var2.close();
      }

   }

   public static t a(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      t var2;
      try {
         var2 = a(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(t var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static t a(DataInput var0) throws IOException {
      ha var1 = ha.b(var0);
      if(var1 instanceof t) {
         return (t)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(t var0, DataOutput var1) throws IOException {
      ha.a(var0, var1);
   }
}
