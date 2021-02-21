package Katze;

public class app {

	public static void main(String[] args) {
		Katze meineKatze = new Katze();
		meineKatze.name = "Pinky";
		meineKatze.gewicht = 6.0;
		meineKatze.groesse = 0.51;
		
		System.out.println(meineKatze.name);
		System.out.println(meineKatze.gewicht);
		System.out.println(meineKatze.groesse);
		
		BMIRechner bmiRechner = new BMIRechner();
		double bmi = bmiRechner.rechne(meineKatze.gewicht, meineKatze.groesse);
		System.out.println("BMI = " + bmi);
		
		
		
		}//main


}
