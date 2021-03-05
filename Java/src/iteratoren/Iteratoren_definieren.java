package iteratoren;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Iteratoren_definieren {

	public static void main(String[] args) {
		Iterator<Integer> iter = new TreeSet<>(Arrays.asList(4,2,9)).iterator();
		
		while (iter.hasNext())
			System.out.println(iter.next());
	}

}
