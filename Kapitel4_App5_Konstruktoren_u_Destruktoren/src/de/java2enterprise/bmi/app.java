package de.java2enterprise.bmi;

import de.java2enterprise.bmi.controler.BMIRechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

// array aus Objekten erstellen
public class app {

	public static void main(String[] args) {
		//BMIRechner bmiRechner = new BMIRechner(); // entfällt nachdem die Klassenmethode als static deklariert wurde
		
		Lebewesen[] lebewesen = new Lebewesen[3]; // erzeugt das Lebewesen array
		
		lebewesen[0] = new Katze();
		lebewesen[0].setName("Pinky");
		lebewesen[0].setGewicht(6.0);
		lebewesen[0].setGroesse(0.51);
		lebewesen[0].isst();
		lebewesen[0].isst();
		lebewesen[0].isst();
		System.out.println(lebewesen[0].getName());
		System.out.println(lebewesen[0].getGewicht());
		System.out.println(lebewesen[0].getGroesse());
		double bmi0 = BMIRechner.rechne(lebewesen[0]);
		System.out.println("BMI " +  lebewesen[0].getName() + " = " + bmi0);
		System.out.println(
				bmi0 >= BMIRechner.BMI_MAX ? "Übergewichtig \n" :
						bmi0 < BMIRechner.BMI_MIN ? "Untergewichtig\n" : 
							"Normalgewichtig\n");
		
		
		lebewesen[1] = new Katze();
		lebewesen[1].setName("flo");
		lebewesen[1].setGewicht(5.2);
		lebewesen[1].setGroesse(0.5);
		Katze katze = (Katze) lebewesen[1];  // casting der Standardweg Keine Ahnung was da passiert !!!
		lebewesen[1].isst();
		lebewesen[1].isst();
		((Katze) lebewesen[1]).spielt();  // casting erforderlich wenn Methoden aufgerufen werden sollen die nur in einer bestimmten Klasse existieren
		((Katze)lebewesen[1]).spielt();
		System.out.println(lebewesen[1].getName());
		System.out.println(lebewesen[1].getGewicht());
		System.out.println(lebewesen[1].getGroesse());
		double bmi1 = BMIRechner.rechne(lebewesen[1]);
		System.out.println("BMI " +  lebewesen[1].getName() + " = " + bmi1);
		System.out.println(
				bmi1 >= BMIRechner.BMI_MAX ? "Übergewichtig\n" :
						bmi1 < BMIRechner.BMI_MIN ? "Untergewichtig\n" : 
							"Normalgewichtig\n");
		
		lebewesen[2] = new Fisch();
		lebewesen[2].setName("Peter");
		lebewesen[2].setGewicht(0.005);
		lebewesen[2].setGroesse(0.01);
		lebewesen[2].isst();
		lebewesen[2].isst(-0.5);
		lebewesen[2].isst(0.5);
		System.out.println(lebewesen[2].getName());
		System.out.println(lebewesen[2].getGewicht());
		System.out.println(lebewesen[2].getGroesse());
		double bmi2 = BMIRechner.rechne(lebewesen[2]);
		System.out.println("BMI " +  lebewesen[2].getName() + " = " + bmi2);
		System.out.println(
				bmi2 >= BMIRechner.BMI_MAX ? "Übergewichtig\n" :
						bmi2 < BMIRechner.BMI_MIN ? "Untergewichtig\n" : 
							"Normalgewichtig\n");
		
		System.out.println("Anzahl der Berechnungen " + BMIRechner.zaehler); // ruft static Variable auf
		System.out.println(BMIRechner.demo);
		
		BMIRechner obj = new BMIRechner();     // zum aufruf einer nicht statischen Variable muss erst ein Objekt erzeugt werden.
		System.out.println(obj.soGehtEsNicht);
		
		
		
		
		
		
		
		
		
		
		
		
		}//main


}
