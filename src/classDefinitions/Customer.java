package classDefinitions;

import java.util.Calendar;

// Abstract bedeutet, es können keine Objekte aus dieser Klasse instanziert werden
public /* abstract */ class Customer {

	Calendar heute = Calendar.getInstance();
	int year = heute.getWeekYear();
	String lastName;
	String firstName;
	int age;
	public boolean over18;
	char geschlecht;

	// anzahlDerInstanzen mitzählen => ausgabe über getter
	public static int anzahlDerInstanzen;
	{
		anzahlDerInstanzen++;
	}

	public void setLastName(String lastName) {
		if (lastName != null && !lastName.trim().isEmpty())
			this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setNames(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setbirthYear(int birthYear) {
		this.age = this.year - birthYear;
		this.over18 = age >= 18 ? true : false;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	// ************* Hier starten die Getter
	// ******************************************************

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	// return und ausdruck
	public String getCustomerInformation() {
		return String.format("%s %s ist %d Jahre alt. Damit ist %s %s . %n", firstName, lastName, age, firstName,
				over18 ? "volljährig" : "leider noch nicht volljährig");
	}

	public void getCustInfo() {
		System.out.printf("%s %s ist %d Jahre alt. Damit ist %s %s . %n", firstName, lastName, age, firstName,
				over18 ? "volljährig" : "leider noch nicht volljährig");
	}

	public static int getAnzahlDerInstanzen() {
		return anzahlDerInstanzen;
	}

}
