// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:39
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

public class ao {

   public static v a(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      v var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(v var0, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput) var2);
      } finally {
         var2.close();
      }

   }

   public static v a(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      v var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(v var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput) var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static v a(DataInput var0) throws IOException {
      hc var1 = hc.b(var0);
      if(var1 instanceof v) {
         return (v)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(v var0, DataOutput var1) throws IOException {
      hc.a(var0, var1);
   }
}
