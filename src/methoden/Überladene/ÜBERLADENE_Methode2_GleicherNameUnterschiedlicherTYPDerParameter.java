package methoden.Überladene;
/**
 * Wenn nicht ganz klar ist mit welchem typ gerechnet werden soll.<br>
 * Einfach die Methode 2 oder mehrmals definieren<br>
 * <b>ACHTUNG : Returntyp muss immer der selbe sein</b><br>
 * 
 *
 */
public class ÜBERLADENE_Methode2_GleicherNameUnterschiedlicherTYPDerParameter {

	
		static double avg(int a, int b) {
			return (a + b) / 2;
		}
		
		static double avg(double a, double b) {
			return (a + b) / 2;
		}
		
		public static void main(String[] args) {
			System.out.println(avg(10,800)); //aufruf mit 2 INTEGER
			System.out.println(avg(10.34, 800.65)); // aufruf mit 2 DOUBLE
		
		}
	
	

}
