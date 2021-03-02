package stringStringBuffer;

/**
 * schneidet whitespace vorne und hinten ab
 *
 *
 * 02.03.2021
 */

public class Trim {

	public static void main(String[] args) {
		String str1 = "   Ich bin der String    ";
		String str2 = str1.trim();
		System.out.println(str1 + "\n" + str2);

	}

}
