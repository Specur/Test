package gramy;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surowce extends JPanel{
	public Surowce(){
		
		setLayout(null);
		JComponent materialButton = new Przyciski();
		add(materialButton);
		JComponent materialDescription = new Opisy();
		add(materialDescription);
		JPanel materialImage = new Obrazki();
		add(materialImage);
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
		
	}

}
