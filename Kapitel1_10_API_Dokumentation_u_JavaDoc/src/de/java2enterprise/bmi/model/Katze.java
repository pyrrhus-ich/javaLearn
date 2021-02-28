package de.java2enterprise.bmi.model;
/**
 * Stellt den Datentypen fuer alle Katzen dar
 *@since 1.0.0
 */
public class Katze extends Lebewesen {
	
	/**
	 * <p>InheritDoc fuehrt dazu, das die JavaDoc von der Elterklasse geerbt wird
	 * {@inheritDoc}
	 */
	@Override
	public void isst() {
		super.setGewicht(getGewicht() + 0.1);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void spielt() {
		super.setGewicht(getGewicht() - 0.1 );
	}
	
	
	

}
