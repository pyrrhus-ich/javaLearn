package basics;
/**
 * <li>Normale Switch Anweisung
 *
 */
public class Bedingte_Anweisungen_SWITCH {

	public static void main(String[] args) {
		System.out.println("Erste Zahl\n");
	double a = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Operator\n");
	char operator = new java.util.Scanner(System.in).nextLine().charAt(0);
		System.out.println("Zweite Zahl\n");
	double b = new java.util.Scanner(System.in).nextDouble();
	
	switch (operator) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '*':
		System.out.println(a * b);
		break;
		default:
			System.out.println("Falsche Eingabe");
			break;
	}	
	
	}

}
