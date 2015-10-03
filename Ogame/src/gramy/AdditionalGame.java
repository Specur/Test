package gramy;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdditionalGame extends JPanel{
	
	public AdditionalGame(){
		setLayout(null);
		JComponent AdditionalGameSource = new AdditionalGameSource();
		add(AdditionalGameSource);
		
		
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
	}

}
