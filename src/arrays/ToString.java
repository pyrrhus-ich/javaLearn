package arrays;

// Methoden:
// Array.toString
// Array.deepToString

import java.util.Arrays;

// java.util.Array
public class ToString {

	public static void main(String[] args) {
		
		// toString
		String[] dogs = {"Yorki", "Pudel", "Schäferhund"};
		// produziert Kauderwelsch [Ljava.lang.String;@76ccd017
		System.out.println(dogs);
		// Gibt das Array korrekt aus [Yorki, Pudel, Schäferhund]
		System.out.println(Arrays.toString(dogs));
		
		// deepToString
		String[][] katzen = {{"Peter", "Pan"}, {"Miepsi", "Fiepsi"}};
		System.out.println("\nFehler bei Versuch Unterarray mit toString auszudrucken :" + Arrays.toString(katzen));
		System.out.println("Korrekt mit deepToString : "+ Arrays.deepToString(katzen));
	}

}
