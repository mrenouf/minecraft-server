// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class ij extends Thread {

   private bf a;

   ij(bf var1) {
      super();
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if(bf.a(this.a)) {
            bf.f(this.a).interrupt();
            this.a.a("Connection closed");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
