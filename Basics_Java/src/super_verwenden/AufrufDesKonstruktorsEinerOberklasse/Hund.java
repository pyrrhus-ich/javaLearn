package super_verwenden.AufrufDesKonstruktorsEinerOberklasse;

// super muss immer die erste Anweisung in einem Konstruktor sein

public class Hund extends Vierbeiner{
	
	public Hund(){
		super("Bello"); // ruft Konstruktor der Oberklasse auf. Und zwar den ersten konstruktor
						// der einen String als Attribut erwartet.
						// damit heist aber jeder Hund "Bello"
		System.out.println("Standard Konstruktor Hund");
	}
		
	public Hund(String name) {
		super(name); // ruft den Vierbeiner Konstruktor auf und initialisiert das Attribut 'name'
					 // mit dem richtigen Namen des Hundes.
	}
}
