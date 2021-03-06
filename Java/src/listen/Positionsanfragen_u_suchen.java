package listen;

import java.util.*;
import java.util.ArrayList;

public class Positionsanfragen_u_suchen {

	public static void main(String[] args) {
		List <String> myList = new ArrayList<>();
		myList.add("Frank"); myList.add("Sabine"); myList.add("Franzi"); myList.add("Sabine");      System.out.println("myList nach der befüllung : " + myList);
		
		
		boolean b = myList.isEmpty();                                                               System.out.println("Ist die Liste leer ? : " + b);
		boolean c = myList.contains("Frank");                                                       System.out.println("Enthaelt die Liste \"Frank\" ? : " + c );
		boolean ca = myList.containsAll(Arrays.asList("Sabine", "Franziska")); 						System.out.println("Enthaelt myList \"Sabine\" und \"Franziska\" ? : " + ca);
		
		Object o = myList.get(1);                                              						System.out.println("Am Index 1 steht : " + o);
		
		int i = myList.indexOf("Sabine");                                      						System.out.println("\"Sabine\" steht am Index : " + i);
	    i = myList.lastIndexOf("Sabine");                                 							System.out.println("Der letzte Index von Sabine ist : " + i);
	
	    
	    
	}

}
