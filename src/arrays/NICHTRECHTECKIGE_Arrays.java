package arrays;
// Kompliziertes Beispiel au Java Insel S.289
public class NICHTRECHTECKIGE_Arrays {

			// Dreieckiges Array erstellen
			static void dreieckArr() {
				String[][] myArr = new String [9][];
				System.out.printf("MyArr length = %d%n", myArr.length);
				for (int i = 0; i < myArr.length; i++) {
					myArr[i] = new String [i + 1];
					// Befüllen
					for (int j = 0; j < myArr[i].length; j++)
						myArr[i][j] = "*";
				}		
				// Ausdrucken
				for (int line = 0; line < myArr.length; line++) {
					for (int column = 0; column < myArr[line].length; column++ )
						System.out.print(myArr[line][column]);
					System.out.println();
				}
			}
	
	
	
	public static void main(String[] args) {
		dreieckArr();

	}

}
