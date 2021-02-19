package datentypen;

public class Datentyp_Ganzzahlen_byte_short_char_int_long {

	public static void main(String[] args) {
		
		//Ganzzahlen sind standardmäßig Integer
		// System.out.println(123456789012345); führt aber zu einem Fehler da die Zahl zu groß ist
		// Bei Wertebereichen +/- 2 Milliarden muss Datentyp 'long' verwendet werdne
		// Zur Verwendung von long wird ein l oder L ans Ende gesetzt
		System.out.println(123456789012345L); // wird mit L korrekt ausgedruckt
		
	}

}
