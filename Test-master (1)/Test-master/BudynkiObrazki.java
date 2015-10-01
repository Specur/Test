package gramy;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BudynkiObrazki extends JPanel {
	
	Image img1,lab,shipyard,nanity,metall,cristall,deuterium;
	
	public BudynkiObrazki(){
		
		img1 =loadImage("background.jpg");
		lab=loadImage("laboratorium.jpg");
		shipyard =loadImage("stocznia.jpg");
		nanity =loadImage("nanity.jpg");
		metall = loadImage("metall.gif");
		cristall = loadImage("kristall.gif");
		deuterium = loadImage("deuterium.gif");
		
		
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}
	public void paintComponent(Graphics g){
		g.drawImage(img1, 1, 1, this);
		g.drawImage(lab, 300, 150, this);
		g.drawImage(shipyard, 300, 270, this);
		g.drawImage(nanity, 300, 390, this);
		g.drawImage(metall, 350, 40, this);
		g.drawImage(cristall, 550, 40,this);
		g.drawImage(deuterium, 750, 40, this);
		
	}
	
	
public BufferedImage loadImage(String sciezka) {
	URL url=null;
		try {
			url = getClass().getClassLoader().getResource(sciezka);
				return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("error 0002"+ sciezka);
			System.exit(0);
				return null;
		}
		}
}
