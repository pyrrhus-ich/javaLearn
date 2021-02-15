package klassen_und_Objekte;
// this wird verwendet um auf Objektvariablen zuzugreifen 
// wenn diese gleich heissen wie eine Objectvariable

public class This_verwendung {
	
	String password = "+covfefe"; // Objektvariable password
	boolean isAuthenticated;
	
	// Methodenvariable password
	boolean authenticate( String password ) {
		// vergleicht das Objektpassword(this) mit dem Password der Methode
		return isAuthenticated = this.password.equals(password);
	}


}
