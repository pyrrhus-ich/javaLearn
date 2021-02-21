package textstrings;

// Wandle einen String um in Uppercase
// berücksichtige Zahlen oder punkte nicht
// Wenn es einen Whitespace gibt, ersetze diesen durch einen Unterstrich
// kann nicht mit ß umgehen

public class Character_toUpperCase_toLowerCase2 {

	public static void main(String[] args) {
		String satz = "Ich schweiße seit 1999 , ich klein bin";
		System.out.println(satz);
		//satz = satz.replace("ß", "ss"); // ersetzt das ß durch ein ss
		System.out.println(satz);
		
		for (int i = 0; i < satz.length(); i++) {
			char c = satz.charAt(i);

			if (Character.isWhitespace(c))
				System.out.print("_");
			else if (Character.isLetter(c))
				System.out.print(Character.toUpperCase(c));
			else if (Character.isDigit(c))
				System.out.print(c);
			
		}
			

	}

}
