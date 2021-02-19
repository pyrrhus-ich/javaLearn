package exceptions;

public class ContinueInput {

	public static void main(String[] args) {
		repeatInput();

	}//Main
	
	static void repeatInput() {
		int number = 0;
		while(true) {
			try {
				String s = javax.swing.JOptionPane.showInputDialog(
						"Bitte gib eine Zahl ein");
				System.out.println(s);
				number = Integer.parseInt(s);
				break;
			}
			catch (NumberFormatException e) {
				System.err.println("Das ist keine Zahl");
			}
		}//while
		System.out.println("Danke für die Eingabe der Zahl");
		System.exit( 0 ); //Beendet die Anwendung
	}//repeatInput

}
