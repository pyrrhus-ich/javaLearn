package basics;

public class Bedingte_Anweisungen_IF {

	public static void main(String[] args) {

		int a = -101;
		int b = 200;
		
		if (a < 100)
			System.out.println("a ist kleiner als 100");
		else if (a == 100)
			System.out.println("a ist genau 100");
		else
			System.out.println("a muss größer als 100 sein");
		
		// Bedingungsoperator
		
		String max = (a > b) ? "a ist gr��er b" : "b ist gr��er a";
		System.out.println(max);

		}
	};
