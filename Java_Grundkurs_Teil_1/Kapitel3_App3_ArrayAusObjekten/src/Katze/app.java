package Katze;
// array aus Objekten erstellen
public class app {

	public static void main(String[] args) {
		BMIRechner bmiRechner = new BMIRechner(); // wird nur einmal erzeugt für berechnung beider Katzen Objekte
		
		Katze[] katze = new Katze[2]; // erzeugt das Katzen array
		
		katze[0] = new Katze();
		katze[0].name = "Pinky";
		katze[0].gewicht = 6.0;
		katze[0].groesse = 0.51;
		System.out.println(katze[0].name);
		System.out.println(katze[0].gewicht);
		System.out.println(katze[0].groesse);
		double bmi0 = bmiRechner.rechne(katze[0]);
		System.out.println("BMI " +  katze[0].name + " = " + bmi0 + "\n");
		
		
		katze[1] = new Katze();
		katze[1].name = "flo";
		katze[1].gewicht = 5.2;
		katze[1].groesse = 0.5;
		System.out.println(katze[1].name);
		System.out.println(katze[1].gewicht);
		System.out.println(katze[1].groesse);
		double bmi1 = bmiRechner.rechne(katze[1]);
		System.out.println("BMI " +  katze[1].name + " = " + bmi1 + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//main


}
