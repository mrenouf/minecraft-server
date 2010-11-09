// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class w implements ActionListener {

   w(gg var1, JTextField var2) {
      this.b = var1;
      this.a = var2;
      super();
   }

   public void actionPerformed(ActionEvent var1) {
      String var2 = this.a.getText().trim();
      if(var2.length() > 0) {
         gg.a(this.b).a(var2, this.b);
      }

      this.a.setText("");
   }
}
