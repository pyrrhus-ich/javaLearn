package exercises;

public class Ueben_1_4_1_Zahltag {

	public static void main(String[] args) {
		
		int returnVal = new java.util.Scanner( System.in).nextInt();
		int minVal = 900;
		int maxVal = 1200;
		// Variante 1
		String result = (returnVal >= minVal && returnVal <= maxVal ) ? "Good boy" : "You son of a bi***!";
		System.out.println(result);
		// oder kürzer Variante 2. Hierbei wird die Variable Result gespart
		System.out.println((returnVal >= minVal && returnVal <= maxVal ) ? "Good boy" : "You son of a bi***!");
	}

}
