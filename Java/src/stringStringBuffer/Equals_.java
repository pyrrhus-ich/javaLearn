package stringStringBuffer;
/**
 * Vergleicht ganze Strings<br>
 * Zwei Methoden <br>
 * <li>equals</li>
 * <li>equalsIgnoreCase</li>
 *
 *
 * 01.03.2021
 */
public class Equals_ {

	public static void main(String[] args) {
		String a = "frank ist cool";
		String b = "Frank ist cool";
		
		// equals()
		if (a.equals(b)) {
			System.out.println("a ist gleich b");
		}else {
			System.out.println("a ist Nicht gleich b");
		}
		//equalsIgnoreCase()
		if (a.equalsIgnoreCase(b)) {
			System.out.println("a Ist Gleich b");
		}else {
			System.out.println("a ist nicht gleich b");
		}
	}

}
