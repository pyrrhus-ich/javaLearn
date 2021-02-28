package schleifen_;
/**
 * <p>
 * Mit labeln kann man z.B in Verschachtelten Schleifen einen abbruch der <br>
 * �usseren Schleife erreichen. Oder im Switch bei der Falscheingabe einen <br>
 * kompletten Abbruch der Schleife erzwingen. Im Beispiel unten bei erreichen des X<br>
 *
 * </p>
 *
 */
public class Schleifen_LABEL_oder_MARKEN_zum_Abbruch {

	public static void main(String[] args) {
		String dnaBases = "CGCXAGTTCTTCGGXAC"; 
		int a = 0,g= 0,c= 0,t= 0;
		
		loop:
		for ( int i = 0; i < dnaBases.length(); i++ ) { 
			switch ( dnaBases.charAt(i)){ 
			case 'A': 
			case 'a': 
			a++; 
			break; 
				case 'G': 
				case 'g': 
				g++; 
				break; 
					case 'C': 
					case 'c': 
					c++; 
					break; 
						case 'T': 
						case 't': t++; 
						break; 
							default: 
							System.err.println( "Unbekannte Nukleinbasen " + dnaBases.charAt( i ) ); 
							break loop; 
			} 
		} 
		System.out.printf( "Anzahl: A=%d, G=%d, C=%d, T=%d%n", a, g, c, t ); 
	} 
	
}

