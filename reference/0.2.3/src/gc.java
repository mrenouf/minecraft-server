// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:50
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gc {

   public static Logger a = Logger.getLogger("Minecraft");


   public static void a() {
      hq var0 = new hq();
      a.setUseParentHandlers(false);
      ConsoleHandler var1 = new ConsoleHandler();
      var1.setFormatter(var0);
      a.addHandler(var1);

      try {
         FileHandler var2 = new FileHandler("server.log");
         var2.setFormatter(var0);
         a.addHandler(var2);
      } catch (Exception var3) {
         a.log(Level.WARNING, "Failed to log to server.log", var3);
      }

   }

}
