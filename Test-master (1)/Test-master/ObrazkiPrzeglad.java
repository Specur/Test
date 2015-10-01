package gramy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazkiPrzeglad extends JPanel{
	Image planet, img, metall, cristal, deuterium;
		public ObrazkiPrzeglad(){
			int m ;
			Random generator = new Random();
			 m = generator.nextInt(9);
			 switch(m){
			 case 0 :planet = loadImage("planeta.jpg"); break;
			 case 1 :planet = loadImage("planeta1.jpg"); break;
			 case 2 :planet = loadImage("planeta2.jpg"); break;
			 case 3 :planet = loadImage("planeta3.jpg"); break;
			 case 4 :planet = loadImage("planeta4.jpg"); break;
			 case 5 :planet = loadImage("planeta5.jpg"); break;
			 case 6 :planet = loadImage("planeta6.jpg"); break;
			 case 7 :planet = loadImage("planeta7.jpg"); break;
			 case 8 :planet = loadImage("planeta8.jpg"); break;
			 case 9 :planet = loadImage("planeta9.jpg"); break;
			 }
			 	img =loadImage("background.jpg");
			 	metall = loadImage("metall.gif");
			 	cristal = loadImage("kristall.gif");
				deuterium = loadImage("deuterium.gif");
			 
			 
			 
			 setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
			 setVisible(true);
		}
		public void paintComponent(Graphics g){
			g.drawImage(img, 1, 1, this);
			g.drawImage(planet,Stage.WIDTH/2-120,Stage.HEIGHT/2-120,this);
			g.drawImage(metall, 350, 40, this);
			g.drawImage(cristal, 550, 40,this);
			g.drawImage(deuterium, 750, 40, this);
			 
			
		}
		
		public BufferedImage loadImage(String sciezka) {
			URL url=null;
			try {
			url = getClass().getClassLoader().getResource(sciezka);
			return ImageIO.read(url);
			} catch (Exception e) {
			System.out.println("error 0001"+ sciezka);
			System.exit(0);
			return null;
			}
			}
}
