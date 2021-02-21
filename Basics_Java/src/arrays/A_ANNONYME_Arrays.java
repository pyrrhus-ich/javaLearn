package arrays;
// siehe auch ./methoden/MEHRERE_R�CKGABEWERTE_durch_Array

public class A_ANNONYME_Arrays {

	static double avg(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double avg = sum / array.length;
		return avg;
	}
	
	public static void main(String[] args) {
		// Annonyme Arrays sind ein new mit []
		//int[] primes;
		//primes = new int[] {1, 5, 9};
		
		// kann auch in Methoden verwendet werden
		System.out.println(avg(new double[]{3, 5, 8, 34}));

	}

}
