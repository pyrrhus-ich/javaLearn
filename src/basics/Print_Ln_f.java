package basics;
/**
 * <h5><li>System.out</li></h5>
 * <h5><li>System.err</li></h5>
 * 
 * <li>print</li>
 * <li>println</li> 
 * <li>printf</li>
 * 
 */
class Print_Ln_f {
	public static void main (String[] args ) {
		// print erzeugt keinen Zeilenvorschub. Also keine neue Zeile
		System.out.print("Hello");
		System.out.print("Welt");
		// println hängt Zeilenvorschub an. Neue Ausgabe erzeugt neue Zeile
		System.out.println("Standard: schreibt text in die console");
		
		double zahlD = 10.23;
		System.out.println("Double : " + zahlD);
		int zahlI = 12345;
		
		System.out.println("Integer : " + zahlI);
		
		System.out.println(); // Leerzeile
		
		// Escape sequencen
		// \vor Sonderzeichen wie z.B "
		System.out.println("'Hallo' \"Welt\" ");
		
		; // Hier passiert gar nichts
		
		// \n Zeilenumbruch
		System.out.println("Hello\nWorld");
		
		// error
		System.err.println("Das ist eine Fehlermeldung");
		
		// printf Ausgabe in Landesspezifischer Kommazahl
		double zahl = 10.00;
		System.out.printf("%g", zahl);
	}
}





