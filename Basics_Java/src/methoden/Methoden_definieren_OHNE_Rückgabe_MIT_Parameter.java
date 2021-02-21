/**
 * 
 */
package methoden;


	class Methoden_definieren_OHNE_Rückgabe_MIT_Parameter {
		// In den Parametern muss der typ angegeben werden
		// a und b sind hier die formalen Parameter
		static void printMax(double a, double b) {
			if (a > b)
				System.out.println( a );
			else
				System.out.println( b );
	}
		
		
	// ruft greet() auf
	public static void main(String[] args) {
		printMax(500.67 , 800.95);
}

}
