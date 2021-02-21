package arrays;

import java.util.*;

// Methoden aus java.util.Arrays
// -equals
// -deepEquals
// beide Methoden geben true oder false zurück
// mismatch

public class B_Vergleichen_mit_equals_und_deepEquals {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1, 2, 3};
		int[] c = {0, 1, 2};
		System.out.println("Einfache Arrays :");
		System.out.printf("1 Ist a = b ??? => %b%n", Arrays.equals(a, b));
		System.out.printf("2 Ist c = a ??? => %b%n", Arrays.equals(c, a));
		
		System.out.println("\nMehrdimensionale Arrays :");
		int[][] d = {{1, 2}, {3, 4}};
		int[][] e = {{1, 2}, {3, 4}};
		int[][] f = {{1, 2, 3}, {3, 4}};
		// verwendung von equals führt zu falschem Ergebis
		System.out.printf("3 Ist d = e ??? => %b <= Fehler weil mehrdimensionales Array%n", Arrays.equals(d, e));
		// bei Mehrdimensionalen Arrays deepEquals
		System.out.printf("4 Ist d = e ??? => %b <= Mit deepEquals korrekt%n", Arrays.deepEquals(d, e));
		
		// Strings Vergleichen => ohne groß kleinschreibung
		System.out.println("\nArray von Strings vergleichen");
		String[] words1 = { "Zufriedenheit", "übertrifft" , "Reichtum" }; 
		String[] words2 = { "REICHTUM", "übertrifft" , "ZuFRIEDEnheit" }; 
		Arrays.sort( words1, String.CASE_INSENSITIVE_ORDER ); 
		Arrays.sort( words2, String.CASE_INSENSITIVE_ORDER ); 
		System.out.println("5 " + Arrays.equals( words1, words2, String.CASE_INSENSITIVE_ORDER ) );

		System.out.println("\nVerwendung von mismatch");
		System.out.printf("6 Wenn arrays gleich sind => %d%n",Arrays.mismatch(a, b));
		System.out.printf("7 Wenn Arrays nicht gleich sind => %d%n",Arrays.mismatch(a, c));
	}

}
