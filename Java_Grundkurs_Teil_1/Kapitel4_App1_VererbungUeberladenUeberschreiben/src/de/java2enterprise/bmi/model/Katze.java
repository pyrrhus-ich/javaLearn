package de.java2enterprise.bmi.model;


public class Katze extends Lebewesen{

	private Ball ball;

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	// überschreibt Methode der Superklasse
	public void isst() {
		super.gewicht += 0.1;   
	}
	
	public void isst(double menge) {
		super.gewicht += 0.1;   
	}
	
	public void spielt() {
		super.gewicht -= 0.1;
	}

}
