/**
 * 
 */
package methoden;

// Wenn R�ckgabe gew�nscht darf nicht 'void' im Methodenkopf stehen
// Eine return - Anweisung gibt einen Wert zur�ck
	class Methoden_definieren_MIT_R�ckgabe_OHNE_Parameter {
		// definieren der Methode
		// Eine statische Methode liefert eine Zufallszahl zwischen 0 & 100 zur�ck
		static double largerRandom() {
			return Math.random() * 100;
	}
		
	public static void main(String[] args) {
		// Verwendung der Methode
		double rdm = largerRandom();
		System.out.println(rdm);
}

}
