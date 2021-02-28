package de.java2enterprise.bmi;

import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMI;
import de.java2enterprise.bmi.controller.BMIKoerper;
import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

/**
 * <h3>Javadoc wird wie folgt erstellt</h3>
 * <li>Projekt markieren</li>
 * <li>Rechte Maustaste</li>
 * <li>Export\Java\JavaDoc</li>
 * 
 * Dieses ist ein Kommentar fuer die JavaDoc
 *App ist die <b>Start Klasse</b> des Dokumentes<br>
 *html Tags werden unterstuetzt.<br>
 *Javadoc Tags fangen mit '@' an. Nach Eingabe von '@' oeffnet sich ein Contextmenue aus<br>
 *dem man dann auswaehlen kann.
 *<h3>Im folgenden sieht man Block Tags</h3>
 *@see <a href = "https://de.wikipedia.org/wiki/Javadoc">Wikipedia</a> <br>
 *@since 1.0.0 => soll bei jeder neu eingefuehrten Klasse genutzt werden
 *'@deprecated' Zeigt an welche Klasse statt dessen verwendet werden sollen
 *<h3>Jetzt folgt ein Beispiel fuer ein Inline Tag</h3>
 *{@link Dann folgt irgendwas} 
 */


/* 
 * Innere Klassen werden selten verwendet, koennen aber sinnvoll sein, wenn es sich bei der inneren
 * Klasse um eine Definition handelt, die nur in der aeusseren Klasse verfuegbar sein soll.
 */


public class App {
	// werden als ObjektVariablen deklariert, da sie von mehreren Methoden aufgerufen werden
	private Scanner scanner = new Scanner(System.in); // Klasse Scanner braucht deutsche Interpunktion
	private Lebewesen lebewesen;
	private String[] ergebnisse = new String[BMI.MAX_ANZAHL];
	private int index = -1;
	
	public static void main(String[] args) {
		new App(); // ruft die Methode App() auf. App enthaelt alle anderen Methoden
	}
	
	private App() {
		System.out.println("BMI [Programm startet]");
		boolean nochmal = true;
		// solange 'nochmal' = true && index < variable
		while(nochmal && index < BMI.MAX_ANZAHL) {
			System.out.print("BMI [1=Eingabe 2=essen 3 =spielen 4=Verarbeiten 5=Ausgabe 6=Beenden");
			int auswahl = scanner.nextInt();
			if (auswahl == 1) {
				gibEin();
			}else if (auswahl == 2) {
				// spaete Bindung
				lebewesen.isst();
				}else if (auswahl == 3) {
						// spaete Bindung
						lebewesen.spielt();
					}else if (auswahl == 4) {
						verarbeite();
						}else if (auswahl == 5) {
								gibAus();
							}else if (auswahl == 6) {
							nochmal = false;
								}else {
									System.out.println("Bitte gib eine Zahl zwischen 1 und 4 ein");
								}
		}
		scanner.close(); // Scanner muss geschlossen werden
		System.out.println("BMI [Programm endet]");
	}// App
	
	private void gibEin() {
		while (true) {
			System.out.println("BMI [1=Katze 2=Fisch]");
			int lebewesenTyp = scanner.nextInt();
			if (lebewesenTyp == 1) {
				lebewesen = new Katze();
				break;
			}else if (lebewesenTyp == 2) {
				lebewesen = new Fisch();
				break;
			}else {
				System.out.println("Falsche Eingabe");
			}
		}//while
		
		if (lebewesen instanceof Katze) {
			System.out.println("BMI [Katze wurde angelegt]");
		}else if (lebewesen instanceof Fisch) {
			System.out.println("BMI [Fisch wurde angelegt]");
		}//if
		
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
		// Hier wird die anonyme Klasse erzeugt
		BMIRechner rechner = new BMIRechner() {
			
			public  String pruefe(BMIKoerper k) {
				
				double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
				String ergebnis = null; // lokale Variablen muessen initialisiert werden
				if (bmi >= BMI_MAX) {
					ergebnis = "Uebergewichtig";
				}else if (bmi < BMI_MIN) {
					ergebnis = "Untergewichtig";
				}else {
					ergebnis = "Normalgewichtig";
				}
				
				return ergebnis;
				
			}//pruefe
		};
		ergebnisse[++index] = rechner.pruefe(lebewesen);//zaehlt variable 'index' noch vor Ausgabe der Pruefungsergebnisse 1 hoch
		}// verarbeite
	
	private void gibAus() {
		//erweiterte for Schleife
		int i = -1;
		// fuer die neu angelegte Variable 'ergebnis' durchlaufe jedes Element des Arrays 'ergebnisse'
		for (String ergebnis : ergebnisse) {
			if(++i > index) {
				break;
			}
			System.out.println("BMI [Ergebnis = " + ergebnis + "] ");
		}//for
		
		
	}// gibAus

}
