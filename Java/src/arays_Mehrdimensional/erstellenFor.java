package arays_Mehrdimensional;

public class erstellenFor {

	public static void main(String[] args) {
		createArr(5,6);

	}// main
	
	public static void createArr(int row, int col) {
		int[][] myArr = new int[row][col];
		for (int i = 0; i<= row - 1; i++) {
			for (int j = 0; j<= col - 1; j++) {
				myArr[i][j]= j;
			}
		}// for
		System.out.println(myArr.length);
		
		//Ausgabe des Arrays
		for (int i = 0; i <= myArr.length - 1; i++) {
			System.out.println("es beginnt Reihe " + i);
			for (int j = 0; j <= myArr[i].length - 1; j++) {
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
