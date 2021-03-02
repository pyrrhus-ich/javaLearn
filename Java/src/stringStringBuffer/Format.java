package stringStringBuffer;
/**
 * 2 Methoden format() und printf()
 *Siehe Java Insel S.390
 *Formatspezifizierer für Datumswerte S.391
 *
 * 02.03.2021
 */
public class Format {

	public static void main(String[] args) {
		// s formats strings. Funktioniert auch mit boolean
		// b boolean
	    // d formats decimal integers.
	    // f formats floating-point numbers. Werden gerundet 0,45 ~ 0,5
	    // t formats date/time values. Erwartet immer suffix S.392 JavaInsel
		// % Przentzeichen
		// n neue Zeile
		// verwendung von Argumenten S.393
		String str = String.format("Hallo %s. %s hat schon %d mal angerufen ", "Frank", "Peter", 5);
		System.out.println(str);

	}

}
