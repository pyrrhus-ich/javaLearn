package basics;

public class Operatoren {

	public static void main(String[] args) {
		
		//Vergleichsoperator liefert immer boolean
		int baba = 1;
		System.out.println(baba == 1);
		System.out.println(baba == 2);
		
		
		
		// Restwertoperator nur für Integer
		int modulo = 7 % 3;
				System.out.println(modulo);
				
		// Numerische Umwandlung: Es wird immer zum höheren Datentyp hin umgewandelt
		// Int / double = double
		int intZahl = 10;
		double doubleZahl = 2.56;
		System.out.println(intZahl / doubleZahl);
		
		// Division von Integer rundet ab
		int a = 1;
		int b = 3;
		System.out.println(a / b); // Ergebnis = 0 und nicht 0,333
		a = 10;
		System.out.println(a / b); // Ergebnis = 3 und nicht 3,333
			
		// Bedingungsoperator
		a = 2;
		b = 1;
		String max = (a > b) ? "a ist größer b" : "b ist größer a";
		System.out.println(max);
		
	}

}
