// Decompiled by:       Fernflower v0.6
// Date:                09.11.2010 14:06:51
// Copyright:           2008-2009, Stiver
// Home page:           http://www.reversed-java.com

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class gg extends JComponent implements et {

   public static Logger a = Logger.getLogger("Minecraft");
   private MinecraftServer b;


   public static void a(MinecraftServer var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var3) {
         ;
      }

      gg var1 = new gg(var0);
      JFrame var2 = new JFrame("Minecraft server");
      var2.add(var1);
      var2.pack();
      var2.setLocationRelativeTo((Component)null);
      var2.setVisible(true);
      var2.addWindowListener(new u(var0));
   }

   public gg(MinecraftServer var1) {
      this.b = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());

      try {
         this.add(this.d(), "Center");
         this.add(this.a(), "West");
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private JComponent a() {
      JPanel var1 = new JPanel(new BorderLayout());
      var1.add(new iw(), "North");
      var1.add(this.b(), "Center");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var1;
   }

   private JComponent b() {
      h var1 = new h(this.b);
      JScrollPane var2 = new JScrollPane(var1, 22, 30);
      var2.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
      return var2;
   }

   private JComponent d() {
      JPanel var1 = new JPanel(new BorderLayout());
      JTextArea var2 = new JTextArea();
      a.addHandler(new cz(var2));
      JScrollPane var3 = new JScrollPane(var2, 22, 30);
      var2.setEditable(false);
      JTextField var4 = new JTextField();
      var4.addActionListener(new w(this, var4));
      var2.addFocusListener(new x(this));
      var1.add(var3, "Center");
      var1.add(var4, "South");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      return var1;
   }

   public void b(String var1) {
      a.info(var1);
   }

   public String c() {
      return "CONSOLE";
   }

   public static MinecraftServer a(gg var1) {
      return var1.b;
   }
}
