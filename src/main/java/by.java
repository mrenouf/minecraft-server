// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:18
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import net.minecraft.server.MinecraftServer;

public class by extends Thread {

   public by(MinecraftServer var1) {
      this.a = var1;
      super();
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(true) {
         try {
            while(true) {
               Thread.sleep(2147483647L);
            }
         } catch (InterruptedException var2) {
            ;
         }
      }
   }
}
