package xxx_UebenBeispiele;

public class AAA_TEST {

	public static void main( String[] args ) {
		StringBuilder str = new StringBuilder();
		int cnt = 0;
		while (cnt < 10) {
			str.append("\u2665 ");
			cnt ++;
		}
		System.out.println(str);
		
	}
}
