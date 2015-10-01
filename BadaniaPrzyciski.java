package gramy;

import static java.lang.Math.pow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class BadaniaPrzyciski extends JComponent {
	JButton lvlupFight , lvlupProtection, lvlupMine ;
	ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			
				if(source == lvlupFight && Stage.LVL_LAB >= 10 && Stage.METAL>BadaniaOpisy.KOSZTY_BOJOWA_METAL*pow(1.5,Stage.LVL_FIGHT-1)&& Stage.CRISTAL>BadaniaOpisy.COST_FIGHT_KRYSZTAL*pow(1.5,Stage.LVL_FIGHT-1)&& Stage.DEUTERIUM>BadaniaOpisy.COST_FIGHT_DEUTER*pow(1.5,Stage.LVL_FIGHT-1)){
					Stage.METAL-=BadaniaOpisy.KOSZTY_BOJOWA_METAL*pow(1.5,Stage.LVL_FIGHT-1);
					Stage.CRISTAL-=BadaniaOpisy.COST_FIGHT_KRYSZTAL*pow(1.5,Stage.LVL_FIGHT-1);
					Stage.DEUTERIUM-=BadaniaOpisy.COST_FIGHT_DEUTER*pow(1.5,Stage.LVL_FIGHT-1);
					Stage.LVL_FIGHT+=1;
					BadaniaOpisy.fightCost.setText("Potrzebne surowce: Metal "+(int)(BadaniaOpisy.KOSZTY_BOJOWA_METAL*pow(1.5,Stage.LVL_FIGHT-1))+" Krysztal "+(int)(BadaniaOpisy.COST_FIGHT_KRYSZTAL*pow(1.5,Stage.LVL_FIGHT-1))+ " Deuter " +(int)(BadaniaOpisy.COST_FIGHT_DEUTER*pow(1.5,Stage.LVL_FIGHT-1)));
					BadaniaOpisy.fightLvl.setText("Technologia bojowa " + Stage.LVL_FIGHT+" lvl");
				}
				if(source == lvlupProtection &&Stage.LVL_LAB >= 15 &&Stage.METAL>BadaniaOpisy.COST_PROTECTION_METAL*pow(1.5,Stage.LVL_PROTECTION-1)&& Stage.CRISTAL>BadaniaOpisy.COST_PROTECTION_KRYSZTAL*pow(1.5,Stage.LVL_PROTECTION-1)&& Stage.DEUTERIUM>BadaniaOpisy.COST_PROTECTION_DEUTER*pow(1.5,Stage.LVL_PROTECTION-1)){
					Stage.METAL -= BadaniaOpisy.COST_PROTECTION_METAL*pow(1.5,Stage.LVL_PROTECTION-1); 
					Stage.CRISTAL -=BadaniaOpisy.COST_PROTECTION_KRYSZTAL*pow(1.5,Stage.LVL_PROTECTION-1);
					Stage.DEUTERIUM -= BadaniaOpisy.COST_PROTECTION_DEUTER*pow(1.5,Stage.LVL_PROTECTION-1);
					Stage.LVL_PROTECTION+=1;
					BadaniaOpisy.protectionCost.setText("Potrzebne surowce: Metal "+(int)(BadaniaOpisy.COST_PROTECTION_METAL*pow(1.5,Stage.LVL_PROTECTION-1))+" Krysztal "+(int)(BadaniaOpisy.COST_PROTECTION_KRYSZTAL*pow(1.5,Stage.LVL_PROTECTION-1))+ " Deuter " +(int)(BadaniaOpisy.COST_PROTECTION_DEUTER*pow(1.5,Stage.LVL_PROTECTION-1)));
					BadaniaOpisy.protectionLvl.setText("Technologia ochronna " + Stage.LVL_PROTECTION+" lvl");
				}
				if(source == lvlupMine  && Stage.LVL_LAB >= 5 && Stage.METAL>BadaniaOpisy.COST_MINE_METAL*pow(1.5,Stage.LVL_MINE-1)&& Stage.CRISTAL>BadaniaOpisy.COST_MINE_KRYSZTAL*pow(1.5,Stage.LVL_MINE-1)&& Stage.DEUTERIUM>BadaniaOpisy.COST_MINE_DEUTER*pow(1.5,Stage.LVL_MINE-1)){
					Stage.METAL -= BadaniaOpisy.COST_MINE_METAL*pow(1.5,Stage.LVL_MINE-1);
					Stage.CRISTAL -= BadaniaOpisy.COST_MINE_KRYSZTAL*pow(1.5,Stage.LVL_MINE-1);
					Stage.DEUTERIUM -= BadaniaOpisy.COST_MINE_DEUTER*pow(1.5,Stage.LVL_MINE-1);
					Stage.LVL_MINE+=1;
					BadaniaOpisy.mineCost.setText("Potrzebne surowce: Metal "+(int)(BadaniaOpisy.COST_MINE_METAL*pow(1.5,Stage.LVL_MINE-1))+" Krysztal "+(int)(BadaniaOpisy.COST_MINE_KRYSZTAL*pow(1.5,Stage.LVL_MINE-1))+ " Deuter " +(int)(BadaniaOpisy.COST_MINE_DEUTER*pow(1.5,Stage.LVL_MINE-1)));
					BadaniaOpisy.mineLvl.setText("Technologia wydobywcza " + Stage.LVL_MINE +" lvl");
				}
				
			
			
			}
		};
	
	
	
	public BadaniaPrzyciski(){
		
		
		lvlupProtection = new JButton("Buduj");
		lvlupProtection.setBounds(700,300,100,20);
		lvlupProtection.addActionListener(al);
		add(lvlupProtection);
		
		
		lvlupFight = new JButton("Buduj");
		lvlupFight.setBounds(700, 180, 100, 20);
		lvlupFight.addActionListener(al);
		add(lvlupFight);
	
		
		lvlupMine = new JButton("Buduj");
		lvlupMine.setBounds(700, 420, 100, 20);
		lvlupMine.addActionListener(al);
		add(lvlupMine);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}

}