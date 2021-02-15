package konvertieren_Datentypen;

public class valueOf_von_Primitiv_to_String {
	
	public static void main(String[] args) {
		int integer = 10;
		String s1 = String.valueOf(integer);
		System.out.println(s1 + " ist jetzt ein String");
		s1 = String.valueOf(1 < 2);
		System.out.println("Nun gibt er den boolean Wert aus => " + s1);
		s1 = String.valueOf(Math.PI);
		System.out.println("PI ist = " + s1);
System.out.println("\n********  Für Objekte  ****************");
		System.out.println(String.valueOf(java.time.LocalTime.now()));
		
	}

}
