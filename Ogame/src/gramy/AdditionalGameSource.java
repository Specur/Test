package gramy;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class AdditionalGameSource extends JComponent {
	public static JButton button ;
	public AdditionalGameSource(){
		
		setLayout(null);
		
		button = new JButton("niiegig");
		button.setBounds(200,200,100,30);
		button.addActionListener(new AdditionalGamePicture());
		add(button);
		
		
		
		AdditionalGamePicture Picture = new AdditionalGamePicture();
		
		add(Picture);
		
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
	}

}
