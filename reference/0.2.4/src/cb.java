// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:38:58
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com


public class cb extends fs {

   public cb(int var1) {
      super(var1);
   }

   public hj a(hj var1, em var2, fv var3) {
      if(var3.at != null) {
         int var4 = var3.at.c();
         var1.a(var4);
         var3.E();
      } else {
         var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
         if(!var2.z) {
            var2.a(new kb(var2, var3));
         }

         var3.E();
      }

      return var1;
   }
}
