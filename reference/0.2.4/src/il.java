// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class il extends Thread {

   il(bh var1) {
      this.a = var1;
      super();
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if(bh.a(this.a)) {
            bh.f(this.a).interrupt();
            this.a.a("Connection closed");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
