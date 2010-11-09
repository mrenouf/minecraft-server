// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:38
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class fe implements at {

   private File a;
   private boolean b;


   public fe(File var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   private File a(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.a, var4);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.b?null:var6;
   }

   public jn a(el var1, int var2, int var3) {
      File var4 = this.a(var2, var3);
      if(var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            t var6 = am.a(var5);
            if(!var6.a("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if(!var6.j("Level").a("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            jn var7 = a(var1, var6.j("Level"));
            if(!var7.a(var2, var3)) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var7.j + ", " + var7.k + ")");
               var6.a("xPos", var2);
               var6.a("zPos", var3);
               var7 = a(var1, var6.j("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   public void a(el var1, jn var2) {
      var1.h();
      File var3 = this.a(var2.j, var2.k);
      if(var3.exists()) {
         var1.v -= var3.length();
      }

      try {
         File var4 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         t var6 = new t();
         t var7 = new t();
         var6.a("Level", var7);
         this.a(var2, var1, var7);
         am.a(var6, var5);
         var5.close();
         if(var3.exists()) {
            var3.delete();
         }

         var4.renameTo(var3);
         var1.v += var3.length();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(jn var1, el var2, t var3) {
      var2.h();
      var3.a("xPos", var1.j);
      var3.a("zPos", var1.k);
      var3.a("LastUpdate", var2.e);
      var3.a("Blocks", var1.b);
      var3.a("Data", var1.e.a);
      var3.a("SkyLight", var1.f.a);
      var3.a("BlockLight", var1.g.a);
      var3.a("HeightMap", var1.h);
      var3.a("TerrainPopulated", var1.n);
      var1.r = false;
      dy var4 = new dy();

      Iterator var6;
      t var8;
      for(int var5 = 0; var5 < var1.m.length; ++var5) {
         var6 = var1.m[var5].iterator();

         while(var6.hasNext()) {
            dv var7 = (dv)var6.next();
            var1.r = true;
            var8 = new t();
            if(var7.c(var8)) {
               var4.a(var8);
            }
         }
      }

      var3.a("Entities", var4);
      dy var9 = new dy();
      var6 = var1.l.values().iterator();

      while(var6.hasNext()) {
         av var10 = (av)var6.next();
         var8 = new t();
         var10.b(var8);
         var9.a(var8);
      }

      var3.a("TileEntities", var9);
   }

   public static jn a(el var0, t var1) {
      int var2 = var1.d("xPos");
      int var3 = var1.d("zPos");
      jn var4 = new jn(var0, var2, var3);
      var4.b = var1.i("Blocks");
      var4.e = new hm(var1.i("Data"));
      var4.f = new hm(var1.i("SkyLight"));
      var4.g = new hm(var1.i("BlockLight"));
      var4.h = var1.i("HeightMap");
      var4.n = var1.l("TerrainPopulated");
      if(!var4.e.a()) {
         var4.e = new hm(var4.b.length);
      }

      if(var4.h == null || !var4.f.a()) {
         var4.h = new byte[256];
         var4.f = new hm(var4.b.length);
         var4.b();
      }

      if(!var4.g.a()) {
         var4.g = new hm(var4.b.length);
         var4.a();
      }

      dy var5 = var1.k("Entities");
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.b(); ++var6) {
            t var7 = (t)var5.a(var6);
            dv var8 = hj.a(var7, var0);
            var4.r = true;
            if(var8 != null) {
               var4.a(var8);
            }
         }
      }

      dy var11 = var1.k("TileEntities");
      if(var11 != null) {
         for(int var12 = 0; var12 < var11.b(); ++var12) {
            t var10 = (t)var11.a(var12);
            av var9 = av.c(var10);
            if(var9 != null) {
               var4.a(var9);
            }
         }
      }

      return var4;
   }

   public void a() {
   }

   public void b() {
   }

   public void b(el var1, jn var2) {
   }
}
