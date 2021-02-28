package xxx_UebenBeispiele_;

public class Ueben_1_3_2_PrüfenObBeuteFairAufgeteiltWerdenKann {

	public static void main(String[] args) {
		System.out.println("Wieviele Flaschen habt ihr erbeutet ?");
		 int flaschen = new java.util.Scanner(System.in).nextInt();
						
		// hälfte für den captain nach unten abgerundet
		int captain = flaschen / 2;
					System.out.printf("Der Captain bekommt %d Flaschen\n", captain);
		
		System.out.println("Wieviele Crewmitglieder ohne Captain ?");
		int crew = new java.util.Scanner(System.in).nextInt();
		
		// Rest verbleibt für die Crew
		int crewFlaschenSum = flaschen - captain;
					System.out.printf("F�r die gesamte Crew verbleiben %d Flaschen\n", crewFlaschenSum);
		
		// Wenn Rest = 0 gib true aus, sonst false
		boolean fairOrNot = crewFlaschenSum % crew == 0;		
					System.out.println(fairOrNot);
		

	}

}
