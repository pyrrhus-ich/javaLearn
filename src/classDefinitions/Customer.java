package classDefinitions;

import java.util.Calendar;


// Abstract bedeutet, es können keine Objekte aus dieser Klasse instanziert werden
public /* abstract */ class Customer {
	
	// vorgegebene Variablen
	Calendar heute = Calendar.getInstance();
	int year = heute.getWeekYear();
	String[] bezeichnung = {"Mädchen", "Teenager", "Frau", "Junge", "Mann"};
	String phase;
	String lastName;
	String firstName;
	int birthYear;
	String geschlecht;		/*erlaubt sind f - frau oder m - mann*/
	// *** kalkulierte Variablen
	int age;
	public boolean over18 = age >= 18 ? true : false;
	
	// kalkulationen
	public void calcPhase() {
		if (geschlecht == "f") {
			if (age <= 12)
				phase = bezeichnung[0];
				else if (age <= 21)
					phase = bezeichnung[1];
					else
						phase = bezeichnung[2];
				
		}else if (geschlecht == "m") {
			if (age <= 12)
				phase = bezeichnung[3];
				else if (age <= 21)
					phase = bezeichnung[1];
					else
						phase = bezeichnung[4];
		}
	}
	
	

	// anzahlDerInstanzen mitzählen => ausgabe über getter
	public static int anzahlDerInstanzen;
	{
		anzahlDerInstanzen++;
		
	}
	// weil die Methode genauso heist wie die Klasse, kann sie in einem Rutsch angelegt werden
	public Customer (String firstName, String lastName, int birthYear, String geschlecht) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.geschlecht = geschlecht;
		this.age = year - birthYear;
		getCustInfo();
	}
		
	public void setAll(String firstName, String lastName, int birthYear, String geschlecht) {
		
		this.firstName = firstName;
		if (lastName != null && !lastName.trim().isEmpty())
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.geschlecht = geschlecht;
		this.age = year - birthYear ;
	}
	
	public void setLastName(String lastName) {
		
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
		this.birthYear = birthYear;
		//this.over18 = age >= 18 ? true : false;
	}

	public void setGeschlecht(String geschlecht) {
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
		calcPhase();
		System.out.printf("%s %s ist %d Jahre alt und %s %s. Damit ist %s %s . %n", firstName, lastName, age, phase == "Frau" ? "eine" : "ein", phase,firstName,
				over18 ? "volljährig." : "leider noch nicht volljährig.");
		System.out.println();
	}

	public static int getAnzahlDerInstanzen() {
		return anzahlDerInstanzen;
	}

}
