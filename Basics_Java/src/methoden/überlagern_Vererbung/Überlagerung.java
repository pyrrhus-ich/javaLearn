package methoden.überlagern_Vererbung;
/**
 * In Java werden Methoden immer über Objekte aufgerufen. Wenn ich also die Referenzvariable<br>
 * als Lebewesen definiere, kann das Objekt vom typ Säugetier nur auf die in der Klasse Lebewesen <br>
 * definierten Attribute zugreifen<br>
 *<li>https://www.programmierenlernenhq.de/ueberlagern-von-methoden-dynamisches-binden-java/<br>
 *
 * 16.02.2021
 */
public class Überlagerung {
		
// Klassendefinitionen	
static class Lebewesen
{  // Ober oder auch Superklasse
	String getArt() 
	{  // definiert Methode getArt();
		return "Lebewesen";
	}
}

static class Säugetier extends Lebewesen{  // erbt von Lebewesen
	short tragZeit;
	
	short getTragZeit() {  // Neu definierte Methode
		return this.tragZeit;
	}
	@Override
	String getArt() {      // Modifiziert(Überlagert) Methode getArt() aus der Oberklasse
		return "Säugetier";
	}
}

public static void main(String[] args) {
	// Variable hat typ Lebewesen => Objekttyp (new) ist auch Lebewesen
	Lebewesen lebewesen = new Lebewesen();
	System.out.println("Ruft Methode getArt() für Lebewesen auf => " + lebewesen.getArt() + "\n");
	
	// Variable hat typ Lebewesen aber der Objekttyp ist Säugetier => tragzeit kann nicht zugewiesen werden
	Lebewesen lebewesenSäugetier = new Säugetier();
	//lebewesenSäugetier.tragzeit = 33; Kann nicht zugewiesen werden, da Tragzeit eine Variable der 
	//Klasse Säugetier ist.
	System.out.println(lebewesenSäugetier.getArt()+ "\n");
	
	// Variablentyp ist Säugetier und Objekttyp ist auch Säugetier. Deshalb kann tragZeit zugewiesen werden
	Säugetier säugetier = new Säugetier();
	säugetier.tragZeit = 33;
	System.out.println("Ruft überlagerte Methode getArt() für Säugetier auf => " + säugetier.getArt() + "\n");
	System.out.println("Ruft Methode getTragZeit() für Säugetier auf => " + säugetier.getArt() + "Tragzeit = " + säugetier.getTragZeit()+ "Wochen\n");
	
}



}
