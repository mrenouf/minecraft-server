// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:43
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class bh {

   public static final Object a = new Object();
   public static int b;
   public static int c;
   private Object d = new Object();
   private Socket e;
   private DataInputStream f;
   private DataOutputStream g;
   private boolean h = true;
   private List i = Collections.synchronizedList(new LinkedList());
   private List j = Collections.synchronizedList(new LinkedList());
   private List k = Collections.synchronizedList(new LinkedList());
   private ey l;
   private boolean m = false;
   private Thread n;
   private Thread o;
   private boolean p = false;
   private String q = "";
   private int r = 0;
   private int s = 0;
   private int t = 0;


   public bh(Socket var1, String var2, ey var3) {
      this.e = var1;
      this.l = var3;
      var1.setTrafficClass(24);
      this.f = new DataInputStream(var1.getInputStream());
      this.g = new DataOutputStream(var1.getOutputStream());
      this.o = new im(this, var2 + " read thread");
      this.n = new in(this, var2 + " write thread");
      this.o.start();
      this.n.start();
   }

   public void a(ey var1) {
      this.l = var1;
   }

   public void a(io var1) {
      if(!this.m) {
         Object var2 = this.d;
         synchronized(this.d) {
            this.s += var1.a() + 1;
            if(var1.j) {
               this.k.add(var1);
            } else {
               this.j.add(var1);
            }

         }
      }
   }

   private void e() {
      try {
         boolean var1 = true;
         io var2;
         Object var3;
         if(!this.j.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (io)this.j.remove(0);
               this.s -= var2.a() + 1;
            }

            io.a(var2, this.g);
         }

         if((var1 || this.t-- <= 0) && !this.k.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (io)this.k.remove(0);
               this.s -= var2.a() + 1;
            }

            io.a(var2, this.g);
            this.t = 50;
         }

         if(var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var8) {
         ;
      } catch (Exception var9) {
         if(!this.p) {
            this.a(var9);
         }
      }

   }

   private void f() {
      try {
         io var1 = io.b(this.f);
         if(var1 != null) {
            this.i.add(var1);
         } else {
            this.a("End of stream");
         }
      } catch (Exception var2) {
         if(!this.p) {
            this.a(var2);
         }
      }

   }

   private void a(Exception var1) {
      var1.printStackTrace();
      this.a("Internal exception: " + var1.toString());
   }

   public void a(String var1) {
      if(this.h) {
         this.p = true;
         this.q = var1;
         (new ik(this)).start();
         this.h = false;

         try {
            this.f.close();
         } catch (Throwable var5) {
            ;
         }

         try {
            this.g.close();
         } catch (Throwable var4) {
            ;
         }

         try {
            this.e.close();
         } catch (Throwable var3) {
            ;
         }

      }
   }

   public void a() {
      if(this.s > 1048576) {
         this.a("Send buffer overflow");
      }

      if(this.i.isEmpty()) {
         if(this.r++ == 1200) {
            this.a("Timed out");
         }
      } else {
         this.r = 0;
      }

      int var1 = 100;

      while(!this.i.isEmpty() && var1-- >= 0) {
         io var2 = (io)this.i.remove(0);
         var2.a(this.l);
      }

      if(this.p && this.i.isEmpty()) {
         this.l.a(this.q);
      }

   }

   public SocketAddress b() {
      return this.e.getRemoteSocketAddress();
   }

   public void c() {
      this.m = true;
      this.o.interrupt();
      (new il(this)).start();
   }

   public int d() {
      return this.k.size();
   }

}
