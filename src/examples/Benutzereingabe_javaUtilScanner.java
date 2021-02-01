package examples;
/**
 * <li>Beispiel für die Verwendung der Konsoleneingabe
 * @author ich
 *
 */
public class Benutzereingabe_javaUtilScanner {

	public static void main(String[] args) {
		System.out.println("Wie ist Dein Name :");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.printf("Hallo %s , wie alt bist Du denn?%n", name);
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.printf("Ah %s Jahre alt. Das ist ja die hälfte von %s.%n", age, age *2 );
		System.out.printf("Sag mal %s . Wie lautet Deine Lieblings Fließkommazahl", name);
		double value = new java.util.Scanner(System.in).nextDouble();
		System.out.printf("Ah %s. Meine ist %s.%n", value, Math.random()*10000 );
	}

}
