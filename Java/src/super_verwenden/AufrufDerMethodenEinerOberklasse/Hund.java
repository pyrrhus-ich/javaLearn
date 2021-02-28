package super_verwenden.AufrufDerMethodenEinerOberklasse;

public class Hund extends Vierbeiner{
	
	Hund(String name){
		super(name);
		System.out.println("Konstruktor Hund aufgerufen");
		System.out.println("Name ist : " + super.name);
	}
	
	public void fressen() {
		super.fressen(); // ruft die Methode aus Vierbeiner auf
		System.out.println("Bitte bring mir einen Napf"); //komplettiert sie um den 2. Satz
	}

}
