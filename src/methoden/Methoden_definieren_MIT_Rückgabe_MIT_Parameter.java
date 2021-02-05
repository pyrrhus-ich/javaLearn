/**
 * 
 */
package methoden;

// Wenn Rückgabe gewünscht darf nicht 'void' im Methodenkopf stehen
// Eine return - Anweisung gibt einen Wert zurück
	class Methoden_definieren_MIT_Rückgabe_MIT_Parameter {
		// definieren der Methode
		// Eine statische Methode ermittelt den Mittelwert und gibt diesen zurück
		static double avg( double a, double b) {
			return (a + b) / 2;
	}
		
	public static void main(String[] args) {
		// Verwendung der Methode
		System.out.println( avg (5 , 7));
}

}
