package variablen_;
/**
 * <ul>
 * <li>deklarieren einzelner Variablen</>
 * <li>deklarieren mehrerer Variablen</>
 * <li>deklarieren von Variablen mit var</>
 * <li>Verwenden des Modifiers 'final' zum deklarieren zB von Konstanten</>
 * </ul>
 * @author ich
 *
 */
public class VariablenDeklaration {

	public static void main(String[] args) {
		// Deklaration einzelner Variablen
		String name; // Name
		int age; //Alter
		double income; //Einkommen
		char gender; // Geschlecht ('f' oder 'm')
		boolean isPresident; // Ist Präsident ('true' or 'false')
		boolean isVegetarian; // ist die Person Vegetarier ?
		
		// Wenn der Datentyp der selbe ist kann man mehrere Variablen auf einmal deklarieren
		// Die Variablennamen werden dabei mit Komma getrennt
		boolean isPraesident, isVegetarier;
		// Deklarierung mehrere Variablen bei gleichzeitiger Intialisierung
		boolean sendSms = true, //<= Wichtig ist auch hier das Komma als Trenner
				bungaBungaParty = true;
		String person1 = "Sylvio",
			   person2 = "Ruby the Heart stealer";
		
		// Deklarieren von Variablen mit 'var'
		// Braucht kein Datentyp angegeben zu werden. Muss aber eindeutig sein zB String oder int
		// nicht f�r double oder float. Nur moeglich mit gleichzeitige deklaration.
		var ages = 48;
		var names = "Frank";
		var isDumm = true;
		
		// Modifier 'final' z.B. für Konstanten
		int width = 40, height = 12; // veränderbare Variablen
		final int area = width * height; // unveränderliche Variable
		// aufgeschobene Initialisierung möglich
		final int perimeter; // deklariert die Variable mit 'final'
		perimeter = width * 2 + height * 2; // aufgeschobene Initialisierung
		//perimeter = 100; // fuehrt zu einer Fehlermeldung, weil perimeter jetzt bereits initialisiert ist
	}
	

}
