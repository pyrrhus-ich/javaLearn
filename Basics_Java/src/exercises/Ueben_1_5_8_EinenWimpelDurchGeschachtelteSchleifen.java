package exercises;

public class Ueben_1_5_8_EinenWimpelDurchGeschachtelteSchleifen {

	public static void main(String[] args) {
		int max = 5;
		int x = 1;
		
		for (int i = 1 ; i <= max; i++) {
				for(int y = 1; y <= x; y++) {
					System.out.print(x);
				}
				System.out.println();
				x += 1;
		}
	}

}
