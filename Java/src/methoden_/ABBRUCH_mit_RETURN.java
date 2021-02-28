package methoden_;

// WICHTIG Nach dem Return darf nichts mehr kommen. Return bricht ab.
public class ABBRUCH_mit_RETURN {

	static void printSqrt(double d) {
		// return bricht hier die funktion nach Fehlermeldung ab
		if (d < 0) {
			System.out.println("Keine Wurzel aus negativen Zahlen");
			return;
		}
		System.out.println(Math.sqrt(d));
			
	}
	public static void main(String[] args) {
		printSqrt(-4);
		printSqrt(4444444);

	}

}
