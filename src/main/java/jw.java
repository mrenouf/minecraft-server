// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:24
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jw implements ActionListener {

   private iy a;

jw(iy var1) {
	   super();
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      iy.a(this.a);
   }
}
