package stringStringBuffer;

public class ValueOf {

	public static void main(String[] args) {
		int i = Integer.valueOf("2345");
		System.out.println(i);
		int z = i + 12; // Beweis das Umwandlung geklappt hat
		System.out.println(z);

	}

}
