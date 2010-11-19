// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:45
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class gr {

   private Set a = new HashSet();
   private ib b = new ib();
   private MinecraftServer c;
   private int d;


   public gr(MinecraftServer var1) {
      this.c = var1;
      this.d = var1.f.a();
   }

   public void a(dw var1) {
      if(var1 instanceof ep) {
         this.a(var1, 512, 2);
         ep var2 = (ep)var1;
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            gs var4 = (gs)var3.next();
            if(var4.a != var2) {
               var4.a(var2);
            }
         }
      } else if(var1 instanceof kb) {
         this.a(var1, 64, 5, true);
      } else if(var1 instanceof gh) {
         this.a(var1, 64, 20, true);
      } else if(var1 instanceof jj) {
         this.a(var1, 160, 5, true);
      } else if(var1 instanceof fi) {
         this.a(var1, 160, 5, true);
      } else if(var1 instanceof af) {
         this.a(var1, 160, 3);
      }

   }

   public void a(dw var1, int var2, int var3) {
      this.a(var1, var2, var3, false);
   }

   public void a(dw var1, int var2, int var3, boolean var4) {
      if(var2 > this.d) {
         var2 = this.d;
      }

      if(this.b.b(var1.g)) {
         throw new IllegalStateException("Entity is already tracked!");
      } else {
         gs var5 = new gs(var1, var2, var3, var4);
         this.a.add(var5);
         this.b.a(var1.g, var5);
         var5.b(this.c.e.d);
      }
   }

   public void b(dw var1) {
      gs var2 = (gs)this.b.d(var1.g);
      if(var2 != null) {
         this.a.remove(var2);
         var2.a();
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         gs var3 = (gs)var2.next();
         var3.a(this.c.e.d);
         if(var3.n && var3.a instanceof ep) {
            var1.add((ep)var3.a);
         }
      }

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         ep var7 = (ep)var1.get(var6);
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            gs var5 = (gs)var4.next();
            if(var5.a != var7) {
               var5.a(var7);
            }
         }
      }

   }

   public void a(dw var1, io var2) {
      gs var3 = (gs)this.b.a(var1.g);
      if(var3 != null) {
         var3.a(var2);
      }

   }
}
