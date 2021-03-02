package stringStringBuffer;

/**
 * prüft ob eine Stringsequence in einem String vorhanden ist<br>
 *Ist caseSensitive
 *
 * 28.02.2021
 */

public class Contains {

	public static void main(String[] args) {
		String str = "Franziska die Freche";
		String str1 = "Franzi";
		String str2 = "franzi";
		
		boolean str1Instr = str.contains(str1);
		System.out.println(str1Instr);
		// check case sensitiv
		boolean str2Instr = str.contains(str2);
		System.out.println(str2Instr);
		
		System.out.println("Franziska die Freche".contains("Franzi"));

	}

}
