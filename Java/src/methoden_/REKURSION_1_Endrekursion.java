package methoden_;
/**
 * Rekursion im einfachsten Sinn ist, das sich eine methode so lange<br>
 * selbst aufruft bis eine bestimmte Bedingung erf�llt ist<br>
 *
 */
public class REKURSION_1_Endrekursion {

	static void down1( int n){
		if ( n <= 0 ) 			// Rekursionsende | Wenn n <= 0 
			return;  			// brich ab
	System.out.print(n+ ", " ); // sonst drucke "n, " und
	down1(n- 1 ); 				// rufe die Funktion wieder auf.
	} 			  				// und wiederhole das bis N <= 0 ist.
	
	public static void main(String[] args) {
		down1(10);

	}

}
