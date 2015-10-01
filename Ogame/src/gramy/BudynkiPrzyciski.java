package gramy;

import static java.lang.Math.pow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class BudynkiPrzyciski extends JComponent {
	JButton lvlLab,lvlShiyard,lvlTerrafometr; 
	
	
	ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if(Stage.CURRENT_LVL<Stage.MAX_LVL){
				if(source == lvlShiyard&& Stage.METAL>BudynkiOpisy.COST_SHIPYARD_METAL*pow(1.5,Stage.LVL_SHIPYARD-1) && Stage.CRISTAL > BudynkiOpisy.COST_SHIPYARD_CRISTAL*pow(1.5,Stage.LVL_SHIPYARD-1)){
					Stage.METAL-=BudynkiOpisy.COST_SHIPYARD_METAL*pow(1.5,Stage.LVL_SHIPYARD-1);
					Stage.CRISTAL -= BudynkiOpisy.COST_SHIPYARD_CRISTAL*pow(1.5,Stage.LVL_SHIPYARD-1);
					Stage.LVL_SHIPYARD+=1;
					BudynkiOpisy.shipyardCost.setText("Potrzebne surowce: Metal "+(int)(BudynkiOpisy.COST_SHIPYARD_METAL*pow(1.5,Stage.LVL_SHIPYARD-1))+" Krysztal "+(int)( BudynkiOpisy.COST_SHIPYARD_CRISTAL*pow(1.5,Stage.LVL_SHIPYARD-1)));
					BudynkiOpisy.shipyardLvl.setText("Stocznia " + Stage.LVL_SHIPYARD+" lvl");
					Stage.CURRENT_LVL +=1 ;
				}
				if(source == lvlLab && Stage.METAL>BudynkiOpisy.COST_LAB_METAL*pow(1.6,Stage.LVL_LAB-1) && Stage.CRISTAL > BudynkiOpisy.COST_LAB_CRISTAL*pow(1.5,Stage.LVL_LAB-1)){
					Stage.METAL-=BudynkiOpisy.COST_LAB_METAL*pow(1.6,Stage.LVL_LAB-1);
					Stage.CRISTAL-=BudynkiOpisy.COST_LAB_CRISTAL*pow(1.5,Stage.LVL_LAB-1);
					Stage.LVL_LAB+=1;
					BudynkiOpisy.labCost.setText("Potrzebne surowce: Metal "+(int)(BudynkiOpisy.COST_LAB_METAL*pow(1.6,Stage.LVL_LAB-1) )+" Krysztal "+(int)(BudynkiOpisy.COST_LAB_CRISTAL*pow(1.5,Stage.LVL_LAB-1)));
					BudynkiOpisy.labLvl.setText("Labolatorium " + Stage.LVL_LAB+" lvl");
					Stage.CURRENT_LVL +=1 ;
				}

			}
			
				if(source == lvlTerrafometr && Stage.METAL>BudynkiOpisy.COST_TERRAFOMETR_METAL*pow(1.6,Stage.LVL_TERRAFOMETR-1) && Stage.CRISTAL > BudynkiOpisy.COST_TERRAFOMETR_CRISTAL*pow(1.5,Stage.LVL_TERRAFOMETR-1) ){
					Stage.METAL -= BudynkiOpisy.COST_TERRAFOMETR_METAL*pow(1.6,Stage.LVL_TERRAFOMETR-1);
					Stage.CRISTAL -=BudynkiOpisy.COST_TERRAFOMETR_CRISTAL*pow(1.5,Stage.LVL_TERRAFOMETR-1);
					Stage.LVL_TERRAFOMETR+=1;
					BudynkiOpisy.terrafometrCost.setText("Potrzebne surowce: Metal "+(int)(BudynkiOpisy.COST_TERRAFOMETR_METAL*pow(1.6,Stage.LVL_TERRAFOMETR-1) )+" Krysztal "+(int)(BudynkiOpisy.COST_TERRAFOMETR_CRISTAL*pow(1.5,Stage.LVL_TERRAFOMETR-1)));
					BudynkiOpisy.terrafometrLvl.setText("Terrafometr " + Stage.LVL_TERRAFOMETR +" lvl");
					Stage.MAX_LVL += 10 ;
					OpisyPrzeglad.building.setMaximum(Stage.MAX_LVL);
					
				}
			
				OpisyPrzeglad.building.setValue(Stage.CURRENT_LVL);
			
				
			}
			
		};
	
	public BudynkiPrzyciski(){
		lvlLab = new JButton("Buduj");
		lvlLab.setBounds(700, 180, 100, 20);
		lvlLab.addActionListener(al);
		add(lvlLab);
		

		lvlShiyard = new JButton("Buduj");
		lvlShiyard.setBounds(700,300,100,20);
		lvlShiyard.addActionListener(al);
		add(lvlShiyard);
		
		lvlTerrafometr = new JButton("Buduj");
		lvlTerrafometr.setBounds(700, 420, 100, 20);
		lvlTerrafometr.addActionListener(al);
		add(lvlTerrafometr);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}

}
