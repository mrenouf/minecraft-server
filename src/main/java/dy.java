// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class dy extends ha {

   private List a = new ArrayList();
   private byte b;


   void a(DataOutput var1) {
      if(this.a.size() > 0) {
         this.b = ((ha)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((ha)this.a.get(var2)).a(var1);
      }

   }

   void a(DataInput var1) {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         ha var4 = ha.a(this.b);
         var4.a(var1);
         this.a.add(var4);
      }

   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + ha.b(this.b);
   }

   public void a(ha var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public ha a(int var1) {
      return (ha)this.a.get(var1);
   }

   public int b() {
      return this.a.size();
   }
}
