package examples;
/**
 * Gibt die Quadrate von allen Zahlen einer gegebenen Zahl aus
 */
public class squares {
	// methode quadrat berechnet nur das quadrat 
	static int quadrat( int a) {
		return a * a;
	}
	
	static void ausgabe ( int n ) {
		// solange i < n 
		for ( int i = 1; i <= n; i++) {
			// rufe die Methode quadrat auf und speichere das 
			// ergebnis in der Variablen s
			String s = "Quadrat (" + i + ") = " + quadrat(i);
			// dann drucke die Variable s aus
			System.out.println( s );
		}
		
	}
	// die Main Methode ruft dann die Methode ausgabe auf
	public static void main(String[] args) {
		ausgabe( 4 );

	}

}
