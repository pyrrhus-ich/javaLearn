package exceptions;

/**
 * sehr gut erkl�rt:<br>
 *https://www.andreasschrade.com/java/2013/08/12/java-die-null-referenz-teil-I/ <br>
 *<br>
 * Ursache f�r NullPointerExceptions ist eine falsche Verwendung von null
 *
 */

public class NULL_NullPointerException {

	public static void main(String[] args) {
		// NULL ist nicht erlaubt bei primitiven Datentypen (double, char, int, float, long)
		// Erlaubt bei komplexenen Datentypen wie String, BigDezimal
		
		String s = null;
		System.out.println(s);
		
		// Zur vermeidung von Nullpointer exceptions sollten diese abgefangen werden
		// dies erfolgt entweder mit '==' oder '!='
		
		String eingabe = javax.swing.JOptionPane.showInputDialog("Eingabe");
		if ( eingabe!= null && ! eingabe.isEmpty())
			System.out.println("Eingabe " + eingabe);
		else
			System.out.println("Abbruch oder keine Eingabe");

	}

}
