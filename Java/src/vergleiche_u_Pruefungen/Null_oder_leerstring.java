package vergleiche_u_Pruefungen;

public class Null_oder_leerstring {
	
	public static void checkString(String a) {
	String item = a;
	// Insel Seite 412
	if( item != null && !item.trim().isEmpty()){
		System.out.println("String ist wohl okay");
	}else {
		System.out.println("Das ist kein String");
	}

	}	
	public static void main(String[] args) {
		checkString("45");

	}
}
