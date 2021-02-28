package schleifen_;
// Wenn man sich beide Beispiele anschaut, wird klar, das man sich die Methode zweiMalEins
// hätte sparen können. Für eine andere Darstellung reicht es aus die Sysout... Zeile zu ändern
// Deshalb auch noch mal die Methode beidesMalEins
public class FOR_Verschachtelt_Ein_mal_Eins {

		public static void einMalEins(int x, int y) {
			for (int zähler = 1; zähler <= x ; zähler++) {
				for (int nenner = 1; nenner <= y; nenner++) {
					System.out.printf("Zähler * Nenner => %d * %d = %d%n",zähler, nenner, zähler * nenner);
				}//ende innere for
				System.out.println();
			}// ende äußere for
			
		  }// ende einMalEins
	
		public static void zweiMalEins(int x, int y) {
			for (int zähler = 1; zähler <= x; zähler++) {
				for (int nenner = 1 ; nenner <= y ; nenner++ ) {
					System.out.printf("Nenner * Zähler => %d * %d = %d%n", nenner, zähler, nenner * zähler );
				}// innere
				System.out.println("<<<zweiMalEins Innere Schleife ist einmal durch >>>>>\n");
			}//äussere
		}
		
		public static void beidesMalEins(int x, int y) {
			for (int zähler = 1; zähler <= x; zähler++) {
				for (int nenner = 1 ; nenner <= y ; nenner++ ) {
					System.out.printf("== > >Zähler * Nenner => %d * %d = %d%n",zähler, nenner, zähler * nenner);
					System.out.printf("Nenner * Zähler => %d * %d = %d%n", nenner, zähler, nenner * zähler );
				}// innere
				System.out.println("**************************************************");
			}//äussere
		}
	
	public static void main(String[] args) {
		//einMalEins(10, 10);
		//zweiMalEins(10,5);
		beidesMalEins(5, 10);

	}

}
