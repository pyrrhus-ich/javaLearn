package streamAPI;

import java.util.*;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamGenerate_fromArray {

	public static void main(String[] args) {
		int[] nums = {12, 3, 15, 8, 10 };
		// Falsch => gibt nur das Array zurück
		Stream.of(nums).forEach(n -> System.out.println(n));
		// Richtig => bezieht sich auf die nummern in nums
		Arrays.stream(nums).forEach(n -> System.out.print(n + " "));
		
		

	}

}
