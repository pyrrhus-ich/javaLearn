package arays_Mehrdimensional;

public class MEHRDIMENSIONALE_Arrays4_mit_verschachtelten_Schleifen_durchlaufen {

	public static void main(String[] args) {
		char[][] letter = { { ' ', '#', ' ' }, 
							{ '#', ' ', '#' }, 
							{ '#', ' ', '#' }, 
							{ '#', ' ', '#' }, 
							{ ' ', '#', ' ' } };
		
		for (int line = 0; line < letter.length; line++) {
			for (int column = 0; column < letter[line].length; column++)
				System.out.print(letter[line][column]);
			System.out.println();//Wichtig für die Darstellung in linien und spalten
		}


	}

}
