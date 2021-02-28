package xxx_UebenBeispiele_;


public class Ueben_1_5_7_0_Größte_und_kleinst_Zahl_finden {

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl ein");
		long eingabe = new java.util.Scanner(System.in).nextLong(); // nimmt die Eingabe entgegen
		long x = Math.abs(eingabe); // bewirkt das ein eventuelles negatives Vorzeichen verschwindet
		String y = Long.toString(x); //wandelt x in einen String um da der iterierbar ist
		
		long max = 0; //initialisiert mit der kleinst möglichen Zahl
		long min = 9; // initialisiert mit der gröst möglichen Zahl
		
		if (x >= 0) {
			for (int i = 0; i < y.length(); i++) {
				int charAt = Integer.parseInt(String.valueOf(y.charAt(i)));
				//System.out.println(charAt);
				if (charAt > max)
					max = charAt;
				if (charAt < min)
					min = charAt;
			}
		}
			
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
				
	}

}
