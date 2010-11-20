// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com



public final class bw extends Thread {

   private MinecraftServer a;

public bw(String var1, MinecraftServer var2) {
	   super(var1);
      this.a = var2;
   }

   public void run() {
      this.a.run();
   }
}
