package super_verwenden.AufrufDerMethodenEinerOberklasse;

public class Vierbeiner {
	
	protected String name;
		

	Vierbeiner(){}
		
	Vierbeiner(String name){
		System.out.println("Konstruktor Vierbeiner(String name) aufgerufen");
		this.name = name;
	}
	
	public void fressen() {
		System.out.println("\nIch habe Hunger und will fressen");
	}

}// class
