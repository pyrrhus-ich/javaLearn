package methoden;

public class aus_ANDERER_Klasse_aufrufen {

	
	public static void main(String[] args) {
		// ruft aus der Klasse 'Methoden definieren' die Methode 'greet()' auf.
		Methoden_definieren_OHNE_Rückgabe_OHNE_Parameter.greet();
		
		// dto. 'printMax' aus 'Methoden_definieren_OHNE_Rückgabe_MIT_Parameter'
		Methoden_definieren_OHNE_Rückgabe_MIT_Parameter.printMax( 500.35, 100.25);
		
		// Wertübergabe 'call by value' oder 'copy by value'. Lediglich der Wert
		// von i wird übergeben. Die Variable selbst wird nicht verändert
		int i = 35;
		Methoden_definieren_OHNE_Rückgabe_MIT_Parameter.printMax( i , 100.25);
	}

}
