// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:40:13
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class ji extends ay {

   public String[] e = new String[]{"", "", "", ""};
   public int f = -1;


   public void b(v var1) {
      super.b(var1);
      var1.a("Text1", this.e[0]);
      var1.a("Text2", this.e[1]);
      var1.a("Text3", this.e[2]);
      var1.a("Text4", this.e[3]);
   }

   public void a(v var1) {
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.e[var2] = var1.h("Text" + (var2 + 1));
         if(this.e[var2].length() > 15) {
            this.e[var2] = this.e[var2].substring(0, 15);
         }
      }

   }
}
