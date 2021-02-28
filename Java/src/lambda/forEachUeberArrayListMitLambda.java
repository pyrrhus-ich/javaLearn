package lambda;

import java.util.ArrayList;

public class forEachUeberArrayListMitLambda {

	public static void main(String[] args) {
		// definiert myArr das schon Werte enthält
		Integer[] myArr = {4,7,8};
		// definiert myList
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		// fügt Werte zu myList hinzu
		myList.add(5);  // fügt tatsächlich die Int 5 hinzu
		myList.add(myArr[2]); // fügt die Int aus Index 2 von myArr hinzu
		
		// fügt alle elemente aus myArr zu myList hinzu
		for (int el : myArr) {
			myList.add(el);
		}
		
		// Hier kommt die Lambda Function die alle elemente aus myList ausdruckt
		// forEach geht nur für List Elemente. Nicht für elemente eines Arrays
		myList.forEach( (el) -> System.out.println("Lambda function genutzt => " + el));
		

}
	
}
