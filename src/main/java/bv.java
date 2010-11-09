// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:17
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import net.minecraft.server.MinecraftServer;

public final class bv extends Thread {

   private MinecraftServer a;

public bv(String var1, MinecraftServer var2) {
	   super(var1);
      this.a = var2;
   }

   public void run() {
      this.a.run();
   }
}
