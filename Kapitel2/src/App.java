/*
 * Berechnung des BMI - Wertes
 * BMI = K�rpergewicht / K�rpergr��e�
 */
class App {
	
	public static void main(String[] args) {
		double gewicht;
		gewicht = 80.70;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		System.out.printf(
				"Das Gewicht %.2f kg und die Gr��e %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);

	}

}
