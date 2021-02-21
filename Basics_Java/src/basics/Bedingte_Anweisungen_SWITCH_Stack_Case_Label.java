package basics;
/**
 * <li>Stack Case Label (mehrere Case untereinander)
 *
 */
public class Bedingte_Anweisungen_SWITCH_Stack_Case_Label {

	public static void main(String[] args) {
		
	// Stack - Case Label
	int hour = 13;
	
	switch (hour) {
	// Nachtruhe von 22 - 06:00 Uhr
	case 22:
	case 23:
	case 24: case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		System.out.println("NACHTRUHE");
		break;
	// Mittagsruhe von 13 - 15 Uhr
	case 13:
	case 14:
		System.out.println("MITTAGSRUHE");
		break;
		// Alle anderen Zeiten
		default:
			System.out.println("GEH ARBEITEN");
			break;
	}

	}

}
