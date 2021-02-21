package textstrings;

// Wandle einen String um in Uppercase
// berücksichtige Zahlen oder punkte nicht
// Wenn es einen Whitespace gibt, ersetze diesen durch einen Unterstrich
// kann nicht mit ß umgehen

public class Character_toUpperCase_toLowerCase {

	public static void main(String[] args) {
		String satz = "Ich bin der 1. Earl of London";
		System.out.println(satz);
		
		for (int i = 0; i < satz.length(); i++) {
			char c = satz.charAt(i);

			if (Character.isWhitespace(c))
				System.out.print("_");
			else if (Character.isLetter(c))
				System.out.print(Character.toUpperCase(c));
			
		}
			

	}

}
