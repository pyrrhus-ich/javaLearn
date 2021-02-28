package benutzereingaben;
/**
 * <li>Stringeingabe in der Konsole
 * <li>int Eingabe in der Konsole
 * <li>double Eingabe in der Konsole
 *
 */
public class Benutzereingabe_javaUtilScanner {

	public static void main(String[] args) {
		// String
		System.out.println("Bitte gib einen String ein");
		String s = new java.util.Scanner(System.in).nextLine();
				System.out.println(s);
		// Integer
		System.out.println("Bitte gib eine Ganzzahl ein");
		int i = new java.util.Scanner(System.in).nextInt();
		System.out.println(i);
	}

}
