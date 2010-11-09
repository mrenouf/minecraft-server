// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class il extends Thread {

   il(bf var1, String var2) {
      this.a = var1;
      super(var2);
   }

   public void run() {
      Object var1 = bf.a;
      synchronized(bf.a) {
         ++bf.c;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(!bf.a(this.a)) {
               var11 = false;
               break;
            }

            bf.d(this.a);
         } finally {
            if(var11) {
               Object var5 = bf.a;
               synchronized(bf.a) {
                  --bf.c;
               }
            }
         }
      }

      var1 = bf.a;
      synchronized(bf.a) {
         --bf.c;
      }
   }
}
