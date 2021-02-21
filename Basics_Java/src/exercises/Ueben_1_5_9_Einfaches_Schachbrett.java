package exercises;

public class Ueben_1_5_9_Einfaches_Schachbrett {

	static void schachbrett(int a, int b) {
		for (int line = 0; line < a; line ++) {
			for (int spalte = 0; spalte < b; spalte ++) {
				System.out.print( (line + spalte) % 2 == 0 ? "#" : " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		schachbrett(8, 8);

	}

}
