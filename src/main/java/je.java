// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:40
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class je extends fw {

   protected je(int var1, jr var2) {
      super(var1, var2);
      if(var2 == jr.e) {
         ++this.bh;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public boolean a() {
      return false;
   }

   public ds d(el var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
      return super.d(var1, var2, var3, var4);
   }

   public void a(io var1, int var2, int var3, int var4) {
      this.b(this.d(var1.b(var2, var3, var4)));
   }

   public void b(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      if(var1 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
      }

      if(var1 == 1) {
         this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var1 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
      }

      if(var1 == 3) {
         this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
      }

   }

   public void b(el var1, int var2, int var3, int var4, ft var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   public boolean a(el var1, int var2, int var3, int var4, ft var5) {
      if(this.bt == jr.e) {
         return true;
      } else {
         int var6 = var1.b(var2, var3, var4);
         if((var6 & 8) != 0) {
            if(var1.a(var2, var3 - 1, var4) == this.bi) {
               this.a(var1, var2, var3 - 1, var4, var5);
            }

            return true;
         } else {
            if(var1.a(var2, var3 + 1, var4) == this.bi) {
               var1.b(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.b(var2, var3, var4, var6 ^ 4);
            var1.b(var2, var3 - 1, var4, var2, var3, var4);
            if(Math.random() < 0.5D) {
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.door_open", 1.0F, var1.l.nextFloat() * 0.1F + 0.9F);
            } else {
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.door_close", 1.0F, var1.l.nextFloat() * 0.1F + 0.9F);
            }

            return true;
         }
      }
   }

   public void a(el var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.b(var2, var3, var4);
      if((var6 & 8) != 0) {
         if(var1.a(var2, var3 - 1, var4) == this.bi) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }

      } else {
         boolean var7 = (var1.b(var2, var3, var4) & 4) > 0;
         if(var7 != var5) {
            if(var1.a(var2, var3 + 1, var4) == this.bi) {
               var1.b(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.b(var2, var3, var4, var6 ^ 4);
            var1.b(var2, var3 - 1, var4, var2, var3, var4);
            if(Math.random() < 0.5D) {
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.door_open", 1.0F, var1.l.nextFloat() * 0.1F + 0.9F);
            } else {
               var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.door_close", 1.0F, var1.l.nextFloat() * 0.1F + 0.9F);
            }

         }
      }
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.b(var2, var3, var4);
      if((var6 & 8) != 0) {
         if(var1.a(var2, var3 - 1, var4) != this.bi) {
            var1.d(var2, var3, var4, 0);
         }

         if(var5 > 0 && fw.n[var5].c()) {
            this.b(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if(var1.a(var2, var3 + 1, var4) != this.bi) {
            var1.d(var2, var3, var4, 0);
            var7 = true;
         }

         if(!var1.d(var2, var3 - 1, var4)) {
            var1.d(var2, var3, var4, 0);
            var7 = true;
            if(var1.a(var2, var3 + 1, var4) == this.bi) {
               var1.d(var2, var3 + 1, var4, 0);
            }
         }

         if(var7) {
            this.a_(var1, var2, var3, var4, var6);
         } else if(var5 > 0 && fw.n[var5].c()) {
            boolean var8 = var1.n(var2, var3, var4) || var1.n(var2, var3 + 1, var4);
            this.a(var1, var2, var3, var4, var8);
         }
      }

   }

   public int a(int var1, Random var2) {
      return (var1 & 8) != 0?0:(this.bt == jr.e?fq.az.aW:fq.at.aW);
   }

   public gk a(el var1, int var2, int var3, int var4, ba var5, ba var6) {
      this.a(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public int d(int var1) {
      return (var1 & 4) == 0?var1 - 1 & 3:var1 & 3;
   }

   public boolean a(el var1, int var2, int var3, int var4) {
      return var3 >= 127?false:var1.d(var2, var3 - 1, var4) && super.a(var1, var2, var3, var4) && super.a(var1, var2, var3 + 1, var4);
   }
}
