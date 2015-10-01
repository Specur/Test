package gramy;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Obrona extends JPanel {
	
	public Obrona(){
		setLayout(null);
		
		JComponent Opisy = new ObronaOpisy();
		add(Opisy);
		
		JPanel Obrazki = new ObronaObrazki();
		add(Obrazki);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}

}
