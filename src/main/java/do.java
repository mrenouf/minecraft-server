// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:33
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class do {

   public static Logger a = Logger.getLogger("Minecraft");
   private ServerSocket d;
   private Thread e;
   public volatile boolean b = false;
   private int f = 0;
   private ArrayList g = new ArrayList();
   private ArrayList h = new ArrayList();
   public MinecraftServer c;


   public do(MinecraftServer var1, InetAddress var2, int var3) {
      this.c = var1;
      this.d = new ServerSocket(var3, 0, var2);
      this.d.setPerformancePreferences(0, 2, 1);
      this.b = true;
      this.e = new df(this, "Listen thread", var1);
      this.e.start();
   }

   public void a(jc var1) {
      this.h.add(var1);
   }

   private void a(fn var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      } else {
         this.g.add(var1);
      }
   }

   public void a() {
      int var1;
      for(var1 = 0; var1 < this.g.size(); ++var1) {
         fn var2 = (fn)this.g.get(var1);

         try {
            var2.a();
         } catch (Exception var5) {
            var2.b("Internal server error");
            a.log(Level.WARNING, "Failed to handle packet: " + var5, var5);
         }

         if(var2.c) {
            this.g.remove(var1--);
         }
      }

      for(var1 = 0; var1 < this.h.size(); ++var1) {
         jc var6 = (jc)this.h.get(var1);

         try {
            var6.a();
         } catch (Exception var4) {
            var6.c("Internal server error");
            a.log(Level.WARNING, "Failed to handle packet: " + var4, var4);
         }

         if(var6.c) {
            this.h.remove(var1--);
         }
      }

   }

}
