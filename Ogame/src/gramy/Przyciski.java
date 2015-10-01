package gramy;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import static java.lang.Math.*;

public class Przyciski extends JComponent {
	private static JButton buildKrysztal,buildMetal,buildDeuter;
	
	ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			Object source = ae.getSource();
						
			if(Stage.CURRENT_LVL<Stage.MAX_LVL){
				if(source == buildMetal && Stage.METAL>Stage.COST_METAL_METAL*pow(1.5,Stage.LVL_METAL-1) && Stage.CRISTAL > Stage.COST_METAL_CRISTAL*pow(1.5,Stage.LVL_METAL-1)){
					
					
					 Stage.METAL-=Stage.COST_METAL_METAL*pow(1.5,Stage.LVL_METAL-1);
					 Stage.CRISTAL -= Stage.COST_METAL_CRISTAL*pow(1.5,Stage.LVL_METAL-1);
					Stage.LVL_METAL+=1;
					Opisy.metalCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_METAL_METAL*pow(1.5,Stage.LVL_METAL-1))+" Krysztal "+(int)(Stage.COST_METAL_CRISTAL*pow(1.5,Stage.LVL_METAL-1)));
					Opisy.metalLvl.setText("Kopalnia Metalu " + Stage.LVL_METAL+" lvl");
					Stage.CURRENT_LVL +=1 ;
				}
				if(source == buildKrysztal && Stage.METAL>Stage.COST_CRISTAL_METAL*pow(1.6,Stage.LVL_CRISTAL-1) && Stage.CRISTAL > Stage.COST_CRISTAL_CRISTAL*pow(1.6,Stage.LVL_CRISTAL-1)){
				
					Stage.METAL-=Stage.COST_CRISTAL_METAL*pow(1.6,Stage.LVL_CRISTAL-1);
					 Stage.CRISTAL -= Stage.COST_CRISTAL_CRISTAL*pow(1.6,Stage.LVL_CRISTAL-1);
					 Stage.LVL_CRISTAL+=1;
					 Opisy.cristalCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_CRISTAL_METAL*pow(1.6,Stage.LVL_CRISTAL-1))+" Krysztal "+(int)(Stage.COST_CRISTAL_CRISTAL*pow(1.6,Stage.LVL_CRISTAL-1)));
					Opisy.cristalLvl.setText("Kopalnia Kryszta³u " + Stage.LVL_CRISTAL+" lvl");
					Stage.CURRENT_LVL +=1 ;
				}
				if(source == buildDeuter && Stage.METAL>Stage.COST_DEUTERIUM_METAL*pow(1.3,Stage.LVL_DEUTERIUM-1) && Stage.CRISTAL > Stage.COST_DEUTERIUM_CRISTAL*pow(1.3,Stage.LVL_DEUTERIUM-1)){
				
					Stage.METAL-=Stage.COST_DEUTERIUM_METAL*pow(1.3,Stage.LVL_DEUTERIUM-1);
					 Stage.CRISTAL -= Stage.COST_DEUTERIUM_CRISTAL*pow(1.3,Stage.LVL_DEUTERIUM-1);
					Stage.LVL_DEUTERIUM+=1;
					Opisy.deuteriumCosts.setText("Potrzebne surowce: Metal "+(int)(Stage.COST_DEUTERIUM_METAL*pow(1.3,Stage.LVL_DEUTERIUM-1))+" Krysztal "+(int)(Stage.COST_DEUTERIUM_CRISTAL*pow(1.3,Stage.LVL_DEUTERIUM-1)));
					Opisy.deuteriumLvl.setText("Kopalnia Deuteru " + Stage.LVL_DEUTERIUM +" lvl");
					Stage.CURRENT_LVL +=1 ;
				}
				
				OpisyPrzeglad.building.setValue(Stage.CURRENT_LVL);
			}
			}
		};
	public Przyciski(){
		
		
		buildKrysztal = new JButton("Buduj");
		buildKrysztal.setBounds(700, 300, 100, 20);
		buildKrysztal.addActionListener(al);
		add(buildKrysztal);
		

		buildMetal = new JButton("Buduj");
		buildMetal.setBounds(700,180,100,20);
		buildMetal.addActionListener(al);
		add(buildMetal);
		
		buildDeuter = new JButton("Buduj");
		buildDeuter.setBounds(700, 420, 100, 20);
		buildDeuter.addActionListener(al);
		add(buildDeuter);
		
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}

}
