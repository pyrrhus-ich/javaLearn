package arrays;

public class ZugriffÜber_INDEX_Array_Vorwärts_und_Rückwärts_durchlaufen {

	public static void main(String[] args) {
		String[] myArr = {"Ich" , "bin", "schlau","aber ", "nicht", "die", "Nummer", "1", "."};
		String[] myArr1 = {".", "durchlaufen", "rückwärts", "wird", "Array", "Dieses"};
		// Erstes Element des Arrays
		String first = myArr[0];
		System.out.println("Erstes Element = " + first + "\n");
		
		//letztes Element des Arrays
		String last = myArr[myArr.length -1];
		System.out.println("Letztes Element = "+ last);
		
		//Array vorwärts durchlaufen
		System.out.println("\nArray vorwärts durchlaufen");
		for(int i = 0; i < myArr.length; i++) {
			System.out.println("Index " + i + " = " + myArr[i]);
		}
		// Array rückwärts durchlaufen
		System.out.println("\nArray wird rückwärts durchlaufen");
			for (int i = 1; i <= myArr1.length; i++) {
				System.out.println("Index -" + i + " = " + myArr1[myArr1.length -i]);
		}

	}

}
