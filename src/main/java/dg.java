// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.net.Socket;


class dg extends Thread {

   private dp b;
private MinecraftServer a;

dg(dp var1, String var2, MinecraftServer var3) {
	   super(var2);
      this.b = var1;
      this.a = var3;
   }

   public void run() {
      while(this.b.b) {
         try {
        	 Socket var1 = dp.a(this.b).accept();
            if(var1 != null) {
               fo var2 = new fo(this.a, var1, "Connection #" + dp.b(this.b));
               dp.a(this.b, var2);
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

   }
}
