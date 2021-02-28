package stringStringBuffer;

//gibt 'false' zurück wenn es sich um einen String handelt

public class Is_Null_or_Empty__Methode_um_auf_leere_Strings_zu_testen {
	
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.isEmpty() || s.isBlank();
	}
	
	
	public static void main(String[] args) {
		System.out.println(isNullOrEmpty("Frank"));
		System.out.println(isNullOrEmpty("Frank Menzel"));
		System.out.println(isNullOrEmpty(""));
		System.out.println(isNullOrEmpty("   "));

	}

}
