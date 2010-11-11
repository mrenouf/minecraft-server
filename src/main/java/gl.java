// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:52
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class gl {

   public static Logger a = Logger.getLogger("Minecraft");
   public List<eo> b = new ArrayList<eo>();
   private MinecraftServer c;
   private ia d;
   private int e;
   private Set<String> f = new HashSet<String>();
   private Set<String> g = new HashSet<String>();
   private Set<String> h = new HashSet<String>();
   private File i;
   private File j;
   private File k;
   private cw l;


   public gl(MinecraftServer var1) {
      this.c = var1;
      this.i = var1.a("banned-players.txt");
      this.j = var1.a("banned-ips.txt");
      this.k = var1.a("ops.txt");
      this.d = new ia(var1);
      this.e = var1.d.a("max-players", 20);
      this.e();
      this.g();
      this.i();
      this.f();
      this.h();
      this.j();
   }

   public void a(es var1) {
      this.l = new cw(new File(var1.t, "players"));
   }

   public int a() {
      return this.d.b();
   }

   public void a(eo var1) {
      this.b.add(var1);
      this.l.b(var1);
      this.c.e.A.d((int)var1.p >> 4, (int)var1.r >> 4);

      while(this.c.e.a(var1, var1.z).size() != 0) {
         var1.a(var1.p, var1.q + 1.0D, var1.r);
      }

      this.c.e.a(var1);
      this.d.a(var1);
   }

   public void b(eo var1) {
      this.d.c(var1);
   }

   public void c(eo var1) {
      this.d.b(var1);
      this.l.a(var1);
      this.c.e.d(var1);
      this.b.remove(var1);
   }

   public eo a(PendingConnection var1, String var2, String var3) {
      if(this.f.contains(var2.trim().toLowerCase())) {
         var1.b("You are banned from this server!");
         return null;
      } else {
         String var4 = var1.b.getRemoteSocketAddress().toString();
         var4 = var4.substring(var4.indexOf("/") + 1);
         var4 = var4.substring(0, var4.indexOf(":"));
         if(this.g.contains(var4)) {
            var1.b("Your IP address is banned from this server!");
            return null;
         } else if(this.b.size() >= this.e) {
            var1.b("The server is full!");
            return null;
         } else {
            for(int var5 = 0; var5 < this.b.size(); ++var5) {
               eo var6 = (eo)this.b.get(var5);
               if(var6.ar.equalsIgnoreCase(var2)) {
                  var6.a.c("You logged in from another location");
               }
            }

            return new eo(this.c, this.c.e, var2, new jo(this.c.e));
         }
      }
   }

   public void b() {
      this.d.a();
   }

   public void a(int var1, int var2, int var3) {
      this.d.a(var1, var2, var3);
   }

   public void a(BaseObject var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         eo var3 = (eo)this.b.get(var2);
         var3.a.b(var1);
      }

   }

   public String c() {
      String var1 = "";

      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         if(var2 > 0) {
            var1 = var1 + ", ";
         }

         var1 = var1 + ((eo)this.b.get(var2)).ar;
      }

      return var1;
   }

   public void a(String var1) {
      this.f.add(var1.toLowerCase());
      this.f();
   }

   public void b(String var1) {
      this.f.remove(var1.toLowerCase());
      this.f();
   }

   private void e() {
      try {
         this.f.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.i));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.f.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         a.warning("Failed to load ban list: " + var3);
      }

   }

   private void f() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.i, false));
         Iterator<String> var2 = this.f.iterator();

         while(var2.hasNext()) {
            String var3 = var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         a.warning("Failed to save ban list: " + var4);
      }

   }

   public void c(String var1) {
      this.g.add(var1.toLowerCase());
      this.h();
   }

   public void d(String var1) {
      this.g.remove(var1.toLowerCase());
      this.h();
   }

   private void g() {
      try {
         this.g.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.j));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.g.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         a.warning("Failed to load ip ban list: " + var3);
      }

   }

   private void h() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.j, false));
         Iterator<String> var2 = this.g.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         a.warning("Failed to save ip ban list: " + var4);
      }

   }

   public void e(String var1) {
      this.h.add(var1.toLowerCase());
      this.j();
   }

   public void f(String var1) {
      this.h.remove(var1.toLowerCase());
      this.j();
   }

   private void i() {
      try {
         this.h.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.k));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.h.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         a.warning("Failed to load ip ban list: " + var3);
      }

   }

   private void j() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.k, false));
         Iterator<String> var2 = this.h.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         a.warning("Failed to save ip ban list: " + var4);
      }

   }

   public boolean g(String var1) {
      return this.h.contains(var1.trim().toLowerCase());
   }

   public eo h(String var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         eo var3 = (eo)this.b.get(var2);
         if(var3.ar.equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void a(String var1, String var2) {
      eo var3 = this.h(var1);
      if(var3 != null) {
         var3.a.b(new be(var2));
      }

   }

   public void i(String var1) {
      be var2 = new be(var1);

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         eo var4 = (eo)this.b.get(var3);
         if(this.g(var4.ar)) {
            var4.a.b(var2);
         }
      }

   }

   public boolean a(String var1, BaseObject var2) {
      eo var3 = this.h(var1);
      if(var3 != null) {
         var3.a.b(var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2, int var3, av var4) {
      this.d.a(new ja(var1, var2, var3, var4), var1, var2, var3);
   }

   public void d() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         this.l.a((eo)this.b.get(var1));
      }

   }

}
