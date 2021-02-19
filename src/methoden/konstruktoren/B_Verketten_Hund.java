/**
 * 
 */
package methoden.konstruktoren;

/**
 *<li>Zeigt wie man Konstruktoren miteinander verkettet	<br>
 *<li>Die Verkettung erfolgt im Konstruktor 3	<br>
 * 16.02.2021
 */
public class B_Verketten_Hund {
	
	// Deklaration der Instanzvariablen
	String name;
	byte alter;
	float gewicht;
	
	// Konstruktor 1
	public B_Verketten_Hund() {
		System.out.println("Aufruf des parameterlosen Konstruktors 1");
	}
	
	// Konstruktor 2
	public B_Verketten_Hund(String name) {
		this.name = name;
		System.out.println("Aufruf Konstruktor 2");
	}
	
	// Konstruktor 3
	public B_Verketten_Hund(String name, byte alter, float gewichtDesTieres) {
		this(name); 				// Verketteter Konstruktoraufruf muss als erstes erfolgen
		this.alter = alter; 		// da lokale Variable so heist wie Instanzvariable nutzung von 'this'
		gewicht = gewichtDesTieres; // lokalvariable hat anderen Namen als Instanzvariable. Deshalb ohne.this
		System.out.println("Aufruf Konstruktor 3");
		
	}
	
	
//<<<<<<<<<<<< MAIN METHODE >>>>>>>>>>>>>	
	public static void main(String[] args) {
		System.out.println("\n --- Instanziere Objekt mit Konstruktor 3 --------\n");
		B_Verketten_Hund franzi = new B_Verketten_Hund("Franzi", (byte)5, 2.36F);
		System.out.println("\n --- Ende Instanzieren Objekt mit Konstruktor 3 --------\n");
	}

}
