package gramy;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Badania extends JPanel{
	

	public Badania(){
		setLayout(null);
		
		
		JComponent Description = new BadaniaOpisy();
		add(Description);
		
		JComponent Button = new BadaniaPrzyciski();
		add(Button);
		
		JPanel Image = new ObrazkiBadania();
		add(Image);
		
		
		
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
		
	}

}
