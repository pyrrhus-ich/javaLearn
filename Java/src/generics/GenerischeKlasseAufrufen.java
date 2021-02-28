package generics;

import generics.GenerischeKlasseDefinieren.Generisch;

public class GenerischeKlasseAufrufen {

	public static void main(String[] args) {
		Generisch<String> str = new Generisch<String>();
		str.setValue("Frank Menzel");
		System.out.println(str.getValue());
		
		Generisch<Integer> int1 = new Generisch<Integer>();
		int1.setValue(4711);
		System.out.println(int1.getValue());
		
		

	}

}
