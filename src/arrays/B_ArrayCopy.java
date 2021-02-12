package arrays;

public class B_ArrayCopy {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, -5, 6};
		int[] b = new int[10];
		
		int l = a.length;
		int[] c = new int[l]; // Variable verwendet zur zuweisung der Länge
		System.out.println(c.length);
		
		b[0] = 111;			  // Zuweisung zu index 0
		System.out.println(b[0]);
		
		//Ganzes Array kopieren von a nach c
		System.arraycopy(a, 0, c, 0, 6);
		for(int indexc = 0; indexc < c.length; indexc++)
			System.out.printf("c[%d] = %d | ",indexc, c[indexc]);
		System.out.println();
		
		// Ganzes array a nach b kopieren und ab dem Index 1 in b einfügen
		System.arraycopy(a, 0, b, 1, a.length);
		for (int indexOfB = 0; indexOfB < b.length; indexOfB++)
			if (b[indexOfB] != 0)
			System.out.printf("b[%d] = %d | ", indexOfB, b[indexOfB]);
		System.out.println();
		
		// Copy funktioniert auch im eigenen Array
		System.arraycopy(b, 1, b, 0, b.length -1); // verschiebt alles nach links Wert aus Index 0 wird überschrieben
		for (int indexOfB = 0; indexOfB < b.length; indexOfB++)
			if (b[indexOfB] != 0)
			System.out.printf("b[%d] = %d | ", indexOfB, b[indexOfB]);
		System.out.println();
		
		System.arraycopy(b, 0, b, 1, b.length -1);//verschiebt alles 1 nach rechts. Allerdings bleibt b[0]stehen und ist dann = b[1]
		for (int indexOfB = 0; indexOfB < b.length; indexOfB++)
			if (b[indexOfB] != 0)
			System.out.printf("b[%d] = %d | ", indexOfB, b[indexOfB]);

	}

}
