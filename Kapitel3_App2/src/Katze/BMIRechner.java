package Katze;

// Beispiel für pass by reference

class BMIRechner {
	
	double rechne(Katze katze) {
		double bmi = katze.gewicht / (katze.groesse * katze.groesse);
		katze.gewicht = 100;
		return bmi;
	}// rechne

}
