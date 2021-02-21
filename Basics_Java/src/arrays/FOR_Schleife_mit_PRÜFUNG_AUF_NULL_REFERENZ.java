package arrays;

public class FOR_Schleife_mit_PRÜFUNG_AUF_NULL_REFERENZ {
	
	static double avg(double[] array) {
		double sum = 0;
		//Pr�fung auf Null
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array ist NULL oder leer");
		}else {
			for (int i = 0; i < array.length ; i++) {
				sum += array[i];
			}
			return sum / array.length;
		}
	}
	

	public static void main(String[] args) {
		double[] myArr = {12.25, 13.56, 78.98};
		System.out.println(avg(myArr));
		
		// Wirft die Exception
		double[] myArr1 = {};
		System.out.println(avg(myArr1));

	}

}
