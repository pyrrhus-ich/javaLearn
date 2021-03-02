package stringStringBuffer;
/**
 * macht aus einem String ein Array aus Buchstaben<br>
 *
 *
 * 01.03.2021
 */
public class GetChars {

	public static void main(String[] args) {
		String str = "Frank Menzel";
		char[] myCharAr = new char[str.length()];
		myCharAr = str.toCharArray();
		for (char el : myCharAr) {
			System.out.println(el);
		}
	}

}
