package de.java2enterprise.bmi.controler;

import de.java2enterprise.bmi.model.Lebewesen;

// 'final' in der Klasse würde bewirken das von der Klasse keine Unterklassen abgeleitet werden können
public class BMIRechner {
		public static int zaehler; 
		
		//'final' macht Variable zur Konstanten => groß geschrieben u sofort initialisiert
		public static final double BMI_MAX = 25.0; // <= so soll eine Konstante definiert werden
		public static final double BMI_MIN = 18.5;
		
		public static String demo = "Ich bin der Demostring";
		public String soGehtEsNicht = "Ich bin nicht statisch. Deshalb kannst Du mich auch nicht direkt aufrufen"
				+ "sondern musst vorher ein Objekt erzeugen";
		
		// 'final' in Methoden bewirkt das diese von Unterklassen nicht mehr verändert werden können
	    public static double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		zaehler ++;
		return bmi;
	}// rechne

}
