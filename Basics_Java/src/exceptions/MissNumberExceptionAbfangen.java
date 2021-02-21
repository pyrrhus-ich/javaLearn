package exceptions;

public class MissNumberExceptionAbfangen {
	
	public static void main(String[] args) {
		numberFormatException();
	}// Main

	//Definition
	
		public static void numberFormatException() {
		String stringToConvert = "19%";
		double vat = 19;
		
		try {
			vat = Integer.parseInt(stringToConvert);
		}
		catch (NumberFormatException e) {
			System.err.printf("%s kann man nicht in eine Zahl konvertieren !%n", stringToConvert);
		}
		
		System.out.printf("Weiter gehts mit MwSt=%g.%n", vat);
		
		}// number format exception
	
	

}
