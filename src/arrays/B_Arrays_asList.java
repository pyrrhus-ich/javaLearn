package arrays;
import java.util.*;
// kann nur Objekte z.B Strings | Funktioniert nicht bei primitiven Datentypen (char, int...)
// bei unsortierten Arrays funktioniert binary Search nicht
// die Methode dekoriert das Array als Liste vom typ java.util.List . Darauf sind dann Methoden 
// vom Typ contains(); equals() oder suList() möglich

public class B_Arrays_asList {

	public static void main(String[] args) {
		
		// asList nimmt entweder ein array von Objekten oder aufgezahlte Elemente
		System.out.println( "Leer => " + Arrays.asList()); // leer ist möglich
		System.out.println( Arrays.asList("Frank", "Franka")); // Liste ist möglich
		
		String[] myArr = {"Ich", "Du", "Wir"};
		System.out.println( Arrays.asList(myArr)); // Array ebenfalls
		
		int[] myIntArr = {25, 35, 46};
		System.out.println("Integer können nur mit toString ausgegeben werden " + myIntArr);
		System.out.println( Arrays.toString(myIntArr));
		
		String[] a = { "Asus", "Elitegroup", "MSI" }; 
		String[] b = { "Elitegroup", "MSI", "Shuttle" };
		// Beispiel für equals
		// prüft ob a index 1 und 3  == b Index 0 und 1 ist. Gibt true or false zurück
		// der Endindex ist immer exclusiv(ausgeschlossen)
		System.out.println( Arrays.asList( a ).subList( 1, 3 ).equals( Arrays.asList( b ).subList( 0, 2 ) ) ); // true


	}

}
