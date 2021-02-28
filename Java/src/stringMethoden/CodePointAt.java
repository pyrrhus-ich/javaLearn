package stringMethoden;
/**
 * gibt den Unicode eines Buchstaben an einem bestimmten Index aus<br>
 * Syntax:<br>
 * String.codePointAt(Index);<br>
 * Beispiel:<br>
 * int x = myStr.codePointAt(el);
 *28.02.2021
 */

public class CodePointAt {

	public static void main(String[] args) {
		String myStr = "abcxyz12/\\3@§&%ABCäöü";
		
		for (int el = 0; el < myStr.length() ; el++) {
			System.out.printf("Index %d "
					+ "Buchstabe %s "
					+ "Unicode %d %n", el, myStr.charAt(el), myStr.codePointAt(el));
		}
	}

}
