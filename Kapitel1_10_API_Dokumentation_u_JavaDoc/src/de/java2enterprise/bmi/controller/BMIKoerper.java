package de.java2enterprise.bmi.controller;

/**
 * Der Koerper eines BMI Wesens
 *
 *
 */

public interface BMIKoerper {
	/**
	 * Liefert das Gewicht eines BMI Koerpers
	 * @return Das Gewicht des BMI Koerpers in KG
	 */
	public double getGewicht();
	/**
	 * Liefert die Groesse eines BMI Koerpers
	 * @return die Groesse des BMI Koerpers im meter
	 */
	public double getGroesse();

}
