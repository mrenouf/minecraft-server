// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class ik extends Thread {

   ik(bf var1, String var2) {
      this.a = var1;
      super(var2);
   }

   public void run() {
      Object var1 = bf.a;
      synchronized(bf.a) {
         ++bf.b;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(bf.a(this.a)) {
               if(!bf.b(this.a)) {
                  bf.c(this.a);
                  continue;
               }

               var11 = false;
               break;
            }

            var11 = false;
            break;
         } finally {
            if(var11) {
               Object var5 = bf.a;
               synchronized(bf.a) {
                  --bf.b;
               }
            }
         }
      }

      var1 = bf.a;
      synchronized(bf.a) {
         --bf.b;
      }
   }
}
