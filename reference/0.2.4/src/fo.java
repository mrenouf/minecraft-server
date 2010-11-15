// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.net.Socket;
import java.util.Random;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class fo extends ey {

   public static Logger a = Logger.getLogger("Minecraft");
   private static Random d = new Random();
   public bh b;
   public boolean c = false;
   private MinecraftServer e;
   private int f = 0;
   private String g = null;
   private ad h = null;
   private String i = "";


   public fo(MinecraftServer var1, Socket var2, String var3) {
      this.e = var1;
      this.b = new bh(var2, var3, this);
   }

   public void a() {
      if(this.h != null) {
         this.b(this.h);
         this.h = null;
      }

      if(this.f++ == 600) {
         this.b("Took too long to log in");
      } else {
         this.b.a();
      }

   }

   public void b(String var1) {
      a.info("Disconnecting " + this.b() + ": " + var1);
      this.b.a(new jr(var1));
      this.b.c();
      this.c = true;
   }

   public void a(f var1) {
      if(this.e.l) {
         this.i = Long.toHexString(d.nextLong());
         this.b.a(new f(this.i));
      } else {
         this.b.a(new f("-"));
      }

   }

   public void a(ad var1) {
      this.g = var1.b;
      if(var1.a != 4) {
         this.b("Outdated client!");
      } else {
         if(!this.e.l) {
            this.b(var1);
         } else {
            (new dq(this, var1)).start();
         }

      }
   }

   public void b(ad var1) {
      ep var2 = this.e.f.a(this, var1.b, var1.c);
      if(var2 != null) {
         a.info(this.b() + " logged in with entity id " + var2.g);
         je var3 = new je(this.e, this.b, var2);
         var3.b(new ad("", "", var2.g, this.e.e.u, (byte)this.e.e.q.g));
         var3.b(new cn(this.e.e.m, this.e.e.n, this.e.e.o));
         this.e.f.a(var2);
         var3.a(var2.p, var2.q, var2.r, var2.v, var2.w);
         var3.d();
         this.e.c.a(var3);
         var3.b(new gf(this.e.e.e));
      }

      this.c = true;
   }

   public void a(String var1) {
      a.info(this.b() + " lost connection");
      this.c = true;
   }

   public void a(io var1) {
      this.b("Protocol error");
   }

   public String b() {
      return this.g != null?this.g + " [" + this.b.b().toString() + "]":this.b.b().toString();
   }

}
