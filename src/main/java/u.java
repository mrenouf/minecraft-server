// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:07
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class u extends WindowAdapter {

   private MinecraftServer a;

   u(MinecraftServer var1) {
      super();
      this.a = var1;
   }

   public void windowClosing(WindowEvent var1) {
      this.a.a();

      while(!this.a.g) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      System.exit(0);
   }
}
