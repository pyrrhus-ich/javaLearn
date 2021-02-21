
/*
 * Berechnung des BMI - Wertes
 * BMI = Körpergewicht / Körpergröße²
 */
class App8 {
	
	public static void main(String[] args) {
		double groesse = 1.68;
		System.out.println("Gewicht\tGröße\tBMI\tAuswertung");// Definiert den Tabellenkopf
		for(double gewicht = 20.70; gewicht < 85.00; gewicht = gewicht + 0.50) {
			double bmi = gewicht / (groesse * groesse);
			System.out.printf(
					"%lf\t%lf\t%lf", gewicht, groesse, bmi);
			
			int i = (bmi >= 25 ) ? 1 : ((bmi < 18) ? -1 : 0); // Schalter > 25 = 1 | < 18 = -1 | sonst 0 als Basis für switch
															// alles zwischen 18 und 25 ist Null
			switch (i) {
			case 0:
				System.out.println("Normal");
				break;
			case 1:
				System.out.println("ZUVIEL");
				break;
			case -1:
				System.out.println("UNTERGEWICHT");
				break;
			default:
				System.out.println("Fehler");
				break;
				
			}
		
	}
		
	}

}
