package classAufrufe;

// importiert aus dem Paket classDefinitions die KLasse Mahnung
import classDefinitions.Mahnung;

// ruft die Klasse Mahnung auf

public class Mahnung_Aufruf {

	public static void main(String[] args) {
		Mahnung first = new Mahnung();
		Mahnung second = new Mahnung(first);
		Mahnung eins = new Mahnung();
		Mahnung third = new Mahnung(second);

	}

}
