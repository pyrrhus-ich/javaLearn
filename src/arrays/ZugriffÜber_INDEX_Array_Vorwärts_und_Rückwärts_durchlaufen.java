package arrays;

public class Zugriff�ber_INDEX_Array_Vorw�rts_und_R�ckw�rts_durchlaufen {

	public static void main(String[] args) {
		String[] myArr = {"Ich" , "bin", "schlau","aber ", "nicht", "die", "Nummer", "1", "."};
		String[] myArr1 = {".", "durchlaufen", "r�ckw�rts", "wird", "Array", "Dieses"};
		// Erstes Element des Arrays
		String first = myArr[0];
		System.out.println("Erstes Element = " + first + "\n");
		
		//letztes Element des Arrays
		String last = myArr[myArr.length -1];
		System.out.println("Letztes Element = "+ last);
		
		//Array vorw�rts durchlaufen
		System.out.println("\nArray vorw�rts durchlaufen");
		for(int i = 0; i < myArr.length; i++) {
			System.out.println("Index " + i + " = " + myArr[i]);
		}
		// Array r�ckw�rts durchlaufen
		System.out.println("\nArray wird r�ckw�rts durchlaufen");
			for (int i = 1; i <= myArr1.length; i++) {
				System.out.println("Index -" + i + " = " + myArr1[myArr1.length -i]);
		}

	}

}
