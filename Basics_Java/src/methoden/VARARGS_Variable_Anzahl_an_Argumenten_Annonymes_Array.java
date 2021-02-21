package methoden;
// VARARGS wird definiert mit typ... 
// Das array wird also nicht über [] definiert sindern über '...'
// Beim Aufruf der Funktion wird dann ein anonymes array erzeugt
public class VARARGS_Variable_Anzahl_an_Argumenten_Annonymes_Array {
	
	static double avg(double... myArr) {
		double sum = 0;
		for (int i=0; i < myArr.length; i++) {
			sum += myArr[i];
		}//for
		double avg = sum / myArr.length;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println(avg (15.25, 16.35, 48.59));

	}

}
