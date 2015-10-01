package gramy;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//okno podsumowuj�ce
public class Wynik extends JFrame{
	JLabel result,points;
	JTextArea summary ,summaryComputer ;
	public Wynik(){
		
		//690+350+210
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.BLUE);
		double mypkt = Stage.GUN_LASER + (2.1*Stage.GUN_ION)+(4*Stage.GUN_GAUSS)+(2.3*Stage.SHIP_CRUISER)+(5*Stage.SHIP_GRENADE)+(15*Stage.SHIP_STAR_DEATH) +((0.01*Stage.LVL_FIGHT)+(0.01*Stage.LVL_PROTECTION)) *(Stage.GUN_LASER + (2.1*Stage.GUN_ION)+(4*Stage.GUN_GAUSS)+(2.3*Stage.SHIP_CRUISER)+(5*Stage.SHIP_GRENADE)+(15*Stage.SHIP_STAR_DEATH));
		Font czcionka = new Font("serif",Font.BOLD,50);
		Font czcionkaa = new Font("serif",Font.BOLD,20);
		
			//pkt ustawione na 1000- atakuj�cy ma ich troche wiecej.
		
		
			if(mypkt>1000)
			{ 
				points = new JLabel("ZWYCIESTWO");
				points.setBounds(410,250,500,110);
				points.setForeground(Color.BLACK);
				points.setFont(czcionka);
				add(points);
			}else
			{
				result = new JLabel("PRZEGRANA");
				result.setBounds(410,250,500,110);
				result.setForeground(Color.BLACK);
				result.setFont(czcionka);
				add(result);
			}
			
			summary = new JTextArea("Obro�ca pkt:"+mypkt+"\nDzia�o laserowe "+Stage.GUN_LASER+"\nDzia�o jonowe "+Stage.GUN_ION+"\nDzia�o Gaussa "+Stage.GUN_GAUSS+"\nKr��ownik "+Stage.SHIP_CRUISER+"\nB�bowiec "+Stage.SHIP_GRENADE+"\nGwiazda �mierci "+Stage.SHIP_STAR_DEATH);
			summary.setOpaque(false);
			summary.setFont(czcionkaa);
			summary.setEditable(false);
			summary.setBounds(200,350,800,500);
			summary.setForeground(Color.WHITE);
			add(summary);
			
			summaryComputer = new JTextArea("Atakuj�cy pkt: 1000\nKr��ownik 100\nB�bowiec 100\nGwiazda �mierci 30");
			summaryComputer.setOpaque(false);
			summaryComputer.setFont(czcionkaa);
			summaryComputer.setEditable(false);
			summaryComputer.setBounds(800,350,800,500);
			summaryComputer.setForeground(Color.WHITE);
			add(summaryComputer);
			
			
			
			
			
			
		setBounds(0, 0, Stage.WIDTH , Stage.HEIGHT);
		setVisible(true);
			
		}	
	}

