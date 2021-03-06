package listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KopierenUndAusschneiden {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Frank"); list.add("Sabine"); list.add("Franzi"); list.add("Sabine"); list.add("Sabine");list.add("Frank");list.add("Frank");list.add("Frank");    
		list.add("Franki"); list.add("Sabinelein"); list.add("Franzili"); list.add("Sabinelein"); System.out.println("\"list\" nach der befüllung : " + list);
		
		List<String> list1 = new ArrayList<>( Arrays.asList( "0 1 2 3 4 5 6 7 8 9".split(" ")) );
		System.out.println(list1);
		
		// sublist enfernt von bis
		list1.subList(2, list1.size() - 2).clear(); //[0, 1, 8, 9]
		System.out.println("sublist : " + list1);
	}

}
