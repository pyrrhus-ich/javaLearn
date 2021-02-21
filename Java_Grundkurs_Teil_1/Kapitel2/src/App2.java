/*
 * Berechnung des BMI - Wertes
 * BMI = Körpergewicht / Körpergröße²
 */
class App2 {
	
	public static void main(String[] args) {
		float gewicht;
		gewicht = 80.70f; //das 'f' weist Java an, das gewicht tatsächlich als float und nicht als double (Vorgabe) zu behandeln
		float groesse = 1.68f;
		float bmi = gewicht / (groesse * groesse);
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);

	}

}
