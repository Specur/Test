package gramy;

import static java.lang.Math.pow;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FlotaOpisy extends JComponent{
	public static JLabel needs,needsCruiser,needsGrenade,needsStarDeath, costsCruiser,costsGrenade,costsStarDeath, metal,cristal,deuterium,grenade,cruiser,starDeath,grenadeLvl,cruiserLvl,starDeathLvl,captionMetal,captionCristal,captionDeuterium;
	JTextArea textCruiser , textGrenade, textStarDeath ;
	
	JTextArea buildCruiser,buildGrenade,buildStarDeath;
	JButton cruiserBuild , grenadeBuild,starDeathBuild ;
	
	public static int COST_CRUISER_METAL = 5000 ;
	public static int COST_CRUISER_KRYSZTAL = 4000 ;
	public static int COST_CRUISER_DEUTER = 3000 ;
	
	public static int COST_GRENADE_METAL = 6000 ;
	public static int COST_GRENADE_KRYSZTAL = 9000 ;
	public static int COST_GRENADE_DEUTER = 8000 ;
	
	public static int COST_STAR_DEATH_METAL = 30000 ;
	public static int COST_STAR_DEATH_KRYSZTAL = 20000 ;
	public static int COST_STAR_DEATH_DEUTER = 10000 ;
	
	
	ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			
				if(source == cruiserBuild){
					try{
					int i = Integer.parseInt(buildCruiser.getText());
						if(Stage.METAL> i*COST_CRUISER_METAL &&  Stage.CRISTAL > i * COST_CRUISER_KRYSZTAL && Stage.DEUTERIUM > i * COST_CRUISER_DEUTER){
							Stage.METAL-=i*COST_CRUISER_METAL;
							Stage.CRISTAL-=i*COST_CRUISER_KRYSZTAL;
							Stage.DEUTERIUM-=i*COST_CRUISER_DEUTER;
							Stage.SHIP_CRUISER += i ;
							cruiserLvl.setText("Kr��ownik " + Stage.SHIP_CRUISER+" sztuk");
						}
					
					}catch(Exception R){
						buildCruiser.setText("0");
						
					}
				}
				
				
				
				
				if(source == grenadeBuild){
					try{
						int i = Integer.parseInt(buildGrenade.getText());
							if(Stage.METAL> i*COST_GRENADE_METAL && Stage.CRISTAL > i * COST_GRENADE_KRYSZTAL && Stage.DEUTERIUM > i * COST_GRENADE_DEUTER){
								Stage.METAL-=i*COST_GRENADE_METAL;
								Stage.CRISTAL-=i*COST_GRENADE_KRYSZTAL;
								Stage.DEUTERIUM-=i*COST_GRENADE_DEUTER;
								Stage.SHIP_GRENADE += i ;
								grenadeLvl.setText("B�bowiec " + Stage.SHIP_GRENADE+" sztuk");
							}
						
						}catch(Exception R){
							buildGrenade.setText("0");
							
						}
					
					
				}
				
				if(source == starDeathBuild){
					try{
						int i = Integer.parseInt(buildStarDeath.getText());
							if(Stage.METAL> i*COST_STAR_DEATH_METAL && Stage.CRISTAL > i * COST_STAR_DEATH_KRYSZTAL && Stage.DEUTERIUM > i * COST_STAR_DEATH_DEUTER){
								Stage.METAL-=i*COST_STAR_DEATH_METAL;
								Stage.CRISTAL-=i*COST_STAR_DEATH_KRYSZTAL;
								Stage.DEUTERIUM-=i*COST_STAR_DEATH_DEUTER;
								Stage.SHIP_STAR_DEATH += i ;
								starDeathLvl.setText("Gwiazda �mierci " + Stage.SHIP_STAR_DEATH+" sztuk");
							}
						
						}catch(Exception R){
							buildStarDeath.setText("0");
							
						}
				}
				
		}
			
		};
	
	
	
	public FlotaOpisy(){
		
		needs = new JLabel();
		needs.setBounds(812,140,150,40);
		needs.setForeground(Color.RED);
		needs.setText("WYMAGANIA:");
		add(needs);
		
		
		needsCruiser = new JLabel();
		needsCruiser.setBounds(805,170,150,40);
		needsCruiser.setForeground(Color.WHITE);
		needsCruiser.setText("Stocznia 10 lvl");
		add(needsCruiser);
		
		needsGrenade = new JLabel();
		needsGrenade.setBounds(805,290,150,40);
		needsGrenade.setForeground(Color.WHITE);
		needsGrenade.setText("Stocznia 15 lvl");
		add(needsGrenade);
		
		needsStarDeath = new JLabel();
		needsStarDeath.setBounds(805,410,150,40);
		needsStarDeath.setForeground(Color.WHITE);
		needsStarDeath.setText("Stocznia 20 lvl");
		add(needsStarDeath);
		
		
		
		
		costsCruiser = new JLabel();
		costsCruiser.setBounds(400,195,400,70);
		costsCruiser.setForeground(Color.WHITE);
		costsCruiser.setText("Potrzebne surowce: Metal 5000 Kryszta� 4000, deuter 3000");
		add(costsCruiser);
		
		
		costsGrenade = new JLabel();
		costsGrenade.setBounds(400,320,400,70);
		costsGrenade.setForeground(Color.WHITE);
		costsGrenade.setText("Potrzebne surowce: Metal 6000 Kryszta� 9000, deuter 8000");
		add(costsGrenade);
	
		costsStarDeath = new JLabel();
		costsStarDeath.setBounds(400,440,400,70);
		costsStarDeath.setForeground(Color.WHITE);
		costsStarDeath.setText("Potrzebne surowce: Metal 30000 Kryszta� 20000, deuter 10000");
		add(costsStarDeath);
		
		
		buildCruiser = new JTextArea("0");
		buildCruiser.setBounds(710, 150, 80, 20);
		buildCruiser.setBackground(Color.WHITE);
		add(buildCruiser);
		
		buildGrenade = new JTextArea("0");
		buildGrenade.setBounds(710, 270, 80, 20);
		buildGrenade.setBackground(Color.WHITE);
		add(buildGrenade);
		
		buildStarDeath = new JTextArea("0");
		buildStarDeath.setBounds(710, 390, 80, 20);
		buildStarDeath.setBackground(Color.WHITE);
		add(buildStarDeath);
		
		
		cruiserBuild = new JButton("Buduj");
		cruiserBuild.setBounds(700, 180, 100, 20);
		cruiserBuild.addActionListener(al);
		add(cruiserBuild);
		

		grenadeBuild = new JButton("Buduj");
		grenadeBuild.setBounds(700,300,100,20);
		grenadeBuild.addActionListener(al);
		add(grenadeBuild);
		
		starDeathBuild = new JButton("Buduj");
		starDeathBuild.setBounds(700, 420, 100, 20);
		starDeathBuild.addActionListener(al);
		add(starDeathBuild);
		
		
		
		
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
		
		
		cruiserLvl = new JLabel("Kr��ownik " + Stage.SHIP_CRUISER +" sztuk");
		grenadeLvl = new JLabel("B�bowiec "+Stage.SHIP_GRENADE +" sztuk");
		starDeathLvl = new JLabel("Gwiazda �mierci "+Stage.SHIP_STAR_DEATH +" sztuk");
		cruiserLvl.setForeground(Color.WHITE);
		grenadeLvl.setForeground(Color.WHITE);
		starDeathLvl.setForeground(Color.WHITE);
		cruiserLvl.setBounds(400,130,300,30);
		grenadeLvl.setBounds(400,250,300,30);
		starDeathLvl.setBounds(400,370,300,30);
		add(cruiserLvl);
		add(grenadeLvl);
		add(starDeathLvl);
		
		
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
		
		textCruiser = new JTextArea();
		Font dialog = new Font("Serif" , Font.ITALIC,13);
		textCruiser.setForeground(Color.RED);
		textCruiser.setFont(dialog);
		textCruiser.setText("Kr��ownik jest �wietnie opancerzony, dysponuje du��\nsi�� ognia. W dodatku jest bardzo szybki.");
		textCruiser.setBackground(Color.GRAY);
		textCruiser.setEditable(false);
		textCruiser.setOpaque(false);
		textCruiser.setBounds(400, 150, 295, 95);
		add(textCruiser);
		//////////////////////////////////////////
		
		textGrenade = new JTextArea();
		textGrenade.setForeground(Color.RED);
		textGrenade.setFont(dialog);
		textGrenade.setText("Bombowiec zosta� stworzony, aby niszczy� systemy\nobronne innych planet.");
		//textkrys.setBackground(Color.GRAY);
		textGrenade.setEditable(false);
		textGrenade.setOpaque(false);
		textGrenade.setBounds(400, 270, 295, 95);
		add(textGrenade);
		/////////////////////////////////////////
		
		textStarDeath = new JTextArea();
		textStarDeath.setForeground(Color.RED);
		textStarDeath.setFont(dialog);
		textStarDeath.setText("Gwiazda �mierci jest uzbrojona w ogromne\ndzia�o grawitonowe, kt�re mo�e niszczy� statki\ntak du�e jak niszczyciele a nawet ksi�yce.");
		//textdeu.setBackground(Color.GRAY);
		textStarDeath.setEditable(false);
		textStarDeath.setOpaque(false);
		textStarDeath.setBounds(400, 390, 295, 95);
		add(textStarDeath);
		
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
		
	}

}
