// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:53
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class gp {

   private Set a = new HashSet();
   private hz b = new hz();
   private MinecraftServer c;
   private int d;


   public gp(MinecraftServer var1) {
      this.c = var1;
      this.d = var1.f.a();
   }

   public void a(dv var1) {
      if(var1 instanceof eo) {
         this.a(var1, 512, 2);
         eo var2 = (eo)var1;
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            gq var4 = (gq)var3.next();
            if(var4.a != var2) {
               var4.a(var2);
            }
         }
      } else if(var1 instanceof jz) {
         this.a(var1, 64, 20);
      } else if(var1 instanceof gf) {
         this.a(var1, 64, 20);
      } else if(var1 instanceof jh) {
         this.a(var1, 160, 4);
      } else if(var1 instanceof fh) {
         this.a(var1, 160, 4);
      } else if(var1 instanceof ad) {
         this.a(var1, 160, 2);
      }

   }

   public void a(dv var1, int var2, int var3) {
      if(var2 > this.d) {
         var2 = this.d;
      }

      if(this.b.b(var1.g)) {
         throw new IllegalStateException("Entity is already tracked!");
      } else {
         gq var4 = new gq(var1, var2, var3);
         this.a.add(var4);
         this.b.a(var1.g, var4);
         var4.b(this.c.e.d);
      }
   }

   public void b(dv var1) {
      gq var2 = (gq)this.b.d(var1.g);
      if(var2 != null) {
         this.a.remove(var2);
         var2.a();
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         gq var3 = (gq)var2.next();
         var3.a(this.c.e.d);
         if(var3.j && var3.a instanceof eo) {
            var1.add((eo)var3.a);
         }
      }

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         eo var7 = (eo)var1.get(var6);
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            gq var5 = (gq)var4.next();
            if(var5.a != var7) {
               var5.a(var7);
            }
         }
      }

   }

   public void a(dv var1, BaseObject var2) {
      gq var3 = (gq)this.b.a(var1.g);
      if(var3 != null) {
         var3.a(var2);
      }

   }
}
