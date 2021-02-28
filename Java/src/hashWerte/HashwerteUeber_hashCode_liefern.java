package hashWerte;

public class HashwerteUeber_hashCode_liefern {

	public static void main(String[] args) {
		Integer int1 = 15;
		System.out.println(int1.hashCode());
		String ich = "Frank Menzel";
		System.out.println(ich.hashCode());
		String du = "Frank Menzel";
		System.out.println(du.hashCode());
		System.out.println(du.equals(ich));
		System.out.println(System.identityHashCode(ich));
		System.out.println(System.identityHashCode(du));
		
		

	}

}
