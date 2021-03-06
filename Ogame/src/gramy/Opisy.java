package gramy;

import static java.lang.Math.pow;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Opisy extends JComponent {
	
	
	
	private JTextArea textMetal,textCristal,textDeuterium;
	public static JLabel captionMetal,captionCristal,captionDeuterium , metalLvl,cristalLvl,deuteriumLvl,metal,cristal,deuterium,metalCosts,deuteriumCosts,cristalCosts;
	
	public Opisy(){
		
		metalCosts = new JLabel();
		metalCosts.setBounds(400,170,400,70);
		metalCosts.setForeground(Color.WHITE);
		metalCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_METAL_METAL*pow(1.5,Stage.LVL_METAL-1))+" Krysztal "+(int)(Stage.COST_METAL_CRISTAL*pow(1.5,Stage.LVL_METAL-1)));
		add(metalCosts);
		
		
		cristalCosts = new JLabel();
		cristalCosts.setBounds(400,290,400,70);
		cristalCosts.setForeground(Color.WHITE);
		cristalCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_CRISTAL_METAL*pow(1.6,Stage.LVL_CRISTAL-1))+" Krysztal "+(int)(Stage.COST_CRISTAL_CRISTAL*pow(1.6,Stage.LVL_CRISTAL-1)));
		add(cristalCosts);
		
		deuteriumCosts = new JLabel();
		deuteriumCosts.setBounds(400,430,400,70);
		deuteriumCosts.setForeground(Color.WHITE);
		deuteriumCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_DEUTERIUM_METAL*pow(1.3,Stage.LVL_DEUTERIUM-1))+" Krysztal "+(int)(Stage.COST_DEUTERIUM_CRISTAL*pow(1.3,Stage.LVL_DEUTERIUM-1)));
		add(deuteriumCosts);
		
		
		
		
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
	
		
		metalLvl = new JLabel("Kopalnia Metalu " + Stage.LVL_METAL +" lvl");
		cristalLvl = new JLabel("Kopalnia Kryszta�u "+Stage.LVL_CRISTAL +" lvl");
		deuteriumLvl = new JLabel("Kopalnia Deuteru "+Stage.LVL_DEUTERIUM +" lvl");
		metalLvl.setForeground(Color.WHITE);
		cristalLvl.setForeground(Color.WHITE);
		deuteriumLvl.setForeground(Color.WHITE);
		metalLvl.setBounds(400,130,150,30);
		cristalLvl.setBounds(400,250,150,30);
		deuteriumLvl.setBounds(400,370,150,30);
		add(metalLvl);
		add(cristalLvl);
		add(deuteriumLvl);
		/////////////////////////////////////////////////////
			captionMetal = new JLabel("Metal");
			captionCristal = new JLabel("Krysztal");
			captionDeuterium = new JLabel("Deuter");
		//podmet.setOpaque(true);
		//podmet.setBackground(Color.BLUE);
			captionMetal.setForeground(Color.WHITE);
			captionCristal.setForeground(Color.WHITE);
			captionDeuterium.setForeground(Color.WHITE);
			captionMetal.setBounds(353,15,150,30);
			captionCristal.setBounds(548,15,150,30);
			captionDeuterium.setBounds(750,15,150,30);
			add(captionMetal);
			add(captionCristal);
			add(captionDeuterium);
		
		textMetal = new JTextArea();
		Font dialog = new Font("Serif" , Font.ITALIC,13);
		textMetal.setForeground(Color.RED);
		textMetal.setFont(dialog);
		textMetal.setText("Dostawca g��wnego surowca do budowy \nkonstrukcji no�nych budynk�w i statk�w kosmicznych.");
		textMetal.setBackground(Color.GRAY);
		textMetal.setEditable(false);
		textMetal.setOpaque(false);
		textMetal.setBounds(400, 150, 295, 95);
		add(textMetal);
		//////////////////////////////////////////
		
		textCristal = new JTextArea();
		textCristal.setForeground(Color.RED);
		textCristal.setFont(dialog);
		textCristal.setText("Dostawca g��wnego surowca do budowy\n element�w elektronicznych i stop�w metali.");
		//textkrys.setBackground(Color.GRAY);
		textCristal.setEditable(false);
		textCristal.setOpaque(false);
		textCristal.setBounds(400, 270, 295, 95);
		add(textCristal);
		/////////////////////////////////////////
		
		textDeuterium = new JTextArea();
		textDeuterium.setForeground(Color.RED);
		textDeuterium.setFont(dialog);
		textDeuterium.setText("Oddziela atomy deuteru(ci�kiego izotopu wodoru)\n od atom�w lekkiego wodoru z wody znajduj�cej\n si� na planecie.");
		//textdeu.setBackground(Color.GRAY);
		textDeuterium.setEditable(false);
		textDeuterium.setOpaque(false);
		textDeuterium.setBounds(400, 390, 295, 95);
		add(textDeuterium);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
		
		
	}

}
