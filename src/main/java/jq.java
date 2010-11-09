// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:07:55
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.util.Random;

public class jq extends fw {

   private boolean a;


   public jq(int var1, boolean var2) {
      super(var1, 6, jr.d);
      this.a = var2;
      if(!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.c(255);
   }

   public int a(int var1) {
      return var1 <= 1?6:5;
   }

   public boolean a() {
      return this.a;
   }

   public void b(el var1, int var2, int var3, int var4, int var5) {
      if(this == fw.al) {
         ;
      }
   }

   public void e(el var1, int var2, int var3, int var4) {
      if(this != fw.al) {
         super.e(var1, var2, var3, var4);
      }

      int var5 = var1.a(var2, var3 - 1, var4);
      if(var5 == al.bi) {
         var1.d(var2, var3, var4, 0);
         var1.d(var2, var3 - 1, var4, fw.ak.bi);
      }

   }

   public int a(int var1, Random var2) {
      return fw.al.bi;
   }

   public boolean a(io var1, int var2, int var3, int var4, int var5) {
      if(this != fw.al) {
         super.a(var1, var2, var3, var4, var5);
      }

      return var5 == 1?true:(!super.a(var1, var2, var3, var4, var5)?false:(var5 == 0?true:var1.a(var2, var3, var4) != this.bi));
   }
}
