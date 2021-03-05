package arays_Mehrdimensional;

public class ausgeben {

	public static void main(String[] args) {
		int[][] myAr = {{101, 205 , 2,},{9,8}};
		
			for (int row = 0; row <= myAr.length - 1; row++) {
				if (row > 0) {
					System.out.println("---------------------");
					}
				
				for (int col = 0; col <= myAr[row].length -1 ; col++)
					System.out.println("Row " + row + " Col " + myAr[row][col]);
			}

	}

}
