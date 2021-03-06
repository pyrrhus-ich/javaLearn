package streamAPI;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamIterate {

	
	public static void main(String[] args) {
		
		// Erzeuge einen endlosen Stream aus BigInteger Objekten
		
		
		
		
		
		// Produziere die Permutationen eines Strings
		// Definition
		UnaryOperator<String> shuffleOp = s -> { 
			char[] chars = s.toCharArray(); 
			for ( int index = chars.length - 1; index > 0; index-- ) {
				int rndIndex = ThreadLocalRandom.current().nextInt( index + 1 ); 
				if ( index == rndIndex ) continue; 
				char c = chars[ rndIndex ]; 
				chars[ rndIndex ] = chars[ index ]; 
				chars[ index ] = c;
				
			} return new String( chars ); 
			}; 
			
			// Deklaration und Aufruf
			String text = "Du"; 
			Stream.iterate( text, shuffleOp ).limit( 2 ).forEach( System.out::println );

			
			
			

			}
		}



