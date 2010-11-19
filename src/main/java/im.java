// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class im extends Thread {

   im(bh var1, String var2) {
      this.a = var1;
      super(var2);
   }

   public void run() {
      Object var1 = bh.a;
      synchronized(bh.a) {
         ++bh.b;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(bh.a(this.a)) {
               if(!bh.b(this.a)) {
                  bh.c(this.a);
                  continue;
               }

               var11 = false;
               break;
            }

            var11 = false;
            break;
         } finally {
            if(var11) {
               Object var5 = bh.a;
               synchronized(bh.a) {
                  --bh.b;
               }
            }
         }
      }

      var1 = bh.a;
      synchronized(bh.a) {
         --bh.b;
      }
   }
}
