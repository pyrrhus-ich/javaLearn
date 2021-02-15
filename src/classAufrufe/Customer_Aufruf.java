package classAufrufe;

import classDefinitions.Customer;

// Wird auf einen Fehler laufen, wenn die Klasse Customer als abstrakte Klasse definiert wurde

public class Customer_Aufruf {

	public static void main(String[] args) {

		System.out.printf("Bisher angelegte Instanzen = %d %n", Customer.getAnzahlDerInstanzen());
		System.out.println();
		
		// ruft Customer direkt auf
		Customer ich = new Customer("Franziska", "Menzel", 2015, "f");

		System.out.printf("Bisher angelegte Instanzen = %d", Customer.getAnzahlDerInstanzen());
	}

}
