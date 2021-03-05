package scanner;

import java.util.Scanner;

public class HasNext_u_Next {

	public static void main(String[] args) {
		// Achtung !!! Keine Kommata im String
		Scanner str = new Scanner("tutego 12 73 TRUE 12,03 123456789000");
		
		System.out.println("hasNext() => " + str.hasNext());
		System.out.println("next() =>  " +str.next());
		
		System.out.println("hasNextBoolean => " + str.hasNextBoolean());
		//System.out.println(str.nextBoolean());
		
		System.out.println(str.hasNextByte());
		System.out.println(str.nextByte());
		
		while (str.hasNext()) {
			System.out.println(str.next());
		}
		
		
	}

}
