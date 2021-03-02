package stringStringBuffer;

/**
 * haengt den einen String an den anderen<br>
 *funktioniert mit und ohne variablen<br>
 *
 * 28.02.2021
 */

public class Concat {

	public static void main(String[] args) {
		String str = "Frank";
		String str1 = " Menzel";
		System.out.println(str.concat(str1));
		System.out.println("Frank".concat(" Menzel"));

	}

}
