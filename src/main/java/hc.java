// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;

public abstract class hc {

   private String a = null;


   abstract void a(DataOutput var1);

   abstract void a(DataInput var1);

   public abstract byte a();

   public String c() {
      return this.a == null?"":this.a;
   }

   public hc m(String var1) {
      this.a = var1;
      return this;
   }

   public static hc b(DataInput var0) {
      byte var1 = var0.readByte();
      if(var1 == 0) {
         return new jk();
      } else {
         hc var2 = a(var1);
         var2.a = var0.readUTF();
         var2.a(var0);
         return var2;
      }
   }

   public static void a(hc var0, DataOutput var1) {
      var1.writeByte(var0.a());
      if(var0.a() != 0) {
         var1.writeUTF(var0.c());
         var0.a(var1);
      }
   }

   public static hc a(byte var0) {
      switch(var0) {
      case 0:
         return new jk();
      case 1:
         return new bz();
      case 2:
         return new fu();
      case 3:
         return new bn();
      case 4:
         return new e();
      case 5:
         return new m();
      case 6:
         return new eg();
      case 7:
         return new gk();
      case 8:
         return new ih();
      case 9:
         return new ea();
      case 10:
         return new v();
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
