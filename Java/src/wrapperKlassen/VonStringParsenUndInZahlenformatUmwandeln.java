package wrapperKlassen;

public class VonStringParsenUndInZahlenformatUmwandeln {

	public static void main(String[] args) {
		// parse string to int
		String str = "600";
		int int1 = Integer.parseInt(str); //Primitiv Int
		
		Integer int2 = 900;               //Wrapper Class Integer
		System.out.println(int1  + int2); //Autounboxing ?

	}

}
