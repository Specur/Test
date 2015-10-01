package gramy;

import static java.lang.Math.pow;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BadaniaOpisy extends JComponent{
	public static int KOSZTY_BOJOWA_METAL = 400 ;
	public static int COST_FIGHT_KRYSZTAL = 200 ;
	public static int COST_FIGHT_DEUTER = 500 ;
	
	public static int COST_PROTECTION_METAL = 500 ;
	public static int COST_PROTECTION_KRYSZTAL = 600 ;
	public static int COST_PROTECTION_DEUTER = 600 ;
	
	public static int COST_MINE_METAL = 500 ;
	public static int COST_MINE_KRYSZTAL = 500 ;
	public static int COST_MINE_DEUTER = 1000 ;
	
	JTextArea descriptionFight,descriptionProtection,descriptionMine ;
	public static JLabel  needs,needsFight , needsProtection, needsMine, fightCost,protectionCost,mineCost, metal , cristal , deuterium , fightLvl , mineLvl , protectionLvl , desriptionMetal , descriptionCristal , descriptionDeuterium ;
	
	public BadaniaOpisy(){
		
		
		needs = new JLabel();
		needs.setBounds(812,140,150,40);
		needs.setForeground(Color.RED);
		needs.setText("WYMAGANIA:");
		add(needs);
		
		
		needsFight = new JLabel();
		needsFight.setBounds(805,170,150,40);
		needsFight.setForeground(Color.WHITE);
		needsFight.setText("Labolatorium 10 lvl");
		add(needsFight);
		
		
		needsProtection = new JLabel();
		needsProtection.setBounds(805,290,150,40);
		needsProtection.setForeground(Color.WHITE);
		needsProtection.setText("Labolatorium 15 lvl");
		add(needsProtection);
		
		
		needsMine = new JLabel();
		needsMine.setBounds(805,410,150,40);
		needsMine.setForeground(Color.WHITE);
		needsMine.setText("Labolatorium 5 lvl");
		add(needsMine);
		
		
		fightCost = new JLabel();
		fightCost.setBounds(400,195,400,70);
		fightCost.setForeground(Color.WHITE);
		fightCost.setText("Potrzebne surowce: Metal "+(int)(KOSZTY_BOJOWA_METAL*pow(1.5,Stage.LVL_FIGHT-1))+" Krysztal "+(int)(COST_FIGHT_KRYSZTAL*pow(1.5,Stage.LVL_FIGHT-1))+ " Deuter " +(int)(COST_FIGHT_DEUTER*pow(1.5,Stage.LVL_FIGHT-1)));
		add(fightCost);
		
		
		protectionCost = new JLabel();
		protectionCost.setBounds(400,320,400,70);
		protectionCost.setForeground(Color.WHITE);
		protectionCost.setText("Potrzebne surowce: Metal "+(int)(COST_PROTECTION_METAL*pow(1.5,Stage.LVL_PROTECTION-1))+" Krysztal "+(int)(COST_PROTECTION_KRYSZTAL*pow(1.5,Stage.LVL_PROTECTION-1))+" Deuter "+ (int)(COST_PROTECTION_DEUTER*pow(1.5,Stage.LVL_PROTECTION-1)));
		add(protectionCost);
		
		
		mineCost = new JLabel();
		mineCost.setBounds(400,470,400,70);
		mineCost.setForeground(Color.WHITE);
		mineCost.setText("Potrzebne surowce: Metal "+(int)(COST_MINE_METAL*pow(1.5,Stage.LVL_MINE-1))+" Krysztal "+(int)(COST_MINE_KRYSZTAL*pow(1.5,Stage.LVL_MINE-1))+" Deuter "+(int)(COST_MINE_DEUTER*pow(1.5,Stage.LVL_MINE-1)));
		add(mineCost);

		
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
		
		
		fightLvl = new JLabel("Technologia bojowa " + Stage.LVL_FIGHT +" lvl");
		protectionLvl = new JLabel("Technologia ochronna "+Stage.LVL_PROTECTION +" lvl");
		mineLvl = new JLabel("Technologia wydobywcza "+Stage.LVL_MINE +" lvl");
		fightLvl.setForeground(Color.WHITE);
		protectionLvl.setForeground(Color.WHITE);
		mineLvl.setForeground(Color.WHITE);
		fightLvl.setBounds(400,130,150,30);
		protectionLvl.setBounds(400,250,200,30);
		mineLvl.setBounds(400,370,250,30);
		add(fightLvl);
		add(protectionLvl);
		add(mineLvl);
		
		
		desriptionMetal = new JLabel("Metal");
		descriptionCristal = new JLabel("Krysztal");
		descriptionDeuterium = new JLabel("Deuter");
	//podmet.setOpaque(true);
	//podmet.setBackground(Color.BLUE);
		desriptionMetal.setForeground(Color.WHITE);
		descriptionCristal.setForeground(Color.WHITE);
		descriptionDeuterium.setForeground(Color.WHITE);
		desriptionMetal.setBounds(353,15,150,30);
		descriptionCristal.setBounds(548,15,150,30);
		descriptionDeuterium.setBounds(750,15,150,30);
		add(desriptionMetal);
		add(descriptionCristal);
		add(descriptionDeuterium);
		
		
		descriptionFight = new JTextArea();
		Font dialog = new Font("Serif" , Font.ITALIC,13);
		descriptionFight.setForeground(Color.RED);
		descriptionFight.setFont(dialog);
		descriptionFight.setText("Technologia bojowa usprawnia systemy bojowe.\nKa�dy poziom technologii bojowej podwy�sza moc\nbojow� jednostek o 10% warto�ci pocz�tkowej.");
		descriptionFight.setBackground(Color.GRAY);
		descriptionFight.setEditable(false);
		descriptionFight.setOpaque(false);
		descriptionFight.setBounds(400, 150, 295, 95);
		add(descriptionFight);
		//////////////////////////////////////////
		
		descriptionProtection = new JTextArea();
		descriptionProtection.setForeground(Color.RED);
		descriptionProtection.setFont(dialog);
		descriptionProtection.setText("Technologia ochronna usprawnia pow�oki ochronne\nwok� statk�w i system�w obronnych. Ka�dy poziom\ntechnologii ochronnej podwy�sza efektywno�� pow�ok\no 10% warto�ci podstawowej.");
		//textkrys.setBackground(Color.GRAY);
		descriptionProtection.setEditable(false);
		descriptionProtection.setOpaque(false);
		descriptionProtection.setBounds(400, 270, 295, 95);
		add(descriptionProtection);
		/////////////////////////////////////////
		
		descriptionMine = new JTextArea();
		descriptionMine.setForeground(Color.RED);
		descriptionMine.setFont(dialog);
		descriptionMine.setText("Technologia wydobywcza zosta�a opracowana przez\nspecjalistyczny zesp� naukowc�w. Dzi�ki\nzastosowaniu po��czenia komputer�w i energii\nmo�liwe jest pozyskiwanie zl� metalu i kryszta�u\nw mniejszym czasie ni� dotychczas. Ka�dy poziom tej\ntechnologii zwi�ksza wydobycie surowc�w 5%.");
		//textdeu.setBackground(Color.GRAY);
		descriptionMine.setEditable(false);
		descriptionMine.setOpaque(false);
		descriptionMine.setBounds(400, 390, 295, 130);
		add(descriptionMine);
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}

}
