package strings;

public class Replace_und_replaceAll {

	public static void main(String[] args) {
		// replace ersetzt char oder char sequencen durch strings
		String a = "Fuer mich bist Du schoen. Und das bleibst Du auch .";
		String b = a.replace("ue", "ü").replace("oe", "ö").replace(" ", "_").replace(".","!");
		System.out.println(b);
		
		
		// replace all ersetzt alle Strings die durch regex beschrieben werden. Gefährlich !!
		b = a.replaceAll(".", "!"); // ersetzt alle Zeichen weil der Punkt ein Soderzeichen ist
		System.out.println(b);
		b = a.replaceAll("\\.", "!"); // Führt zum gewünschtem Ergebniss
		System.out.println(b);

	}

}
