package textstrings;

// hinter der öffnenden Klammer kommt das Trennzeichen

public class join_Strings_zusammenfügen {

	public static void main(String[] args) {
		String s = String.join( " ", "Geht", "ein", "Mullah", "in", "die", "Bar." );
		System.out.println(s);
		
		String a = "4711";
		String b = "und";
		String c = "0815";
		String d = "sind Umgangssprachliche Begriffe";
		System.out.println(String.join(" ", a, b, c, d));
	}

}
