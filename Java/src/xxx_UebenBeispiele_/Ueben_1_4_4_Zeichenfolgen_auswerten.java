package xxx_UebenBeispiele_;

public class Ueben_1_4_4_Zeichenfolgen_auswerten {

	public static void main(String[] args) {
		
		System.out.println("Gib die Best�tigung ein :>");
		String answer = new java.util.Scanner( System.in).nextLine();
		
		switch(answer) {
		case "Ay":
		case "Ay, ay":
		case "Ein Ei":
		case "yes":
		case "ja":
			System.out.println("Keep it up!");
			break;
			default:
				System.out.println("Don't you dare!");
				break;
		}
	}

}
