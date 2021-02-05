package Exercises;

public class Ueben_1_4_3_Kreise_mit_unterschiedlichen_Farben {

	public static void main(String[] args) {
		
		int zahl = (int)(Math.random() * 9 + 1);
		
		if (zahl >=1 && zahl <=3 ) {
			System.out.println("green");
		}else if (zahl >=4 && zahl <= 6) {
			System.out.println("blue");
		}else if (zahl >=7 && zahl <= 9) {
			System.out.println("yellow");
		}else {
			System.out.println("Unerwartetes Ergebnis");
		}

	}

}
