// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:58
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import net.minecraft.server.MinecraftServer;

public class ca extends Thread {

   public ca(MinecraftServer var1) {
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
