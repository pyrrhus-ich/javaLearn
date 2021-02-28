package casting;

public class Umwandlung_datentypen_casting {

	public static void main(String[] args) {
		int a = 10;
		String as = "10";
		System.out.println(a + " " + as);
		
		double b = (double) a;
		System.out.println(b);
		
		float c = (float) a;
		System.out.println(c);

		String d = ((Integer)a).toString();
		System.out.println(d);
	}

}
