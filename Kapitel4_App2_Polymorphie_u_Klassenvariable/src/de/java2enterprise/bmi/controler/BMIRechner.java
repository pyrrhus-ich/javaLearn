package de.java2enterprise.bmi.controler;

import de.java2enterprise.bmi.model.Lebewesen;

public class BMIRechner {
		public static int zaehler; // Klassenvariable ist IMMER static
	    public double rechne(Lebewesen lebewesen) {
	    	
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		zaehler ++;
		return bmi;
	}// rechne

}
