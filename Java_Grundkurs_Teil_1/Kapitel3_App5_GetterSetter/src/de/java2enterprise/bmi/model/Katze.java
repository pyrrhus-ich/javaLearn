package de.java2enterprise.bmi.model;


public class Katze {

	private String name;     //Variablen werden als privat deklariert, da auf sie nur mit get und set von aussen 
	private double gewicht;  // zugegriffen werden soll.
	private double groesse;
	
	
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
	
	
	
	
	

}
