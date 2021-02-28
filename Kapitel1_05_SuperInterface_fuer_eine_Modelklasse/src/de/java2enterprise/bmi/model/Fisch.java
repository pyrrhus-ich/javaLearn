package de.java2enterprise.bmi.model;

public class Fisch extends Lebewesen {
	
	@Override
	public void isst() {
		super.setGewicht(getGewicht() + 0.001);
	}

	@Override
	public void spielt() {
		super.setGewicht(getGewicht() - 0.001 );
	}

}
