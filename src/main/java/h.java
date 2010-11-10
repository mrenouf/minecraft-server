// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:04
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Vector;
import javax.swing.JList;

public class h extends JList implements ei {

   private MinecraftServer a;
   private int b = 0;


   public h(MinecraftServer var1) {
      this.a = var1;
      var1.a(this);
   }

   public void a() {
      if(this.b++ % 20 == 0) {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < this.a.f.b.size(); ++var2) {
            var1.add(((eo)this.a.f.b.get(var2)).ar);
         }

         this.setListData(var1);
      }

   }
}
