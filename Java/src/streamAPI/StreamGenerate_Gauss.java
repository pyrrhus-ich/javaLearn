package streamAPI;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

// Generate produziert Elemente aus einem Supplier; der Stream ist unendlich

import math.Math_RANDOM;

public class StreamGenerate_Gauss {
	
// erzeuge ein Array von 10 Zufallszahlen nach Normalverteilung
	public static void main(String[] args) {
		Random random = new Random();
		
		double[] randoms = Stream.generate(random::nextGaussian)
				.limit(10).mapToDouble(e -> e).toArray();
		
		System.out.println(Arrays.toString(randoms));
		
		
	}// main

	 
	
}// class
