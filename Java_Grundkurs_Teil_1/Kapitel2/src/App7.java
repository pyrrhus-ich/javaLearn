
/*
 * Berechnung des BMI - Wertes
 * BMI = Körpergewicht / Körpergröße²
 */
class App7 {
	
	public static void main(String[] args) {
		double gewicht;
		gewicht = 20.70;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		
		System.out.println("\n" + ((bmi>=25) ? "Übergewicht" : ((bmi < 18 ) ? "Untergewichtig" : "Normalgewicht"))); // verkürzte If else
		
	}

}
