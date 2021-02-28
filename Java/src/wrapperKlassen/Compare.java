package wrapperKlassen;

public class Compare {

	public static void main(String[] args) {
		System.out.println("Integer");
		System.out.println(Integer.compare(5, 6));
		System.out.println(Integer.compare(6, 5));
		System.out.println(Integer.compare(6,6));
		
		System.out.println("Double");
		System.out.println(Double.compare(2.0, 3.0));
		System.out.println(Double.compare(Double.NaN, 0));
		
		System.out.println("Boolean");
		System.out.println(Boolean.compare(false, false));
		System.out.println(Boolean.compare(true, false));
		System.out.println(Boolean.compare(false, true));

	}

}
