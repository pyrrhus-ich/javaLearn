package stringStringBuffer;
/** 
 * Prueft ob ein String die length() 0 hat oder Nicht ist oder nicht<br>
 *gibt boolean zurück<br>
 *Achtung wenn String nur aus whitespace besteht erkennt er das als String<br>
 *fuer diese Faelle ist isBlank() das richtige.
 * 01.03.2021
 */
public class IsEmpty_u_IsBlank {

	public static void main(String[] args) {
		String str1 = "Ich";
		String str2 = "";
		String str3 = "  ";
		
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		// erkennt keinen whitespace
		System.out.println(str3.isEmpty());
		// erkennt auch whitespace
		System.out.println(str3.isBlank());
	}

}
