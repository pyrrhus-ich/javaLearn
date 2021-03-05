package xxx_UebenBeispiele.PascalschesDreieck;


import java.util.*;

// In this challenge you have to implement an algorithm that returns the n-th row

public class code {
	
// wenn die zahl 3 ist
// neues Array mit länge 3
// Arr[0] = 1; Arr1 =2 Arr[2] == 1
// 
	
	public static void triangle(Integer n) {
		int[][] triangle = new int[n][];
		for (int row = 0; row < triangle.length; row++) {
			//System.out.print(row);
			
		triangle[row] = new int[row +1];
		
		for (int col = 0; col <= row; col++) {
			if (col == 0 || col == row) {
				triangle[row][col] = 1;
			}else {
				triangle[row][col] = triangle[row - 1][col -1] 
									 + triangle[row -1][col];
				
			}// ifelse
			
		}// second for
		System.out.printf("%3d %n", triangle[row][col]);
		}// first for
			
		
		
	}// triangle
	

}
