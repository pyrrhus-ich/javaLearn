package arrays;
import java.util.*;

// ist noch nicht ganz klar wie das funktioniert 
// Sieht so aus als könnten nur bestimmte Funktionen genutzt werdne

public class B_setAll {

	public static void main(String[] args) {
		double[] myArr = {5, 6, 9};
		
		for (double el : myArr)
			System.out.print(el + " | ");
		
		System.out.println();
		
		Arrays.setAll(myArr, v -> Math.random()); // Lambda Funktion
		for (double el : myArr)
			System.out.print(el + " | ");
		

	}

}
