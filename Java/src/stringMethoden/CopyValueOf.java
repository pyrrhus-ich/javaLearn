package stringMethoden;

/**
 * nimmt ein Array aus chars und gibt einen String zurück<br>
 *
 *
 * 28.02.2021
 */

public class CopyValueOf {

	public static void main(String[] args) {
		char[] myArr = {'H', 'e', 'l', 'l', 'o' } ;
		String str = "";
		
		// Mit Start und End Index
		str = str.copyValueOf(myArr, 0, 3);
		System.out.println(str);
		// Das gesamte Array
		str = str.copyValueOf(myArr);
		System.out.println(str);

	}

}
