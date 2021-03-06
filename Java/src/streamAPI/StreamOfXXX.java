package streamAPI;
import java.util.stream.*;
import java.math.*;

public class StreamOfXXX {

	public static void main(String[] args) {
/*Produziere einen Stream aus gegebenen Ganzzahlen, entferne die Vorzeichen,
sortiere das Ergebnis und gib es aus*/
		Stream.of(-4, 1, -2, 3)
				.map(Math::abs)
				.sorted()
				.forEach(System.out::println);

	}

}
