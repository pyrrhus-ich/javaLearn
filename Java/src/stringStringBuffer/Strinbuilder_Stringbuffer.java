package stringStringBuffer;


//StringBuffer hat eigene Methoden die String nicht hat
// StringBuilder und Buffer verändern den String tatsächlich und erzeugen KEIN neues Objekt
// String Methoden dagegen erzeugen ein neues Objekt und referenzieren dieses nur mit dem 
// alten String Namen
// StringBuilder Objekte sind keine Strings. Wenn man sie mit strings vergleichen will, müssen
// sie erst mit toString umgewandelt werden

public class Strinbuilder_Stringbuffer {

	public static void main(String[] args) {
		// Objekt erzeugen
		StringBuilder sb = new StringBuilder("Kate");// kann auch leer sein
	    sb = sb.insert(3, "z");
	    sb = sb.append(" und ");
		sb = sb.append("Hund").append(" sind nicht immer Freunde.");
		System.out.println(sb);
		

	}

}
