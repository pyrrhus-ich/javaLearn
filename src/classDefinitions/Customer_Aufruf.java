package classDefinitions;

// Wird auf einen Fehler laufen, da die Klasse Customer als abstrakte Klasse definiert wurde
// wird das abstrakt dort heraus genommen können auch wieder Ojekte instanziirt werden
public class Customer_Aufruf {

	public static void main(String[] args) {

		System.out.printf("Bisher angelegte Instanzen = %d %n", Customer.getAnzahlDerInstanzen());

		// Customer p
		Customer p = new Customer();
		p.setLastName("Menzel");
		p.setFirstName("Frank");
		System.out.printf("Der Vorname ist %s und der Nachname ist %s%n", p.getFirstName(), p.getLastName());
		p.setbirthYear(1963);
		System.out.printf("%s ist volljährig %b . %n", p.getFirstName(), p.over18);

		// Customer s
		Customer s = new Customer();
		s.setNames("Sabine", "Langer");
		System.out.printf("Der Vorname ist %s und der Nachname ist %s%n", s.getFirstName(), s.getLastName());

		// return und ausdruck
		s.setbirthYear(1962);
		System.out.printf("%s ist volljährig %b . %n", s.getFirstName(), s.over18);
		System.out.print(s.getCustomerInformation());
		s.getCustInfo();

		Customer frank = new Customer();
		frank.setNames("Frank", "Menzel");
		System.out.printf("%s %s ist der neu angelegte Kunde.%n", frank.getFirstName(), frank.getLastName());

		System.out.printf("Bisher angelegte Instanzen = %d", Customer.getAnzahlDerInstanzen());
	}

}
