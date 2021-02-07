package methoden;
/**
 * Wenn nicht ganz klar ist ob ich zwei oder 3 Argumente übergeben bekomme.<br>
 * Einfach die Methode 2 oder mehrmals definieren<br>
 * <b>ACHTUNG : Returntyp muss immer der selbe sein</b><br>
 * 
 *
 */
public class ÜBERLADENE_Methode1_GleicherNameUnterschiedlicheAnzahlDerParameter {

	
		static double avg(int a, int b) {
			return (a + b) / 2;
		}
		
		static double avg(int a, int b, int c) {
			return (a + b + c) / 3;
		}
		
		public static void main(String[] args) {
			System.out.println(avg(10,800)); //aufruf mit 2 Argumenten
			System.out.println(avg(10, 800, -600)); // aufruf mit 3 Argumenten
		
		}
	
	

}
