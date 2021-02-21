package textstrings;

public class GetChars_Teile_eines_Strings_in_ein_Array {

	public static void main(String[] args) {
		String a = "Franziska die Freche ist  unser Hund";
		char[] b = new char[10]; // Länge muss gleich der extrahierten Länge sein
		a.getChars(10, 20, b, 0);
		System.out.println(b);
		
	}

}
