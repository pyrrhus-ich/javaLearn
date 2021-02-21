package de.java2enterprise.bmi.model;


public class Katze extends Lebewesen{

	private Ball ball;
	
	// Ohne Übergabeparameter nennt sich der Konstruktor default Konstruktor
	public Katze() {
		super(); // ruft den Konstruktor der Oberklasse auf. Nicht imme rnotwendig
		System.out.println("Katze wird erstellt Default Konstruktor wird aufgerufen");
	}
	
	// erstellt einen Konstruktor für die Katze
	public Katze(String name, double gewicht, double groesse) {
		super(); // ruft den Konstruktor der Oberklasse auf. Nicht imme rnotwendig
		System.out.println("Katze wird erstellt Default Konstruktor wird aufgerufen");
		super.setName(name);
		super.setGewicht(gewicht);
		super.setGroesse(groesse);
	}
	
	// Destruktoren immer mit finalize
	// Destruktoren werden kaum verwendet.

	public void finalize() {
		System.out.println("Katze wird entfernt => Destruktor wird aufgerufen");
	}

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
	
	// fügt Methode spielt zu Katze hinzu. Diese Methode gibt es nur bei der Katze
	public void spielt() {
		super.gewicht -= 0.1;
	}

}
