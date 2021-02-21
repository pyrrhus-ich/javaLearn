package de.java2enterprise.bmi;

import de.java2enterprise.bmi.controler.BMIRechner;
import de.java2enterprise.bmi.model.Katze;

// array aus Objekten erstellen
public class app {

	public static void main(String[] args) {
		BMIRechner bmiRechner = new BMIRechner(); // wird nur einmal erzeugt für berechnung beider Katzen Objekte
		
		Katze[] katze = new Katze[2]; // erzeugt das Katzen array
		
		katze[0] = new Katze();
		katze[0].setName("Pinky");
		katze[0].setGewicht(6.0);
		katze[0].setGroesse(0.51);
		System.out.println(katze[0].getName());
		System.out.println(katze[0].getGewicht());
		System.out.println(katze[0].getGroesse());
		double bmi0 = bmiRechner.rechne(katze[0]);
		System.out.println("BMI " +  katze[0].getName() + " = " + bmi0 + "\n");
		
		
		katze[1] = new Katze();
		katze[1].setName("flo");
		katze[1].setGewicht(5.2);
		katze[1].setGroesse(0.5);
		System.out.println(katze[1].getName());
		System.out.println(katze[1].getGewicht());
		System.out.println(katze[1].getGroesse());
		double bmi1 = bmiRechner.rechne(katze[1]);
		System.out.println("BMI " +  katze[1].getName() + " = " + bmi1 + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//main


}
