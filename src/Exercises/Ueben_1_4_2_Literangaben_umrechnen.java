package Exercises;

public class Ueben_1_4_2_Literangaben_umrechnen {

	public static void main(String[] args) {
		System.out.println("Gib die Menge in Litern an");
		double input = new java.util.Scanner( System.in).nextDouble();
		
		if (input >=1) {
			System.out.printf("ca %d l", (long) input);
		}else if (input >= 0.09999) {
				System.out.printf("ca %d cl", (long) (input * 100));
		}else if (input >= 0.009999) {
			System.out.printf("ca %d ml", (long) (input * 1000));
		}else {
			System.out.println("Der Wert ist zu wenig zum anzeigen");
		};

	}

}
