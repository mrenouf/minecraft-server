// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:58
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class by extends Thread {

   private MinecraftServer a;

public by(MinecraftServer var1) {
	   super();
      this.a = var1;
   }

   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
      String var2 = null;

      try {
         while(!this.a.g && MinecraftServer.a(this.a) && (var2 = var1.readLine()) != null) {
            this.a.a(var2, this.a);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
