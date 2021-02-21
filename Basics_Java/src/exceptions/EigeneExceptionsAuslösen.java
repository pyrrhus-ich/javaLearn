package exceptions;

import java.util.Scanner.*;

// wirft eine Exception wenn Zahl <= 0 ist
// Eingabe von Buchstaben wird nicht abgefangen

public class EigeneExceptionsAuslösen {

	public static void main(String[] args) {
		giveAge();

	}//Main
	
	public static void giveAge() {
		int age;
		System.out.println("Gib Dein Alter ein");
		age = new java.util.Scanner(System.in).nextInt();
		if (age <= 0) {
			throw new IllegalArgumentException("Es sind nur Eingaben > 0 erlaubt" );
		}else {
		System.out.println("Dein alter ist => " + age);
		}
		
	}// giveAge

}
