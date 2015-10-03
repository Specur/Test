package gramy;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AdditionalGamePicture extends JPanel{
	public static int x = Stage.WIDTH/2,y = Stage.HEIGHT/2 ;
	public static Image monster ;
	
	JButton button ;
	int g = 0;
	ActionListener oo = new ActionListener(){
		public void actionPerformed(ActionEvent e){	
			
		}
	};
	
	
	
	
	public AdditionalGamePicture(){
		
		button = new JButton("niiegig");
		button.setBounds(200,200,100,30);
		button.addActionListener(oo);
		add(button);
		
		monster = loadImage("obcy.jpg");
		
		
		while(isVisible()){
			
			
			
		}
		
		
		
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	public void paint(Graphics g){
		g.drawImage(monster,x,y, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public  BufferedImage loadImage(String sciezka) {
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
