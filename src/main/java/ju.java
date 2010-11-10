// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:59
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ju implements ActionListener {
   final iw a;
   ju(iw var1) {
      super();
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      iw.a(this.a);
   }
}
