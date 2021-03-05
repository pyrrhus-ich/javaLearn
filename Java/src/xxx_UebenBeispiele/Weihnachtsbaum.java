package xxx_UebenBeispiele;


public class Weihnachtsbaum {

	public static void main(String[] args) {
		
		
		int max = 50;
		
		int vgl = 0;
		
		String sym = "*";
		String leerZeichen = "";
		
		
		for (int i = 0 ; i <= max; i++) {
			// Sorgt dafür das die Leerzeichen bei jedem Durchlauf eines weniger werden
			// das besorgt das max - i (1. Durchlauf 10 | 2. Durchlauf 9 ....
			for(int el = 0; el <= max - i; el ++) {
				leerZeichen += " ";
				// soll eigentlich zufällige 'o' s einstreuen. Das sieht aber auch noch 
				// ziemlich gleichmäßig aus
				double rd = Math.random();
				vgl = (int)(rd * 100);
				}
			System.out.println(leerZeichen + sym);
			// addiert 2 Sterne für die symetrische Darstellung
			if (vgl > 59 ) {
				sym += "*o";
			}else {
				sym += "**";
			}
			// setzt die Anzahl der Leerzeichen wieder zurück auf 0
			leerZeichen = "";
			
		}
	}

}
