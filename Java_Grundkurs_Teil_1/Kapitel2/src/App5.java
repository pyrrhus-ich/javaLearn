
/*
 * Berechnung des BMI - Wertes
 * BMI = Körpergewicht / Körpergröße²
 */
class App5 {
	
	public static void main(String[] args) {
		double gewicht;
		gewicht = 20.70;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		
		int i = (bmi >= 25 ) ? 1 : ((bmi < 18) ? -1 : 0); // Schalter > 25 = 1 | < 18 = -1 | sonst 0 als Basis für switch
														// alles zwischen 18 und 25 ist Null
		switch (i) {
		case 0:
			System.out.println("\nDein Gewicht ist normal");
			break;
		case 1:
			System.out.println("\nDu wiegst ZUVIEL");
			break;
		case -1:
			System.out.println("\nDu wiegst zu wenig");
			break;
		default:
			System.out.println("\nDa ist ein Fehler aufgetreten");
			break;
			
		}
		
	}

}
