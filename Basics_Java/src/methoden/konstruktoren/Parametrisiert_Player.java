package methoden.konstruktoren;

// Wenn es einen Parametrisierten Konstruktor gibt und es soll trotzdem ein leeeres
//Objekt angelegt werden können, muss ein leerer Konstruktor angelegt werden.
// Zum Beweis einfach mal Zeile 22 auskommentieren.

public class Parametrisiert_Player {

	public static void main(String[] args) {
		Parametrisiert_Player franzi = new Parametrisiert_Player("Franziska Menzel", 5);
		Parametrisiert_Player frank = new Parametrisiert_Player();
		frank.name = "Frank Menzel";
		frank.age = 57;
		System.out.println(franzi.name + " und das alter : " + franzi.age);
		System.out.println(frank.name + " und das alter : " + frank.age);

	}

	String name;
	int age;
	
	Parametrisiert_Player(){} // Parameterloser Konstruktor muss von Hand angelegt werden
	
	Parametrisiert_Player(String name, int age){
	this.name = name;
	this.age = age;
	}
}
