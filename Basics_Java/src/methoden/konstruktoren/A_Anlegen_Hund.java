package methoden.konstruktoren;
/**
 * <li>Konstruktoren sind Methoden ohne Rückgabewerte<br>
 * <li>Sie tragen den Namen Ihrer Klasse<br>
 * <li>Jede Klasse wird mit einem unsichtbarem Default Konstruktor initialisiert<br>
 * <li>Der Default Konstruktor wird automatisch erzeugt. Es sei denn, die Klasse hat nur<br>
 * &nbsp;&nbsp;&nbsp;&nbsp parametrisierte Konstruktoren.
 * <li>Man kann diesen Konstruktor überschreiben. Wenn er dann aber Parameter hat,<br>
 * &nbsp;&nbsp;&nbsp;&nbsp kann man Objekt nicht mehr mit 'new' anlegen
 * <li>
 *  
 * 
 *
 */
public class A_Anlegen_Hund {
	
	String name;
	String rasse;
	
	public A_Anlegen_Hund() { // Default Konstruktor in der Regel nicht sichtbar. 
							//Wenn man ihn benutzen will muss er angelegt werden
	// Nur wenn er angelegt ist kann man Objekte mit new & ohne Parameter anlegen.	
	}
	
	public void setName(String name) {// setter ist erforderlich wenn der tatsächliche Variablenname verborgen bleiben soll.
		this.name = name;
	}
	
	public A_Anlegen_Hund(String name, String rasse) { // Konstruktor mit Parametern Überschreibt den Default Konstruktor
		this.name = name;
		this.rasse = rasse;
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Anlegen_Hund franzi = new A_Anlegen_Hund();
		franzi.setName("Franzi");
		System.out.println(franzi.name);
		System.out.println(franzi.rasse); // null weil nicht mit Setter angelegt

	}

}
