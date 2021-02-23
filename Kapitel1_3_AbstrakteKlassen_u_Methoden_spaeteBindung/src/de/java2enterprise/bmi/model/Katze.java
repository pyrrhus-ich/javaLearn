package de.java2enterprise.bmi.model;

public class Katze extends Lebewesen {

	@Override
	public void isst() {
		super.setGewicht(getGewicht() + 0.1);
	}

	@Override
	public void spielt() {
		super.setGewicht(getGewicht() - 0.1 );
	}
	
	
	

}
