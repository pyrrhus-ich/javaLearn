/**
 * 
 */
package methoden_;

// Wenn R�ckgabe gew�nscht darf nicht 'void' im Methodenkopf stehen
// Eine return - Anweisung gibt einen Wert zur�ck
	class Methoden_definieren_MIT_Rueckgabe_MIT_Parameter {
		// definieren der Methode
		// Eine statische Methode ermittelt den Mittelwert und gibt diesen zur�ck
		static double avg( double a, double b) {
			return (a + b) / 2;
	}
		
	public static void main(String[] args) {
		// Verwendung der Methode
		System.out.println( avg (5 , 7));
}

}
