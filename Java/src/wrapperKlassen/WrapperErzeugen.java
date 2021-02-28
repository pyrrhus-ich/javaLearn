package wrapperKlassen;
/**
 * Insel S.685
 *
 *
 * 25.02.2021
 */
public class WrapperErzeugen {

	public static void main(String[] args) {
		System.out.println(int1 + " " + int2 + " " + lng1 + " " + int3 + " " + bol1);

	}// main
	
	// Ueber statische valueOf() Methode
	static Integer int1 = Integer.valueOf("30"); // valueOf()
	static Integer int2 = Integer.valueOf(15);	// valueOf()
	static Long lng1 = Long.valueOf("256987");
	// Ueber boxing => Hierbei erzeugt der Compier automatisch valueOf() aufrufe
	static Integer int3 = 897;
	static Boolean bol1 = true;
	// über Konstruktor. => Ist deprecated kann aber in altem Code noch vorkommen
	
	
	

	
	

}
