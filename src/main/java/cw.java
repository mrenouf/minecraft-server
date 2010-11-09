// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:05:30
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class cw {

   public static Logger a = Logger.getLogger("Minecraft");
   private File b;


   public cw(File var1) {
      this.b = var1;
      var1.mkdir();
   }

   public void a(eo var1) {
      try {
         t var2 = new t();
         var1.d(var2);
         File var3 = new File(this.b, "_tmp_.dat");
         File var4 = new File(this.b, var1.ar + ".dat");
         am.a(var2, new FileOutputStream(var3));
         if(var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         a.warning("Failed to save player data for " + var1.ar);
      }

   }

   public void b(eo var1) {
      try {
         File var2 = new File(this.b, var1.ar + ".dat");
         if(var2.exists()) {
            t var3 = am.a(new FileInputStream(var2));
            if(var3 != null) {
               var1.e(var3);
            }
         }
      } catch (Exception var4) {
         a.warning("Failed to load player data for " + var1.ar);
      }

   }

}
