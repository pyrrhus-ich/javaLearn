package klassen_und_Objekte;

public class PlayersAndDoorsAsPoints {

	public static void main(String[] args) {
		java.awt.Point player = new java.awt.Point(); // erzeugt neues Objekt Player
				player.x = player.y = 10; // setzt die Werte für die Variablen
				
		java.awt.Point door = new java.awt.Point(); //neues Objekt door
				door.setLocation(10, 100); // nutzt methode set Location um Zustand zu verandern
		
		System.out.println(player.distance(door)); 
		

	}

}
