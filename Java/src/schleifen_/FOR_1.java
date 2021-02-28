package schleifen_;
/**
 * <p>
 * Ist wie die while Schleife, wird aber in erster Linie zum Z�hlen verwendet. Wird <br>
 * nur ausgef�hrt wenn die Bedingung wahr ist
 * </p>
 * 
 *
 */
public class FOR_1 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("i betr�gt jetzt " + i);
		}
			
	for (int i = 1; i <= 5; i ++) {
		for (int j = 1; j <= i; j++)
			System.out.print("*");
		System.out.println();
	}

	}

}
