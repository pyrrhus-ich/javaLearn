package methoden.Überladene;
/**
 * Hier ist es möglich 2 oder 3 integer oder double einzugeben<br>
 * <b>ACHTUNG : Returntyp muss immer der selbe sein</b><br>
 * 
 *
 */
public class ÜBERLADENE_Methode3_MixAus1_und_2 {

	
		static double avg(int a, int b) {
			return (a + b) / 2;
		}
		
		static double avg(double a, double b) {
			return (a + b) / 2;
		}
		
		static double avg(int a, int b, int c) {
			return (a + b + c) / 3;
		}
		
		static double avg(double a, double b, double c) {
			return (a + b + c) / 3;
		}
		
		public static void main(String[] args) {
			System.out.println(avg(10,800)); //aufruf mit 2 INTEGER
			System.out.println(avg(10.34, 800.65, -600.58)); // aufruf mit 3 DOUBLE
		
		}
	
	

}
