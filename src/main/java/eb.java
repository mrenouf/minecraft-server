// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:26
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.ArrayList;
import java.util.Random;

public class eb extends fy {

   private fy a;


   protected eb(int var1, fy var2) {
      super(var1, var2.bg, var2.bs);
      this.a = var2;
      this.c(var2.bi);
      this.b(var2.bj / 3.0F);
      this.a(var2.bq);
   }

   public void a(iq var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public dt d(em var1, int var2, int var3, int var4) {
      return super.d(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean a(iq var1, int var2, int var3, int var4, int var5) {
      return super.a(var1, var2, var3, var4, var5);
   }

   public void a(em var1, int var2, int var3, int var4, dt var5, ArrayList var6) {
      int var7 = var1.b(var2, var3, var4);
      if(var7 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 1) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void b(em var1, int var2, int var3, int var4, fv var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void a(em var1, int var2, int var3, int var4, int var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public float a(dw var1) {
      return this.a.a(var1);
   }

   public int a(int var1, Random var2) {
      return this.a.a(var1, var2);
   }

   public int a(Random var1) {
      return this.a.a(var1);
   }

   public int a(int var1) {
      return this.a.a(var1);
   }

   public int b() {
      return this.a.b();
   }

   public void a(em var1, int var2, int var3, int var4, dw var5, bc var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean d() {
      return this.a.d();
   }

   public boolean a(int var1, boolean var2) {
      return this.a.a(var1, var2);
   }

   public boolean a(em var1, int var2, int var3, int var4) {
      return this.a.a(var1, var2, var3, var4);
   }

   public void e(em var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4, 0);
      this.a.e(var1, var2, var3, var4);
   }

   public void b(em var1, int var2, int var3, int var4) {
      this.a.b(var1, var2, var3, var4);
   }

   public void a(em var1, int var2, int var3, int var4, int var5, float var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public void a_(em var1, int var2, int var3, int var4, int var5) {
      this.a.a_(var1, var2, var3, var4, var5);
   }

   public void b(em var1, int var2, int var3, int var4, dw var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void a(em var1, int var2, int var3, int var4, Random var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public boolean a(em var1, int var2, int var3, int var4, fv var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   public void c(em var1, int var2, int var3, int var4) {
      this.a.c(var1, var2, var3, var4);
   }

   public void a(em var1, int var2, int var3, int var4, jv var5) {
      int var6 = hd.b((double)(var5.v * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.b(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.b(var2, var3, var4, 1);
      }

      if(var6 == 2) {
         var1.b(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.b(var2, var3, var4, 0);
      }

   }
}
