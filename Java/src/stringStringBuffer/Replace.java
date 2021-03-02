package stringStringBuffer;

/**
 * ersetzt einen String durch den anderen
 *
 *
 * 02.03.2021
 */


public class Replace {

	public static void main(String[] args) {
		String str = "Frank Menzel";
		String str1 = str.replace("k", "ziska");
		String str2 = str.replace("z", "s");
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
