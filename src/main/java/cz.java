// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

public class cz extends Handler {

   private int[] b = new int[1024];
   private int c = 0;
   Formatter a = new gt(this);
   private JTextArea d;


   public cz(JTextArea var1) {
      this.setFormatter(this.a);
      this.d = var1;
   }

   public void close() {
   }

   public void flush() {
   }

   public void publish(LogRecord var1) {
      int var2 = this.d.getDocument().getLength();
      this.d.append(this.a.format(var1));
      this.d.setCaretPosition(this.d.getDocument().getLength());
      int var3 = this.d.getDocument().getLength() - var2;
      if(this.b[this.c] != 0) {
         this.d.replaceRange("", 0, this.b[this.c]);
      }

      this.b[this.c] = var3;
      this.c = (this.c + 1) % 1024;
   }
}
