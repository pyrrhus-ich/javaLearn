package vergleiche_u_Pruefungen;

public class equals {

	public static void main(String[] args) {
		String a = "FrANk";
		String b = "Frank";
		
		if (a.equals(b)) {
			System.out.println("a ist gleich b");
		}else {
			System.out.println("a ist Nicht gleich b");
		}
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("a Ist Gleich b");
		}else {
			System.out.println("a ist nicht gleich b");
		}

	}

}
