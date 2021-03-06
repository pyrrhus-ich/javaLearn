package listen;

/**
 * ArrayList wenn Elemente nur am Anfang oder Ende eingefügt werden<br>
 * muessen. Oder wenn schneller Zugriff auf Elemente innerhalb der <br>
 * Liste erforderlich<br>
 * <b>Nicht fuer</b>
 * Wenn Elemente innerhalb der Liste gelöscht oder hinzugefügt werden muessen<br>
 * <b>Fuer solche Faelle<b><br>
 * Array.asList => add geht dort nicht => set überschreibt den Wert am Index<br>
 * 
 */

import java.util.*;

public class List_ArrayList_asList {

	public static void main(String[] args) {
		List<String> myLi = new ArrayList<>();
		myLi.add("Frank"); myLi.add("Sabine");
		System.out.println("myLi (ArrayList) nach Initialisierung : " + myLi);
		
		List<String> myLi1 = Arrays.asList("Franz");
		System.out.println("myLi1 (Array.asList) nach Initialisierung : " + myLi1);
		myLi1.set(0, "Du"); // set überschreibt den Index
		// myLi1.add(0, "Wir"); Fehler add ist nicht erlaubt
		System.out.println("myLi1 nach set Du auf 0 : "+ myLi1);
			
		myLi.addAll(myLi1);
		System.out.println("myLi nach addAll myLi1 : " + myLi);
		myLi.addAll(1, myLi1); //Einfügen am Index 1
		System.out.println("myLi nach addAll myLi1 an Ind 1 : " + myLi);
		//myLi.add(23); geht nicht wegen <String>
	
		
		
		
		
		

	}

}
