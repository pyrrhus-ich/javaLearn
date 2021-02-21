package de.java2enterprise.bmi.controler;

import de.java2enterprise.bmi.model.Katze;

public class BMIRechner {
	
	    public double rechne(Katze katze) {
	    	
		double bmi = katze.getGewicht() / (katze.getGroesse() * katze.getGroesse());
		
		return bmi;
	}// rechne

}
