package Exercises;

public class Ueben_1_3_3_Besitzen_zwei_Zahlen_gleiche_Ziffern {

	public static void main(String[] args) {
		int a = 12;
		int b = 31;
		
		int a1 = a / 10;
		int a2 = a % 10;
		System.out.println(a1 + " " + a2);
		int b1 = b / 10;
		int b2 = b % 10;
		System.out.println(b1 + " " + b2);
		
		if (a1 == b1 || a1 == b2
			|| a2 == b1 || a2 == b2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
				

	}

}
