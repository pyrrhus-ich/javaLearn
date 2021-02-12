package strings;

// Bei Input Variablen muss der Vergleich mit equals erfolgen, da sonst ein falsches Ergebnis
// raus kommt. Bei String Vergleichen sollte man wohl immer equals nehmen
// Methoden:
// - equals()  => Vergleicht korrekt
// - equalsIgnoreCase()  => Ignoriert Gross und Kleinschreibung

public class equals_und_equalsignoreCase_Vergleichen_von_Strings {

	public static void main(String[] args) {
		String a = javax.swing.JOptionPane.showInputDialog("Gib Ich ein");
		String b = "Ich";
		String c = "Ich";
		String d = "ich";
		
		System.out.println("\n************* Nutzung von '==' ************************************************");
		// Vergleich b = c ? Beides Stringvariablen, ergibt true
				System.out.printf("Vergleich zweier Variablen => %s%n", (b == c) ? true : false);
		
		// Vergleich Eingabe mit Variable. Obwohl in beiden 'Ich' steht kommt false
				System.out.printf("Input \"Ich\" Vergleich mit Variablen \"Ich\" => "
				+ " %s%n",(a == b) ? true : false);
		
System.out.println("\n************* Nutzung von equals() ************************************************");
		// Vergleich Input mit Variable wenn equals genutzt wird
				System.out.printf("Input \"Ich\" vergelichen mit equals => %s%n", b.equals(a));
				
		// Vergleich 2er Variablen mit equals
				System.out.printf("Vergleich a & b mit 'equals' => %s%n", b.equals(c));
				
System.out.println("\n************* Nutzung von equalsIgnoreCase() ************************************************");
		// equals
				System.out.printf("Vergleiche Input mit Variable d unter Nutzung von equals => %s%n", d.equals(a));
		// equalsIgnoreCase
				System.out.printf("Vergleiche Input mit Variable d unter Nutzung von equalsIgnoreCase => %s%n", d.equalsIgnoreCase(a));
				
				System.out.println("\n************* Nutzung von compare() ************************************************");
	}

}
