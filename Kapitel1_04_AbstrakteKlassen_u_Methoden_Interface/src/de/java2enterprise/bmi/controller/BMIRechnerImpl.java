package de.java2enterprise.bmi.controller;

import de.java2enterprise.bmi.model.Lebewesen;

public class BMIRechnerImpl implements BMIRechner {
	
	public final static double BMI_MAX = 25.00;
	public final static double BMI_MIN = 18.50;
	public final static int MAX_ANZAHL = 100;
	
	public String pruefe(Lebewesen lebewesen) {
		
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
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
