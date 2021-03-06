package listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoeschenVonElementen {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Frank"); list.add("Sabine"); list.add("Franzi"); list.add("Sabine"); list.add("Sabine");list.add("Frank");list.add("Frank");list.add("Frank");    
		list.add("Franki"); list.add("Sabinelein"); list.add("Franzili"); list.add("Sabinelein"); System.out.println("\"list\" nach der befüllung : " + list);
		
		list.remove(1);                                                                           System.out.println("remove(1)   => entfernt Sabine an Index 1 : " + list);
	    list.remove("Sabine");                                                                    System.out.println("remove()    => entfernt die erste \"Sabine\" die es findet" + list);
	    list.removeAll(Arrays.asList("Frank"));                                                   System.out.println("removeAll() => entfernt alle Vorkommen von \"Frank\" : " + list);
	    
	    list.clear();                                                                             System.out.println("clear()     => entfernt alle Elemente : " + list);
	
	    
	    
	    List <String> list2 = new ArrayList<>();
		list2.add("Frank"); list2.add("Sabine"); list2.add("Franzi"); list2.add("Sabine"); list2.add("Sabine");list2.add("Frank");list2.add("Frank");list2.add("Frank");    
		list2.add("Franki"); list2.add("Sabinelein"); list2.add("Franzili"); list2.add("Sabinelein"); System.out.println("\n\"list2\" nach der befüllung : " + list2);
		
		list2.removeIf( n-> (n.length() > 5));                                                    System.out.println("removeIf()  => bekommt eine Kondition mit. Entferne alle Elemente mit length() > 5 : " + list2);
		
	}

}
