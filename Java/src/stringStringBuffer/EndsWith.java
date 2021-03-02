package stringStringBuffer;
/**
 * prüft ob ein string mit einer bestimmten sequenz endet<br>
 *
 *
 * 28.02.2021
 */
public class EndsWith {

	public static void main(String[] args) {
		String str = "Franzi die Freche";
		boolean res = str.endsWith("che");
		System.out.println(res);
		
		boolean res1 = str.endsWith("e");
		System.out.println(res1);

	}

}
