// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.net.Socket;

/** Listen thread */
class ClientListenThread extends Thread {

   private do_ b;
   private MinecraftServer a;

   ClientListenThread(do_ var1, String var2, MinecraftServer var3) {
      super(var2);
      this.b = var1;
      this.a = var3;
   }

   public void run() {
      while(this.b.b) {
         try {
            Socket var1 = do_.a(this.b).accept();
            if(var1 != null) {
               PendingConnection var2 = new PendingConnection(this.a, var1, "Connection #" + do_.b(this.b));
               do_.a(this.b, var2);
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

   }
}
