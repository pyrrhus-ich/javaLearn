package generics;

public class GenerischeKlasseDefinierenUndAufrufen {

	public static void main(String[] args) {
		// Hinter new sieht man den Diamant Operator
		MeineKlasse<Integer> meinInt = new MeineKlasse<>();
		meinInt.setWerte(25, 35);
		int x = meinInt.getWert() + meinInt.getWert2();
		System.out.println(x);
		
		MeineKlasse<String> meinStr = new MeineKlasse<String>();
		meinStr.setWerte("Frank ", "Menzel");
		String y = meinStr.getWert() + meinStr.getWert2();
		System.out.println(y);

	}// main

	
	public static class MeineKlasse<T>{
		private T Wert;
		private T Wert2;
		
		
		public void setWerte(T a , T b) {
			this.Wert = a;
			this.Wert2 = b;
			
		}
		
		public T getWert() {
			return Wert;
		}
		public void setWert(T wert) {
			Wert = wert;
		}
		public T getWert2() {
			return Wert2;
		}
		public void setWert2(T wert2) {
			Wert2 = wert2;
		}
		
		
		
		
		
	}
}
