package examples;
/**
 * aufbauend auf squares, ist dies der Versuch, das selbe als </p>
 * addition zu machen</p>
 * 
 */
public class addition {
	
	static int addiere(int el) {
		System.out.println("el ist : " + el);
		return el + el;
	}
	
	static void ergebniss(int n) {
		System.out.println("Starte Methode Ergebniss");
		for (int i = 0; i < n; i++) {
			System.out.println("i = " + i);
			int s = addiere(i);
			System.out.println("Das Ergebnis ist : " + s);
			System.out.println("Methode ergebnis beendet");
		}
	}
	public static void main(String[] args) {
		ergebniss(3);

	}

}
