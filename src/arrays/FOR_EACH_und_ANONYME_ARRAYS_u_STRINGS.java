package arrays;

public class FOR_EACH_und_ANONYME_ARRAYS_u_STRINGS {

	public static void main(String[] args) {
		for ( int prime : new int[]{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 } ) 
			System.out.println( prime );
	
	// Auch m�glich f�r Objekte z.B. Strings
	for (String name : new String[] {"Ich", "will", "es", "lernen"})
		System.out.println(name);
	}
}
