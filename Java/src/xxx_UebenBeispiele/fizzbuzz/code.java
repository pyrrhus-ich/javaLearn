package xxx_UebenBeispiele.fizzbuzz;

public class code {

	public static String fizzbuzz(int number) {
		String x = (number % 3 == 0 && number % 5 == 0) ? "fizzbuzz" : (number % 3 == 0)? "fizz" : (number % 5 == 0) ? "buzz" : String.valueOf(number);
		return x;
	};
}
