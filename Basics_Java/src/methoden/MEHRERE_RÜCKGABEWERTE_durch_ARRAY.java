package methoden;

public class MEHRERE_RÜCKGABEWERTE_durch_ARRAY {

	
	static int[] productAndSum(int a, int b) {
		return new int[] {a * b, a + b};
	}
	public static void main(String[] args) {
		int x = productAndSum(5, 4)[0];
		int y = productAndSum(9, 15)[1];
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
