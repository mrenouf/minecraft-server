// Decompiled by:       Fernflower v0.6
// Date:                15.11.2010 02:39:56
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;

public class iy extends JComponent {

   private int[] a = new int[256];
   private int b = 0;
   private String[] c = new String[10];


   public iy() {
      this.setPreferredSize(new Dimension(256, 196));
      this.setMinimumSize(new Dimension(256, 196));
      this.setMaximumSize(new Dimension(256, 196));
      (new Timer(500, new jw(this))).start();
      this.setBackground(Color.BLACK);
   }

   private void a() {
      long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      System.gc();
      this.c[0] = "Memory use: " + var1 / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
      this.c[1] = "Threads: " + bh.b + " + " + bh.c;
      this.a[this.b++ & 255] = (int)(var1 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 256, 192);

      int var2;
      for(var2 = 0; var2 < 256; ++var2) {
         int var3 = this.a[var2 + this.b & 255];
         var1.setColor(new Color(var3 + 28 << 16));
         var1.fillRect(var2, 100 - var3, 1, var3);
      }

      var1.setColor(Color.BLACK);

      for(var2 = 0; var2 < this.c.length; ++var2) {
         String var4 = this.c[var2];
         if(var4 != null) {
            var1.drawString(var4, 32, 116 + var2 * 16);
         }
      }

   }
}
