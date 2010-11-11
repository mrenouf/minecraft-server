// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:34
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class dp extends Thread {
	final ClientHello a;
	final PendingConnection connection;

   dp(PendingConnection var1, ClientHello var2) {
      super();
      this.connection = var1;
      this.a = var2;
   }

   public void run() {
      try {
         String serverId = PendingConnection.getServerId(this.connection);
         URL var2 = new URL("http://www.minecraft.net/game/checkserver.jsp?user=" + this.a.b + "&serverId=" + serverId);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String reply = var3.readLine();
         var3.close();
         System.out.println("THE REPLY IS " + reply);
         if(reply.equals("YES")) {
            PendingConnection.setServerAuthSomething(this.connection, this.a);
         } else {
            this.connection.b("Failed to verify username!");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }
}
