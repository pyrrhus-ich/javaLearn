package de.java2enterprise.bmi;

import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {
	
	// werden als ObjektVariablen deklariert, da sie von mehreren Methoden aufgerufen werden
	private Scanner scanner = new Scanner(System.in); // Klasse Scanner braucht deutsche Interpunktion
	private Lebewesen lebewesen;
	private String ergebnis;
	
	public static void main(String[] args) {
		new App(); // ruft die Methode App() auf. App enthält alle anderen Methoden
	}
	
	private App() {
		System.out.println("BMI [Programm startet]");
		boolean nochmal = true;
		// solange 'nochmal' = true
		while(nochmal) {
			System.out.print("BMI [1=Eingabe 2=Verarbeiten 3=Ausgabe 4=Beenden");
			int auswahl = scanner.nextInt();
			if (auswahl == 1) {
				gibEin();
			}else if (auswahl == 2) {
				verarbeite();
			}else if (auswahl == 3) {
					gibAus();
				}else if (auswahl == 4) {
					nochmal = false;
				}else {
					System.out.println("Bitte gib eine Zahl zwischen 1 und 4 ein");
				}
		}
		scanner.close(); // Scanner muss geschlossen werden
		System.out.println("BMI [Programm endet]");
	}
	
	private void gibEin() {
		lebewesen = new Katze();
		
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		lebewesen.setName(name);
		
		System.out.print("BMI [Geben Sie die Groesse [m] ein] > ");
		double groesse = scanner.nextDouble();
		lebewesen.setGroesse(groesse);
		
		System.out.print("BMI [Geben Sie das Gewicht [kg] ein] > ");
		double gewicht = scanner.nextDouble();
		lebewesen.setGewicht(gewicht);
	}// gibEin
	
	private void verarbeite() {
		
		BMIRechner rechner = new BMIRechner();
		ergebnis = rechner.pruefe(lebewesen);
		}// verarbeite
	
	private void gibAus() {
		System.out.println("BMI [Ergebnis = " + ergebnis + "] ");
		
	}// gibAus

}
