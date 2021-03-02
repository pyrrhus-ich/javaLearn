package stringStringBuffer;
/**
 * Funktionalität wie compareTo aber vorher werden alle Buchstaben<br>
 *in lowercase umgewandelt.
 *
 * 28.02.2021
 */
public class CompareToIgnoreCase {

	public static void main(String[] args) {
		String str1 = "Frank";
		String str2 = "frank";
		int compareTo = str1.compareTo(str2);
		int compareToIgnoreCase = str1.compareToIgnoreCase(str2);
		System.out.println(compareTo);
		System.out.println(compareToIgnoreCase);

	}

}
