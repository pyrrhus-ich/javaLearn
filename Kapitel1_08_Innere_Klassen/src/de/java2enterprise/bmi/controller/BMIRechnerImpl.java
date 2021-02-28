package de.java2enterprise.bmi.controller;

/* 
 * Innere Klassen werden selten verwendet, können aber sinnvoll sein, wenn es sich bei der inneren
 * Klasse um eine Definition handelt, die nur in der äusseren Klasse verfügbar sein soll.
 */

public class BMIRechnerImpl  {
	class BMISommerRechnerImpl implements BMIRechner{
		public  String pruefe(BMIKoerper k) {
			
			double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
			String ergebnis = null; // lokale Variablen müssen initialisiert werden
			if (bmi >= BMI_MAX) {
				ergebnis = "Uebergewichtig";
			}else if (bmi < BMI_MIN) {
				ergebnis = "Untergewichtig";
			}else {
				ergebnis = "Normalgewichtig";
			}
			
			return ergebnis;
			
		}//pruefe
	}//Sommer
	
	class BMIWinterRechnerImpl implements BMIRechner {
		
		public final static int TOLERANZ = 1;
		
		public String pruefe(BMIKoerper k) {

			double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
			String ergebnis = null; // lokale Variablen müssen initialisiert werden
			if (bmi >= BMI_MAX + TOLERANZ) {
				ergebnis = "Uebergewichtig";
			} else if (bmi < BMI_MIN) {
				ergebnis = "Untergewichtig";
			} else {
				ergebnis = "Normalgewichtig";
			}

			return ergebnis;

		}// pruefe
	}// Winter
}//BMIRechnerImpl
