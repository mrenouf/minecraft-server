// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import net.minecraft.server.MinecraftServer;

public final class bw extends Thread {

   public bw(String var1, MinecraftServer var2) {
      this.a = var2;
      super(var1);
   }

   public void run() {
      this.a.run();
   }
}
