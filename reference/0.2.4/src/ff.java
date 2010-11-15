// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:37
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class ff implements av {

   private File a;
   private boolean b;


   public ff(File var1, boolean var2) {
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

   public jp a(em var1, int var2, int var3) {
      File var4 = this.a(var2, var3);
      if(var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            v var6 = ao.a(var5);
            if(!var6.a("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if(!var6.j("Level").a("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            jp var7 = a(var1, var6.j("Level"));
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

   public void a(em var1, jp var2) {
      var1.h();
      File var3 = this.a(var2.j, var2.k);
      if(var3.exists()) {
         var1.v -= var3.length();
      }

      try {
         File var4 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         v var6 = new v();
         v var7 = new v();
         var6.a("Level", var7);
         this.a(var2, var1, var7);
         ao.a(var6, var5);
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

   public void a(jp var1, em var2, v var3) {
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
      ea var4 = new ea();

      Iterator var6;
      v var8;
      for(int var5 = 0; var5 < var1.m.length; ++var5) {
         var6 = var1.m[var5].iterator();

         while(var6.hasNext()) {
            dw var7 = (dw)var6.next();
            var1.r = true;
            var8 = new v();
            if(var7.c(var8)) {
               var4.a(var8);
            }
         }
      }

      var3.a("Entities", var4);
      ea var9 = new ea();
      var6 = var1.l.values().iterator();

      while(var6.hasNext()) {
         ay var10 = (ay)var6.next();
         var8 = new v();
         var10.b(var8);
         var9.a(var8);
      }

      var3.a("TileEntities", var9);
   }

   public static jp a(em var0, v var1) {
      int var2 = var1.d("xPos");
      int var3 = var1.d("zPos");
      jp var4 = new jp(var0, var2, var3);
      var4.b = var1.i("Blocks");
      var4.e = new ho(var1.i("Data"));
      var4.f = new ho(var1.i("SkyLight"));
      var4.g = new ho(var1.i("BlockLight"));
      var4.h = var1.i("HeightMap");
      var4.n = var1.l("TerrainPopulated");
      if(!var4.e.a()) {
         var4.e = new ho(var4.b.length);
      }

      if(var4.h == null || !var4.f.a()) {
         var4.h = new byte[256];
         var4.f = new ho(var4.b.length);
         var4.b();
      }

      if(!var4.g.a()) {
         var4.g = new ho(var4.b.length);
         var4.a();
      }

      ea var5 = var1.k("Entities");
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.b(); ++var6) {
            v var7 = (v)var5.a(var6);
            dw var8 = hl.a(var7, var0);
            var4.r = true;
            if(var8 != null) {
               var4.a(var8);
            }
         }
      }

      ea var11 = var1.k("TileEntities");
      if(var11 != null) {
         for(int var12 = 0; var12 < var11.b(); ++var12) {
            v var10 = (v)var11.a(var12);
            ay var9 = ay.c(var10);
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

   public void b(em var1, jp var2) {
   }
}
