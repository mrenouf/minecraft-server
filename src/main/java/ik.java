// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:54
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


class ik extends Thread {

   private bh a;

ik(bh var1) {
	   super();
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(bh.e(this.a).isAlive()) {
            try {
               bh.e(this.a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(bh.f(this.a).isAlive()) {
            try {
               bh.f(this.a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
