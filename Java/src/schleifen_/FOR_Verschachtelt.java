package schleifen_;

public class FOR_Verschachtelt {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 3; i ++) {
			for (int j = 0; j <= 5; j ++ ) {
				System.out.printf("I = %d und j = %d%n", i, j);
				
			}// ende innere for
			
			System.out.println("<<<< Innere for ist einmal durch >>>>");
			
		}// Ende äußere for

	}

}
