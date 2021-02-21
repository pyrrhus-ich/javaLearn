package de.java2enterprise.bmi.model;

// Superklasse
public class Lebewesen {
	
	private String name;     //Variablen werden als privat deklariert, da auf sie nur mit get und set von aussen 
	  						 // zugegriffen werden soll.
	private double groesse;
	protected double gewicht; // protected ist in Kindklassen sichtbar
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	
	public double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	
	public void isst() {
		
	}
	// überlädt methode isst man kann jetzt also auch die Menge angeben
	public void isst(double menge) {
		
	}

}
