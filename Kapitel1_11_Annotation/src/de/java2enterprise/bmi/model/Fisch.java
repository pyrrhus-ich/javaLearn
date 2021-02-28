package de.java2enterprise.bmi.model;

public class Fisch extends Lebewesen {
	
	/**
	 * <p>InheritDoc fuehrt dazu, das die JavaDoc von der Elterklasse geerbt wird
	 * {@inheritDoc}
	 */
	
	@Override
	public void isst() {
		super.setGewicht(getGewicht() + 0.001);
	}
	
	/**
	 * <p>InheritDoc fuehrt dazu, das die JavaDoc von der Elterklasse geerbt wird
	 * {@inheritDoc}
	 */
	@Override
	public void spielt() {
		super.setGewicht(getGewicht() - 0.001 );
	}

}
