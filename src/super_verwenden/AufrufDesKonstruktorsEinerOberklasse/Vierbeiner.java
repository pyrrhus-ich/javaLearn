package super_verwenden.AufrufDesKonstruktorsEinerOberklasse;

// Oberklasse zu Hund

public abstract class Vierbeiner {
	
	protected String name;
	protected String farbe;
	
	//Standard Constructor um fehlerfrei starten zu können 
	public Vierbeiner(){
		System.out.println("Standard konstruktor Vierbeiner");
	}
	
	// mit super in Hund importierter Konstruktor
	Vierbeiner(String name){
		this.name = name;
	}
	
	
	
	

}
