package generics;

public class GenerischeKlasseDefinieren {
	
// Generische Klasse definieren
	public static class Generisch<T>{
		private T value;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
		
	}

}
