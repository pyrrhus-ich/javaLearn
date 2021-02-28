package methoden.konstruktoren;

/**
 * Sobald es einen parametrisierten Konstruktor gibt, ist es nicht mehr möglich 
 *
 *
 * 17.02.2021
 */


public class Parametrisierte {

	public static void main(String[] args) {
		Parametrisierte spielerOnly = new Parametrisierte("Only the Player");
		Parametrisierte spielerWithItem = new Parametrisierte("Player with Item", "ItemItself");
		System.out.println(spielerOnly.name);
		System.out.println(spielerWithItem.name + "and the : " + spielerWithItem.item);
				

	}

// Klassendefinition >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public String name;
	public String item;
	
	Parametrisierte(String spielerName){
		this.name = spielerName;
	}
	
	Parametrisierte(String spielerName, String spielerItem) {
		this.name = spielerName;
		this.item = spielerItem;
	}
	
	
	
	
}
