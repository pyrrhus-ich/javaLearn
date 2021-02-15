package classDefinitions;

// ruft die Klasse Mahnung auf

public class Mahnung_Aufruf {

	public static void main(String[] args) {
		Mahnung first = new Mahnung();
		Mahnung second = new Mahnung(first);
		Mahnung eins = new Mahnung();
		Mahnung third = new Mahnung(second);

	}

}
