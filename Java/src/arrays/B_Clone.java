package arrays;

// Wenn arrays geclont wurde führt jede Änderung in einem array zur selben änderung
// im anderen Array. 
public class B_Clone {

	public static void main(String[] args) {
		String[][] myArr = {{"Frank", "Sabine"}, {"Franzi", "Francesca"} };
		String[][] zielArr = myArr.clone();
		System.out.println(myArr[1][0]);
		System.out.println(zielArr[1][0]);
		// Wert im source Array wird geändert
		myArr[1][0] = "Peter";
		System.out.println(myArr[1][0]);
		System.out.println(zielArr[1][0]);
		// Wert im ZielArray wird geändert
		zielArr[1][0] = "Detlef";
		System.out.println(myArr[1][0]);
		System.out.println(zielArr[1][0]);
		
		
	}

}
