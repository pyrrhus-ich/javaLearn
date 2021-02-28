package xxx_UebenBeispiele_;

public class Ueben_1_5_3_Zahlen_von_der_Kommandozeile_summieren {

	public static void main(String[] args) {
		
		int amount = 0;
		int summe = 0;
		
		
		do {
			System.out.println("Gib de Betrag ein => ");
			amount = new java.util.Scanner( System.in).nextInt();
			summe += amount;
		}
		while (amount != 0);
		
		System.out.println("Gesamtbetrag der Einnahmen => " + summe + "�");
			
		
		
		

	}

}
