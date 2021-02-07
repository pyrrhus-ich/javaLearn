package Klassen_und_Objekte;
/**
 * Methode toString() liefert ein String Objekt das den Zustand des<br>
 * Punktes preis gibt. 
 *
 */
public class toString {

	public static void main(String[] args) {
		java.awt.Point player = new java.awt.Point(); // player Objekt instanzieren
		java.awt.Point door = new java.awt.Point(); // door Objekt instanzieren
		door.setLocation(10, 100);  //werte für door setzen
		
		//Ausgabe der Werte eine Objektes
		System.out.println(player.toString());
		System.out.println(door.toString());
		// Verkürzt
		System.out.println(player);
		System.out.println(door);
		
		String s = door.toString();
		System.out.println("Var s = " + s);
		System.out.println("Länge von s = " + s.length());

	}

}
