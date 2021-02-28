package schleifen_;
/**
 * <p>
 * Verwendung von Break erkl�rt an einem Zahlenratespiel
 * </p>
 * 
 *
 */
public class Schleifen_unterbrechen_mit_BREAK {

	public static void main(String[] args) {
		int number = 5; // Nummer die zu erraten ist
		// true setzt hier die die Bedingung der Schleife auf immer
		// wahr. Ohne 'break' w�rde die Schleife nie enden
		while (true) {
			System.out.println("Sch�tze die Zahl");
			int guess = new java.util.Scanner(System.in).nextInt();
			if (guess == number) {
				System.out.println("Stimmt");
				break; // Schleife beendet
			}
			else if (number > guess) {
				System.out.println("Zu niedrig gesch�tzt");
			}
			else {
				System.out.println("Zu hoch gesch�tzt");
			}
			
			
		}

	}

}
