package strings;

// gibt boolean zurück wenn bestimmter String enthalten ist

public class Contains_Nach_Zeichen_oder_Zeichenfolgen_suchen {

	public static boolean enthaeltSpam(String text) {
		return  text.contains("Viagra") ||  text.contains("Bitcoin");
	}
	
	public static void main(String[] args) {
		System.out.println(enthaeltSpam("Ich handele nur mit Euro"));
		System.out.println(enthaeltSpam("Ich handele nur mit Bitcoin"));
	}

}
