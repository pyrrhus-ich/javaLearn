package strings;
//Methoden:
// - endsWith
// - startsWith


public class EndsWith_startsWith {

	public static void main(String[] args) {
		String a = "Ich_bin_ein_xml_file.xml";
		String anrede = "Sehr geehrter Herr Menzel";
		
System.out.println("************** endsWith() ******************************************");
		System.out.printf("Endet a mit '.xml' => %s%n", a.endsWith(".xml"));
		System.out.printf("Endet a mit '.XML' => %s%n", a.endsWith(".xml"));
		
System.out.println("\n************** startsWith() ******************************************");
		boolean istEinMann = anrede.startsWith("Sehr geehrter Herr");
		boolean istEineFrau = anrede.startsWith("Sehr geehrte Frau");
		System.out.printf("Startet die Anrede mit \"Sehr geehrter Herr\" => %s%n", istEinMann);
		System.out.printf("Startet die Anrede mit \"Sehr geehrte Frau\" => %s%n", istEineFrau);

	}

}
