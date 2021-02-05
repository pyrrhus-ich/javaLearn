/**
 * 
 */
package methoden;

// Wenn Rückgabe gewünscht darf nicht 'void' im Methodenkopf stehen
// Eine return - Anweisung gibt einen Wert zurück
	class Methoden_definieren_MIT_Rückgabe_OHNE_Parameter {
		// definieren der Methode
		// Eine statische Methode liefert eine Zufallszahl zwischen 0 & 100 zurück
		static double largerRandom() {
			return Math.random() * 100;
	}
		
	public static void main(String[] args) {
		// Verwendung der Methode
		double rdm = largerRandom();
		System.out.println(rdm);
}

}
