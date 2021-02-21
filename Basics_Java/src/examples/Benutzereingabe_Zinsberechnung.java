package examples;
/**
 * <li>Berechnung der Zinsen nach Eingabe durch den Benutzer
 * <li>Ausgabe in Landesspezifischer Formatierung
 *
 */
public class Benutzereingabe_Zinsberechnung {
	
	public static void main(String[] args) {
		System.out.println("Wieviel willst Du anlegen ?");
		double Anlagebetrag = new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("Zu welchem Zinssatz ?");
		double Zinssatz = new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("Anlagedauer in Monaten ?");
		int Anlagedauer = new java.util.Scanner(System.in).nextInt();
		
		double Ertrag = Anlagebetrag * Zinssatz * Anlagedauer / (12 *100);
		
		System.out.printf("Du erhälst für Dein Investment %g Euro an Zinsen", Ertrag);
		
	}

}
