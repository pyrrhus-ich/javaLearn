package xxx_UebenBeispiele.Laufzeit_messen;

public class String_add {
	
	public String_add() {	
		String str = "";
		for (int i = 0; i < 10000 ; i++) {
			str += "A";
		}
		System.out.println(str.length());
	}
	

}
