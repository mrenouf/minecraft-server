// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class y implements ActionListener {

   y(gi var1, JTextField var2) {
      this.b = var1;
      this.a = var2;
      super();
   }

   public void actionPerformed(ActionEvent var1) {
      String var2 = this.a.getText().trim();
      if(var2.length() > 0) {
         gi.a(this.b).a(var2, this.b);
      }

      this.a.setText("");
   }
}
