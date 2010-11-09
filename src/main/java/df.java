// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:32
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.net.Socket;
import net.minecraft.server.MinecraftServer;

class df extends Thread {

   df(do var1, String var2, MinecraftServer var3) {
      this.b = var1;
      this.a = var3;
      super(var2);
   }

   public void run() {
      while(this.b.b) {
         try {
            Socket var1 = do.a(this.b).accept();
            if(var1 != null) {
               fn var2 = new fn(this.a, var1, "Connection #" + do.b(this.b));
               do.a(this.b, var2);
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

   }
}
