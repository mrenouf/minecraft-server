// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:04
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class ha {

   private String a = null;

   /** write */
   abstract void a(DataOutput var1) throws IOException;
   /** read */
   abstract void a(DataInput var1) throws IOException;

   public abstract byte a();

   public String c() {
      return this.a == null?"":this.a;
   }

   public ha m(String var1) {
      this.a = var1;
      return this;
   }

   public static ha b(DataInput var0) throws IOException {
      byte var1 = var0.readByte();
      if(var1 == 0) {
         return new ji();
      } else {
         ha var2 = a(var1);
         var2.a = var0.readUTF();
         var2.a(var0);
         return var2;
      }
   }

   public static void a(ha var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.a());
      if(var0.a() != 0) {
         var1.writeUTF(var0.c());
         var0.a(var1);
      }
   }

   public static ha a(byte var0) {
      switch(var0) {
      case 0:
         return new ji();
      case 1:
         return new bx();
      case 2:
         return new fs();
      case 3:
         return new bl();
      case 4:
         return new d();
      case 5:
         return new l();
      case 6:
         return new ef();
      case 7:
         return new gh();
      case 8:
         return new _if();
      case 9:
         return new dy();
      case 10:
         return new t();
      default:
         return null;
      }
   }

   public static String b(byte var0) {
      switch(var0) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      default:
         return "UNKNOWN";
      }
   }
}
