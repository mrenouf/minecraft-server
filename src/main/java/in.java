// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class in extends Thread {

   private bh a;

in(bh var1, String var2) {
	   super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = bh.a;
      synchronized(bh.a) {
         ++bh.c;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(!bh.a(this.a)) {
               var11 = false;
               break;
            }

            bh.d(this.a);
         } finally {
            if(var11) {
               Object var5 = bh.a;
               synchronized(bh.a) {
                  --bh.c;
               }
            }
         }
      }

      var1 = bh.a;
      synchronized(bh.a) {
         --bh.c;
      }
   }
}
