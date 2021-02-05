package basics;

public class Math_RANDOM {
	public static void main(String[] args) {
		
		double zufallszahl = Math.random();
		
		// Standardfall gibt Zahl  zwischen 0 und 1 aus
		System.out.println("Zufallszahl als Basis: " + zufallszahl);
		
		//Ganzzahl in festgelegtem Bereich z.B 0 und 9
		//multipliziere den wert von zufallszahl mit der Anzahl möglicher 
		//Zufallszahlen. Das Ergebniss runde mit int ab
		int nullBisNeun = (int)(zufallszahl * 10);
		int nullBis100 = (int)(zufallszahl * 101);
		System.out.println("Null bis Neun = " + nullBisNeun);
		System.out.println("Null bis 100 = " + nullBis100);
		
		//Ganzzahl im Bereich zwischen zwei Zahlen z.B. 1 und 9
		//Wie oben aber die Kleinstmögliche Zufallszahl wird addiert.
		//Dadurch wird der Wertebereich des Ergebnisses verschoben.
		int einsBisNeun = (int)(zufallszahl * 9 + 1);
		System.out.println("Eins bis Neun = " + einsBisNeun);
		
		//Zufallszahl zwischen 13 und 29 ermitteln. 
		//29 - 13 = 17
		int neunundzwanzigUndDreizehn = (int)(zufallszahl * 17 + 13);
		System.out.println("Zahl zwischen 13 und 29 = " + neunundzwanzigUndDreizehn);
		
		
	}

}
