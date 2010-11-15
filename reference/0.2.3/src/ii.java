// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:12
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class ii extends Thread {

   ii(bf var1) {
      this.a = var1;
      super();
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(bf.e(this.a).isAlive()) {
            try {
               bf.e(this.a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(bf.f(this.a).isAlive()) {
            try {
               bf.f(this.a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
