package arrays;
import java.util.*;

// Achtung !!! für biarySearch muss das Array vorher unbedingt sortiert sein
// Wenn nicht liefert es falsche Ergebnisse
// Ergebnis ist der Index

public class B_binarySearch {

	public static void main(String[] args) {
		int[] numbers = { 10, 100, 1000, 1 }; 
		Arrays.sort( numbers ); 
		System.out.println( Arrays.toString( numbers ) ); // [1, 10, 100, 1000] 
		System.out.println( Arrays.binarySearch( numbers, 100 ) ); // 2


	}

}
