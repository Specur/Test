package gramy;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class OpisyPrzeglad extends JComponent{
	JTextArea designation;
	public static JProgressBar building ;
	public static JLabel metal,cristal,deuterium, signatureMetal,signatureCrystal,signatureDeuterium,percentBuildings ;
	JTextArea inscription ;
	public OpisyPrzeglad(){
		
		building = new JProgressBar(0,Stage.MAX_LVL);
		building.setValue(Stage.CURRENT_LVL);
		building.setStringPainted(true);
		building.setBorderPainted(true);
		building.setBounds(450, 500, 300, 20);
		add(building);
		
		inscription = new JTextArea("Na planecie panuje ciep�y klimat\nObiekt ten jest du�� planet�\nTemperatura jaka tu panuje dochodzi do 66�C \nNajni�sza zanotowana temperatura to 39�C");
		inscription.setEditable(false);
		inscription.setForeground(Color.WHITE);
		inscription.setOpaque(false);
		inscription.setBounds(715, 250, 300, 200);
		add(inscription);
		
		
		percentBuildings = new JLabel("Procent zabudowy planety :");
		percentBuildings.setForeground(Color.WHITE);
		percentBuildings.setBounds(450, 480, 200, 20);
		add(percentBuildings);
		
		
		metal = new JLabel(""+Stage.METAL);
		metal.setForeground(Color.WHITE);
		metal.setBounds(400, 40, 200, 20);
		add(metal);
		
		
		cristal = new JLabel(""+Stage.CRISTAL);
		cristal.setForeground(Color.WHITE);
		cristal.setBounds(605, 40, 200, 20);
		add(cristal);
		
		
		deuterium = new JLabel(""+Stage.DEUTERIUM);
		deuterium.setForeground(Color.WHITE);
		deuterium.setBounds(805, 40, 200, 20);
		add(deuterium); 
		
		
		Font serif = new Font("Serif",Font.BOLD,25);
		designation = new JTextArea("Ganimedes ");
		designation.setForeground(Color.white);
		designation.setFont(serif);
		designation.setEditable(false);
		designation.setOpaque(false);
		designation.setBounds(550,200, 500, 40);
		add(designation);
		
		
		signatureMetal = new JLabel("Metal");
		signatureCrystal = new JLabel("Krysztal");
		signatureDeuterium = new JLabel("Deuter");
		signatureMetal.setForeground(Color.WHITE);
		signatureCrystal.setForeground(Color.WHITE);
		signatureDeuterium.setForeground(Color.WHITE);
		signatureMetal.setBounds(353,15,150,30);
		signatureCrystal.setBounds(548,15,150,30);
		signatureDeuterium.setBounds(750,15,150,30);
		add(signatureMetal);
		add(signatureCrystal);
		add(signatureDeuterium);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}

}
