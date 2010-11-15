// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:34
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class dp extends Thread {

   dp(fn var1, ab var2) {
      this.b = var1;
      this.a = var2;
      super();
   }

   public void run() {
      try {
         String var1 = fn.a(this.b);
         URL var2 = new URL("http://www.minecraft.net/game/checkserver.jsp?user=" + this.a.b + "&serverId=" + var1);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = var3.readLine();
         var3.close();
         System.out.println("THE REPLY IS " + var4);
         if(var4.equals("YES")) {
            fn.a(this.b, this.a);
         } else {
            this.b.b("Failed to verify username!");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }
}
