package arrays;

public class FOR_Schleife_Durchschnitt_berechnen {

	    static double avg(double[] arrName) {
		double sum = 0;
		
			for (int i = 0; i < arrName.length; i++) {
				sum += arrName[i];
			}
		
		double avg = sum / arrName.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		double[] myArr = {12.25, 13.36, 15.89};
		System.out.println(avg(myArr));
	}
}
