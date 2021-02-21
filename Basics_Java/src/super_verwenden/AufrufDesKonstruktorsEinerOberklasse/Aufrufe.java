package super_verwenden.AufrufDesKonstruktorsEinerOberklasse;

public class Aufrufe  {

	public static void main(String[] args) {
		Hund hund = new Hund();
		System.out.println(hund.name);
		
		Hund hundMitName = new Hund("Franzi");
		System.out.println(hundMitName.name);
		
	}// Main

}// class
