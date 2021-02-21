package Schleifen;
/**
 * Syntax : for(Typ Bezeichner : Array )<br>
 * <li>Schleife läuft immer das ganze Array ab
 * <li>Index nicht sichtbar
 * <li>Schrittlänge ist immer 1
 * <li>Kann nur lesen, nicht in das Array schreiben
 */
public class FOR_2_erweiterte_FOR_Schleife_FOR_EACH {

		static double avg( double[] array) {
			// usnahmebehandlung
			if (array == null || array.length == 0)
				throw new IllegalArgumentException("Array NULL oder leer");
			
			double sum = 0;
			// erweiterte for Schleife						 
			for(double n : array) // f�r jedes Element n vom typ double im array
				sum += n;		  // addiere 
			
			return sum / array.length;
			
			
		}

	
	public static void main(String[] args) {
		double[] myArr = {12.5, 23.58, 98.78};
		System.out.println(avg(myArr));

		
	}

}
