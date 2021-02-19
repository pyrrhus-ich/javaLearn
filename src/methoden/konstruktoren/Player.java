package methoden.konstruktoren;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	String name;
	String age;
	
	public Player() {
		this("", "" );
	}
	
	public Player(Player player) {
		this(player.name, player.age);
	}
	
	public Player(String name, String age) {
		this.name = name.trim();
		this.age = age;
	
	}
	
}
