package main;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GirisResmi extends JPanel {
    @Override
   protected void paintComponent(Graphics g)
   {
   super.paintComponent(g);
   Image arkaplan=new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\image\\Adsiz.png").getImage();
  
   g.drawImage(arkaplan, 0, 0, 1500, 1000, null);

   }
}