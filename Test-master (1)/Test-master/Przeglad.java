package gramy;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Przeglad extends JPanel{
	public Przeglad(){
		setLayout(null);
		
		//laczenie zakladki przeglad
		JComponent descriptionOverview = new OpisyPrzeglad();
		add(descriptionOverview);
		JPanel ImageOverview = new ObrazkiPrzeglad();
		add(ImageOverview);
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
		
		
	}

}
