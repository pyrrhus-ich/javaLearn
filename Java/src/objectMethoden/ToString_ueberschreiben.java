package objectMethoden;

/**
 * "Ausgeben eines Objektes" , "toString()"
 * das ueberschreiben von toString() fuehrt dazu, das 
 * man sich nur mit dem Namen der Objektinstanz die in 
 * der ueberschriebenen Methode toString() definierten 
 * Werte ausgeben lassen kann.
 * 02.03.2021
 */


public class ToString_ueberschreiben {

	public static void main(String[] args) {
		// Ausgabe wenn toString() ueberschrieben wurde
		Auto myCar = new Auto("Audi", "Silberblau");
		System.out.println("toString() ueberschrieben       => "+myCar);
		// Ausgabe wenn toString nicht ueberschrieben wurde
		Auto2 my2Car = new Auto2("Skoda", "Hellgruen");
		System.out.println("toString() nicht ueberschrieben => "+my2Car);
	}
	
	

}
