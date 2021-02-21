
/*
 * Berechnung des BMI - Wertes
 * BMI = K�rpergewicht / K�rpergr��e�
 */
class App6 {
	
	public static void main(String[] args) {
		double gewicht;
		gewicht = 60.70;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		System.out.printf(
				"Das Gewicht %.2f kg und die Gr��e %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		boolean �bergewichtig = (bmi >= 25); // ist true wenn bmi >=25
		boolean untergewichtig = (bmi < 18);
		boolean nichtnormalgewichtig = (bmi >= 25) || (bmi < 18); // short sequet evaluation
		
		if(nichtnormalgewichtig) {
			if(�bergewichtig) {
				System.out.println("\nDu bekommst weniger zu essen weil Du �bergewichtig bist");
			}else if (untergewichtig){
				System.out.println("\nDu bist untergewichtig");
			}
		}else {
			System.out.println("\nDein Gewicht ist normal");
		}
		
	}

}
