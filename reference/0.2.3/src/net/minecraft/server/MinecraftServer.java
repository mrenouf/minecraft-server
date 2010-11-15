// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:08:14
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

package net.minecraft.server;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MinecraftServer implements et, Runnable {

   public static Logger a = Logger.getLogger("Minecraft");
   public static HashMap b = new HashMap();
   public do c;
   public dc d;
   public es e;
   public gl f;
   private boolean m = true;
   public boolean g = false;
   int h = 0;
   public String i;
   public int j;
   private List n = new ArrayList();
   private List o = Collections.synchronizedList(new ArrayList());
   public gp k;
   public boolean l;


   public MinecraftServer() {
      new by(this);
   }

   private boolean d() {
      bw var1 = new bw(this);
      var1.setDaemon(true);
      var1.start();
      gc.a();
      a.info("Starting minecraft server version 0.2.3");
      if(Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         a.warning("**** NOT ENOUGH RAM!");
         a.warning("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      a.info("Loading properties");
      this.d = new dc(new File("server.properties"));
      String var2 = this.d.a("server-ip", "");
      this.l = this.d.a("online-mode", true);
      InetAddress var3 = null;
      if(var2.length() > 0) {
         var3 = InetAddress.getByName(var2);
      }

      int var4 = this.d.a("server-port", 25565);
      a.info("Starting Minecraft server on " + (var2.length() == 0?"*":var2) + ":" + var4);

      try {
         this.c = new do(this, var3, var4);
      } catch (IOException var6) {
         a.warning("**** FAILED TO BIND TO PORT!");
         a.log(Level.WARNING, "The exception was: " + var6.toString());
         a.warning("Perhaps a server is already running on that port?");
         return false;
      }

      if(!this.l) {
         a.warning("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         a.warning("The server will make no attempt to authenticate usernames. Beware.");
         a.warning("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
         a.warning("To change this, set \"online-mode\" to \"true\" in the server.settings file.");
      }

      this.f = new gl(this);
      this.k = new gp(this);
      String var5 = this.d.a("level-name", "world");
      a.info("Preparing level \"" + var5 + "\"");
      this.c(var5);
      a.info("Done! For help, type \"help\" or \"?\"");
      return true;
   }

   private void c(String var1) {
      a.info("Preparing start region");
      this.e = new es(new File("."), var1, this.d.a("hellworld", false)?-1:0);
      this.e.a(new ep(this));
      this.e.k = this.d.a("monsters", false)?1:0;
      this.f.a(this.e);
      byte var2 = 10;

      for(int var3 = -var2; var3 <= var2; ++var3) {
         this.a("Preparing spawn area", (var3 + var2) * 100 / (var2 + var2 + 1));

         for(int var4 = -var2; var4 <= var2; ++var4) {
            if(!this.m) {
               return;
            }

            this.e.A.d((this.e.m >> 4) + var3, (this.e.o >> 4) + var4);
         }
      }

      this.e();
   }

   private void a(String var1, int var2) {
      this.i = var1;
      this.j = var2;
      System.out.println(var1 + ": " + var2 + "%");
   }

   private void e() {
      this.i = null;
      this.j = 0;
   }

   private void f() {
      a.info("Saving chunks");
      this.e.a(true, (iv)null);
   }

   private void g() {
      a.info("Stopping server");
      if(this.f != null) {
         this.f.d();
      }

      if(this.e != null) {
         this.f();
      }

   }

   public void a() {
      this.m = false;
   }

   public void run() {
      try {
         if(this.d()) {
            long var1 = System.currentTimeMillis();
            long var3 = 0L;

            while(this.m) {
               long var5 = System.currentTimeMillis();
               long var7 = var5 - var1;
               if(var7 > 2000L) {
                  a.warning("Can\'t keep up! Did the system time change, or is the server overloaded?");
                  var7 = 2000L;
               }

               if(var7 < 0L) {
                  a.warning("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var3 += var7;
               var1 = var5;

               while(var3 > 50L) {
                  var3 -= 50L;
                  this.h();
               }

               Thread.sleep(1L);
            }
         } else {
            while(this.m) {
               this.b();

               try {
                  Thread.sleep(10L);
               } catch (InterruptedException var15) {
                  var15.printStackTrace();
               }
            }
         }
      } catch (Exception var16) {
         var16.printStackTrace();
         a.log(Level.SEVERE, "Unexpected exception", var16);

         while(this.m) {
            this.b();

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var14) {
               var14.printStackTrace();
            }
         }
      } finally {
         this.g();
         this.g = true;
         System.exit(0);
      }

   }

   private void h() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = b.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         int var4 = ((Integer)b.get(var3)).intValue();
         if(var4 > 0) {
            b.put(var3, Integer.valueOf(var4 - 1));
         } else {
            var1.add(var3);
         }
      }

      int var6;
      for(var6 = 0; var6 < var1.size(); ++var6) {
         b.remove(var1.get(var6));
      }

      ds.a();
      ba.a();
      ++this.h;
      if(this.h % 20 == 0) {
         this.f.a(new gd(this.e.e));
      }

      this.e.f();

      while(this.e.d()) {
         ;
      }

      this.e.c();
      this.c.a();
      this.f.b();
      this.k.a();

      for(var6 = 0; var6 < this.n.size(); ++var6) {
         ((ei)this.n.get(var6)).a();
      }

      try {
         this.b();
      } catch (Exception var5) {
         a.log(Level.WARNING, "Unexpected exception while parsing console command", var5);
      }

   }

   public void a(String var1, et var2) {
      this.o.add(new al(var1, var2));
   }

   public void b() {
      while(this.o.size() > 0) {
         al var1 = (al)this.o.remove(0);
         String var2 = var1.a;
         et var3 = var1.b;
         String var4 = var3.c();
         if(!var2.toLowerCase().startsWith("help") && !var2.toLowerCase().startsWith("?")) {
            if(var2.toLowerCase().startsWith("list")) {
               var3.b("Connected players: " + this.f.c());
            } else if(var2.toLowerCase().startsWith("stop")) {
               this.a(var4, "Stopping the server..");
               this.m = false;
            } else if(var2.toLowerCase().startsWith("save-all")) {
               this.a(var4, "Forcing save..");
               this.e.a(true, (iv)null);
               this.a(var4, "Save complete.");
            } else if(var2.toLowerCase().startsWith("save-off")) {
               this.a(var4, "Disabling level saving..");
               this.e.C = true;
            } else if(var2.toLowerCase().startsWith("save-on")) {
               this.a(var4, "Enabling level saving..");
               this.e.C = false;
            } else {
               String var11;
               if(var2.toLowerCase().startsWith("op ")) {
                  var11 = var2.substring(var2.indexOf(" ")).trim();
                  this.f.e(var11);
                  this.a(var4, "Opping " + var11);
                  this.f.a(var11, "\u00a7eYou are now op!");
               } else if(var2.toLowerCase().startsWith("deop ")) {
                  var11 = var2.substring(var2.indexOf(" ")).trim();
                  this.f.f(var11);
                  this.f.a(var11, "\u00a7eYou are no longer op!");
                  this.a(var4, "De-opping " + var11);
               } else if(var2.toLowerCase().startsWith("ban-ip ")) {
                  var11 = var2.substring(var2.indexOf(" ")).trim();
                  this.f.c(var11);
                  this.a(var4, "Banning ip " + var11);
               } else if(var2.toLowerCase().startsWith("pardon-ip ")) {
                  var11 = var2.substring(var2.indexOf(" ")).trim();
                  this.f.d(var11);
                  this.a(var4, "Pardoning ip " + var11);
               } else {
                  eo var12;
                  if(var2.toLowerCase().startsWith("ban ")) {
                     var11 = var2.substring(var2.indexOf(" ")).trim();
                     this.f.a(var11);
                     this.a(var4, "Banning " + var11);
                     var12 = this.f.h(var11);
                     if(var12 != null) {
                        var12.a.c("Banned by admin");
                     }
                  } else if(var2.toLowerCase().startsWith("pardon ")) {
                     var11 = var2.substring(var2.indexOf(" ")).trim();
                     this.f.b(var11);
                     this.a(var4, "Pardoning " + var11);
                  } else if(var2.toLowerCase().startsWith("kick ")) {
                     var11 = var2.substring(var2.indexOf(" ")).trim();
                     var12 = null;

                     for(int var14 = 0; var14 < this.f.b.size(); ++var14) {
                        eo var13 = (eo)this.f.b.get(var14);
                        if(var13.ar.equalsIgnoreCase(var11)) {
                           var12 = var13;
                        }
                     }

                     if(var12 != null) {
                        var12.a.c("Kicked by admin");
                        this.a(var4, "Kicking " + var12.ar);
                     } else {
                        var3.b("Can\'t find user " + var11 + ". No kick.");
                     }
                  } else {
                     String[] var5;
                     eo var7;
                     if(var2.toLowerCase().startsWith("tp ")) {
                        var5 = var2.split(" ");
                        if(var5.length == 3) {
                           var12 = this.f.h(var5[1]);
                           var7 = this.f.h(var5[2]);
                           if(var12 == null) {
                              var3.b("Can\'t find user " + var5[1] + ". No tp.");
                           } else if(var7 == null) {
                              var3.b("Can\'t find user " + var5[2] + ". No tp.");
                           } else {
                              var12.a.a(var7.p, var7.q, var7.r, var7.v, var7.w);
                              this.a(var4, "Teleporting " + var5[1] + " to " + var5[2] + ".");
                           }
                        } else {
                           var3.b("Syntax error, please provice a source and a target.");
                        }
                     } else if(var2.toLowerCase().startsWith("give ")) {
                        var5 = var2.split(" ");
                        if(var5.length != 3 && var5.length != 4) {
                           return;
                        }

                        String var6 = var5[1];
                        var7 = this.f.h(var6);
                        if(var7 != null) {
                           try {
                              int var8 = Integer.parseInt(var5[2]);
                              if(fq.c[var8] != null) {
                                 this.a(var4, "Giving " + var7.ar + " some " + var8);
                                 int var9 = 1;
                                 if(var5.length > 3) {
                                    var9 = this.b(var5[3], 1);
                                 }

                                 if(var9 < 1) {
                                    var9 = 1;
                                 }

                                 if(var9 > 64) {
                                    var9 = 64;
                                 }

                                 var7.a(new hh(var8, var9));
                              } else {
                                 var3.b("There\'s no item with id " + var8);
                              }
                           } catch (NumberFormatException var10) {
                              var3.b("There\'s no item with id " + var5[2]);
                           }
                        } else {
                           var3.b("Can\'t find user " + var6);
                        }
                     } else if(var2.toLowerCase().startsWith("say ")) {
                        var2 = var2.substring(var2.indexOf(" ")).trim();
                        a.info("[" + var4 + "] " + var2);
                        this.f.a(new be("\u00a7d[Server] " + var2));
                     } else if(var2.toLowerCase().startsWith("tell ")) {
                        var5 = var2.split(" ");
                        if(var5.length >= 3) {
                           var2 = var2.substring(var2.indexOf(" ")).trim();
                           var2 = var2.substring(var2.indexOf(" ")).trim();
                           a.info("[" + var4 + "->" + var5[1] + "] " + var2);
                           var2 = "\u00a77" + var4 + " whispers " + var2;
                           a.info(var2);
                           if(!this.f.a(var5[1], new be(var2))) {
                              var3.b("There\'s no player by that name online.");
                           }
                        }
                     } else {
                        a.info("Unknown console command. Type \"help\" for help.");
                     }
                  }
               }
            }
         } else {
            var3.b("To run the server without a gui, start it like this:");
            var3.b("   java -Xmx1024M -Xms1024M -jar minecraft_server.jar nogui");
            var3.b("Console commands:");
            var3.b("   help  or  ?               shows this message");
            var3.b("   kick <player>             removes a player from the server");
            var3.b("   ban <player>              bans a player from the server");
            var3.b("   pardon <player>           pardons a banned player so that they can connect again");
            var3.b("   ban-ip <ip>               bans an IP address from the server");
            var3.b("   pardon-ip <ip>            pardons a banned IP address so that they can connect again");
            var3.b("   op <player>               turns a player into an op");
            var3.b("   deop <player>             removes op status from a player");
            var3.b("   tp <player1> <player2>    moves one player to the same location as another player");
            var3.b("   give <player> <id> [num]  gives a player a resource");
            var3.b("   tell <player> <message>   sends a private message to a player");
            var3.b("   stop                      gracefully stops the server");
            var3.b("   save-all                  forces a server-wide level save");
            var3.b("   save-off                  disables terrain saving (useful for backup scripts)");
            var3.b("   save-on                   re-enables terrain saving");
            var3.b("   list                      lists all currently connected players");
            var3.b("   say <message>             broadcasts a message to all players");
         }
      }

   }

   private void a(String var1, String var2) {
      String var3 = var1 + ": " + var2;
      this.f.i("\u00a77(" + var3 + ")");
      a.info(var3);
   }

   private int b(String var1, int var2) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         return var2;
      }
   }

   public void a(ei var1) {
      this.n.add(var1);
   }

   public static void main(String[] var0) {
      try {
         MinecraftServer var1 = new MinecraftServer();
         if(!GraphicsEnvironment.isHeadless() && (var0.length <= 0 || !var0[0].equals("nogui"))) {
            gg.a(var1);
         }

         (new bv("Server thread", var1)).start();
      } catch (Exception var2) {
         a.log(Level.SEVERE, "Failed to start the minecraft server", var2);
      }

   }

   public File a(String var1) {
      return new File(var1);
   }

   public void b(String var1) {
      a.info(var1);
   }

   public String c() {
      return "CONSOLE";
   }

}
