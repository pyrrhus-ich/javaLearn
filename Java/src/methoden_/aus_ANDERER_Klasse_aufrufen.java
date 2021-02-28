package methoden_;

public class aus_ANDERER_Klasse_aufrufen {

	
	public static void main(String[] args) {
		// ruft aus der Klasse 'Methoden definieren' die Methode 'greet()' auf.
		Methoden_definieren_OHNE_Rueckgabe_OHNE_Parameter.greet();
		
		// dto. 'printMax' aus 'Methoden_definieren_OHNE_R�ckgabe_MIT_Parameter'
		Methoden_definieren_OHNE_Rueckgabe_MIT_Parameter.printMax( 500.35, 100.25);
		
		// Wert�bergabe 'call by value' oder 'copy by value'. Lediglich der Wert
		// von i wird �bergeben. Die Variable selbst wird nicht ver�ndert
		int i = 35;
		Methoden_definieren_OHNE_Rueckgabe_MIT_Parameter.printMax( i , 100.25);
	}

}
