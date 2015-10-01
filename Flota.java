package gramy;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flota extends JPanel{
	//laczenie floty
	public Flota(){
		setLayout(null);
		
		
		JComponent description = new FlotaOpisy();
		add(description);
		
		
		JPanel Image = new FlotaObrazki();
		add(Image);
		
		
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
	}

}
