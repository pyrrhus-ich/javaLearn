package textstrings;

// substring liefert Zeichenkette von Index bis zum Ende => Ein neues String Objekt

public class Substring_Teile_eines_Strings_extrahieren {

	public static void main(String[] args) {
		String a = "Was ist Dein Lieblingshund ? Franzi.";
		
System.out.println("\n********** substring() ******************************");
		String b = a.substring(13); // Nur mit Anfangsindex
		System.out.println(b);
		String c = a.substring(29,35 ); // Mit Anfangs und Endindex
		System.out.println(c);

		

	}

}
