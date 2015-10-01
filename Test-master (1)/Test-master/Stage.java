package gramy;

public class Stage {
	//wysokosc/szerokosc okna i szybkosc odliczania surowcow
	public static final int HEIGHT = 720;
	public static final int WIDTH = 1260;
	public static final int SPEED = 1000;
	//lvl poszczegolnych budowli/badan
	public static int LVL_METAL = 0 ;
	public static int LVL_CRISTAL = 0 ;
	public static int LVL_DEUTERIUM = 0 ;
	
	public static int LVL_LAB = 0 ;
	public static int LVL_SHIPYARD = 0 ;
	public static int LVL_TERRAFOMETR = 0 ;
	
	public static int LVL_FIGHT = 0 ;
	public static int LVL_PROTECTION = 0 ;
	public static int LVL_MINE = 0 ;
	//ilosc statkow
	public static int SHIP_CRUISER = 0 ;
	public static int SHIP_GRENADE = 0 ;
	public static int SHIP_STAR_DEATH = 0 ;
	
	public static int GUN_LASER = 0 ;
	public static int GUN_ION = 0 ;
	public static int GUN_GAUSS = 0 ;
	
	
	
	//koszty bazowe budynkow
	public static int COST_METAL_METAL = 60 ;
	public static int COST_METAL_CRISTAL = 15 ;
	public static int COST_METAL_DEUTERIUM = 0 ;
	
	public static int COST_CRISTAL_METAL = 48 ;
	public static int COST_CRISTAL_CRISTAL = 24 ;
	public static int COST_CRISTAL_DEUTERIUM = 0 ;
	
	public static int COST_DEUTERIUM_METAL = 225 ;
	public static int COST_DEUTERIUM_CRISTAL = 75 ;
	public static int COST_DEUTERIUM_DEUTERIUM = 0 ;
	
	//podstawowe dane startowe
	public static long METAL = 1000;
	public static long CRISTAL = 1000;
	public static long DEUTERIUM = 1000;
	public static int MAX_LVL = 70 ;
	public static int CURRENT_LVL = 0;
}
