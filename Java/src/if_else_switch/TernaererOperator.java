package if_else_switch;

public class TernaererOperator {

	public static void main(String[] args) {
		boolean x = (2 < 3) ? true : false;
		System.out.println(x);
		System.out.println((2 > 3) ? true : false);

		String res = (2 < 3) ? "Ja" : "Nein";
		System.out.println(res);
		System.out.println((2 > 3) ? "Ja" : "Nein");
		
		int intRes = (2 < 3 ) ? 1 : 0;
		System.out.println(intRes);
		System.out.println((2 < 3 ) ? 1 : 0);
	}

}
