package Exercises;

public class Ueben_1_3_4_Währungsbetrag_in_Münzen {

	public static void main(String[] args) {
		double money = 11313.91;
		int cent = (int) (money * 100);
		
		if (cent / 200 > 0) {
			System.out.println("2 € = " + cent / 200);
			cent = cent % 200;
		}
		if (cent / 100 > 0) {
			System.out.println("1 € = " + cent / 100);
			cent = cent % 100;
		}
		if (cent / 50 > 0) {
			System.out.println("50 cent = " + cent / 50);
			cent = cent % 50;
		}
		if (cent / 20 > 0) {
			System.out.println("20 cent = " + cent / 20);
			cent = cent % 20;
		}
		if (cent / 10 > 0) {
			System.out.println("10 cent = " + cent / 10);
			cent = cent % 10;
		}
		if (cent / 5 > 0) {
			System.out.println("5 cent = " + cent / 5);
			cent = cent % 5;
		}
		if (cent / 2 > 0) {
		System.out.println("2 cent = " + cent / 2);
		cent = cent % 2;
		}
		if (cent / 1 > 0) {
		System.out.println("1 cent = " + cent / 1);
		cent = cent % 1;
		}
		System.out.println("Es verbleiben noch " + cent + " cent");
		
		}
	}

