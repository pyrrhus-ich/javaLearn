package schleifen_;

import java.util.ArrayList;

public class forSchleifeUeberArrayList {

	public static void main(String[] args) {
		    String str1 = Integer.toString(4711),
				   str2 = Long.toString(58976L),
				   str3 = Float.toString(459.56F),
				   str4 = Double.toString(4589.478),
				   str5 = Boolean.toString(false);
		
		ArrayList<String> myList = new ArrayList<>();

					myList.add(str1); 
					myList.add(str2); 
					myList.add(str3); 
					myList.add(str4); 
					myList.add(str5);
					
	for(int el = 0; el <= myList.size()-1; el++) {
		System.out.println(myList.get(el));
	}
	
	String x = myList.get(0);
	System.out.println("Index 0 => " + x);
		
	
	

}
}
