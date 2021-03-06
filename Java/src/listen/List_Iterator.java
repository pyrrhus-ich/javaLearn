package listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		// erzeugt die Liste
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "b","c","d");
		
		// erzeugt das Iterator Objekt für die Liste
		ListIterator<String> itO = list.listIterator();
		
		itO.add("a"); // fügt "a" an Position 0 ein
		System.out.println(list); // [a, b, c, d]
		
		// remove und set arbeiten immer vom letzten Index aus der mit next()
		// oder previous() gesetzt wurde
		
		// remove geht nur wenn vorher next() oder previous ausgeführt wurde
		itO.next(); // startet bei 0 und geht zum Index 1
		itO.remove(); // löscht den Wert auf Index 1
		System.out.println(list); //[a, c, d]
		
		itO.previous();// geht zu Index 0
		itO.remove(); // loescht Index 0 Der Zeiger steht vor 0
		System.out.println(list); //[c, d]
		
		itO.next(); // da der Zeiger vor 0 steht geht er jetzt zu 0
		itO.set("E"); // aendert den Index 0
		System.out.println(list);
		
		itO = list.listIterator(1); // erzeugt neuen Iterator an Ind 1
		itO.add("A");
		System.out.println(list);
		
		itO = list.listIterator(list.size()); // erzeugt Iterator Objekt hinter dem letzten Index
		itO.previous(); // geht einen Schritt zurück
		itO.remove(); // löscht das letzte Element
		System.out.println(list);

		// Liste rueckwaerts durchlaufen
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1 , "1", "2", "3", "4", "5", "6");
		System.out.println(list1);
		
		for (ListIterator<String> it = list1.listIterator(list1.size());
				it.hasPrevious(); )
		System.out.print(it.previous() + " ");

		
		
	}

}
