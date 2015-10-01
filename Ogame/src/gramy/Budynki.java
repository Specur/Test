package gramy;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Budynki extends JPanel{
	
	public Budynki(){
		
		setLayout(null);
		
		
		
		JComponent BuilidDescription = new BudynkiOpisy();
		add(BuilidDescription);
		
		JComponent Button = new BudynkiPrzyciski();
		add(Button);
		
		JPanel Builid = new BudynkiObrazki();
		add(Builid);
		
		
		
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}

}
