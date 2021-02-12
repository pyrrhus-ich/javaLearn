package strings;

// kommt aus Java.lang.Character | liefer true or false
// static boolean isDigit(char ch) Handelt es sich um eine Ziffer zwischen 0 und 9? 
// static boolean isLetter(char ch) Handelt es sich um einen Buchstaben? 
// static boolean isLetterOrDigit(char ch) Handelt es sich um ein alphanumerisches Zeichen? 
// static boolean isLowerCase(char ch) 
// static boolean isUpperCase(char ch) Ist es ein Klein- oder ein Großbuchstabe? 
// static boolean isWhiteSpace(char ch) Ist es ein Leerzeichen, Zeilenvorschub, Return oder Tabulator, also ein sogenannter Weiß- raum3 (engl. white space), auch Leerraum genannt?

public class Charcter_is_XXX {

	public static boolean isNumeric( String textzeile ) {
		if ( textzeile == null || textzeile.length() == 0 ) 
			return false; 
		
		for ( int i = 0;i< textzeile.length(); i++ ) 
			if ( ! Character.isDigit( textzeile.charAt(i) ) ) 
				return false; 
		return true; 
	}


	
	public static void main(String[] args) {
		System.out.println(isNumeric("1234"));
		System.out.println(isNumeric("12.34"));

	}

}
