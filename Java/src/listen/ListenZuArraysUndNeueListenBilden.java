package listen;

import java.util.*;

public class ListenZuArraysUndNeueListenBilden {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Frank"); list.add("Sabine"); list.add("Franzi"); list.add("Sabine");      System.out.println("\"list\" nach der befüllung : " + list);
		// Array erstellen
		String[] array = list.toArray(new String[list.size()]);                             System.out.print("\"array\"nach erstellen : ");for (String el : array) {System.out.print(el +", " );}
		//oder
		String[] array1 = list.toArray( String[]::new );                                    System.out.print("\n\"array1\"nach erstellen : ");for (String el : array1) {System.out.print(el +", " );}
		//LinkedList erstellen
		List<String> list2 = new LinkedList<>( list );                                      System.out.println("\n\"list2\" nach erstellen : "+ list2);
		list2.retainAll(Arrays.asList("Franzi", "Sabine"));                              System.out.println("\"list2\" nach retainAll() : "+ list2);
	}

}
