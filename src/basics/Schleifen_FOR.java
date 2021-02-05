package basics;
/**
 * <p>
 * Ist wie die while Schleife, wird aber in erster Linie zum Zählen verwendet. Wird <br>
 * nur ausgeführt wenn die Bedingung wahr ist
 * </p>
 * 
 *
 */
public class Schleifen_FOR {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("i beträgt jetzt " + i);
		}
			
	for (int i = 1; i <= 5; i ++) {
		for (int j = 1; j <= i; j++)
			System.out.print("*");
		System.out.println();
	}

	}

}
