// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:10
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dp {

   public static Logger a = Logger.getLogger("Minecraft");
   private ServerSocket d;
   private Thread e;
   public volatile boolean b = false;
   private int f = 0;
   private ArrayList g = new ArrayList();
   private ArrayList h = new ArrayList();
   public MinecraftServer c;


   public dp(MinecraftServer var1, InetAddress var2, int var3) throws IOException {
      this.c = var1;
      this.d = new ServerSocket(var3, 0, var2);
      this.d.setPerformancePreferences(0, 2, 1);
      this.b = true;
      this.e = new dg(this, "Listen thread", var1);
      this.e.start();
   }

   public void a(je var1) {
      this.h.add(var1);
   }

   private void a(fo var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      } else {
         this.g.add(var1);
      }
   }

   public void a() {
      int var1;
      for(var1 = 0; var1 < this.g.size(); ++var1) {
         fo var2 = (fo)this.g.get(var1);

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
         je var6 = (je)this.h.get(var1);

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

public static void a(dp var1, fo var2) {
	var1.a(var2);
}

public static ServerSocket a(dp var1) {
	return var1.d;
}

public static int b(dp var1) {
	var1.f++;
	return var1.f;
}

}
