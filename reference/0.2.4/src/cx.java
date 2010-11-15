// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:08
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class cx {

   public static Logger a = Logger.getLogger("Minecraft");
   private File b;


   public cx(File var1) {
      this.b = var1;
      var1.mkdir();
   }

   public void a(ep var1) {
      try {
         v var2 = new v();
         var1.d(var2);
         File var3 = new File(this.b, "_tmp_.dat");
         File var4 = new File(this.b, var1.ar + ".dat");
         ao.a(var2, new FileOutputStream(var3));
         if(var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         a.warning("Failed to save player data for " + var1.ar);
      }

   }

   public void b(ep var1) {
      try {
         File var2 = new File(this.b, var1.ar + ".dat");
         if(var2.exists()) {
            v var3 = ao.a(new FileInputStream(var2));
            if(var3 != null) {
               var1.e(var3);
            }
         }
      } catch (Exception var4) {
         a.warning("Failed to load player data for " + var1.ar);
      }

   }

}
