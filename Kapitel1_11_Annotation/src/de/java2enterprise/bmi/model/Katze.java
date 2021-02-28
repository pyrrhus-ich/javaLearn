package de.java2enterprise.bmi.model;
/**
 * Stellt den Datentypen fuer alle Katzen dar
 *@since 1.0.0
 */

@Deprecated // Zeigt an das die Klasse veraltet ist und nicht mehr verwendet werden sollte
public class Katze extends Lebewesen {
	
	/**
	 * <p>InheritDoc fuehrt dazu, das die JavaDoc von der Elterklasse geerbt wird
	 * {@inheritDoc}
	 */
	@Override // zeigt an, das die Methode der Vaterklasse überschrieben wurde
	public void isst() {
		super.setGewicht(getGewicht() + 0.1);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override // zeigt an, das die Methode der Vaterklasse überschrieben wurde
	public void spielt() {
		super.setGewicht(getGewicht() - 0.1 );
	}
	
	
	

}
