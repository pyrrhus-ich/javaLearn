package exercises;

import java.util.Scanner;

public class Ueben_1_5_5_Produkte_für_Fakultät_berechnen {
	
	static void berechneFakultät() {
		
		long eingabe = 0;
		long fakultät = 1;
		
		do {
			System.out.println("Gib eine Zahl ein => ");
				eingabe = new Scanner(System.in).nextLong(); // kommt von java.util
				
				if (eingabe == 0) {
					System.out.println("Ergebnis ist =  "  + fakultät);
					eingabe = 1;
					break;
					
				}else if (eingabe < 0) {
						System.err.println("Negative Zahlen sind nicht erlaubt");
						
					}else {
						System.out.println("Positive Zahl Eingabe = " + eingabe);
					
						for (int i = 1; i < eingabe; i++) {
							System.out.println(("i => " + i));
							System.out.println("Fakultät am Beginn der Berechnung => " + fakultät);
							//fakultät += fakultät * i;
							fakultät += Math.multiplyExact(fakultät, i);
							System.out.println("Aktuelle Fakultät ist => " + fakultät);
						}
						
						System.out.println("Ende der Berechnung, Ergebnis ist => " + fakultät);
					}
		}
		
		while (eingabe <= 0);
			
		
	}
	
	public static void main(String[] args) {
		berechneFakultät();
		
		
		}
	
	
}

