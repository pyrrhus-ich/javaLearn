package klassen_und_Objekte;

public class Playground {

	public static void main(String[] args) {
		
		Player p = new Player();
		p.name = "Frank";
		p.item = "Axt";
		System.out.printf("%s nimmt seine %s und geht los .%n", p.name, p.item);
		
		Player s = new Player();
		s.name = "Sabine Menzel";
		s.item = "Nudelholz";
		System.out.printf("%s bewaffnet sich mit ihrem %s und hält dagegen.%n", s.name, s.item);
		
		Player parry = new Player();
		parry.name = "Parry Hotter";
		System.out.println(parry.doesCarryAnything());
		parry.carry("Streitaxt");
		System.out.println(parry.doesCarryAnything());
		parry.carry("Flammenwerfer");
		System.out.printf("%s trägt jetzt => %s%n", parry.name, parry.item);
		parry.dropAll();
		parry.doesCarryAnything();
		parry.carry("Das goldene Ei");
		System.out.printf("%s trägt jetzt %s", parry.name, parry.item);
	}

}
