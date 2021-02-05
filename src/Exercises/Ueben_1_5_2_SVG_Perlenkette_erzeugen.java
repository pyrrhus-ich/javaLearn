package Exercises;

public class Ueben_1_5_2_SVG_Perlenkette_erzeugen {

	public static void main(String[] args) {
		
		System.out.println("<svg height=\"100\" width=\"1000\">");
		
		for (int i = 0; i < 50; i++) {
			int rdmNmbr = (int)(Math.random() * 3 + 1);
			
			switch (rdmNmbr) {
			case 1:
				System.out.printf("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\" />%n", "blue");
				break;
			case 2:
				System.out.printf("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\" />%n", "green");
				break;
			case 3:
				System.out.printf("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\" />%n", "orange");
			}
		
		}
		System.out.println("</svg>");
	}

}
