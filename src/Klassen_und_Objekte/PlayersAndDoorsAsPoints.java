package Klassen_und_Objekte;

public class PlayersAndDoorsAsPoints {

	public static void main(String[] args) {
		java.awt.Point player = new java.awt.Point(); // erzeugt neues Objekt Player
				player.x = player.y = 10; // setzt die Werte f�r die Variablen
				
		java.awt.Point door = new java.awt.Point(); //neues Objekt door
				door.setLocation(10, 100); // nutzt methode set Location um Zustand zu ver�ndern
		
		System.out.println(player.distance(door)); 
		

	}

}
