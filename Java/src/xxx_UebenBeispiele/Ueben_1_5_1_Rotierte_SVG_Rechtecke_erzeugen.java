package xxx_UebenBeispiele;

public class Ueben_1_5_1_Rotierte_SVG_Rechtecke_erzeugen {

	public static void main(String[] args) {
		System.out.println("<svg height=\"200\" width=\"200\">");
		int rotate = 0;
		while (rotate <= 360 ) {
			System.out.printf("<rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\" transform=\"rotate(%d 100 100)\" />%n" ,rotate);
			rotate += 10;
		}
		System.out.println("</svg>");
	}

}
