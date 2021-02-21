package arrays;
import java.util.*;

// erlaubt auch Bereichsangaben
// copyOf
// kann Array vergrößern siehe hierzu snow2 wurde vergrößert auf 12 Elemente
// copyOfRange
// snow4 wurde eingefügt von und an Index 2. Somit hat es keine 12 elemente

public class B_copyOf_copyOfRange {

	public static void main(String[] args) {
		String[] snow = { "Neuschnee", "Altschnee", "Harsch", "Firn" }; 
		String[] snow1 = Arrays.copyOf( snow, 2 ); // [Neuschnee, Altschnee] 
		String[] snow2 = Arrays.copyOf( snow, 12 ); // [Neuschnee, Altschnee, Harsch, 
												   // Firn, null] 
		String[] snow3 = Arrays.copyOfRange( snow, 2, 4 ); // [Harsch, Firn]  
		String[] snow4 = Arrays.copyOfRange( snow, 2, 12 ); // [Harsch, Firn, null]
		
		System.out.println("Snow 2 Beispiel für copyOf ");
		for (String el : snow2)
			System.out.print(el + " | ");
		
		System.out.println();
		
		System.out.println("\nSnow 4 Beispiel für copyOfRange");
		for (String el : snow4)
			System.out.print(el + " | ");
		
		for (int i = 0; i < snow4.length; i++)
			System.out.printf("Index %d = %s | ", i, snow4[i]);
	}

}
