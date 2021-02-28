package wrapperKlassen;

public class Equals_Gleichwertigkeitstes {

	public static void main(String[] args) {
		System.out.println(Integer.valueOf(1).equals(1));
		System.out.println(Integer.valueOf(1).equals(Integer.valueOf(1)));
		
		System.out.println("Vergleiche Integer mit long");
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));

	}

}
