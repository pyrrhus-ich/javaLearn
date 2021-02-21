package examples;

public class FOR_EACH {

	public static void main(String[] args) {
		int[] myArr = {5, 25, 36};
		for (int n : myArr) {
			System.out.printf("n = %d%n",n);
			
			// Selektion funktioniert nicht
			if (n < 5) {
				System.out.println(n);
			}
		}

	}

}
