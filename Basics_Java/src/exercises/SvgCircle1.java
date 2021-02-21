package exercises;
/**
 *<li> Werte Eingabe mit java.util.Scanner
 *<li> Math Random
 *<li>println und printf
 *
 *
 */
public class SvgCircle1 {

	public static void main(String[] args) {
		
		int a, y;
		double r;
		
		System.out.println("Bitte gib den Wert für CX ein\n");
		a = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Bitte gib den Wer für  cy ein\n");
		y = new java.util.Scanner(System.in).nextInt();
		
		r = Math.random() * 10 + 10;
		
		System.out.println("<svg height=\"400\" width=\"1000\">\n"
				+ " <circle cx=\"" + a + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n"
				+ "</svg>\n");
		
		System.out.printf("<svg height=\"400\" width=\"1000\">\n"
				+ " <circle cx=\" %d \" cy=\" %d \" r=\" %.2f \" />\n"
				+ "</svg>", a, y, r);
	}

}
