package methoden.konstruktoren;

public class Copy {

	public static void main(String[] args) {
		System.out.println("1. Spieler Frank anlegen");
		Copy frank = new Copy();
		frank.name = "Frank Menzel";
		frank.age = 57;
		System.out.println("Frank ist angelegt");
		Copy adelheid = new Copy(frank);
		System.out.println("Daten von Adelheid : " + adelheid.name + " " + adelheid.age);
	}

	String name;
	int age;
	
	Copy(){};
	
	Copy(Copy copy){
		this.name = copy.name;
		this.age = copy.age;
	}
	
	
	
	
}
