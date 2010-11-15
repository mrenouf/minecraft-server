// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:49
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jj implements br {

   private Set a = new HashSet();
   private jn b;
   private br c;
   private at d;
   private Map e = new HashMap();
   private List f = new ArrayList();
   private es g;


   public jj(es var1, at var2, br var3) {
      this.b = new jn(var1, new byte['\u8000'], 0, 0);
      this.b.q = true;
      this.b.p = true;
      this.g = var1;
      this.d = var2;
      this.c = var3;
   }

   public boolean a(int var1, int var2) {
      js var3 = new js(var1, var2);
      return this.e.containsKey(var3);
   }

   public void c(int var1, int var2) {
      int var3 = var1 * 16 + 8 - this.g.m;
      int var4 = var2 * 16 + 8 - this.g.o;
      byte var5 = 20;
      if(var3 < -var5 || var3 > var5 || var4 < -var5 || var4 > var5) {
         this.a.add(new js(var1, var2));
      }

   }

   public jn d(int var1, int var2) {
      js var3 = new js(var1, var2);
      this.a.remove(new js(var1, var2));
      jn var4 = (jn)this.e.get(var3);
      if(var4 == null) {
         var4 = this.e(var1, var2);
         if(var4 == null) {
            if(this.c == null) {
               var4 = this.b;
            } else {
               var4 = this.c.b(var1, var2);
            }
         }

         this.e.put(var3, var4);
         this.f.add(var4);
         var4.c();
         if(var4 != null) {
            var4.d();
         }

         if(!var4.n && this.a(var1 + 1, var2 + 1) && this.a(var1, var2 + 1) && this.a(var1 + 1, var2)) {
            this.a(this, var1, var2);
         }

         if(this.a(var1 - 1, var2) && !this.b(var1 - 1, var2).n && this.a(var1 - 1, var2 + 1) && this.a(var1, var2 + 1) && this.a(var1 - 1, var2)) {
            this.a(this, var1 - 1, var2);
         }

         if(this.a(var1, var2 - 1) && !this.b(var1, var2 - 1).n && this.a(var1 + 1, var2 - 1) && this.a(var1, var2 - 1) && this.a(var1 + 1, var2)) {
            this.a(this, var1, var2 - 1);
         }

         if(this.a(var1 - 1, var2 - 1) && !this.b(var1 - 1, var2 - 1).n && this.a(var1 - 1, var2 - 1) && this.a(var1, var2 - 1) && this.a(var1 - 1, var2)) {
            this.a(this, var1 - 1, var2 - 1);
         }
      }

      return var4;
   }

   public jn b(int var1, int var2) {
      js var3 = new js(var1, var2);
      jn var4 = (jn)this.e.get(var3);
      return var4 == null?(this.g.x?this.d(var1, var2):this.b):var4;
   }

   private jn e(int var1, int var2) {
      if(this.d == null) {
         return null;
      } else {
         try {
            jn var3 = this.d.a(this.g, var1, var2);
            if(var3 != null) {
               var3.s = this.g.e;
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private void a(jn var1) {
      if(this.d != null) {
         try {
            this.d.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void b(jn var1) {
      if(this.d != null) {
         try {
            var1.s = this.g.e;
            this.d.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(br var1, int var2, int var3) {
      jn var4 = this.b(var2, var3);
      if(!var4.n) {
         var4.n = true;
         if(this.c != null) {
            this.c.a(var1, var2, var3);
            var4.f();
         }
      }

   }

   public boolean a(boolean var1, iv var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         jn var5 = (jn)this.f.get(var4);
         if(var1 && !var5.p) {
            this.a(var5);
         }

         if(var5.a(var1)) {
            this.b(var5);
            var5.o = false;
            ++var3;
            if(var3 == 2 && !var1) {
               return false;
            }
         }
      }

      if(var1) {
         if(this.d == null) {
            return true;
         }

         this.d.b();
      }

      return true;
   }

   public boolean a() {
      if(!this.g.C) {
         for(int var1 = 0; var1 < 16; ++var1) {
            if(!this.a.isEmpty()) {
               js var2 = (js)this.a.iterator().next();
               jn var3 = this.b(var2.a, var2.b);
               var3.e();
               this.b(var3);
               this.a(var3);
               this.a.remove(var2);
               this.e.remove(var2);
               this.f.remove(var3);
            }
         }

         if(this.d != null) {
            this.d.a();
         }
      }

      return this.c.a();
   }

   public boolean b() {
      return !this.g.C;
   }
}
