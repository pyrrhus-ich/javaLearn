package arrays;
import java.util.*;

// Füllt ein Array mit Werten. Der Standardbereich lässt sich optional angeben

public class B_Fill {

	public static void main(String[] args) {
		char[] zeichen = new char [4]; // array mit 4 Stellen
		Arrays.fill(zeichen, '*'); //Wichtig keine Doppelten Anführungszeichen
		
		String[] text = new String [4];
		Arrays.fill(text, "Ich"); //bei String doppelte Anführungszeichen
		
		for (char el : zeichen)
			System.out.print(el + "|");// | ist der Trenner
		
		System.out.println();
		
		for (String el : text )
			System.out.print(el + " | ");
			
		
		

	}

}
