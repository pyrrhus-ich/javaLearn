package exceptions;

public class MissNumberException {

		int vatRate = Integer.parseInt("19");
		
		public static int getVatRate() {
			return Integer.parseInt("29%");
		}
	
	public static void main(String[] args) {
		System.out.println(getVatRate());

	}

}
