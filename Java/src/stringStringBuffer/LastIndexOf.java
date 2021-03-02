package stringStringBuffer;
/**
 * gibt den Index des letzten Vorkommens aus<br>
 *oder aber -1 wenn der String nicht vorhanden ist.<br>
 *wenn als zweites Argument ein Index genannt wird, so ist das der Index bis zu dem gesucht wird<br>
 * 01.03.2021
 */
public class LastIndexOf {

	public static void main(String[] args) {
		String str = "Wir lernen Java";
		
		System.out.println(str.lastIndexOf("e", 7 )); // sucht letztes "e" vor dem Index 7
		System.out.println(str.lastIndexOf("e", 4 )); // da bis Index 4 kein "e" vorkommt meldet er -1
		
		System.out.println(str.lastIndexOf("ava"));
		
		System.out.println(str.lastIndexOf(101)); // Buchstabe e als Unicode
		
		System.out.println(str.lastIndexOf("String ist nicht vorhanden"));

	}

}
