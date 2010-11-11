// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Logger;


public class PendingConnection extends Connection {

   public static Logger a = Logger.getLogger("Minecraft");
   private static Random d = new Random();
   public bf b;
   public boolean disconnected = false; // disconnected
   private MinecraftServer e;
   private int f = 0;
   private String clientId = null;
   private ClientHello h = null;
   private String serverId = "";


   public PendingConnection(MinecraftServer server, Socket socket, String description) throws IOException {
      this.e = server;
      this.b = new bf(socket, description, this);
   }

   public void checkStatus() {
      if(this.h != null) {
         this.checkLogin(this.h);
         this.h = null;
      }
      
      if(this.f++ == 100) {
         this.b("Took too long to log in");
      } else {
         this.b.a();
      }

   }

   public void b(String var1) {
      a.info("Disconnecting " + this.toString() + ": " + var1);
      this.b.a(new jp(var1));
      this.b.c();
      this.disconnected = true;
   }

   public void a(UserId var1) {
      if(this.e.l) {
         this.serverId = Long.toHexString(d.nextLong());
         this.b.a(new UserId(this.serverId));
      } else {
         this.b.a(new UserId("-"));
      }

   }

   public void a(ClientHello var1) {
      this.clientId = var1.b;
      if(var1.a != 3) {
         this.b("Outdated client!");
      } else {
         if(!this.e.l) {
            this.checkLogin(var1);
         } else {
            (new dp(this, var1)).start();
         }

      }
   }

   public void checkLogin(ClientHello var1) {
      eo var2 = this.e.f.a(this, var1.b, var1.c);
      if(var2 != null) {
         a.info(this.toString() + " logged in");
         ActiveConnection var3 = new ActiveConnection(this.e, this.b, var2);
         var3.b(new ClientHello("", "", 0, this.e.e.u, (byte)this.e.e.q.e));
         var3.b(new cm(this.e.e.m, this.e.e.n, this.e.e.o));
         this.e.f.a(var2);
         var3.a(var2.p, var2.q, var2.r, var2.v, var2.w);
         var3.d();
         this.e.c.a(var3);
         var3.b(new gd(this.e.e.e));
      }

      this.disconnected = true;
   }

   public void a(String var1) {
      a.info(this.toString() + " lost connection");
      this.disconnected = true;
   }

   public void a(BaseObject var1) {
      this.b("Protocol error");
   }

   public String toString() {
      return this.clientId != null ? this.clientId + " [" + this.b.getRemoteSocketAddress().toString() + "]" : this.b.getRemoteSocketAddress().toString();
   }

   public static String getServerId(PendingConnection conn) {
	  return conn.serverId;
   }

   public static ClientHello setServerAuthSomething(PendingConnection var1, ClientHello var2) {
	 var1.h = var2;
	 return var2;
   }
}
