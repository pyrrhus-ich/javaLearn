package stringStringBuffer;

/** splittet einen String am gegebenen delimiter
 * 
 */

import java.util.Arrays;
import java.util.regex.Pattern;

public class Split {

	public static void main(String[] args) {
		String str = "www.tutego.com. Ist das hilfreich? Ja. Denn wir lernen Java!";
		
		// punkt ist ein Sonderzeichen und muss deshalb markiert werden
		String[] strArr = str.split("\\.");
		// Nutzung von Pattern.quote für trennung mit Punkt
		String[] strArr1 = str.split(Pattern.quote("."));
		
		String[] strArr2 = str.split(" ");
		
		// Achtung schmeisst die Satzzeichen weg trennt aber sowohl am Punkt als auch
		// an edem Leerraum und am Ausrufe und Fragezeichen
		String[] strArr3 = str.split("(\\s|\\p{Punct})+");
		
		
		System.out.println("Trennt nur am Punkt =>         " + Arrays.toString(strArr) + " " + strArr.length);
		System.out.println("Trennt auch am Punkt =>        " + Arrays.toString(strArr1) + " " + strArr1.length);
		System.out.println("Trennt an jedem Leerzeichen => " + Arrays.toString(strArr2) + " " + strArr2.length);
		System.out.println("Trennt an jedem Satzzeichen und Leerraum "+Arrays.toString(strArr3) + " " + strArr3.length);
	}

}
