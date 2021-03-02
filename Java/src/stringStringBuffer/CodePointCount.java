package stringStringBuffer;
/**
 * Gibt die Anzahl der Unicodezeichen in einem String zurück<br>
 *Fängt bei 0 an zu zählen<br>
 *Verstehe nicht ganz wozu das gut sein soll
 * 28.02.2021
 */
public class CodePointCount {

	public static void main(String[] args) {
		String myStr = "Frankilein";
		int cnt = myStr.codePointCount(0, myStr.length()-1);
		int laenge = myStr.length();
		
		System.out.println(cnt + " " + laenge);

	}

}
