package listen;

/**
 * ArrayList wenn Elemente nur am Anfang oder Ende eingefügt werden<br>
 * muessen. Oder wenn schneller Zugriff auf Elemente innerhalb der <br>
 * Liste erforderlich<br>
 * <b>Nicht fuer</b>
 * Wenn Elemente innerhalb der Liste gelöscht oder hinzugefügt werden muessen<br>
 * 
 */

import java.util.*;

public class List_ArrayList_asList {

	public static void main(String[] args) {
		List<String> myLi = new ArrayList<>();
		myLi.add("Frank"); myLi.add("Sabine");
		
		List<String> myLi1 = Arrays.asList("Franz");
		myLi1.set(0, "Du");
		// myLi1.add(0, "Wir"); Fehler add ist nicht erlaubt
		System.out.println(myLi1);
			
		myLi.addAll(myLi1);
		myLi.addAll(2, myLi1); //Einfügen am Index 2
		
		System.out.println(myLi);
		//myLi.add(23); geht nicht wegen <String>
	
		
		
		
		
		

	}

}
