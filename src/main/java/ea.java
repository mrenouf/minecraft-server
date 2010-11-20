// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:26
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ea extends hc {

   private List a = new ArrayList();
   private byte b;


   void a(DataOutput var1) throws IOException {
      if(this.a.size() > 0) {
         this.b = ((hc)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((hc)this.a.get(var2)).a(var1);
      }

   }

   void a(DataInput var1) throws IOException {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         hc var4 = hc.a(this.b);
         var4.a(var1);
         this.a.add(var4);
      }

   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + hc.b(this.b);
   }

   public void a(hc var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public hc a(int var1) {
      return (hc)this.a.get(var1);
   }

   public int b() {
      return this.a.size();
   }
}
