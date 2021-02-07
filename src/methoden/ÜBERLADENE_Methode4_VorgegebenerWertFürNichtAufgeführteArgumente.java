package methoden;
/**
 * Wenn ein Parameter nicht immer gegeben ist, kann man eine Methode überladen und so sicher stellen,<br>
 * das im Zweifel immer mit dem vorgegebenen Wert gerechnet wird. Im unten stehenden Beispiel ist nicht<br>
 * ganz klar ob wir immer das Argument für die taxrate bekommen. Wenn also nur das Argument cost übergeben wird<br>
 * verwendet Java automatisch die 2.Methode und nimmt als zweites Argument den Vorgabewert.
 */
public class ÜBERLADENE_Methode4_VorgegebenerWertFürNichtAufgeführteArgumente {
	// Standard Methode berechet Steuer für gegebenen Satz 'taxRate'
	static double tax( double cost, double taxRate ) { 
		return cost * taxRate / 100.0; 
		} 
	// Überladene Methode wenn taxRate nicht bekannt, nimm Standard 19%
	static double tax( double cost ) { 
		return tax( cost, 19.0 ); // statt cost * 19.0 / 100;
	}

	
	public static void main(String[] args) {
		System.out.println(tax(1000, 7)); // Standard
		System.out.println(tax(1000)); // Überladen

	}

}
