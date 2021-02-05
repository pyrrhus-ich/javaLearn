package basics;
/**
 * <p>
 * Mit continue ist es möglich fehleingaben abzufangen
 *</p>
 */
public class Schleifen_fortsetzen_mit_CONTINUE {

	public static void main(String[] args) {
		// erzeugt eine Zufallszahl zwischen 1 und 5
		int number = (int) (Math.random() * 5 + 1);
		System.out.println(number);
		
		while(true) {
			System.out.println("Schätze eine Zahl zwschen 1 und 5\n");
			int guess = new java.util.Scanner(System.in).nextInt();
		// ab hier wird geprüft ob die Zahl im Bereich liegt
		if (guess <1 || guess >5) {
			System.out.println("Nur Zahlen zwischen 1 und 5 erlaubt");
			continue; // startet wieder von vorne
		}
		else if (guess == number) {
			System.out.printf("Stimmt. %s ist die korrekte Zahl. Das Spiel ist vorbei.", guess);
			break;
		}
		else if (guess < number) {
			System.out.println("Deine Zahl ist zu klein");
		}
		else if (guess > number) {
			System.out.println("Du hast zu hoch geschätzt");
		}
		
		}

	}

}
