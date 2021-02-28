package datentypen_;

// Syntax: typ.parseXXX(Variable die geändert werden soll);
// In diesem Beispiel ist die Eingabe mit '.' erforderlich
// Lokalisiertes parsen kommt auf JavaInsel S.375



public class parseXXX_vom_String_zum_Primitiv {

	public static void main(String[] args) {
		
		// Zahl muss mit '.' eingegeben werden
		String x = javax.swing.JOptionPane.showInputDialog("Bitte Zahl eingeben");

		System.out.println(x + " Eingabe war ein String");
		
		//Variable instanzieren Ohne geht es nicht
		double xToDouble = Double.parseDouble(x);
		
		// cosinus berechnen und als double ausgeben
		double cosinus = Math.cos(xToDouble);
		System.out.println(cosinus);
		
		// Rückumwandlung des double in String
		String cosStr = String.valueOf(cosinus) ;
		System.out.println(cosStr + " Jetzt ist er wieder ein String");
		
		
		

	}

}
