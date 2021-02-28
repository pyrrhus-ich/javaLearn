package stringMethoden;
/**
 * vergleicht lexigraphisch str1 mit str2<br>
 *Syntax:<br>
 *string1.compareTo(string2)<br>
 *Es sieht so aus als würden die Unicodes ermittelt und dan die Differenz ausgegeben<br>
 *result => 0 Sind beide gleich, <0 string1 < string2, >0 string1 > string2
 * 28.02.2021
 */
public class CompareTo {

	public static void main(String[] args) {
		String str1 = "0";
		String str2 = "00";
		
		addiereUnicodes(str1);
		addiereUnicodes(str2);
		System.out.println(str1.compareTo(str2));

	}

	
	public static void addiereUnicodes(String str) {
		int uniSum = 0;
		for (int i = 0; i<= str.length() -1 ; i++) {
			uniSum += str.codePointAt(i);
		}//for
		System.out.println(uniSum);	
	}// addiereUnicodes
	
}
