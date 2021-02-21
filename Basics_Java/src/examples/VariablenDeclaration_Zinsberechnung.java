package examples;
/**
 * <H4>Einfache Berechnung des Jahreszinsen</h4>
 *
 */
public class VariablenDeclaration_Zinsberechnung {

	public static void main(String[] args) {
		double capital = 20000 /*Euro*/;
		double interestRate = 3.6 /*Prozent*/;
		double totalInterestRate = capital * interestRate / 100; // Jahr 1
		System.out.println("Zinsen : " + totalInterestRate + " €");

	}

}
