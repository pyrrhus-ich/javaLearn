package stringStringBuffer;

public class CharAt_Gib_char_an_bestimmten_index_au {

	public static void main(String[] args) {
		
		String sentence = "Ich hoffe das alles gut geht !";
		
		char first = sentence.charAt(0);
		System.out.println("Erstes Zeichen im String => " + first);
		
		char last = sentence.charAt(sentence.length() - 1);
		System.out.println("Letztes Zeichen im String => " + last);

	}

}
