// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:04:44
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class bf {

   public static final Object a = new Object();
   public static int b;
   public static int c;
   private Object d = new Object();
   private Socket e;
   private DataInputStream f;
   private DataOutputStream g;
   private boolean h = true;
   private List<BaseObject> i = Collections.synchronizedList(new LinkedList<BaseObject>());
   private List<BaseObject> j = Collections.synchronizedList(new LinkedList<BaseObject>());
   private List<BaseObject> k = Collections.synchronizedList(new LinkedList<BaseObject>());
   private Connection connection;
   private boolean m = false;
   private Thread n;
   private Thread o;
   private boolean p = false;
   private String q = "";
   private int r = 0;
   private int s = 0;
   private int t = 0;


   public bf(Socket var1, String description, Connection var3) throws IOException {
      this.e = var1;
      this.connection = var3;
      var1.setTrafficClass(24);
      this.f = new DataInputStream(var1.getInputStream());
      this.g = new DataOutputStream(var1.getOutputStream());
      this.o = new ik(this, description + " read thread");
      this.n = new il(this, description + " write thread");
      this.o.start();
      this.n.start();
   }

   public void setConnection(Connection connection) {
      this.connection = connection;
   }

   public void a(BaseObject var1) {
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
         BaseObject var2;
         Object var3;
         if(!this.j.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (BaseObject)this.j.remove(0);
               this.s -= var2.a() + 1;
            }

            BaseObject.write(var2, this.g);
         }

         if((var1 || this.t-- <= 0) && !this.k.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (BaseObject)this.k.remove(0);
               this.s -= var2.a() + 1;
            }

            BaseObject.write(var2, this.g);
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
         BaseObject var1 = BaseObject.read(this.f);
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
         (new ii(this)).start();
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
         BaseObject baseObj = (BaseObject)this.i.remove(0);
         baseObj.a(this.connection);
      }

      if(this.p && this.i.isEmpty()) {
         this.connection.a(this.q);
      }

   }

   public SocketAddress getRemoteSocketAddress() {
      return this.e.getRemoteSocketAddress();
   }

   public void c() {
      this.m = true;
      this.o.interrupt();
      (new ij(this)).start();
   }

   public int d() {
      return this.k.size();
   }
   
   static java.lang.Thread f(bf var1) {
      return var1.n;
   }

   public static boolean a(bf var1) {
	 return var1.h;
   }

   public static boolean b(bf var1) {
      return var1.m;
   }

   public static void c(bf var1) {
      var1.f();
   }

   public static void d(bf var1) {
	   var1.e();
   }

   public static Thread e(bf var1) {
      return var1.o;
   }
}
