package de.java2enterprise.bmi.controller;
/**
 *@see <a href = "https://de.wikipedia.org/wiki/Javadoc">Wikipedia</a> <br>
 *Die BMI Konstanten
 * @since 1.0.0
 */
public interface BMI {
	// Variablen im Interface sind immer Konstanten deshalb könnte final weggelassen werden
	/**
	 * Der obere Grenzwert fuer die BMI Werte
	 */
	public final static double BMI_MAX = 25.00;
	/**
	 * Der untere Grenzwert fuer die BMI Werte
	 */
	public final static double BMI_MIN = 18.50;
	/**
	 * Die maximale Anzahl der Messungen im Array
	 */
	public /*final*/ static int MAX_ANZAHL = 100;

}