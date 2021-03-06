package streamAPI;

import java.util.stream.Stream;

public class GenerateStream_AusEinzelObjekten {

	public static void main(String[] args) {
		// Stream von Strings
		Stream.of("Ich", "versuche" , "immer", "noch", "es", "zu", "lernen",".")
		.limit(5)
		.forEach(System.out::println); 
		
		Stream.of("Ich", "versuche" , "immer", "noch", "es", "zu", "lernen",".")
		.limit(5)
		.forEach(n -> System.out.print(n + " ")); 
		System.out.println();
		
		// Stream ohne Angabe von Literalen => LIMITTIEREN
		// Ohne .limit() wird es ein unendlicher Stream
		Stream.iterate(0, i -> i + 1 ).limit(10).forEach(System.out::print);
		
	}

}
