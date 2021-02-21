package de.java2enterprise.bmi.controler;

import de.java2enterprise.bmi.model.Lebewesen;

public class BMIRechner {
		public static int zaehler; // Klassenvariable ist IMMER static
		
		public static String demo = "Ich bin der Demostring";
		public String soGehtEsNicht = "Ich bin nicht statisch. Deshalb kannst Du mich auch nicht direkt aufrufen"
				+ "sondern musst vorher ein Objekt erzeugen";
		
		// auch bei Klassenmethoden ist static Pflicht
		// durch die definition als Klassenmethode muss ich kein neues Objekt mehr erstellen
	    public static double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		zaehler ++;
		return bmi;
	}// rechne

}
