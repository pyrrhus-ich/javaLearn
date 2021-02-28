package de.java2enterprise.bmi.controller;

/**
 * Der Rechner fuer den Body Mass Index
 *@since 1.0.0
 */

public interface BMIRechner extends BMI {
	/**
	 * Ueberprueft einen BMI Koerper
	 * @param k = Der BMIKoerper der geprüft werden soll
	 * @return Uebrgewichtig | Untergewichtig | Normalgewichtig
	 */
	public  String pruefe(BMIKoerper k); 

}
