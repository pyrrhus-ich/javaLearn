package de.java2enterprise.bmi.controller;



public interface BMIRechner extends BMI {
	//durch entfernen von 'static' und einfügen von 'default' ist die Klasse die das Interface implementiert
    //nicht mehr gezwungen die Methode zu überschreiben.
public default String pruefe(BMIKoerper k) {
		
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
		
	}

}
