package stringStringBuffer;
/**
 * gibt den Index des ersten Vorkommens aus<br>
 *oder aber -1 wenn der String nicht vorhanden ist.<br>
 *
 * 01.03.2021
 */
public class IndexOf {

	public static void main(String[] args) {
		String str = "Wir lernen Java";
		
		System.out.println("Index von \"lernen\" ist " + str.indexOf("lernen"));
		
		System.out.println("Index von \"nen\" ist    " + str.indexOf("nen"));
		
		System.out.println(str.indexOf("ava", 10)); // sucht ab index 10 gibt aber den Index von 0 aus an
		
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf(101)); // Buchstabe e als Unicode
		
		System.out.println(str.indexOf("String ist nicht vorhanden"));

	}

}
