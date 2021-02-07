package exercises;

import java.util.Scanner;

public class Ueben_1_5_5_Produkte_f�r_Fakult�t_berechnen {
	
	static void berechneFakult�t() {
		
		long eingabe = 0;
		long fakult�t = 1;
		
		do {
			System.out.println("Gib eine Zahl ein => ");
				eingabe = new Scanner(System.in).nextLong(); // kommt von java.util
				
				if (eingabe == 0) {
					System.out.println("Ergebnis ist =  "  + fakult�t);
					eingabe = 1;
					break;
					
				}else if (eingabe < 0) {
						System.err.println("Negative Zahlen sind nicht erlaubt");
						
					}else {
						System.out.println("Positive Zahl Eingabe = " + eingabe);
					
						for (int i = 1; i < eingabe; i++) {
							System.out.println(("i => " + i));
							System.out.println("Fakult�t am Beginn der Berechnung => " + fakult�t);
							//fakult�t += fakult�t * i;
							fakult�t += Math.multiplyExact(fakult�t, i);
							System.out.println("Aktuelle Fakult�t ist => " + fakult�t);
						}
						
						System.out.println("Ende der Berechnung, Ergebnis ist => " + fakult�t);
					}
		}
		
		while (eingabe <= 0);
			
		
	}
	
	public static void main(String[] args) {
		berechneFakult�t();
		
		
		}
	
	
}

