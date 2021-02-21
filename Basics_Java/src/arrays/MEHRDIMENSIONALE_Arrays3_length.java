package arrays;

public class MEHRDIMENSIONALE_Arrays3_length {

	public static void main(String[] args) {
		int[][] myArr = {{1, 2},{3, 4}, {5, 6}};
		// Länge des gesamten Arrays
		int myArrLength = myArr.length;
		System.out.println(myArrLength);
		
		//Länge eines der Unterelemente hier der Index 0
		int myArrEl = myArr[0].length;
		System.out.println(myArrEl);
		
	}

}
