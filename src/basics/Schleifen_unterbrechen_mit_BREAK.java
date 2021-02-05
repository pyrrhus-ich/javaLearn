package basics;
/**
 * <p>
 * Verwendung von Break erklärt an einem Zahlenratespiel
 * </p>
 * 
 *
 */
public class Schleifen_unterbrechen_mit_BREAK {

	public static void main(String[] args) {
		int number = 5; // Nummer die zu erraten ist
		// true setzt hier die die Bedingung der Schleife auf immer
		// wahr. Ohne 'break' würde die Schleife nie enden
		while (true) {
			System.out.println("Schätze die Zahl");
			int guess = new java.util.Scanner(System.in).nextInt();
			if (guess == number) {
				System.out.println("Stimmt");
				break; // Schleife beendet
			}
			else if (number > guess) {
				System.out.println("Zu niedrig geschätzt");
			}
			else {
				System.out.println("Zu hoch geschätzt");
			}
			
			
		}

	}

}
