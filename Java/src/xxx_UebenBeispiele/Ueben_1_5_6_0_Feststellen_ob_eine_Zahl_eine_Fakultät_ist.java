package xxx_UebenBeispiele;

public class Ueben_1_5_6_0_Feststellen_ob_eine_Zahl_eine_Fakultät_ist {

	public static void zahlIstFakultät() {
	
	long zahl = 0;
	
	while (zahl <= 0) {
		System.out.println("Gib eine Zahl ein");
		zahl = new java.util.Scanner(System.in).nextLong();
		
		if (zahl <= 0) {
		System.out.println("Zahl muss eine Ganzzahl zwischen sein");
		}else {
			int fakultät = 1;
			int cnt = 1;
				while (fakultät < zahl) {
					fakultät = fakultät * (cnt + 1);
					cnt += 1;
				 }// schliest while aus Zeile 18
			
				if (fakultät == zahl) 
					System.out.println("Zahl = " + zahl + " Fakultät = " + cnt );
				else 
					System.out.println("Zahl ist keine Fakult�t");
				
		}// schliest Zeile 15
	}
		
}
	public static void main(String[] args) {
		zahlIstFakultät();

	}

}
