package de.java2enterprise.bmi.model;


public class Fisch extends Lebewesen{

	// überschreibt Methode der Superklasse
	// anders als in der Klasse katze wird hier das Gewicht nicht um 0.1 sondern um 0.001 reduziert
	// das nennt man polymorphie
		public void isst() {
			super.gewicht += 0.001;   
		}
		
		public void isst(double menge) {
			super.gewicht += menge;   
		}
	

}
