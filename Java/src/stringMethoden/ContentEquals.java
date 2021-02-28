package stringMethoden;

/**
 * gibt nur true zurück wenn wirklich der ganze String übereinstimmt<br>
 *
 *
 * 28.02.2021
 */

public class ContentEquals {

	public static void main(String[] args) {
		String str = "Franziska die Freche pennt schon wieder";
		
		String str1 = "die Freche";
		boolean result = str.contentEquals(str1);
		System.out.println(result);
		
		String str2 = "Freche";
		boolean result1 = str.contentEquals(str2);
		System.out.println(result1);
		
		String str3 = "Franziska die Freche pennt schon wieder";
		boolean result2 = str.contentEquals(str3);
		System.out.println(result2);

	}

}
