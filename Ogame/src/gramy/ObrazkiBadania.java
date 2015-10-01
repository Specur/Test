package gramy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazkiBadania extends JPanel {
	Image img , imgFighting, imgProtection, imgConveyor , metall , cristal , deuterium ;
	public ObrazkiBadania(){
		
		
		img =loadImage("background.jpg");
		imgFighting = loadImage("bojowa.jpg");
		imgProtection = loadImage("ochronna.jpg");
		imgConveyor = loadImage("wydobywcza.jpg");
		metall = loadImage("metall.gif");
		cristal = loadImage("kristall.gif");
		deuterium = loadImage("deuterium.gif");
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.drawImage(img, 1, 1, this);
		g.drawImage(imgFighting, 300, 270,this);
		g.drawImage(imgProtection, 300, 150, this);
		g.drawImage(imgConveyor, 300, 390, this);
		g.drawImage(metall, 350, 40, this);
		g.drawImage(cristal, 550, 40,this);
		g.drawImage(deuterium, 750, 40, this);
		g.setColor(Color.WHITE);
		
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
